package com.apihouse_mobiles.apihouse_mobiles;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.annotation.PostConstruct;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Service
public class MobileService {

    private static final Logger LOGGER = Logger.getLogger(MobileService.class.getName());
    private final ObjectMapper mapper = new ObjectMapper();
    private List<MobilePhone> mobiles = Collections.emptyList();

    @PostConstruct
    public void init() {
        try {
            mobiles = mapper.readValue(
                    new ClassPathResource("mobiles.json").getInputStream(),
                    new TypeReference<List<MobilePhone>>() {}
            );
            LOGGER.info("Successfully loaded mobiles from JSON file.");
        } catch (IOException e) {
            LOGGER.severe("Failed to load mobiles.json: " + e.getMessage());
        }
    }
    public List<MobilePhone> getAllMobiles() {
        if (mobiles.isEmpty()) {
            LOGGER.warning("mobiles list is empty, possibly due to earlier loading failure.");
        }
        return mobiles;
    }

    public MobilePhone getMobileByName(String name) {
        if (mobiles.isEmpty()) {
            LOGGER.warning("mobiles list is empty.");
            return null;
        }
        return mobiles.stream()
                .filter(c -> c.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

       public List<MobilePhone> getMobilesByBrand(String brand) {
        if (mobiles.isEmpty()) {
            LOGGER.warning("Mobile list is empty");
            return Collections.emptyList();
        }

        return mobiles.stream()
                .filter(c -> c.getBrand().equalsIgnoreCase(brand))
                .collect(Collectors.toList());
    }
}
