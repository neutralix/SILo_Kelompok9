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

    private ItemForm2 newItemForm;
    private DBHandler dbHandler;
    private MainPage mainPage;
    
    
    public void requestItemForm(ItemForm2 form) {
        newItemForm = form;
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
