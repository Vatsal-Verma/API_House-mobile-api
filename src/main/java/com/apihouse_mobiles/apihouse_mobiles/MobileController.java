package com.apihouse_mobiles.apihouse_mobiles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class MobileController {
    
    @Autowired
    private MobileService mobile;

    @GetMapping("/getAllMobiles")
    public List<MobilePhone> getAllMobiles() {
        return mobile.getAllMobiles();
    }
    
    @GetMapping("/getMobileByName/{mob}")
    public MobilePhone getMobileByName(@PathVariable String mob) {
        return mobile.getMobileByName(mob);
    }

    @GetMapping("/getMobilesByBrand/{brand}")
    public List<MobilePhone> getMobileByBrand(@PathVariable String brand) {
        return mobile.getMobilesByBrand(brand);
    }
}
