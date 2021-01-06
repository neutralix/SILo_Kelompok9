/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silo;

/**
 *
 * @author Mystery-PC
 */
public class Item {
    private String itemId;
    private String barcode;
    private String title;
    private String description;
    private String manufacturer;
    private String url;
    private int numberOfStock;

    public String getItemId() {
        return itemId;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getUrl() {
        return url;
    }

    public int getNumberOfStock() {
        return numberOfStock;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
