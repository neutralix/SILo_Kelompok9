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
        Invoice[] invoice = dbHandler.getListOfInvoice();
        
        Object[][] data = new Object[invoice.length][6];
        for(int i=0; i<invoice.length; i++){
            data[i][0] = invoice[i].getInvoiceNumber();
            data[i][1] = invoice[i].getPoNumber();
            data[i][2] = invoice[i].getSupplierName();
            data[i][3] = invoice[i].getOrderDate();
            data[i][4] = invoice[i].getDeliveryDate();
            data[i][5] = invoice[i].getStatus();
        }
        
        mainPage.showListOfInvoice(data);
    }

    void searchInvoice(String text) {
        Invoice[] invoice = dbHandler.searchInvoice(text);
        
        Object[][] data = new Object[invoice.length][6];
        for(int i=0; i<invoice.length; i++){
            data[i][0] = invoice[i].getInvoiceNumber();
            data[i][1] = invoice[i].getPoNumber();
            data[i][2] = invoice[i].getSupplierName();
            data[i][3] = invoice[i].getOrderDate();
            data[i][4] = invoice[i].getDeliveryDate();
            data[i][5] = invoice[i].getStatus();
        }
        
        mainPage.showListOfInvoice(data);
    }

    int findInvoiceNo(String name) {
        int i = 0;
        Invoice[] invoice = dbHandler.getListOfInvoice();
        
        for(i=0; i<invoice.length; i++){
            Invoice temp = invoice[i];
            if(temp.getInvoiceNumber().equals(name)) {
                break;
            }
        }
        
        return i;
    }
    
}
