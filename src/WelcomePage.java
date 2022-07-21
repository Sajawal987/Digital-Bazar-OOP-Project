import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.event.MenuKeyEvent;
import javax.swing.event.MenuKeyListener;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class WelcomePage {

    public static void main(String[] args) {
        WelcomePage obj = new WelcomePage();
        obj.WelcomePage(-1);
    }
    private static JPanel mainPanel;
    private static JTable table;
    private static DefaultTableModel model_table;
    private static JScrollPane scroll_table;
    private static JFrame f1;


    public void WelcomePage(int currentUserIndex) {

        f1 = new JFrame();
        JLabel l = new JLabel("Digital Bazar");
        l.setFont(new Font("Century Gothic", Font.BOLD, 35));
        l.setBounds(30, 20, 450, 50);
        l.setForeground(new Color(255, 255, 255));
        f1.add(l);
        ImageIcon MotorIcon = new ImageIcon("images/pngwing.com (11).png");
        MotorIcon.setImage(MotorIcon.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));



        ImageIcon ElecIcon = new ImageIcon("images/pngwing.com (21).png");
        ElecIcon.setImage(ElecIcon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));


        ImageIcon HistoryIcon = new ImageIcon("images/history.png");
        HistoryIcon.setImage(HistoryIcon.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));


        JButton BHist = new JButton("  History");
        BHist.setBounds(430, 26, 170, 35);
        BHist.setBackground(new Color(45, 204, 187));
        BHist.setForeground(Color.white);
        BHist.setFont(new Font("Century Gothic", Font.BOLD, 20));
        //BHist.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        BHist.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                String abc[] = {};
                Home15.main(abc, currentUserIndex);
            }
        });
        BHist.setIcon(HistoryIcon);
        f1.add(BHist);


        ImageIcon LogoutIcon = new ImageIcon("images/logout.png");
        LogoutIcon.setImage(LogoutIcon.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));


        JButton BLog = new JButton("  Logout");
        BLog.setBounds(270, 26, 170, 35);
        BLog.setBackground(new Color(45, 204, 187));
        BLog.setForeground(Color.white);
        BLog.setFont(new Font("Century Gothic", Font.BOLD, 20));
        BLog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.setVisible(false);
                login obj = new login();
                obj.login(currentUserIndex);
            }
        });
        BLog.setIcon(LogoutIcon);
        f1.add(BLog);


        JLabel loc = new JLabel("Apply Filter");
        loc.setFont(new Font("Century Gothic", Font.BOLD, 20));
        loc.setBounds(80, 100, 200, 50);
        loc.setForeground(new Color(255, 255, 255));
        f1.add(loc);

        String[] optionsToChoose = {"Choose","Sort By Date(New On Top)", "Sort By Price(Low to High)"};

        JComboBox<String> jComboBox = new JComboBox<>(optionsToChoose);
        jComboBox.setBounds(80, 140, 220, 30);
        jComboBox.setBackground(new Color(70, 69, 106));
        jComboBox.setForeground(Color.WHITE);
        jComboBox.setFont(new Font("Century Gothic", Font.BOLD, 15));

        JButton Bfil = new JButton("Apply");
        Bfil.setBounds(210, 115, 70, 22);
        Bfil.setBackground(new Color(0, 9, 65));
        Bfil.setForeground(Color.white);
        Bfil.setFont(new Font("Century Gothic", Font.BOLD, 10));
        Bfil.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));

        f1.add(Bfil);


