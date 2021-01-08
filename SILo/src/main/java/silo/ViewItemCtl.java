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
public class ViewItemCtl {
    
    private MainPage mainPage;
    private DBHandler dbHandler;

    public ViewItemCtl(MainPage mainPage, DBHandler dbHandler) {
        this.mainPage = mainPage;
        this.dbHandler = dbHandler;
    }
    
    public void getListOfItem() {
        Item[] item = dbHandler.getListOfItem();
        
        Object[][] data = new Object[item.length][7];
        for(int i=0; i<item.length; i++){
            data[i][0] = item[i].getItemId();
            data[i][1] = item[i].getBarcode();
            data[i][2] = item[i].getTitle();
            data[i][3] = item[i].getDescription();
            data[i][4] = item[i].getManufacturer();
            data[i][5] = item[i].getUrl();
            data[i][6] = item[i].getNumberOfStock();
        }
        
        mainPage.showListOfItem(data);
    }

    public void searchItem(String text) {
        Item[] item = dbHandler.searchItem(text);
        
        Object[][] data = new Object[item.length][7];
        for(int i=0; i<item.length; i++){
            data[i][0] = item[i].getItemId();
            data[i][1] = item[i].getBarcode();
            data[i][2] = item[i].getTitle();
            data[i][3] = item[i].getDescription();
            data[i][4] = item[i].getManufacturer();
            data[i][5] = item[i].getUrl();
            data[i][6] = item[i].getNumberOfStock();
        }
        
        mainPage.showListOfItem(data);
    }
    
}
