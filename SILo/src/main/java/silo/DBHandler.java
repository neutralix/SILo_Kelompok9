/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Mystery-PC
 */
public class DBHandler {
    private List<Item> items;
    private List<Invoice> invoices;
    private List<DeliveryNote> deliveryNotes;
    private SimpleDateFormat dateFormat;
    
    public DBHandler(){
        dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        initItem();
        initInvoice();
        initDeliveryNote();
    }
    
    public void initItem(){
        items = new ArrayList<Item>();
        
        try{
            File itemDb = new File("ItemDB.txt");
            Scanner scanner = new Scanner(itemDb);
            while(scanner.hasNextLine()){
                String data = scanner.nextLine();
                String[] str = data.split("/");
                items.add(new Item(str[0], str[1], str[2], str[3], str[4], str[5], Integer.parseInt(str[6])));
            }
        } catch(FileNotFoundException e){
            
        }
    }
    
    public void initInvoice(){
        invoices = new ArrayList<Invoice>();
        
        try{
            File invoiceDb = new File("InvoiceDB.txt");
            Scanner scanner = new Scanner(invoiceDb);
            while(scanner.hasNextLine()){
                String data = scanner.nextLine();
                String[] str = data.split("/");
                Date orderDate = null, deliveryDate = null;
                try{
                    orderDate = dateFormat.parse(str[3]);
                    deliveryDate = dateFormat.parse(str[4]);
                } catch(ParseException e){
                    
                }
                
                invoices.add(new Invoice(str[0], str[1], str[2], orderDate, deliveryDate, str[5]));
            }
        } catch(FileNotFoundException e){
            
        }
    }
    
    public void initDeliveryNote(){
        deliveryNotes = new ArrayList<DeliveryNote>();
        
        try{
            File deliveryNoteDb = new File("DeliveryNoteDB.txt");
            Scanner scanner = new Scanner(deliveryNoteDb);
            while(scanner.hasNextLine()){
                String data = scanner.nextLine();
                String[] str = data.split("/");
                Date orderDate = null, deliveryDate = null;
                try{
                    orderDate = dateFormat.parse(str[4]);
                    deliveryDate = dateFormat.parse(str[5]);
                } catch(ParseException e){
                    
                }
                
                deliveryNotes.add(new DeliveryNote(str[0], str[1], str[2], str[3], orderDate, deliveryDate, str[6]));
            }
        } catch(FileNotFoundException e){
            
        }
    }
    
    public Item[] getListOfItem() {
        Item[] data = new Item[items.size()];
        for(int i=0; i<items.size(); i++)
            data[i] = items.get(i);
        
        return data;
    }

    public Item[] searchItem(String text) {
        List<Item> matchedItem = new ArrayList<Item>();
        for(int i=0; i<items.size(); i++){
            Item temp = items.get(i);
            if(temp.getItemId().toLowerCase().contains(text) || temp.getBarcode().toLowerCase().contains(text) ||
               temp.getTitle().toLowerCase().contains(text) || temp.getDescription().toLowerCase().contains(text) ||
               temp.getManufacturer().toLowerCase().contains(text) || temp.getUrl().toLowerCase().contains(text))
               
                matchedItem.add(temp);
        }
        
        Item[] data = new Item[matchedItem.size()];
        for(int i=0; i<matchedItem.size(); i++)
            data[i] = matchedItem.get(i);
        
        return data;
    }

    public void addNewItem(Item item) {
        items.add(item);
        try{
            FileWriter itemDbWriter = new FileWriter("ItemDB.txt");
            
            for(int i=0; i<items.size(); i++){
                Item temp = items.get(i);
                itemDbWriter.write(
                    temp.getItemId() + "/" +
                    temp.getBarcode() + "/" +
                    temp.getTitle() + "/" +
                    temp.getDescription() + "/" +
                    temp.getManufacturer() + "/" +
                    temp.getUrl() + "/" +
                    Integer.toString(temp.getNumberOfStock()) + "\n"
                );
            }
            itemDbWriter.close();
        } catch(IOException e){
            System.out.println("An error occurred.");
        }
    }
    
    void editItemDescription(Item item) {
        for(int i=0; i<items.size(); i++){
            Item temp = items.get(i);
            
            if(temp.getItemId().equals(item.getItemId())) {
                temp.setBarcode(item.getBarcode());
                temp.setTitle(item.getTitle());
                temp.setDescription(item.getDescription());
                temp.setManufacturer(item.getManufacturer());
                temp.setUrl(item.getUrl());
                temp.setNumberOfStock(item.getNumberOfStock());
                break;
            }
        }
        
        try{
            FileWriter itemDbWriter = new FileWriter("ItemDB.txt");
            
            for(int i=0; i<items.size(); i++){
                Item temp = items.get(i);
                itemDbWriter.write(
                    temp.getItemId() + "/" +
                    temp.getBarcode() + "/" +
                    temp.getTitle() + "/" +
                    temp.getDescription() + "/" +
                    temp.getManufacturer() + "/" +
                    temp.getUrl() + "/" +
                    Integer.toString(temp.getNumberOfStock()) + "\n"
                );
            }
            itemDbWriter.close();
        } catch(IOException e){
            System.out.println("An error occurred.");
        }
    }

    public Invoice[] getListOfInvoice() {
        Invoice[] data = new Invoice[invoices.size()];
        for(int i=0; i<invoices.size(); i++)
            data[i] = invoices.get(i);
        
        return data;
    }

    public Invoice[] searchInvoice(String text) {
        List<Invoice> matchedInvoice = new ArrayList<Invoice>();
        for(int i=0; i<invoices.size(); i++){
            Invoice temp = invoices.get(i);
            if(temp.getInvoiceNumber().toLowerCase().contains(text) || temp.getPoNumber().toLowerCase().contains(text))
                matchedInvoice.add(temp);
        }
        
        Invoice[] data = new Invoice[matchedInvoice.size()];
        for(int i=0; i<matchedInvoice.size(); i++)
            data[i] = matchedInvoice.get(i);
        
        return data;
    }

    void changeInvoiceStatus(String status, String invoiceNumber) {
        for(int i=0; i<invoices.size(); i++){
            Invoice temp = invoices.get(i);
            if(temp.getInvoiceNumber().equals(invoiceNumber)){
                temp.setStatus(status);
                break;
            }
        }
        
        try{
            FileWriter invoiceDbWriter = new FileWriter("InvoiceDB.txt");
            
            for(int i=0; i<invoices.size(); i++){
                Invoice temp = invoices.get(i);
                invoiceDbWriter.write(
                    temp.getInvoiceNumber() + "/" +
                    temp.getPoNumber() + "/" +
                    temp.getSupplierName() + "/" +
                    temp.getOrderDate() + "/" +
                    temp.getDeliveryDate() + "/" +
                    temp.getStatus() + "\n"
                );
            }
            invoiceDbWriter.close();
        } catch(IOException e){
            System.out.println("An error occurred.");
        }
    }

    DeliveryNote[] getListOfDeliveryNote() {
        DeliveryNote[] data = new DeliveryNote[deliveryNotes.size()];
        for(int i=0; i<deliveryNotes.size(); i++)
            data[i] = deliveryNotes.get(i);
        
        return data;
    }

    String[] searchDeliveryNote(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String[] getDeliveryNoteDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void changeDeliveryNoteStatus(String status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
