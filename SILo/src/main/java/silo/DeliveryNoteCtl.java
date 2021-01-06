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
//        String[] result = dbHandler.getDeliveryNoteDescription();
//        DeliveryNote deliveryNote = createDeliveryNote(result);

        deliveryNoteDetailPage.setVisible(true);
//        send delivery note data to detail page
//        deliveryNoteDetailPage.viewDeliveryNoteDescription(invoice);
    }

    private DeliveryNote createDeliveryNote(String[] result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void changeDeliveryNoteStatus(String status) {
        dbHandler.changeDeliveryNoteStatus(status);
    }

    void requestDeliveryNoteForm() {
        deliveryNoteForm.setVisible(true);
    }
}
