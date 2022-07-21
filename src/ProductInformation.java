import com.intellij.util.ui.JBImageIcon;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductInformation {
//    public static void main(String[] args) {
//        userBL obj = new userBL();
//        ProductInformation(0,0);
//    }
    public static void ProductInformation(int buyer,String userid,String id) {
        int index =-1;
        int currentUserIndex = -1;
        JFrame f1= new JFrame();
        for(int i=0;i<userDL.getAllUsers();i++){
            if(userid.equals(((userDL.retrieveFromIndex(i)).getUserID()))){
                currentUserIndex = i;
                break;
            }
        }
        for(int i=0;i<userDL.retrieveFromIndex(currentUserIndex).getAllProducts();i++){
            if(id.equals(((userDL.retrieveFromIndex(currentUserIndex)).retrieveFromIndex(i)).getProduct_id())){
                index = i;
                break;
            }
        }

        JLabel l = new JLabel("Product Details");
        l.setFont(new Font("Century Gothic", Font.BOLD, 35));
        l.setBounds(350,20,300,50);
        l.setForeground(new Color(255, 255, 255));

        JLabel lD = new JLabel("Digital Bazar");
        lD.setFont(new Font("Century Gothic", Font.PLAIN, 40));
        lD.setBounds(60,20,250,50);
        lD.setForeground(new Color(0, 0, 0));

        JSeparator js = new JSeparator();
        js.setOrientation(SwingConstants.HORIZONTAL);
        js.setBounds(100,80,300,10);
        js.setForeground(new Color(254,108,89));

        ImageIcon i1 = new ImageIcon("images/profilepicture.png");
        i1.setImage(i1.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(50,90,50,50);


        JLabel l2 = new JLabel();
        l2.setText(userDL.retrieveFromIndex(currentUserIndex).retrieveFromIndex(index).getProduct_id());
        l2.setFont(new Font("Century Gothic", Font.PLAIN, 28));
        l2.setBounds(100,100,450,30);
        l2.setForeground(new Color(0, 0, 0));

        JLabel l3 = new JLabel();
        l3.setFont(new Font("Century Gothic", Font.PLAIN, 28));
        l3.setText(userDL.retrieveFromIndex(currentUserIndex).retrieveFromIndex(index).getTitle());
        l3.setBounds(60,160,450,30);
        l3.setForeground(new Color(0, 0, 0));

        JLabel l4 = new JLabel();
        l4.setText(userDL.retrieveFromIndex(currentUserIndex).retrieveFromIndex(index).getDescription());
        l4.setFont(new Font("Century Gothic", Font.PLAIN, 28));
        l4.setBounds(60,220,450,30);
        l4.setForeground(new Color(0, 0, 0));

        JLabel l5 = new JLabel();
        l5.setFont(new Font("Century Gothic", Font.PLAIN, 28));
        l5.setText(userDL.retrieveFromIndex(currentUserIndex).retrieveFromIndex(index).getDateOfPublish());
        l5.setBounds(60,280,450,30);
        l5.setForeground(new Color(0, 0, 0));

        JLabel l6 = new JLabel();
        l6.setFont(new Font("Century Gothic", Font.PLAIN, 28));
        l6.setText(userDL.retrieveFromIndex(currentUserIndex).retrieveFromIndex(index).getLocation());
        l6.setBounds(60,340,450,30);
        l6.setForeground(new Color(0, 0, 0));

        JLabel l7 = new JLabel();
        l7.setFont(new Font("Century Gothic", Font.PLAIN, 28));
        l7.setText(String.valueOf(userDL.retrieveFromIndex(currentUserIndex).retrieveFromIndex(index).getPrice()));
        l7.setBounds(60,400,450,30);
        l7.setForeground(new Color(0, 0, 0));

        JButton b1 = new JButton("Order Now");
        b1.setBounds(100, 460, 250, 35);
        b1.setBackground(new Color(70, 69, 106));
        b1.setForeground(Color.white);
        b1.setFont(new Font("Century Gothic", Font.BOLD, 23));
        b1.setFocusPainted(false);
        int finalIndex = index;
        int finalCurrentUserIndex = currentUserIndex;
        int finalCurrentUserIndex2 = currentUserIndex;
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (finalCurrentUserIndex2 != buyer) {
                    product p1 = new laptop();
                    p1 = userDL.retrieveFromIndex(finalCurrentUserIndex).retrieveFromIndex(finalIndex);
                    userDL.retrieveFromIndex(finalCurrentUserIndex).Remove(finalIndex);
                    userDL.retrieveFromIndex(buyer).Create2(p1);
                    JOptionPane.showMessageDialog(null, "Product Bought Successfully", "Purchase", JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(null,"You cannot buy your own product","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });



        JButton b3 = new JButton("Contact Us");
        b3.setBounds(400, 460, 250, 35);
        b3.setBackground(new Color(70, 69, 106));
        b3.setForeground(Color.white);
        b3.setFont(new Font("Century Gothic", Font.BOLD, 23));
        b3.setFocusPainted(false);
        int finalCurrentUserIndex1 = currentUserIndex;
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Phone Number :"+userDL.retrieveFromIndex(finalCurrentUserIndex1).getPhoneNumber()+"\nEmail :"+userDL.retrieveFromIndex(finalCurrentUserIndex1).getEmail(),"Contact",JOptionPane.INFORMATION_MESSAGE);
            }
        });

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
                f1.dispose();
                WelcomePage obj = new WelcomePage();
                obj.WelcomePage(buyer);
            }
        });

        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(l4);
        f1.add(l5);
        f1.add(l6);
        f1.add(l7);
        f1.add(l);
        f1.add(lD);
        f1.add(js);
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.setSize(700,600);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.getContentPane().setBackground(new Color(45, 204, 187));
        f1.setLocationRelativeTo(null);
        f1.setResizable(false);
        f1.setResizable(false);
        f1.setVisible(true);
    }
}