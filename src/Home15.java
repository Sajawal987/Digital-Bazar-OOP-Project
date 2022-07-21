import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Home15 extends javax.swing.JFrame {

    public Home15(int currentUserIndex) {
        initComponents(currentUserIndex);
    }

    public Home15() {

    }

    private void initComponents(int currentUserIndex) {

        main = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_active = new javax.swing.JLabel();
        btn_staff = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        home = new javax.swing.JPanel();
        Active = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();

        jTable1 = new javax.swing.JTable();
        staff = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTable2 = new javax.swing.JTable();



        //  For Title Bar
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        main.setBackground(new java.awt.Color(255, 255, 255));

        ImageIcon back = new ImageIcon("images/back.png");
        back.setImage(back.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));

        JButton b2 = new JButton();
        b2.setBounds(10,10,50,35);
        b2.setBorder(BorderFactory.createEmptyBorder());
        b2.setBackground(new Color(45, 204, 187));
        b2.setIcon(back);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                WelcomePage obj = new WelcomePage();
                obj.WelcomePage(currentUserIndex);
            }

        });

        header.add(b2);
        header.setBackground(new java.awt.Color(45, 204, 187));
        header.setPreferredSize(new java.awt.Dimension(838, 200));

        // For Drag whole the screen
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buying and Selling Point");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Digital Bazar");

        /// Close Menu

        jLabel3.setBackground(new java.awt.Color(45, 204, 187));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("X");
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        btn_active.setBackground(new java.awt.Color(41, 166, 149));
        btn_active.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_active.setForeground(new java.awt.Color(255, 255, 255));
        btn_active.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_active.setText("Active Products");
        btn_active.setOpaque(true);
        btn_active.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_studentsMouseClicked(evt);
            }
        });

        btn_staff.setBackground(new java.awt.Color(41, 166, 149));
        btn_staff.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_staff.setForeground(new java.awt.Color(255, 255, 255));
        btn_staff.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_staff.setText("Bought Product");
        btn_staff.setOpaque(true);
        btn_staff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_staffMouseClicked(evt);
            }
        });





        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
                headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(headerLayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(headerLayout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addGroup(headerLayout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addComponent(jLabel1)))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(headerLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(btn_active, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_staff, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(388, 388, 388))))
        );
        headerLayout.setVerticalGroup(
                headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(30, 30, 30)
                                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn_staff, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_active, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        home.setLayout(new java.awt.CardLayout());

        Active.setBackground(new java.awt.Color(255, 255, 255));
        Active.setLayout(new javax.swing.BoxLayout(Active, javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);

        ImageIcon Edit = new ImageIcon("images/Edit.png");
        Edit.setImage(Edit.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));

        JButton BEdit = new JButton();
        BEdit.setBounds(430,26,40,30);
        BEdit.setBackground(new Color(45, 204, 187));
        BEdit.setForeground(Color.DARK_GRAY);
        BEdit.setFont(new Font("Century Gothic", Font.BOLD, 20));
        BEdit.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        BEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        ImageIcon Del = new ImageIcon("images/delete.png");
        Del.setImage(Del.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));

        JButton Delete = new JButton();
        Delete.setBounds(430,26,40,30);
        Delete.setBackground(new Color(45, 204, 187));
        Delete.setForeground(Color.DARK_GRAY);
        Delete.setFont(new Font("Century Gothic", Font.BOLD, 20));
        Delete.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        Delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        Delete.setIcon(Del);
        BEdit.setIcon(Edit);

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(51, 51, 51));


        userBL tempUser = userDL.retrieveFromIndex(currentUserIndex);
        String P_id ="";
        String P_title="";
        String P_des ="";
        String P_dop ="";
        String P_loc ="";
        String P_con ="";
        String P_price ="";



        jTable1.setDefaultRenderer(Object.class,new Render());

        d1 =  new DefaultTableModel(){
           public boolean isCellEditable(int row,int column) {
               if(column ==0 || column == 3|| column == 7 || column == 8 )
                   return false;
               else
                   return true;
           }
        };
        d1.setColumnIdentifiers(  new Object[]{
                "Product ID", "Product Name", "Description", "Date of Publish", "Condition", "Price", "Location", "Edit", "Delete"
        });
        jTable1.setModel(d1);
        for(int i=0 ;i<tempUser.getAllProducts();i++){
                P_id = tempUser.getAllproducts().get(i).getProduct_id();
                P_title = tempUser.getAllproducts().get(i).getTitle();
                P_des = tempUser.getAllproducts().get(i).getDescription();
                P_dop = tempUser.getAllproducts().get(i).getDateOfPublish();
                P_loc = tempUser.getAllproducts().get(i).getLocation();
                P_con = tempUser.getAllproducts().get(i).getCondition();
                P_price = String.valueOf((((tempUser).getAllproducts()).get(i)).getPrice());
                d1.addRow( new Object[]{
                        P_id, P_title, P_des, P_dop, P_con, P_price, P_loc,BEdit,Delete
                });


        }


        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setRowHeight(40);
        jTable1.setSelectionBackground(new java.awt.Color(41, 166, 149));
        jScrollPane1.setViewportView(jTable1);

        Active.add(jScrollPane1);

        home.add(Active, "card3");


        staff.setBackground(new java.awt.Color(255, 255, 255));

