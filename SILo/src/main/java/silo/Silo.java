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
public class Silo {
    
    static MainPage mainPage;
    static DBHandler dbHandler;
    static ItemForm newItemForm;
    static InvoiceDetailPage invoiceDetailPage;
    static DeliveryNoteDetailPage deliveryNoteDetailPage;
    static DeliveryNoteForm deliveryNoteForm;
    
    static ViewItemCtl viewItemCtl;
    static ItemCtl itemCtl;
    static ViewDeliveryNoteCtl viewDeliveryNoteCtl;
    static DeliveryNoteCtl deliveryNoteCtl;
    static ViewInvoiceCtl viewInvoiceCtl;
    static InvoiceCtl invoiceCtl;
    
    public static void main(String[] args){
        mainPage = new MainPage();
        dbHandler = new DBHandler();
        newItemForm = new ItemForm();
        invoiceDetailPage = new InvoiceDetailPage();
        deliveryNoteDetailPage = new DeliveryNoteDetailPage();
        deliveryNoteForm = new DeliveryNoteForm();
        
        viewItemCtl = new ViewItemCtl(mainPage, dbHandler);
        itemCtl = new ItemCtl(mainPage, dbHandler, newItemForm);
        viewDeliveryNoteCtl = new ViewDeliveryNoteCtl(mainPage, dbHandler);
        deliveryNoteCtl = new DeliveryNoteCtl(mainPage, dbHandler, deliveryNoteDetailPage, deliveryNoteForm);
        viewInvoiceCtl = new ViewInvoiceCtl(mainPage, dbHandler);
        invoiceCtl = new InvoiceCtl(mainPage, dbHandler, invoiceDetailPage);
        
        newItemForm.setCtl(itemCtl);
        invoiceDetailPage.setCtl(invoiceCtl);
        deliveryNoteDetailPage.setCtl(deliveryNoteCtl);
        deliveryNoteForm.setCtl(deliveryNoteCtl);
        mainPage.setCtl(viewItemCtl, itemCtl, viewDeliveryNoteCtl, deliveryNoteCtl, viewInvoiceCtl, invoiceCtl);
        
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                mainPage.setVisible(true);
            }
        });
    }
    
}
