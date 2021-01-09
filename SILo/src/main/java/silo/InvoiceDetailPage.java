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
public class InvoiceDetailPage extends javax.swing.JFrame {
    
    private InvoiceCtl invoiceCtl;
    
    /**
     * Creates new form InvoiceDetailPage
     */
    public InvoiceDetailPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        acceptBtn = new javax.swing.JButton();
        pendingBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        invoiceNumberLabel = new javax.swing.JLabel();
        poNumberLabel = new javax.swing.JLabel();
        supplierNameLabel = new javax.swing.JLabel();
        orderDateLabel = new javax.swing.JLabel();
        deliveryDateLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();

        acceptBtn.setText("Accept");
        acceptBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acceptBtnMouseClicked(evt);
            }
        });

        pendingBtn.setText("Pending");
        pendingBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pendingBtnMouseClicked(evt);
            }
        });

        jLabel1.setText("invoice number");

        jLabel2.setText("po number");

        jLabel3.setText("supplier name");

        jLabel4.setText("order date");

        jLabel5.setText("delivery date");

        jLabel6.setText("status");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(acceptBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(invoiceNumberLabel)
                    .addComponent(pendingBtn)
                    .addComponent(poNumberLabel)
                    .addComponent(supplierNameLabel)
                    .addComponent(orderDateLabel)
                    .addComponent(deliveryDateLabel)
                    .addComponent(statusLabel))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(invoiceNumberLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(poNumberLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(supplierNameLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(orderDateLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(deliveryDateLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(statusLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acceptBtn)
                    .addComponent(pendingBtn))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acceptBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acceptBtnMouseClicked
        // TODO add your handling code here:
        invoiceCtl.changeInvoiceStatus("completed", invoiceNumberLabel.getText());
    }//GEN-LAST:event_acceptBtnMouseClicked

    private void pendingBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendingBtnMouseClicked
        // TODO add your handling code here:
        invoiceCtl.changeInvoiceStatus("pending", invoiceNumberLabel.getText());
    }//GEN-LAST:event_pendingBtnMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptBtn;
    private javax.swing.JLabel deliveryDateLabel;
    private javax.swing.JLabel invoiceNumberLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel orderDateLabel;
    private javax.swing.JButton pendingBtn;
    private javax.swing.JLabel poNumberLabel;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel supplierNameLabel;
    // End of variables declaration//GEN-END:variables

    void viewInvoiceDescription(Invoice invoice) {
//        show invoice data to detail page
    }

    void setCtl(InvoiceCtl invoiceCtl) {
        this.invoiceCtl = invoiceCtl;
    }

    void prepareViewedInvoice(Invoice invoice) {
        invoiceNumberLabel.setText(invoice.getInvoiceNumber());
        poNumberLabel.setText(invoice.getPoNumber());
        supplierNameLabel.setText(invoice.getSupplierName());
        orderDateLabel.setText(invoice.getOrderDate());
        deliveryDateLabel.setText(invoice.getDeliveryDate());
        statusLabel.setText(invoice.getStatus());
    }
}
