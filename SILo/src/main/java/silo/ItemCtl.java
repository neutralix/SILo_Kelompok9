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
    
    public void requestNewItemForm() {
        newItemForm.setFormType(1);
        newItemForm.clearForm();
        
        newItemForm.setVisible(true);
    }
    public void requestEditItemForm() {
        newItemForm.setFormType(2);
        newItemForm.clearForm();
        
        Item[] item = dbHandler.getListOfItem();
        newItemForm.prepareEditedItem(item[mainPage.getEditedItemNo()]);
        
        newItemForm.setVisible(true);
    }

    public void sendData(Item item) {
        newItemForm.setVisible(false);
        
//        enter data to dbhandler
        dbHandler.addNewItem(item);
        
        mainPage.refreshListOfItem();
    }
    
    public void sendUpdateData(Item item) {
        newItemForm.setVisible(false);
        
//        enter data to dbhandler
        dbHandler.editItemDescription(item);
        
        mainPage.refreshListOfItem();
    }

    public void cancelAddNewItem() {
        newItemForm.setVisible(false);
    }
    
}
