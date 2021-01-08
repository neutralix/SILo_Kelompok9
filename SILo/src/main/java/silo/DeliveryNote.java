/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Mystery-PC
 */
public class DeliveryNote {
    private String invoiceNumber;
    private String deliveryNoteNumber;
    private String customerName;
    private String customerEmailAddress;
    private Date orderDate;
    private Date deliveryDate;
    private String status;
    
    private SimpleDateFormat dateFormat;

    public DeliveryNote(String invoiceNumber, String deliveryNoteNumber, String customerName, String customerEmailAddress, Date orderDate, Date deliveryDate, String status) {
        this.invoiceNumber = invoiceNumber;
        this.deliveryNoteNumber = deliveryNoteNumber;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.status = status;
        
        dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getDeliveryNoteNumber() {
        return deliveryNoteNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public String getOrderDate() {
        return dateFormat.format(orderDate);
    }

    public String getDeliveryDate() {
        return dateFormat.format(deliveryDate);
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
