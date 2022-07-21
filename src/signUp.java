import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class signUp {
        public static void  main(String[] args) {
        SignUp();
    }
    public static JFrame f1;
    public static void SignUp() {

        f1= new JFrame();
        JLabel l = new JLabel("Create Account");
        l.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 28));
        l.setBounds(280,29,300,70);
        l.setForeground(new Color(255, 255, 255));

        JSeparator js = new JSeparator();
        js.setOrientation(SwingConstants.HORIZONTAL);
        js.setBounds(100,80,300,10);
        js.setForeground(new Color(254,108,89));

        JLabel l1 = new JLabel("Name");
        l1.setBounds(50,100,200,30); // x, y, width, height
        l1. setForeground(new Color (0, 0, 0));
        l1.setFont(new Font("Century Gothic", Font.BOLD, 20));



        JTextField t1 = new JTextField();
        t1.setBounds(50,130,180,30);
        t1.setBackground(new Color(255, 255, 255));
        t1.setForeground(Color.black);
        t1.setFont(new Font("Century Gothic", Font.BOLD, 20));
        t1.setBorder(javax.swing.BorderFactory.createEmptyBorder());


        JLabel l5 = new JLabel("EMAIL");
        l5.setBounds(50,170,150,30); // x, y, width, height
        l5. setForeground(new Color (0, 0, 0));
        l5.setFont(new Font("Century Gothic", Font.BOLD, 20));



        JTextField t5 = new JTextField();
        t5.setBounds(50,200,180,30);
        t5.setBackground(new Color(255, 255, 255));
        t5.setForeground(Color.black);
        t5.setFont(new Font("Century Gothic", Font.BOLD, 20));
        t5.setBorder(javax.swing.BorderFactory.createEmptyBorder());







        JLabel l6 = new JLabel("Phone  No");
        l6.setBounds(295,170,180,30); // x, y, width, height
        l6. setForeground(new Color (0, 0, 0));
        l6.setFont(new Font("Century Gothic", Font.BOLD, 20));



        JTextField t6 = new JTextField();
        t6.setBounds(290,200,180,30);
        t6.setBackground(new Color(255, 255, 255));
        t6.setForeground(Color.black);
        t6.setFont(new Font("Century Gothic", Font.BOLD, 20));
        t6.setBorder(javax.swing.BorderFactory.createEmptyBorder());



        JLabel l3 = new JLabel("ADDRESS");
        l3.setBounds(295,240,180,30); // x, y, width, height
        l3. setForeground(new Color (0, 0, 0));
        l3.setFont(new Font("Century Gothic", Font.BOLD, 20));



        JTextField t3 = new JTextField();
        t3.setBounds(290,270,180,30);
        t3.setBackground(new Color(255, 255, 255));
        t3.setForeground(Color.black);
        t3.setFont(new Font("Century Gothic", Font.BOLD, 20));
        t3.setBorder(javax.swing.BorderFactory.createEmptyBorder());


        JLabel l2 = new JLabel("USER ID");
        l2.setBounds(295,100,180,30); // x, y, width, height
        l2. setForeground(new Color (0, 0, 0));
        l2.setFont(new Font("Century Gothic", Font.BOLD, 20));



        JTextField t2 = new JTextField();
        t2.setBounds(290,130,180,30);
        t2.setBackground(new Color(255, 255, 255));
        t2.setForeground(Color.black);
        t2.setFont(new Font("Century Gothic", Font.BOLD, 20));
        t2.setBorder(javax.swing.BorderFactory.createEmptyBorder());






        JLabel l4 = new JLabel("PASSWORD");
        l4.setBounds(50,240,200,30); // x, y, width, height
        l4. setForeground(new Color (0, 0, 0));
        l4.setFont(new Font("Century Gothic", Font.BOLD, 20));



        JTextField t4 = new JTextField();
        t4.setBounds(50,270,180,30);
        t4.setBackground(new Color(255, 255, 255));
        t4.setForeground(Color.black);
        t4.setFont(new Font("Century Gothic", Font.BOLD, 20));
        t4.setBorder(javax.swing.BorderFactory.createEmptyBorder());

        JRadioButton jr_m=new JRadioButton("Male");
        jr_m.setBounds(50,310,80,60);
        jr_m.setBackground(new Color(45, 204, 187));
        jr_m.setFont(new Font("Century Gothic", Font.BOLD, 20));

        JRadioButton jr_f=new JRadioButton("Female");
        jr_f.setBounds(130,310,120,60);
        jr_f.setBackground(new Color(45, 204, 187));
        jr_f.setFont(new Font("Century Gothic", Font.BOLD, 20));

        ButtonGroup G = new ButtonGroup();
        G.add(jr_f);
        G.add(jr_m);

        JLabel picLabel = new JLabel();
        picLabel.setBounds(600, 50, 250, 250);
        JButton b2 = new JButton("Upload Picture");
        b2.setBounds(520,400,250,35);
        b2.setBackground(new Color(70, 69, 106));
        b2.setForeground(Color.white);
        b2.setFont(new Font("Century Gothic", Font.BOLD, 23));
        b2.setFocusPainted(false);

        userBL newuser = new userBL();

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
                int result = fileChooser.showOpenDialog(f1.getParent());
                if (result == JFileChooser.APPROVE_OPTION) {
                    try {
                        File file = fileChooser.getSelectedFile();
                        String addressImg = file.getPath();
                        newuser.setAddressImg(addressImg);
                        BufferedImage picture = ImageIO.read(file);

                        picLabel.setIcon(new ImageIcon(picture));
                        f1.add(picLabel);
                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                        JOptionPane.showMessageDialog(null, "ERROR");
                    }
                }
            }
        });

        JButton b1 = new JButton("SignUp");
        b1.setBounds(120,400,250,35);
        b1.setBackground(new Color(70, 69, 106));
        b1.setForeground(Color.white);
        b1.setFont(new Font("Century Gothic", Font.BOLD, 23));
        b1.setFocusPainted(false);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = t1.getText();
                String userid = t2.getText();
                String email = t5.getText();
                String phoneNo = t6.getText();
                String password = t4.getText();
                String address = t3.getText();
                String gender = "";
                if(jr_m.isSelected()){
                    gender = "Male";
                }
                else if (jr_f.isSelected()) {
                    gender = "Female";
                }
                int checkingForSameMail = userDL.searchmail(email);
                int checkingForID = userDL.getIndex(userid);
                if (name.equals("") || email.equals("") || address.equals("") || phoneNo.equals("") || userid.equals("") || password.equals("") ) {
                    JOptionPane.showMessageDialog(null,"Please fill all Necessary details","Fill the Form",JOptionPane.ERROR_MESSAGE);
                }
                else if (checkingForID >= 0) {
                    JOptionPane.showMessageDialog(null,"UserID is already in use.","UserID in use",JOptionPane.ERROR_MESSAGE);
//                    System.out.println(". Please Enter another UserID :");
                }
                else if(checkingForSameMail >= 0){
                    JOptionPane.showMessageDialog(null,"This Email is already in use.","Email in use",JOptionPane.ERROR_MESSAGE);
                }
                else if (checkingForID < 0 && checkingForSameMail < 0) {
                    newuser.setName(name);
                    newuser.setPassword(password);
                    newuser.setEmail(email);
                    newuser.setPhoneNumber(phoneNo);
                    newuser.setAddress(address);
                    newuser.setUserID(userid);
                    userDL.Create(newuser);
                    int retrieveIndex = userDL.getIndex(userid);
                    JOptionPane.showMessageDialog(null, "Sign up successful", "Congragulations", JOptionPane.INFORMATION_MESSAGE);
                    f1.dispose();
                    WelcomePage obj = new WelcomePage();
                    obj.WelcomePage(retrieveIndex);
                }
            }
        });

        JLabel lD = new JLabel("Digital Bazar");
        lD.setFont(new Font("Century Gothic", Font.PLAIN, 40));
        lD.setBounds(30,20,250,50);
        lD.setForeground(new Color(0, 0, 0));


        //   jc_day.setBounds();
        JLabel l9=new JLabel("Already Exists?");
        l9.setBounds(140,450,170,40);
        l5.setFont(new Font("Century Gothic", Font.BOLD, 15));



        JButton b5 = new JButton("Login");
        b5.setBounds(246,455,50,30);
        b5.setBackground(new Color(45, 204, 187));
        b5.setForeground(Color.BLACK);
        b5.setFont(new Font("Century Gothic", Font.BOLD, 15));
        b5.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
                login obj = new login();
                obj.login(-1);
            }
        });




        f1.add(l9);
        f1.add(b5);
        f1.add(l);

        f1.add(js);


        f1.add(l1);
        f1.add(t1);

        f1.add(l2);
        f1.add(t2);

        f1.add(l3);
        f1.add(t3);


        f1.add(l4);
        f1.add(t4);

        f1.add(l5);
        f1.add(t5);


        f1.add(l6);
        f1.add(t6);

        f1.add(jr_m);
        f1.add(jr_f);


        f1.add(b1);
        f1.add(lD);





        f1.setSize(900,550);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.getContentPane().setBackground(new Color(45, 204, 187));
        f1.setLocationRelativeTo(null);
        f1.setResizable(false);
        f1.setVisible(true);
        f1.add(picLabel);

        f1.add(b2);
    }
}