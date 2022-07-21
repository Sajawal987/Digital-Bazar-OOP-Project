import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AddPost {

    public static void main(String[] args) {

//        int i=9;
//        product obj = new table();
//        AddPost.AddPost(obj,i);

    }

    public static void AddPost(product obj,int currentUserIndex) {

        JFrame f1 = new JFrame();

        JLabel l = new JLabel("Post Your AD");
        l.setFont(new Font("Century Gothic", Font.BOLD, 35));
        l.setBounds(350, 20, 450, 50);
        l.setForeground(new Color(255, 255, 255));

        JLabel lD = new JLabel("Digital Bazar");
        lD.setFont(new Font("Century Gothic", Font.PLAIN, 40));
        lD.setBounds(60, 20, 250, 50);
        lD.setForeground(new Color(0, 0, 0));

        JSeparator js = new JSeparator();
        js.setOrientation(SwingConstants.HORIZONTAL);
        js.setBounds(100, 80, 750, 10);
        js.setForeground(new Color(254, 108, 89));


        JLabel l1 = new JLabel("INCLUDE SOME DETAILS");
        l1.setFont(new Font("Century Gothic", Font.BOLD, 35));
        l1.setBounds(350, 90, 450, 50);
        l1.setForeground(new Color(255, 255, 255));


        JLabel l2 = new JLabel("Product Title");
        l2.setBounds(100, 140, 180, 30); // x, y, width, height
        l2.setForeground(new Color(0, 0, 0));
        l2.setFont(new Font("Century Gothic", Font.PLAIN, 25));


        JTextField t2 = new JTextField();
        t2.setBounds(100, 170, 500, 35);
        t2.setBackground(new Color(255, 255, 255));
        t2.setForeground(Color.black);
        t2.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        t2.setBorder(javax.swing.BorderFactory.createEmptyBorder());

        JLabel l3 = new JLabel("Mention the key features of your item (e.g. brand, model, age, type)");
        l3.setBounds(100, 200, 480, 30); // x, y, width, height
        l3.setForeground(new Color(0, 0, 0));
        l3.setFont(new Font("Century Gothic", Font.BOLD, 13));


        JLabel l4 = new JLabel("Description");
        l4.setBounds(100, 240, 180, 30); // x, y, width, height
        l4.setForeground(new Color(0, 0, 0));
        l4.setFont(new Font("Century Gothic", Font.PLAIN, 25));


        JTextArea jta_des = new JTextArea(7, 20);
        jta_des.setBounds(100, 270, 500, 80);
        jta_des.setBackground(new Color(255, 255, 255));
        jta_des.setForeground(Color.black);
        jta_des.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        jta_des.setBorder(javax.swing.BorderFactory.createEmptyBorder());  //I

        JLabel l5 = new JLabel("Include condition, features and reason for selling");
        l5.setBounds(100, 350, 480, 30); // x, y, width, height
        l5.setForeground(new Color(0, 0, 0));
        l5.setFont(new Font("Century Gothic", Font.BOLD, 13));


        JLabel lB = new JLabel("Product ID");
        lB.setBounds(100, 390, 180, 30); // x, y, width, height
        lB.setForeground(new Color(0, 0, 0));
        lB.setFont(new Font("Century Gothic", Font.PLAIN, 25));


        JTextField t_id = new JTextField();
        t_id.setBounds(100, 420, 500, 35);
        t_id.setBackground(new Color(255, 255, 255));
        t_id.setForeground(Color.black);
        t_id.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        t_id.setBorder(javax.swing.BorderFactory.createEmptyBorder());

        JRadioButton jr_n = new JRadioButton("New");
        jr_n.setBounds(100, 460, 80, 40);
        jr_n.setBackground(new Color(45, 204, 187));
        jr_n.setFont(new Font("Century Gothic", Font.BOLD, 20));

        JRadioButton jr_o = new JRadioButton("Used");
        jr_o.setBounds(180, 460, 80, 40);
        jr_o.setBackground(new Color(45, 204, 187));
        jr_o.setFont(new Font("Century Gothic", Font.BOLD, 20));

        JRadioButton jr_r = new JRadioButton("Refurbish");
        jr_r.setBounds(260, 460, 120, 40);
        jr_r.setBackground(new Color(45, 204, 187));
        jr_r.setFont(new Font("Century Gothic", Font.BOLD, 20));

        ButtonGroup G = new ButtonGroup();

        G.add(jr_n);
        G.add(jr_o);
        G.add(jr_r);


        JLabel lP = new JLabel("Set a Price");
        lP.setBounds(100, 500, 180, 30); // x, y, width, height
        lP.setForeground(new Color(0, 0, 0));
        lP.setFont(new Font("Century Gothic", Font.PLAIN, 25));


        JTextField tP = new JTextField();
        tP.setBounds(100, 530, 500, 35);
        tP.setBackground(new Color(255, 255, 255));
        tP.setForeground(Color.black);
        tP.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        tP.setBorder(javax.swing.BorderFactory.createEmptyBorder());


        JLabel lL = new JLabel("Set a Location");
        lL.setBounds(100, 570, 200, 30); // x, y, width, height
        lL.setForeground(new Color(0, 0, 0));
        lL.setFont(new Font("Century Gothic", Font.PLAIN, 25));


        JTextField tL = new JTextField();
        tL.setBounds(100, 600, 500, 35);
        tL.setBackground(new Color(255, 255, 255));
        tL.setForeground(Color.black);
        tL.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        tL.setBorder(javax.swing.BorderFactory.createEmptyBorder());


        JButton b1 = new JButton("Post");
        b1.setBounds(650, 600, 250, 35);
        b1.setBackground(new Color(70, 69, 106));
        b1.setForeground(Color.white);
        b1.setFont(new Font("Century Gothic", Font.BOLD, 23));
        b1.setFocusPainted(false);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = t_id.getText();
                int checkid = userDL.retrieveFromIndex(currentUserIndex).GetIndexFromID(id);
                if (t2.getText().equals("") || t_id.getText().equals("") || tP.getText().equals("") || tL.getText().equals("") || jta_des.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please fill all Necessary details", "Fill the Form", JOptionPane.ERROR_MESSAGE);
                } else if (checkid>=0) {
                    JOptionPane.showMessageDialog(null,"UserID is already in use.","UserID in use",JOptionPane.ERROR_MESSAGE);
                } else if (checkid<0) {
                    userBL tempUser = userDL.retrieveFromIndex(currentUserIndex);
                    obj.setTitle(t2.getText());
                    obj.setDescription(jta_des.getText());
                    obj.setProduct_id(t_id.getText());
                    if(tP.getText().matches("[0-9]+")){
                        JOptionPane.showMessageDialog(null, "Product Posted Successfully", "Post Product", JOptionPane.INFORMATION_MESSAGE);
                        obj.setPrice(tP.getText());
                        obj.setLocation(tL.getText());
                        if (jr_n.isSelected()) {
                            obj.setCondition(jr_n.getText());
                        } else if (jr_o.isSelected()) {
                            obj.setCondition(jr_o.getText());
                        } else if (jr_r.isSelected()) {
                            obj.setCondition(jr_r.getText());
                        }
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");
                        LocalDateTime now = LocalDateTime.now();
                        obj.setDateOfPublish(dtf.format(now));
                        tempUser.Create(obj);
                        userDL.ChangeAtIndex(currentUserIndex, tempUser);
                        f1.dispose();
                        SelectMenu.SelectMenu(currentUserIndex);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Please Enter Digits in Price", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        JButton b2 = new JButton("Back");
        b2.setBounds(650, 550, 250, 35);
        b2.setBackground(new Color(70, 69, 106));
        b2.setForeground(Color.white);
        b2.setFont(new Font("Century Gothic", Font.BOLD, 23));
        b2.setFocusPainted(false);

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                SelectMenu.SelectMenu(currentUserIndex);
            }
        });

        f1.add(b2);

        f1.add(l);
        f1.add(lD);
        f1.add(js);
        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(l4);
        f1.add(l5);
        f1.add(t2);
        f1.add(jta_des);
        f1.add(lB);
        f1.add(t_id);


        f1.add(b1);


        f1.add(tP);
        f1.add(lP);

        f1.add(lL);
        f1.add(tL);


        f1.add(jr_o);
        f1.add(jr_n);
        f1.add(jr_r);

        f1.setSize(1000, 700);
        f1.setLayout(new BorderLayout());
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.getContentPane().setBackground(new Color(45, 204, 187));
        f1.setLocationRelativeTo(null);
        f1.setResizable(false);
        f1.setVisible(true);





    }
}