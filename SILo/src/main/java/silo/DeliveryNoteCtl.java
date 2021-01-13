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

    void changeDeliveryNoteStatus(String status, String deliveryNoteNumber) {
        deliveryNoteDetailPage.setVisible(false);
        
        dbHandler.changeDeliveryNoteStatus(status, deliveryNoteNumber);
        
        mainPage.refreshListOfDeliveryNote();
    }

    void requestDeliveryNoteForm() {
        deliveryNoteForm.clearForm();
        deliveryNoteForm.setVisible(true);
    }

    void sendDeliveryNoteData(DeliveryNote deliveryNote) {
        deliveryNoteForm.setVisible(false);
        
        dbHandler.createNewDeliveryNote(deliveryNote);

        mainPage.refreshListOfDeliveryNote();
        deliveryNoteDetailPage.prepareViewedDeliveryNote(deliveryNote);
        deliveryNoteDetailPage.setVisible(true);
    }

    void sendSoftcopyDone() {
        deliveryNoteDetailPage.setVisible(false);
    }

    void printDeliveryNote() {
        deliveryNoteDetailPage.setVisible(false);
    }
}
