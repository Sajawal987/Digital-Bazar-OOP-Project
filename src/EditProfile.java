import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EditProfile {

    public static void main(String[] args) {

//        EditProfile.Edit();

    }

    public static void Edit(userBL currentUser,int currrentUserIndex) {

        JFrame f1 = new JFrame();

        JLabel l = new JLabel("Edit Your Profile");
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


        JLabel l1 = new JLabel("Make Changes");
        l1.setFont(new Font("Century Gothic", Font.BOLD, 35));
        l1.setBounds(350, 90, 450, 50);
        l1.setForeground(new Color(255, 255, 255));


        JLabel l2 = new JLabel("Change Your Name");
        l2.setBounds(100, 140, 400, 30); // x, y, width, height
        l2.setForeground(new Color(0, 0, 0));
        l2.setFont(new Font("Century Gothic", Font.PLAIN, 25));


        JTextField t2 = new JTextField();
        t2.setText(currentUser.getName());
        t2.setBounds(100, 170, 500, 35);
        t2.setBackground(new Color(255, 255, 255));
        t2.setForeground(Color.black);
        t2.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        t2.setBorder(javax.swing.BorderFactory.createEmptyBorder());


        JLabel l3 = new JLabel("Change Your Address");
        l3.setBounds(100, 240, 400, 30); // x, y, width, height
        l3.setForeground(new Color(0, 0, 0));
        l3.setFont(new Font("Century Gothic", Font.PLAIN, 25));


        JTextField t3 = new JTextField();
        t3.setText(currentUser.getAddress());
        t3.setBounds(100, 270, 500, 35);
        t3.setBackground(new Color(255, 255, 255));
        t3.setForeground(Color.black);
        t3.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        t3.setBorder(javax.swing.BorderFactory.createEmptyBorder());  //I



        JLabel l4 = new JLabel("Change Your Mail");
        l4.setBounds(100, 340, 400, 30); // x, y, width, height
        l4.setForeground(new Color(0, 0, 0));
        l4.setFont(new Font("Century Gothic", Font.PLAIN, 25));


        JTextField t4 = new JTextField();
        t4.setText(currentUser.getEmail());
        t4.setBounds(100, 370, 500, 35);
        t4.setBackground(new Color(255, 255, 255));
        t4.setForeground(Color.black);
        t4.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        t4.setBorder(javax.swing.BorderFactory.createEmptyBorder());

        JLabel l5 = new JLabel("Change Your Phone Number");
        l5.setBounds(100, 440, 400, 30); // x, y, width, height
        l5.setForeground(new Color(0, 0, 0));
        l5.setFont(new Font("Century Gothic", Font.PLAIN, 25));


        JTextField t5 = new JTextField();
        t5.setText(currentUser.getPhoneNumber());
        t5.setBounds(100, 470, 500, 35);
        t5.setBackground(new Color(255, 255, 255));
        t5.setForeground(Color.black);
        t5.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        t5.setBorder(javax.swing.BorderFactory.createEmptyBorder());



        JButton b1 = new JButton("Edit");
        b1.setBounds(650, 600, 250, 35);
        b1.setBackground(new Color(70, 69, 106));
        b1.setForeground(Color.white);
        b1.setFont(new Font("Century Gothic", Font.BOLD, 23));
        b1.setFocusPainted(false);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentUser.setName(t2.getText());
                currentUser.setAddress(t3.getText());
                currentUser.setEmail(t4.getText());
                currentUser.setPhoneNumber(t5.getText());
                userDL.ChangeAtIndex(currrentUserIndex,currentUser);
                JOptionPane.showMessageDialog(null,"Changes Made Successfully","Edit Profile",JOptionPane.INFORMATION_MESSAGE);
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
                userProfile.userProfile(currentUser,currrentUserIndex);
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
        f1.add(t3);
        f1.add(t4);
        f1.add(t5);


        f1.add(b1);





        f1.setSize(1000, 700);
        f1.setLayout(new BorderLayout());
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.getContentPane().setBackground(new Color(45, 204, 187));
        f1.setLocationRelativeTo(null);
        f1.setResizable(false);
        f1.setVisible(true);





    }
}