import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainMenu {

    public static void main_menu(int currentUserIndex){
        JFrame f1= new JFrame();

        JLabel l = new JLabel("Select Category");
        l.setFont(new Font("Century Gothic", Font.BOLD, 25));
        l.setBounds(280,29,300,70);
        l.setForeground(new Color(255, 255, 255));

        JLabel lD = new JLabel("Digital Bazar");
        lD.setFont(new Font("Century Gothic", Font.PLAIN, 40));
        lD.setBounds(30,20,250,50);
        lD.setForeground(new Color(0, 0, 0));

        JSeparator js = new JSeparator();
        js.setOrientation(SwingConstants.HORIZONTAL);
        js.setBounds(100,80,300,10);
        js.setForeground(new Color(254,108,89));

        JButton b1 = new JButton("Sell Product");
        b1.setBounds(120,150,250,50);
        b1.setBackground(new Color(70, 69, 106));
        b1.setForeground(Color.white);
        b1.setFont(new Font("Century Gothic", Font.BOLD, 23));
        b1.setFocusPainted(false);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
//                SelectMenu.SelectMenu(currentUserIndex);
            }
        });

        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b1.setBackground(new Color(70, 69, 106));
                b1.setBounds(100,150,300,50);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1.setBackground(new Color(70, 69, 106));
                b1.setBounds(120,150,250,50);
            }
        });


        JButton b2 = new JButton("Buy Product");
        b2.setBounds(120,230,250,50);
        b2.setBackground(new Color(70, 69, 106));
        b2.setForeground(Color.white);
        b2.setFont(new Font("Century Gothic", Font.BOLD, 23));
        b2.setFocusPainted(false);

        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b2.setBackground(new Color(70, 69, 106));
                b2.setBounds(100,230,300,50);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b2.setBackground(new Color(70, 69, 106));
                b2.setBounds(120,230,250,50);
            }
        });


        JButton b3 = new JButton("Rental Product");
        b3.setBounds(120,310,250,50);
        b3.setBackground(new Color(70, 69, 106));
        b3.setForeground(Color.white);
        b3.setFont(new Font("Century Gothic", Font.BOLD, 23));
        b3.setFocusPainted(false);

        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b3.setBackground(new Color(70, 69, 106));
                b3.setBounds(100,310,300,50);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b3.setBackground(new Color(70, 69, 106));
                b3.setBounds(120,310,250,50);
            }
        });

        JButton b4 = new JButton("Balance Inquiries");
        b4.setBounds(120,390,300,50);
        b4.setBackground(new Color(70, 69, 106));
        b4.setForeground(Color.white);
        b4.setFont(new Font("Century Gothic", Font.BOLD, 23));
        b4.setFocusPainted(false);

        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b4.setBackground(new Color(70, 69, 106));
                b4.setBounds(100,390,300,50);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b4.setBackground(new Color(70, 69, 106));
                b4.setBounds(120,390,250,50);
            }
        });



        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(l);
        f1.add(lD);
        f1.add(js);







        f1.setSize(500,550);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.getContentPane().setBackground(new Color(45, 204, 187));
        f1.setLocationRelativeTo(null);
        f1.setResizable(false);
        f1.setVisible(true);
    }
}
