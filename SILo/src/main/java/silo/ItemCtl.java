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
public class ItemCtl {

    private MainPage mainPage;
    private DBHandler dbHandler;
    private ItemForm newItemForm;

    public ItemCtl(MainPage mainPage, DBHandler dbHandler, ItemForm newItemForm) {
        this.mainPage = mainPage;
        this.dbHandler = dbHandler;
        this.newItemForm = newItemForm;
    }
    
    public void requestItemForm() {
        newItemForm.setVisible(true);
    }

    public void sendData() {
        newItemForm.setVisible(false);
//        enter data to dbhandler
        dbHandler.addNewItem();
        mainPage.refreshListOfItem();
    }

    public void cancelAddNewItem() {
        newItemForm.setVisible(false);
    }
    
}
