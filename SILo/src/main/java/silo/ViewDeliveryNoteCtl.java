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
public class ViewDeliveryNoteCtl {
    
    private MainPage mainPage;
    private DBHandler dbHandler;

    public ViewDeliveryNoteCtl(MainPage mainPage, DBHandler dbHandler) {
        this.mainPage = mainPage;
        this.dbHandler = dbHandler;
    }
    
    public void getListOfDeliveryNote() {
        String[] result = dbHandler.getListOfDeliveryNote();
        DeliveryNote[] deliveryNote = createDeliveryNote(result);
        
        mainPage.showListOfDeliveryNote(deliveryNote);
    }

    private DeliveryNote[] createDeliveryNote(String[] result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void searchDeliveryNote(String text) {
        String[] result = dbHandler.searchDeliveryNote(text);
        DeliveryNote[] deliveryNote = createDeliveryNote(result);
        
        mainPage.showListOfDeliveryNote(deliveryNote);
    }
    
}