//Search text field
        JTextField t1 = new JTextField();
        t1.setBounds(380, 140, 250, 35);
        t1.setBackground(new Color(255, 255, 255));
        t1.setForeground(Color.black);
        t1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        t1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        f1.add(t1);




        ImageIcon searchIcon = new ImageIcon("images/logoSearchBar.png");
        searchIcon.setImage(searchIcon.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));

        //logoSearchBar
        JButton BSearch = new JButton();
        BSearch.setBounds(620, 140, 60, 35);
        BSearch.setBackground(new Color(45, 204, 187));
        BSearch.setForeground(Color.white);
        BSearch.setFont(new Font("Century Gothic", Font.BOLD, 20));
        BSearch.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        BSearch.setIcon(searchIcon);
        f1.add(BSearch);


        ImageIcon SellIcon = new ImageIcon("images/sellicon.png");
        SellIcon.setImage(SellIcon.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));

        //logoSearchBar
        JButton BSell = new JButton(" Sell");
        BSell.setBounds(750, 23, 100, 35);
        BSell.setBackground(new Color(45, 204, 187));
        BSell.setForeground(Color.white);
        BSell.setFont(new Font("Century Gothic", Font.BOLD, 20));
        BSell.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        BSell.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                SelectMenu.SelectMenu(currentUserIndex);
            }
        });

        ImageIcon Admin = new ImageIcon("images/admin.png");
        Admin.setImage(Admin.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));


        //Admin Button
        JButton adminImage = new JButton();
        adminImage.setBounds(680, 23, 50, 35);
        adminImage.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        adminImage.setBackground(new Color(45, 204, 187));
        adminImage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                userProfile.userProfile(userDL.retrieveFromIndex(currentUserIndex), currentUserIndex);
            }
        });


        f1.add(BSell);
        BSell.setIcon(SellIcon);


        f1.add(adminImage);
        adminImage.setIcon(Admin);


        f1.add(jComboBox);


        f1.setSize(900, 700);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.getContentPane().setBackground(new Color(45, 204, 187));
        f1.setLocationRelativeTo(null);
        f1.setResizable(false);
        f1.setVisible(true);


        mainPanel = new JPanel(null);

        JTable table = new JTable();

        table.setDefaultRenderer(Object.class, new Render());

        model_table = new DefaultTableModel(){
            public boolean isCellEditable(int row,int column) {
                if(column==8 || column == 0 ||column==1)
                    return false;
                return true;
            }
        };
        model_table.setColumnIdentifiers(new Object[]{
                "User ID", "Product ID", "Product Name", "Description", "Date of Publish", "Condition", "Price", "Location", "Buy"
        });
        table.setModel(model_table);

        ImageIcon BuyIcon = new ImageIcon("images/buy.png");
        BuyIcon.setImage(BuyIcon.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));


        JButton BBuy = new JButton();
        //  BBuy.setBounds(270,26,40,30);
        BBuy.setBackground(new Color(45, 204, 187));
        BBuy.setForeground(Color.white);
        BBuy.setFont(new Font("Century Gothic", Font.BOLD, 15));
        BBuy.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));

        BBuy.setIcon(BuyIcon);


        for (int i = 0; i < userDL.getAllUsers(); i++) {                             // add value to table
            for (int j = 0; j < userDL.retrieveFromIndex(i).getAllProducts(); j++) {
                String P_id = userDL.retrieveFromIndex(i).retrieveFromIndex(j).getProduct_id();
                String title = userDL.retrieveFromIndex(i).retrieveFromIndex(j).getTitle();
                String des = userDL.retrieveFromIndex(i).retrieveFromIndex(j).getDescription();
                String dop = userDL.retrieveFromIndex(i).retrieveFromIndex(j).getDateOfPublish();
                String location = userDL.retrieveFromIndex(i).retrieveFromIndex(j).getLocation();
                String con = userDL.retrieveFromIndex(i).retrieveFromIndex(j).getCondition();
                String price = String.valueOf(((userDL.retrieveFromIndex(i)).retrieveFromIndex(j)).getPrice());
                String U_id = userDL.retrieveFromIndex(i).getUserID();
                model_table.addRow(new Object[]{
                        U_id, P_id, title, des, dop, con, price, location, BBuy
                });
            }
        }
        table.setRowHeight(40);



        JButton BShow = new JButton("Show Complete Data");
        BShow.setBounds(300, 500, 250, 35);
        BShow.setBackground(new Color(45, 71, 204));
        BShow.setForeground(Color.white);
        BShow.setFont(new Font("Century Gothic", Font.BOLD, 20));
      //  BShow.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        BShow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel d_new = new DefaultTableModel(){
                    public boolean isCellEditable(int row,int column) {
                        if(column==8 || column == 0 ||column==1)
                            return false;
                        return true;
                    }
                };
                d_new.setColumnIdentifiers(new Object[]{
                        "User ID", "Product ID", "Product Name", "Description", "Date of Publish", "Condition", "Price", "Location", "Buy"
                });
                table.setModel(d_new);
                for (int i = 0; i < userDL.getAllUsers(); i++) {                             // add value to table
                    for (int j = 0; j < userDL.retrieveFromIndex(i).getAllProducts(); j++) {
                        String P_id = userDL.retrieveFromIndex(i).retrieveFromIndex(j).getProduct_id();
                        String title = userDL.retrieveFromIndex(i).retrieveFromIndex(j).getTitle();
                        String des = userDL.retrieveFromIndex(i).retrieveFromIndex(j).getDescription();
                        String dop = userDL.retrieveFromIndex(i).retrieveFromIndex(j).getDateOfPublish();
                        String location = userDL.retrieveFromIndex(i).retrieveFromIndex(j).getLocation();
                        String con = userDL.retrieveFromIndex(i).retrieveFromIndex(j).getCondition();
                        String price = String.valueOf(((userDL.retrieveFromIndex(i)).retrieveFromIndex(j)).getPrice());
                        String U_id = userDL.retrieveFromIndex(i).getUserID();
                        d_new.addRow(new Object[]{
                                U_id, P_id, title, des, dop, con, price, location, BBuy
                        });
                    }
                }
            }
        });
        f1.add(BShow);

        scroll_table = new JScrollPane(table);            // add table to scroll panel
        scroll_table.setBounds(0, 0, 870, 250);
        scroll_table.setVisible(true);
        mainPanel.add(scroll_table);
        mainPanel.setBounds(10, 230, 870, 250);
        mainPanel.setVisible(true);
        f1.add(mainPanel);
        Bfil.addActionListener(new ActionListener() {           //related to sorting
            @Override
            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(null,"I love mia");

                            if (!jComboBox.getSelectedItem().toString().equals("Choose")){
                                DefaultTableModel d2 = new DefaultTableModel(){
                                    public boolean isCellEditable(int row,int column) {
                                        if(column==8 || column == 0 ||column==1)
                                            return false;
                                        return true;
                                    }
                                };;
                                d2.setColumnIdentifiers(new Object[]{
                                        "User ID", "Product ID", "Product Name", "Description", "Date of Publish", "Condition", "Price", "Location", "Buy"
                                });
                                if(jComboBox.getSelectedItem().toString().equals("Sort By Date(New On Top)")){
                                    ArrayList<objectsForTable> list = new ArrayList<>();
                                    for(int row = 0; row < table.getRowCount(); row++) {
                                        objectsForTable object = new objectsForTable();
                                        for(int column = 0; column < table.getColumnCount()-1; column++) {

                                            switch(column) {
                                                case 0: {
                                                    object.setUserID((String) table.getValueAt(row, column));
                                                    break;
                                                }
                                                case 1: {
                                                    object.setProduct_id((String) table.getValueAt(row, column));
                                                    break;
                                                }
                                                case 2: {
                                                    object.setTitle((String) table.getValueAt(row, column));
                                                    break;
                                                }
                                                case 3: {
                                                    object.setDescription((String) table.getValueAt(row, column));
                                                    break;
                                                }
                                                case 4: {
                                                    object.setDateOfPublish((String) table.getValueAt(row, column));
                                                    break;
                                                }
                                                case 5: {
                                                    object.setCondition((String) table.getValueAt(row, column));

                                                    break;
                                                }
                                                case 6: {
                                                    object.setPrice((String) table.getValueAt(row, column));
                                                    break;
                                                }
                                                case 7:{
                                                    object.setLocation((String) table.getValueAt(row, column));
                                                    break;
                                                }
                                            }
                                        }
                                        list.add(object);
                                    }
                                    Collections.sort(list, new Comparator<objectsForTable>() {
                                        @Override
                                        public int compare(objectsForTable o1, objectsForTable o2) {
                                            if(o2.getDateOfPublish()==null || o1.getDateOfPublish()==null)
                                                return 0;
                                            return o2.getDateOfPublish().compareTo(o1.getDateOfPublish());
                                        }
                                    });
                                    for (int i = 0; i < list.size(); i++) {
                                        String P_id = list.get(i).getProduct_id();
                                        String title =  list.get(i).getTitle();
                                        String des = list.get(i).getDescription();
                                        String dop = list.get(i).getDateOfPublish();
                                        String location =  list.get(i).getLocation();
                                        String con =  list.get(i).getCondition();
                                        String price =  list.get(i).getPrice();
                                        String U_id =  list.get(i).getUserID();
                                        d2.addRow(new Object[]{
                                                U_id, P_id, title, des, dop, con, price, location, BBuy
                                        });
                                    }
                                    table.setModel(d2);
                                }
                                else if (jComboBox.getSelectedItem().toString().equals("Sort By Price(Low to High)")) {
                                    ArrayList<objectsForTable> list = new ArrayList<>();
                                    for(int row = 0; row < table.getRowCount(); row++) {
                                        objectsForTable object = new objectsForTable();
                                        for(int column = 0; column < table.getColumnCount()-1; column++) {

                                            switch(column) {
                                                case 0: {
                                                    object.setUserID((String) table.getValueAt(row, column));
                                                    break;
                                                }
                                                case 1: {
                                                    object.setProduct_id((String) table.getValueAt(row, column));
                                                    break;
                                                }
                                                case 2: {
                                                    object.setTitle((String) table.getValueAt(row, column));
                                                    break;
                                                }
                                                case 3: {
                                                    object.setDescription((String) table.getValueAt(row, column));
                                                    break;
                                                }
                                                case 4: {
                                                    object.setDateOfPublish((String) table.getValueAt(row, column));
                                                    break;
                                                }
                                                case 5: {
                                                    object.setCondition((String) table.getValueAt(row, column));

                                                    break;
                                                }
                                                case 6: {
                                                    object.setPrice((String) table.getValueAt(row, column));
                                                    break;
                                                }
                                                case 7:{
                                                    object.setLocation((String) table.getValueAt(row, column));
                                                    break;
                                                }
                                            }
                                        }
                                        list.add(object);
                                    }
                                    Collections.sort(list);
                                for (int i = 0; i < list.size(); i++) {
                                        String P_id = list.get(i).getProduct_id();
                                        String title =  list.get(i).getTitle();
                                        String des = list.get(i).getDescription();
                                        String dop = list.get(i).getDateOfPublish();
                                        String location =  list.get(i).getLocation();
                                        String con =  list.get(i).getCondition();
                                        String price =  list.get(i).getPrice();
                                        String U_id =  list.get(i).getUserID();
                                        d2.addRow(new Object[]{
                                                U_id, P_id, title, des, dop, con, price, location, BBuy
                                        });
                                }
                                    table.setModel(d2);
                                }

                            }
                        }
            });
        //Search a product on the basis of id or name
        BSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = t1.getText();
                DefaultTableModel d3 = new DefaultTableModel() {
                    public boolean isCellEditable(int row, int column) {
                        if(column==8 || column == 0 ||column==1)
                            return false;
                        return true;
                    }
                };
                d3.setColumnIdentifiers(new Object[]{
                        "User ID", "Product ID", "Product Name", "Description", "Date of Publish", "Condition", "Price", "Location", "Buy"
                });
                for (int i = 0; i < userDL.getAllUsers(); i++) {
                    for (int j = 0; j < userDL.retrieveFromIndex(i).getAllProducts(); j++) {
                        if (text.equals((userDL.retrieveFromIndex(i)).retrieveFromIndex(j).getProduct_id())) {

                            String P_id = userDL.retrieveFromIndex(i).retrieveFromIndex(j).getProduct_id();
                            String title = userDL.retrieveFromIndex(i).retrieveFromIndex(j).getTitle();
                            String des = userDL.retrieveFromIndex(i).retrieveFromIndex(j).getDescription();
                            String dop = userDL.retrieveFromIndex(i).retrieveFromIndex(j).getDateOfPublish();
                            String location = userDL.retrieveFromIndex(i).retrieveFromIndex(j).getLocation();
                            String con = userDL.retrieveFromIndex(i).retrieveFromIndex(j).getCondition();
                            String price = String.valueOf(((userDL.retrieveFromIndex(i)).retrieveFromIndex(j)).getPrice());
                            String U_id = userDL.retrieveFromIndex(i).getUserID();
                            d3.addRow(new Object[]{
                                    U_id, P_id, title, des, dop, con, price, location, BBuy
                            });
                            break;
                        } else if (text.equals(userDL.retrieveFromIndex(i).retrieveFromIndex(j).getTitle())) {
                            String P_id = userDL.retrieveFromIndex(i).retrieveFromIndex(j).getProduct_id();
                            String title = userDL.retrieveFromIndex(i).retrieveFromIndex(j).getTitle();
                            String des = userDL.retrieveFromIndex(i).retrieveFromIndex(j).getDescription();
                            String dop = userDL.retrieveFromIndex(i).retrieveFromIndex(j).getDateOfPublish();
                            String location = userDL.retrieveFromIndex(i).retrieveFromIndex(j).getLocation();
                            String con = userDL.retrieveFromIndex(i).retrieveFromIndex(j).getCondition();
                            String price = String.valueOf(((userDL.retrieveFromIndex(i)).retrieveFromIndex(j)).getPrice());
                            String U_id = userDL.retrieveFromIndex(i).getUserID();
                            d3.addRow(new Object[]{
                                    U_id, P_id, title, des, dop, con, price, location, BBuy
                            });
                        }
                    }
                }
                table.setModel(d3);
            }
        });
        table.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int column= table.getColumnModel ().getColumnIndexAtX (e.getX());
                int row = e.getY()/table.getRowHeight();
                if (row < table.getRowCount () && row >= 0 && column < table.getColumnCount() && column >= 0) {
                    Object value =table.getValueAt (row, column);
                    if (value instanceof JButton) {
                        ((JButton) value).doClick();
                        JButton button =(JButton) value;
                        f1.dispose();
                        Object value1 = table.getValueAt(row,column-7);        //product id
                        Object value2 = table.getValueAt(row,0);               //user id
                        ProductInformation.ProductInformation(currentUserIndex,(String)value2,(String)value1);

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



}