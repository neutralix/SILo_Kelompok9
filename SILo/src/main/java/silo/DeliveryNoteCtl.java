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
public class DeliveryNoteCtl {
    
    private MainPage mainPage;
    private DBHandler dbHandler;
    private DeliveryNoteDetailPage deliveryNoteDetailPage;
    private DeliveryNoteForm deliveryNoteForm;

    public DeliveryNoteCtl(MainPage mainPage, DBHandler dbHandler, DeliveryNoteDetailPage deliveryNoteDetailPage, DeliveryNoteForm deliveryNoteForm) {
        this.mainPage = mainPage;
        this.dbHandler = dbHandler;
        this.deliveryNoteDetailPage = deliveryNoteDetailPage;
        this.deliveryNoteForm = deliveryNoteForm;
    }

    void getDeliveryNoteDescription() {
        DeliveryNote[] deliveryNote = dbHandler.getListOfDeliveryNote();
        deliveryNoteDetailPage.prepareViewedDeliveryNote(deliveryNote[mainPage.getViewedDeliveryNoteNo()]);
        
        deliveryNoteDetailPage.setVisible(true);
    }

    private DeliveryNote[] createDeliveryNote(String[] result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void changeDeliveryNoteStatus(String status) {
        dbHandler.changeDeliveryNoteStatus(status);
    }

    void requestDeliveryNoteForm() {
        deliveryNoteForm.setVisible(true);
    }

    void sendDeliveryNoteData() {
        deliveryNoteForm.setVisible(false);
//        enter data to dbhandler
//        step 15
//        dbHandler.addNewItem();
//        step 16 17
//        String[] result = dbHandler.getListOfDeliveryNote();
//        DeliveryNote[] deliveryNote = createDeliveryNote(result);
        
//        add data to delivery note detail page
        deliveryNoteDetailPage.setVisible(true);
    }

    void sendSoftcopyDone() {
        deliveryNoteDetailPage.setVisible(false);
    }

    void printDeliveryNote() {
        deliveryNoteDetailPage.setVisible(false);
    }
}
