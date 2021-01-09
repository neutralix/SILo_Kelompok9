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
        DeliveryNote[] deliveryNote = dbHandler.getListOfDeliveryNote();
        
        Object[][] data = new Object[deliveryNote.length][7];
        for(int i=0; i<deliveryNote.length; i++){
            data[i][0] = deliveryNote[i].getInvoiceNumber();
            data[i][1] = deliveryNote[i].getDeliveryNoteNumber();
            data[i][2] = deliveryNote[i].getCustomerName();
            data[i][3] = deliveryNote[i].getCustomerEmailAddress();
            data[i][4] = deliveryNote[i].getOrderDate();
            data[i][5] = deliveryNote[i].getDeliveryDate();
            data[i][6] = deliveryNote[i].getStatus();
        }
        
        mainPage.showListOfDeliveryNote(data);
    }

    void searchDeliveryNote(String text) {
        DeliveryNote[] deliveryNote = dbHandler.searchDeliveryNote(text);
        
        Object[][] data = new Object[deliveryNote.length][7];
        for(int i=0; i<deliveryNote.length; i++){
            data[i][0] = deliveryNote[i].getInvoiceNumber();
            data[i][1] = deliveryNote[i].getDeliveryNoteNumber();
            data[i][2] = deliveryNote[i].getCustomerName();
            data[i][3] = deliveryNote[i].getCustomerEmailAddress();
            data[i][4] = deliveryNote[i].getOrderDate();
            data[i][5] = deliveryNote[i].getDeliveryDate();
            data[i][6] = deliveryNote[i].getStatus();
        }
        
        mainPage.showListOfDeliveryNote(data);
    }
    
    int findDeliveryNoteNo(String name) {
        int i = 0;
        DeliveryNote[] deliveryNote = dbHandler.getListOfDeliveryNote();
        
        for(i=0; i<deliveryNote.length; i++){
            DeliveryNote temp = deliveryNote[i];
            if(temp.getDeliveryNoteNumber().equals(name)) {
                break;
            }
        }
        
        return i;
    }
    
}
