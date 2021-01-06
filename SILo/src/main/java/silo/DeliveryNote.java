/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silo;

import java.util.Date;

/**
 *
 * @author Mystery-PC
 */
public class DeliveryNote {
    private int invoiceNumber;
    private int poNumber;
    private String supplierName;
    private Date orderDate;
    private Date deliveryDate;
    private String status;

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public int getPoNumber() {
        return poNumber;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public String getStatus() {
        return status;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
