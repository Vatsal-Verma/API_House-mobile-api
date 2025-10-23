package com.apihouse_mobiles.apihouse_mobiles;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MobilePhone {

    private String name;
    private String brand;
    
    @JsonProperty("release_year")
    private int releaseYear;
    
    private String display;
    private String processor;
    private String ram;
    
    @JsonProperty("storage_options")
    private List<Integer> storageOptions;
    
    private String camera;
    private String battery;
    private double price;
    private String os;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public int getReleaseYear() { return releaseYear; }
    public void setReleaseYear(int releaseYear) { this.releaseYear = releaseYear; }

    public String getDisplay() { return display; }
    public void setDisplay(String display) { this.display = display; }

    public String getProcessor() { return processor; }
    public void setProcessor(String processor) { this.processor = processor; }

    public String getRam() { return ram; }
    public void setRam(String ram) { this.ram = ram; }

    public List<Integer> getStorageOptions() { return storageOptions; }
    public void setStorageOptions(List<Integer> storageOptions) { this.storageOptions = storageOptions; }

    public String getCamera() { return camera; }
    public void setCamera(String camera) { this.camera = camera; }

    public String getBattery() { return battery; }
    public void setBattery(String battery) { this.battery = battery; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getOs() { return os; }
    public void setOs(String os) { this.os = os; }
} 
    

