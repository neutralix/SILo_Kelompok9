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
    
    private MainPage mainPage;
    private DBHandler dbHandler;
    private InvoiceDetailPage invoiceDetailPage;

    public InvoiceCtl(MainPage mainPage, DBHandler dbHandler, InvoiceDetailPage invoiceDetailPage) {
        this.mainPage = mainPage;
        this.dbHandler = dbHandler;
        this.invoiceDetailPage = invoiceDetailPage;
    }
    
    void getInvoiceDescription() {
//        String[] result = dbHandler.getInvoiceDescription();
//        Invoice invoice = createInvoice(result);

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
