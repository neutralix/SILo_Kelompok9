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
    
    private DBHandler dbHandler;
    private MainPage mainPage;

    public void getListOfItem() {
        String[] result = dbHandler.getListOfItem();
        Item[] item = createItem(result);
        
        mainPage.showListOfItem(item);
    }

    private Item[] createItem(String[] result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void searchItem(String text) {
        String[] result = dbHandler.searchItem(text);
        Item[] item = createItem(result);
        
        mainPage.showListOfItem(item);
    }
    
}
