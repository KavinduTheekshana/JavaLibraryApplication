/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalibraryapplication.view;

import java.sql.ResultSet;
import java.util.Vector;
import javalibraryapplication.database.DbConnection;
import javalibraryapplication.model.DbSearch;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kavindu Theekshana
 */
public class UserDashboard extends javax.swing.JFrame {
    /**
     * Creates new form UserDashboard
     */
    public UserDashboard() {
        initComponents();
        displayBookDetails();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnl = new javax.swing.JPanel();
        tablePane = new javax.swing.JTabbedPane();
        search = new javax.swing.JPanel();
        cmbSchField = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBook = new javax.swing.JTable();
        view = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBorrow = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("USER DASHBOARD");

        jPanel1.setBackground(new java.awt.Color(247, 249, 249));

        search.setBackground(new java.awt.Color(247, 249, 249));

        cmbSchField.setFont(new java.awt.Font("Montserrat Light", 0, 20)); // NOI18N
        cmbSchField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Author", "Category" }));

        txtSearch.setFont(new java.awt.Font("Montserrat Light", 0, 24)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        tblBook.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tblBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ISBN", "Name", "Category", "Author", "Price", "Copies"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBook.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tblBook);

        javax.swing.GroupLayout searchLayout = new javax.swing.GroupLayout(search);
        search.setLayout(searchLayout);
        searchLayout.setHorizontalGroup(
            searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchLayout.createSequentialGroup()
                        .addGap(0, 851, Short.MAX_VALUE)
                        .addComponent(cmbSchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        searchLayout.setVerticalGroup(
            searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                .addContainerGap())
        );

        tablePane.addTab("Search Books", search);

        view.setBackground(new java.awt.Color(247, 249, 249));

        tblBorrow.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tblBorrow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Membership No", "Member Name", "Book ID", "Book Name", "Category", "Returned Date", "Condetion", "Condetion Payment", "Aditional Payment", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBorrow.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(tblBorrow);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewLayout = new javax.swing.GroupLayout(view);
        view.setLayout(viewLayout);
        viewLayout.setHorizontalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1454, Short.MAX_VALUE)
                    .addGroup(viewLayout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        viewLayout.setVerticalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                .addContainerGap())
        );

        tablePane.addTab("View", view);

        javax.swing.GroupLayout pnlLayout = new javax.swing.GroupLayout(pnl);
        pnl.setLayout(pnlLayout);
        pnlLayout.setHorizontalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablePane)
        );
        pnlLayout.setVerticalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablePane)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu2.setText("Search");
        jMenuBar1.add(jMenu2);

        jMenu1.setText("Borrows");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        try {
            ResultSet rs;
            if(cmbSchField.getSelectedItem().toString()=="Name"){
                rs = new DbSearch().searchBookName(txtSearch.getText());
            }
            else if(cmbSchField.getSelectedItem().toString()=="Author"){
                rs = new DbSearch().searchBookAuthor(txtSearch.getText());
            }
            else if(cmbSchField.getSelectedItem().toString()=="Category"){
                rs = new DbSearch().searchBookCategory(txtSearch.getText());
            }
            else{
                rs = new DbSearch().searchBorrowId(txtSearch.getText());
            }
            DefaultTableModel dtm = (DefaultTableModel)
            tblBook.getModel();
            dtm.setRowCount(0);
            Vector v;
            while(rs.next())
            {
                v = new Vector();
                v.add(rs.getString("id"));
                v.add(rs.getString("isbn"));
                v.add(rs.getString("bookname"));
                v.add(rs.getString("category"));
                v.add(rs.getString("author"));
                v.add(rs.getString("price"));
                v.add(rs.getString("copyno"));
                dtm.addRow(v);
            }
            DbConnection.closeCon();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        displayBorrowDetails();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDashboard().setVisible(true);
            }
        });
    }
    
     public void displayBookDetails(){
        ResultSet rs = new DbSearch().searchBooks();
        DefaultTableModel dtm = (DefaultTableModel)
                tblBook.getModel();
                dtm.setRowCount(0);
        try
        {
            Vector v;
            while(rs.next())
            {
                v = new Vector();
                v.add(rs.getString("bookid"));
                v.add(rs.getString("isbn"));
                v.add(rs.getString("bookname"));
                v.add(rs.getString("category"));
                v.add(rs.getString("author"));
                v.add(rs.getString("price"));
                v.add(rs.getString("copyno"));
                dtm.addRow(v);
            }
            DbConnection.closeCon();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
     }
     
     public void displayBorrowDetails(){
        System.out.println(jTextField2.getText());
        ResultSet rs = new DbSearch().searchReturnwhenuser(jTextField2.getText());
        DefaultTableModel dtm = (DefaultTableModel)
                tblBorrow.getModel();
                dtm.setRowCount(0);
        try
        {
            Vector v;
            while(rs.next())
            {
                v = new Vector();
                v.add(rs.getString("id"));
                v.add(rs.getString("membership_no"));
                v.add(rs.getString("member_name"));
                v.add(rs.getString("book_id"));
                v.add(rs.getString("bookname"));
                v.add(rs.getString("category"));
                v.add(rs.getString("returned_date"));
                v.add(rs.getString("condetion"));
                v.add(rs.getString("condetion_Payment"));
                v.add(rs.getString("aditionl_payment"));
                v.add(rs.getString("total_Payment"));
                dtm.addRow(v);
            }
            DbConnection.closeCon();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbSchField;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTextField jTextField2;
    private javax.swing.JPanel pnl;
    private javax.swing.JPanel search;
    private javax.swing.JTabbedPane tablePane;
    private javax.swing.JTable tblBook;
    private javax.swing.JTable tblBorrow;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JPanel view;
    // End of variables declaration//GEN-END:variables

    
}
