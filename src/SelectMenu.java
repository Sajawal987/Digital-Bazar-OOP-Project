import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SelectMenu {
    public static void SelectMenu(int currentUserIndex) {
        JFrame f1=new JFrame();

        JLabel l = new JLabel("CHOOSE A CATEGORY");
        l.setFont(new Font("Century Gothic", Font.BOLD, 35));
        l.setBounds(350,20,450,50);
        l.setForeground(new Color(255, 255, 255));

        JLabel lD = new JLabel("Digital Bazar");
        lD.setFont(new Font("Century Gothic", Font.PLAIN, 40));
        lD.setBounds(60,20,250,50);
        lD.setForeground(new Color(0, 0, 0));

        JSeparator js = new JSeparator();
        js.setOrientation(SwingConstants.HORIZONTAL);
        js.setBounds(100,80,750,10);
        js.setForeground(new Color(254,108,89));



        JLabel l1 = new JLabel("Post Your AD");
        l1.setFont(new Font("Century Gothic", Font.BOLD, 35));
        l1.setBounds(350,90,450,50);
        l1.setForeground(new Color(255, 255, 255));

        JButton b1 = new JButton("Laptop");
        b1.setBounds(120,150,250,35);
        b1.setBackground(new Color(255, 255, 255));
        b1.setForeground(Color.BLACK);
        b1.setFont(new Font("Century Gothic", Font.BOLD, 23));
        b1.setFocusPainted(false);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                product p1 = new laptop();
                f1.dispose();
                AddPost.AddPost(p1,currentUserIndex);
            }
        });

        JButton b2 = new JButton("Mobile");
        b2.setBounds(120,200,250,35);
        b2.setBackground(new Color(255, 255, 255));
        b2.setForeground(Color.BLACK);
        b2.setFont(new Font("Century Gothic", Font.BOLD, 23));
        b2.setFocusPainted(false);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                product p2 = new mobile();
                f1.dispose();
                AddPost.AddPost(p2,currentUserIndex);
            }
        });

        JButton b3 = new JButton("Air Conditioner");
        b3.setBounds(120,250,250,35);
        b3.setBackground(new Color(255, 255, 255));
        b3.setForeground(Color.BLACK);
        b3.setFont(new Font("Century Gothic", Font.BOLD, 23));
        b3.setFocusPainted(false);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                product p3 = new airConditioner();
                f1.dispose();
                AddPost.AddPost(p3,currentUserIndex);
            }
        });

        JButton b4 = new JButton("Car");
        b4.setBounds(120,300,250,35);
        b4.setBackground(new Color(255, 255, 255));
        b4.setForeground(Color.BLACK);
        b4.setFont(new Font("Century Gothic", Font.BOLD, 23));
        b4.setFocusPainted(false);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                product p4 = new car();
                f1.dispose();
                AddPost.AddPost(p4,currentUserIndex);
            }
        });

        JButton b5 = new JButton("Bike");
        b5.setBounds(120,350,250,35);
        b5.setBackground(new Color(255, 255, 255));
        b5.setForeground(Color.BLACK);
        b5.setFont(new Font("Century Gothic", Font.BOLD, 23));
        b5.setFocusPainted(false);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                product p5 = new bike();
                f1.dispose();
                AddPost.AddPost(p5,currentUserIndex);
            }
        });


        JButton b6 = new JButton("Bed");
        b6.setBounds(120,400,250,35);
        b6.setBackground(new Color(255, 255, 255));
        b6.setForeground(Color.BLACK);
        b6.setFont(new Font("Century Gothic", Font.BOLD, 23));
        b6.setFocusPainted(false);
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                product p6 = new bed();
                f1.dispose();
                AddPost.AddPost(p6,currentUserIndex);
            }
        });

        JButton b7 = new JButton("Chair");
        b7.setBounds(120,450,250,35);
        b7.setBackground(new Color(255, 255, 255));
        b7.setForeground(Color.BLACK);
        b7.setFont(new Font("Century Gothic", Font.BOLD, 23));
        b7.setFocusPainted(false);
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                product p7 = new chair();
                f1.dispose();
                AddPost.AddPost(p7,currentUserIndex);
            }
        });

        JButton b8 = new JButton("Table");
        b8.setBounds(120,500,250,35);
        b8.setBackground(new Color(255, 255, 255));
        b8.setForeground(Color.BLACK);
        b8.setFont(new Font("Century Gothic", Font.BOLD, 20));
        b8.setFocusPainted(false);
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                product p8 = new table();
                f1.dispose();
                AddPost.AddPost(p8,currentUserIndex);
            }
        });
        JButton b9 = new JButton("Back");
        b9.setBounds(650, 550, 250, 35);
        b9.setBackground(new Color(70, 69, 106));
        b9.setForeground(Color.white);
        b9.setFont(new Font("Century Gothic", Font.BOLD, 23));
        b9.setFocusPainted(false);

        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                WelcomePage obj = new WelcomePage();
                obj.WelcomePage(currentUserIndex);
            }
        });

        f1.add(b9);

        f1.add(js);
        f1.add(lD);
        f1.add(l);
        f1.add(l1);

        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(b5);
        f1.add(b6);
        f1.add(b7);
        f1.add(b8);


        f1.setSize(1000,1000);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.getContentPane().setBackground(new Color(45, 204, 187));
        f1.setLocationRelativeTo(null);
        f1.setResizable(false);
        f1.setVisible(true);
    }
}