//        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
//        jLabel4.setForeground(new java.awt.Color(41, 166, 149));
//        jLabel4.setText("Never Mind No Data here for now (:-");

        javax.swing.GroupLayout staffLayout = new javax.swing.GroupLayout(staff);


        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 12));
        jTable2.setForeground(new java.awt.Color(51, 51, 51));

        jTable2.setDefaultRenderer(Object.class,new Render());

        d2 =  new DefaultTableModel(){
            public boolean isCellEditable(int row,int column) {
                return false;
            }
        };
        d2.setColumnIdentifiers(  new Object[]{
                "Product ID", "Product Name", "Description", "Date of Publish", "Condition", "Price", "Location"
        });
        jTable2.setModel(d2);
        for(int i=0 ;i<userDL.retrieveFromIndex(currentUserIndex).getAllProducts2();i++){
            P_id = userDL.retrieveFromIndex(currentUserIndex).retrieveFromIndex2(i).getProduct_id();
            P_title = userDL.retrieveFromIndex(currentUserIndex).retrieveFromIndex2(i).getTitle();
            P_des = userDL.retrieveFromIndex(currentUserIndex).retrieveFromIndex2(i).getDescription();
            P_dop = userDL.retrieveFromIndex(currentUserIndex).retrieveFromIndex2(i).getDateOfPublish();
            P_loc = userDL.retrieveFromIndex(currentUserIndex).retrieveFromIndex2(i).getLocation();
            P_con = userDL.retrieveFromIndex(currentUserIndex).retrieveFromIndex2(i).getCondition();
            P_price = String.valueOf((userDL.retrieveFromIndex(currentUserIndex).retrieveFromIndex2(i).getPrice()));
            d2.addRow( new Object[]{
                    P_id, P_title, P_des, P_dop, P_con, P_price, P_loc
            });
        }
        jTable2.setGridColor(new java.awt.Color(255, 255, 255));
        jTable2.setRowHeight(40);
        jTable2.setSelectionBackground(new java.awt.Color(41, 166, 149));
        jScrollPane2.setViewportView(jTable2);
        staff.add(jScrollPane2);


        staff.setLayout(new javax.swing.BoxLayout(staff, javax.swing.BoxLayout.LINE_AXIS));
