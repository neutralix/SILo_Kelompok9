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
        Invoice[] invoice = dbHandler.getListOfInvoice();
        invoiceDetailPage.prepareViewedInvoice(invoice[mainPage.getViewedInvoiceNo()]);
        
        invoiceDetailPage.setVisible(true);
    }

    void changeInvoiceStatus(String status, String invoiceNumber) {
        invoiceDetailPage.setVisible(false);
        
        dbHandler.changeInvoiceStatus(status, invoiceNumber);
        
        mainPage.refreshListOfInvoice();
    }
    
}
