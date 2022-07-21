import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class login{
//    public static void main(String[] args){
//        login jl = new login();
//        jl.login(-1);
//    }


    public void login(int currentUserIndex){
        JFrame f1= new JFrame();
        JLabel l = new JLabel("Login");
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


        JLabel l1 = new JLabel("User ID");
        l1.setBounds(100,100,180,30); // x, y, width, height
        l1. setForeground(new Color (0, 0, 0));
        l1.setFont(new Font("Century Gothic", Font.BOLD, 25));

        JSeparator js1 = new JSeparator();
        js1.setOrientation(SwingConstants.HORIZONTAL);
        js1.setBounds(100,170,300,5);
        js1.setForeground(Color.white);

        JTextField t1 = new JTextField();
        t1.setBounds(100,130,300,40);
        t1.setBackground(new Color(255, 255, 255));
        t1.setForeground(Color.black);
        t1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        t1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        t1.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                js1.setForeground(new Color(254,108,89));
            }
            public void focusLost(FocusEvent e) {
                js1.setForeground(Color.white);
            }
        });

        JLabel l2 = new JLabel("Password");
        l2.setBounds(100,190,200,30);
        l2. setForeground(new Color (37, 0, 0));
        l2.setFont(new Font("Century Gothic", Font.BOLD, 25));

        JSeparator js2 = new JSeparator();
        js2.setOrientation(SwingConstants.HORIZONTAL);
        js2.setBounds(100,260,300,5);
        js2.setForeground(new Color(254,108,89));

        JPasswordField tp = new JPasswordField();
        tp.setBounds(100, 220, 300,40);
        tp.setEchoChar('*');
        tp.setBackground(new Color(255, 255, 255));
        tp.setForeground(Color.black);
        tp.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        tp.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        tp.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                js2.setForeground(Color.black);
            }
            public void focusLost(FocusEvent e) {
                js2.setForeground(Color.white);
            }
        });

        JCheckBox checkbox = new JCheckBox("Show Password");
        checkbox.setBounds(270,290,120,30);
        checkbox.setBackground(new Color (45, 204, 187));
        checkbox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange()==1){
                    tp.setEchoChar((char)0);
                }
                else{
                    tp.setEchoChar('*');
                }
            }
        });

        JButton b3 = new JButton("Forget Password?");
        b3.setBounds(100,290,150,30);
        b3.setBackground(new Color(45, 204, 187));
        b3.setBorder(null);
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                f1.dispose();
                //your forget password gui function
            }
        });
        b3.setFocusPainted(false);

        JButton b1 = new JButton("Login");
        b1.setBounds(120,360,250,35);
        b1.setBackground(new Color(70, 69, 106));
        b1.setForeground(Color.white);
        b1.setFont(new Font("Century Gothic", Font.BOLD, 23));
        b1.setFocusPainted(false);

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                String id = t1.getText();
                char[] ch = tp.getPassword();
                String pass = new String(ch);
                int callResult = userDL.getIndex(id);
                if(id.equals("") || pass.equals("")){
                    JOptionPane.showMessageDialog(null,"Please fill all Necessary details","Fill the Form",JOptionPane.ERROR_MESSAGE);
                }
                else if (callResult != -1) {
                    userBL copyobj = new userBL();
                    copyobj = userDL.retrieveFromIndex(callResult);
                    if (id.equals(copyobj.getUserID()) && pass.equals(copyobj.getPassword())) {
                        f1.dispose();
                        WelcomePage obj = new WelcomePage();
                        obj.WelcomePage(callResult);
                    } else {
                        JOptionPane.showMessageDialog(null, "Wrong USER ID or PASSWORD!", "Login Error", JOptionPane.ERROR_MESSAGE);
                    }

                } else{
                    JOptionPane.showMessageDialog(null,"No Account Exist!","Login Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b1.setBackground(new Color(70, 69, 106));
                b1.setBounds(100,360,300,35);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1.setBackground(new Color(70, 69, 106));
                b1.setBounds(120,360,250,35);
            }
        });

        JButton b2 = new JButton("Create Account");
        b2.setBounds(120,400,250,35);
        b2.setBackground(new Color(45, 204, 187));
        b2.setForeground(Color.white);
        b2.setFont(new Font("Century Gothic", Font.BOLD, 20));
        b2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                signUp.SignUp();
            }
        });



        f1.add(l);
        f1.add(lD);
        f1.add(js);
        f1.add(l1);
        f1.add(t1);
        f1.add(js1);
        f1.add(l2);
        f1.add(tp);
        f1.add(js2);
        f1.add(checkbox);
        f1.add(b3);
        f1.add(b1);
        f1.add(b2);

        f1.setSize(500,550);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.getContentPane().setBackground(new Color(45, 204, 187));
        f1.setLocationRelativeTo(null);
        f1.setResizable(false);
        f1.setVisible(true);
    }
}