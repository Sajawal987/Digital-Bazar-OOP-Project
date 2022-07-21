import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class userProfile {
    public static void userProfile(userBL obj,int currentUserIndex) {
        JFrame f1= new JFrame();

        JLabel l = new JLabel("User Profile");
        l.setFont(new Font("Century Gothic", Font.BOLD, 35));
        l.setBounds(350,20,250,50);
        l.setForeground(new Color(255, 255, 255));

        JLabel lD = new JLabel("Digital Bazar");
        lD.setFont(new Font("Century Gothic", Font.PLAIN, 40));
        lD.setBounds(60,20,250,50);
        lD.setForeground(new Color(0, 0, 0));

        JSeparator js = new JSeparator();
        js.setOrientation(SwingConstants.HORIZONTAL);
        js.setBounds(100,80,300,10);
        js.setForeground(new Color(254,108,89));




        JLabel l2 = new JLabel();
        l2.setText(obj.getUserID());
        l2.setFont(new Font("Century Gothic", Font.PLAIN, 28));
        l2.setBounds(60,100,450,30);
        l2.setForeground(new Color(0, 0, 0));

        JLabel l3 = new JLabel();
        l3.setFont(new Font("Century Gothic", Font.PLAIN, 28));
        l3.setText(obj.getName());
        l3.setBounds(60,160,450,30);
        l3.setForeground(new Color(0, 0, 0));

        JLabel l4 = new JLabel();
        l4.setText(obj.getEmail());
        l4.setFont(new Font("Century Gothic", Font.PLAIN, 28));
        l4.setBounds(60,220,450,30);
        l4.setForeground(new Color(0, 0, 0));

        JLabel l5 = new JLabel();
        l5.setFont(new Font("Century Gothic", Font.PLAIN, 28));
        l5.setText(obj.getPhoneNumber());
        l5.setBounds(60,280,450,30);
        l5.setForeground(new Color(0, 0, 0));

        JLabel l6 = new JLabel();
        l6.setFont(new Font("Century Gothic", Font.PLAIN, 28));
        l6.setText(obj.getAddress());
        l6.setBounds(60,340,450,30);
        l6.setForeground(new Color(0, 0, 0));

        JButton b1 = new JButton("Edit");
        b1.setBounds(170, 400, 250, 35);
        b1.setBackground(new Color(70, 69, 106));
        b1.setForeground(Color.white);
        b1.setFont(new Font("Century Gothic", Font.BOLD, 23));
        b1.setFocusPainted(false);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                EditProfile.Edit(obj,currentUserIndex);
            }
        });
        ImageIcon back = new ImageIcon("images/back.png");
        back.setImage(back.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
        JLabel l9 = new JLabel(back);
        JButton b2 = new JButton();
        b2.setBounds(10,10,50,35);
        b2.setBorder(BorderFactory.createEmptyBorder());
        b2.setBackground(new Color(45, 204, 187));
        b2.setIcon(l9.getIcon());
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                WelcomePage obj = new WelcomePage();
                obj.WelcomePage(currentUserIndex);
            }
        });


        String imgAddres= userDL.retrieveFromIndex(currentUserIndex).getAddressImg();
        if(imgAddres!=null){
            ImageIcon i1 = new ImageIcon(imgAddres);
            i1.setImage(i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT));
            JLabel l1 = new JLabel(i1);
            l1.setBounds(600,90,250,250);
            f1.add(l1);
        } else {
            ImageIcon i1 = new ImageIcon("images/profilepicture.png");
            i1.setImage(i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT));
            JLabel l1 = new JLabel(i1);
            l1.setBounds(600,90,250,250);
            f1.add(l1);
        }

        f1.add(l2);
        f1.add(l3);
        f1.add(l4);
        f1.add(l5);
        f1.add(l6);
        f1.add(l);
        f1.add(lD);
        f1.add(js);
        f1.add(b1);
        f1.add(b2);
        f1.setSize(900,500);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.getContentPane().setBackground(new Color(45, 204, 187));
        f1.setLocationRelativeTo(null);
        f1.setResizable(false);
        f1.setResizable(false);
        f1.setVisible(true);





    }
}