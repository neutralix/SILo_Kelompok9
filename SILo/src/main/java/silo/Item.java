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

    public Item(String itemId, String barcode, String title, String description, String manufacturer, String url, int numberOfStock) {
        this.itemId = itemId;
        this.barcode = barcode;
        this.title = title;
        this.description = description;
        this.manufacturer = manufacturer;
        this.url = url;
        this.numberOfStock = numberOfStock;
    }

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

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setNumberOfStock(int numberOfStock) {
        this.numberOfStock = numberOfStock;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
