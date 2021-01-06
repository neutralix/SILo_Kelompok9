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
public class InvoiceCtl {
    
    private InvoiceDetailPage invoiceDetailPage;
    private DBHandler dbHandler;
    private MainPage mainPage;
    
    void getInvoiceDescription(InvoiceDetailPage invoiceDP) {
//        String[] result = dbHandler.getInvoiceDescription();
//        Invoice invoice = createInvoice(result);

        invoiceDetailPage = invoiceDP;
        invoiceDetailPage.setVisible(true);
//        send invoice data to detail page
//        invoiceDetailPage.viewInvoiceDescription(invoice);
    }

    private Invoice createInvoice(String[] result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void changeInvoiceStatus(String status) {
        dbHandler.changeInvoiceStatus(status);
    }
    
}
