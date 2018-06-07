package Restaurant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ShopForm extends javax.swing.JFrame {
    public static Connection conn=DBConnect.connect(); 
    String query=null;
    Statement st=null;
    String spare=null;
    
    public ShopForm() {
        initComponents();
        refresh();
    }
    void getItemTableData(){
        query="SELECT name,unit_price,quantity,category FROM item WHERE 1";
        try{
        ResultSet rs=new DBConnect().resultQuery(query);
        DefaultTableModel model= new DefaultTableModel(new String[]{"Name","Unit Price","Available","Category"}, 0);
        while(rs.next()){
            String col1 = rs.getString("name");
            String col2 = rs.getString("unit_price");
            String col3 = rs.getString("quantity");                
            String col4 = rs.getString("category"); 
            model.addRow(new Object[]{col1, col2, col3, col4});        
        }
        itemTable.setModel(model);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    void cartUpdate(){
        int selectedRowIndex = itemTable.getSelectedRow();
        query="SELECT name,unit_price,quantity,total FROM cart";
        try{
            ResultSet rs=new DBConnect().resultQuery(query);
            DefaultTableModel model= new DefaultTableModel(new String[]{"Name", "Unit Price", "Unit", "Total"}, 0);
            while(rs.next()){
            String col1 = rs.getString("name");
            String col2 = rs.getString("unit_price");
            String col3 = rs.getString("quantity");                
            String col4 = rs.getString("total");   
            model.addRow(new Object[]{col1, col2, col3, col4});        
        }
        cartTable.setModel(model);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    void refresh(){
        getItemTableData();
        unitField.setEditable(true);
        unitField.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectCategory = new javax.swing.JComboBox<>();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        shopingCartLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        checkoutButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        unitField = new javax.swing.JTextField();
        buyUnit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        selectCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Starter", "Main", "Desert" }));
        selectCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectCategoryActionPerformed(evt);
            }
        });

        searchButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        searchButton.setText("Search");
        searchButton.setToolTipText("");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Unit Price", "Available", "Category"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(itemTable);

        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Unit Price", "Unit", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(cartTable);

        shopingCartLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        shopingCartLabel.setText("Shoping Cart");

        addButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addButton.setText("Add To Cart");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        checkoutButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        checkoutButton.setText("Checkout");
        checkoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutButtonActionPerformed(evt);
            }
        });

        removeButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        removeButton.setText("Remove Item");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        unitField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitFieldActionPerformed(evt);
            }
        });

        buyUnit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buyUnit.setText("Units To Buy:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(shopingCartLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(147, 147, 147))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(checkoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(buyUnit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(unitField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(selectCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchButton))
                    .addComponent(shopingCartLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(unitField)
                    .addComponent(buyUnit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addButton)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectCategoryActionPerformed
            try{
                ResultSet rs=null;
                query="select * from item where category=?";
                PreparedStatement pst =conn.prepareStatement(query);
                pst.setString(1, selectCategory.getSelectedItem().toString());
                rs=pst.executeQuery();
                DefaultTableModel model= new DefaultTableModel(new String[]{"Name","Unit Price","Available","Category"}, 0);
                while(rs.next()){
                    String col1 = rs.getString("name");
                    String col2 = rs.getString("unit_price");
                    String col3 = rs.getString("quantity");                
                    String col4 = rs.getString("category");  
                    model.addRow(new Object[]{col1, col2, col3, col4});        
                    }
                itemTable.setModel(model);
                }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }            
    }//GEN-LAST:event_selectCategoryActionPerformed

    private void checkoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutButtonActionPerformed
            try{
                ResultSet rs=null;
                query="SELECT name, unit_price, quantity, total FROM cart WHERE ?";
                PreparedStatement pst =conn.prepareStatement(query);
                pst.setString(1, "1");
                rs=pst.executeQuery();
                while(rs.next()){
                    String name = rs.getString("name");
                    int price =Integer.valueOf(rs.getString("unit_price"));
                    int quantity =Integer.valueOf(rs.getString("quantity")) ;                
                    int total= Integer.valueOf(rs.getString("total"));
                    new DBConnect().updateQuery("INSERT INTO sales (name,unit_price,quantity,total) values ('"+name+"',"+price+","+quantity+","+total+")");
                }
                new DBConnect().updateQuery("TRUNCATE cart");
                 DefaultTableModel model= new DefaultTableModel(new String[]{"Name","Unit Price","Unit","Total"}, 0);
                 cartTable.setModel(model);
                 JOptionPane.showMessageDialog(null,"Transaction Successful Please collect your Memo");
                
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }        
    }//GEN-LAST:event_checkoutButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        if(searchField.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Enter Product Name To Search");
        else{
            try{
                ResultSet rs=null;
                query="select * from item where name=?";
                PreparedStatement pst =conn.prepareStatement(query);
     //         System.out.println(searchField.getText());
                pst.setString(1,searchField.getText());
                rs=pst.executeQuery();
                DefaultTableModel model= new DefaultTableModel(new String[]{"Name","Unit Price","Available","Category"}, 0);
                while(rs.next()){
                    String col1 = rs.getString("name");
                    String col2 = rs.getString("unit_price");
                    String col3 = rs.getString("quantity");                
                    String col4 = rs.getString("category");  
                    model.addRow(new Object[]{col1, col2, col3, col4});        
                    }
                itemTable.setModel(model);
                }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }            
           }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
         int selectedRowIndex = itemTable.getSelectedRow();        
         if((selectedRowIndex >= 0)&&(!unitField.getText().equals(""))){
             String name=(itemTable.getModel().getValueAt(selectedRowIndex, 0).toString());
             int unitPrice=Integer.valueOf(itemTable.getModel().getValueAt(selectedRowIndex,1 ).toString());
             int available=Integer.valueOf(itemTable.getModel().getValueAt(selectedRowIndex, 2).toString());
             int userNeed=Integer.valueOf(unitField.getText().toString());
             int total;
             if(userNeed<=available){
                 total=userNeed*unitPrice;
                 spare="INSERT INTO cart (name,unit_price,quantity,total) values ('"+name+"',"+unitPrice+","+userNeed+","+total+")";
                 new DBConnect().updateQuery(spare);
                 cartUpdate();
                 unitField.setEditable(true);
                 unitField.setText("");
             }
             else{
                 JOptionPane.showMessageDialog(null, "Required Product Quantity is not available Or Quantity not entered");
             }
         }
         else{
             JOptionPane.showMessageDialog(null,"Select An Item First And also valid Quantity");
         }
    }//GEN-LAST:event_addButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        try{
       
        
     
           // Connection con=new DBConnect().connect();
            int selectedRowIndex = cartTable.getSelectedRow();
            spare=cartTable.getModel().getValueAt(selectedRowIndex,0).toString();
            query="Select sn from cart where name='"+spare;
            ResultSet rs=null;
            System.out.println("lalalal");
            System.out.println(spare);
            //Statement st=con.createStatement();
            
           Statement tt;
           tt=conn.createStatement();
           tt.executeUpdate("DELETE FROM `cart` WHERE `cart`.`name` = '"+spare+"'");
            //System.out.println(rs.getText(sn));
   //         PreparedStatement pst =conn.prepareStatement(query);
  //        pst.setString(1,spare);
//            ResultSet rs=pst.executeQuery();
   //         int i=Integer.valueOf(rs.getString("sn"));
     //       new DBConnect().updateQuery("DELETE FROM cart WHERE sn="+i);
           // */
            //int selectedRowIndex = cartTable.getSelectedRow();
            //Statement st=conn.createStatement();
            //st.executeUpdate("DELETE FROM cart WHERE name="+cartTable.getModel().getValueAt(selectedRowIndex,0));
//System.out.println("lalalal");
            ((DefaultTableModel)cartTable.getModel()).removeRow(selectedRowIndex);
           // System.out.println("lalalal");
            //query="";
            //new DBConnect().updateQuery();
        }
        
        catch(Exception ew){
            JOptionPane.showMessageDialog(null,"You Need to select a row to Perform Remove");
      
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void unitFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel buyUnit;
    private javax.swing.JTable cartTable;
    private javax.swing.JButton checkoutButton;
    private javax.swing.JTable itemTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JComboBox<String> selectCategory;
    private javax.swing.JLabel shopingCartLabel;
    private javax.swing.JTextField unitField;
    // End of variables declaration//GEN-END:variables
}
