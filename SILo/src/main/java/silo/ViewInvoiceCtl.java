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
public class ViewInvoiceCtl {

    private MainPage mainPage;
    private DBHandler dbHandler;
    
    public ViewInvoiceCtl(MainPage mainPage, DBHandler dbHandler) {
        this.mainPage = mainPage;
        this.dbHandler = dbHandler;
    }
    
    public void getListOfInvoice() {
        String[] result = dbHandler.getListOfInvoice();
        Invoice[] invoice = createInvoice(result);
        
        mainPage.showListOfInvoice(invoice);
    }

    private Invoice[] createInvoice(String[] result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void searchInvoice(String text) {
        String[] result = dbHandler.searchInvoice(text);
        Invoice[] invoice = createInvoice(result);
        
        mainPage.showListOfInvoice(invoice);
    }
    
}