//        staffLayout.setHorizontalGroup(
//                staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGroup(staffLayout.createSequentialGroup()
//                                .addGap(203, 203, 203)
//                                .addComponent(jLabel4)
//                                .addContainerGap(244, Short.MAX_VALUE))
//        );
//        staffLayout.setVerticalGroup(
//                staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGroup(staffLayout.createSequentialGroup()
//                                .addGap(116, 116, 116)
//                                .addComponent(jLabel4)
//                                .addContainerGap(160, Short.MAX_VALUE))
//        );

        home.add(staff, "card3");

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
                mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE)
                        .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainLayout.setVerticalGroup(
                mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainLayout.createSequentialGroup()
                                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 536, Short.MAX_VALUE)
        );

        pack();
        jTable1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int column= jTable1.getColumnModel ().getColumnIndexAtX (e.getX());
                int row = e.getY()/jTable1.getRowHeight();
                if (row < jTable1.getRowCount () && row >= 0 && column < jTable1.getColumnCount() && column >= 0) {
                    Object value = jTable1.getValueAt (row, column);
                    if (value instanceof JButton) {
                        ((JButton) value).doClick();
                        JButton button =(JButton) value;
                        if(button==BEdit){
//                            JOptionPane.showMessageDialog(null,"Editing");
                            Object id = jTable1.getValueAt(row,0);
                            Object title = jTable1.getValueAt(row,1);
                            Object description = jTable1.getValueAt(row,2);
                            Object condition = jTable1.getValueAt(row,4);
                            Object price = jTable1.getValueAt(row,5);
                            Object location = jTable1.getValueAt(row,6);
//                            JOptionPane.showMessageDialog(null,"id :"+id);
                            int index = userDL.retrieveFromIndex(currentUserIndex).getIndex((String) id);
//                            JOptionPane.showMessageDialog(null,"index :"+index+"User Index :"+currentUserIndex);
                            userDL.retrieveFromIndex(currentUserIndex).retrieveFromIndex(index).setTitle((String)title);
//                            JOptionPane.showMessageDialog(null,"Title is :"+userDL.retrieveFromIndex(currentUserIndex).retrieveFromIndex(index).getTitle());
                            userDL.retrieveFromIndex(currentUserIndex).retrieveFromIndex(index).setDescription((String)description);
                            userDL.retrieveFromIndex(currentUserIndex).retrieveFromIndex(index).setCondition((String)condition);
                            userDL.retrieveFromIndex(currentUserIndex).retrieveFromIndex(index).setPrice((String) price);
                            userDL.retrieveFromIndex(currentUserIndex).retrieveFromIndex(index).setLocation((String)location);
                            jTable1.setValueAt(title,row,1);
                            jTable1.setValueAt(description,row,2);
                            jTable1.setValueAt(condition,row,4);
                            jTable1.setValueAt(price,row,5);
                            jTable1.setValueAt(location,row,6);
                        }
                        else if (button==Delete) {

                            Object id = jTable1.getValueAt(row,0);
                            int index = userDL.retrieveFromIndex(currentUserIndex).getIndex((String) id);
                            userDL.retrieveFromIndex(currentUserIndex).Remove(index);
                            d1.removeRow(row);
                        }

                    }
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
    int xx;
    int xy;
    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();

    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_headerMouseDragged

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btn_studentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_studentsMouseClicked
        // TODO add your handling code here:

        setLblColor(btn_active);
        resetLblColor(btn_staff);
        //switch bettween Jpane ls
        staff.setVisible(false);
        Active.setVisible(true);


    }//GEN-LAST:event_btn_studentsMouseClicked

    private void btn_staffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_staffMouseClicked
        // TODO add your handling code here:

        setLblColor(btn_staff);
        resetLblColor(btn_active);
        staff.setVisible(true);
        Active.setVisible(false);
    }//GEN-LAST:event_btn_staffMouseClicked

    // ------------switch between colors for Active/Inactive color
    public void setLblColor(JLabel lbl)
    {
        lbl.setBackground(new Color(49, 234, 212));
    }

    public void resetLblColor(JLabel lbl)
    {
        lbl.setBackground(new Color(49, 234, 212));
    }

    public static void main(String[] args, int currentUserIndex) {
        /* Set the Nimbus look and feel */

        //Change UI look of table.

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home15(currentUserIndex).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_staff;
    private javax.swing.JLabel btn_active;
    private javax.swing.JPanel header;
    private javax.swing.JPanel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;

    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private DefaultTableModel d1;
    private DefaultTableModel d2;

    private javax.swing.JPanel main;
    private javax.swing.JPanel staff;
    private javax.swing.JPanel Active;
    // End of variables declaration//GEN-END:variables


}