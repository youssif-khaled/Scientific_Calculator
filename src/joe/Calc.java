
package joe;
import javax.swing.*;
import java.awt.*;



public class Calc extends JFrame {
    double result,n1,n2,x;
    char op;
    JPanel p,p2;
    JTextField T;
    JButton J0,J1,J2,J3,J4,J5,J6,J7,J8,J9,J10,J11,J12,J13,J14,J15,J16,J17,J18,J19;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    public Calc(){
        this.setTitle("Calculator");
        this.setSize(555,550);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocation(500,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        T=new JTextField();
        p2=new JPanel(); p2.setBackground(Color.DARK_GRAY);this.add(p2);
        p=new JPanel();p.setBackground(Color.BLACK); this.add(p); this.setLayout(new GridLayout(2,1));
    p2.setLayout(null); T.setBounds(55,25,430,40);p2.add(T);
p.setLayout(new GridLayout(4,5,5,10));p2.setLayout(null);

J0=new JButton();p.add(J0);J1=new JButton();p.add(J1);J2=new JButton();p.add(J2);J3=new JButton();p.add(J3);J17=new JButton(" AC ");p.add(J17);                              
J4=new JButton();p.add(J4);J5=new JButton();p.add(J5);J6=new JButton();p.add(J6);J7=new JButton();p.add(J7);J18=new JButton(" / ");p.add(J18);
J8=new JButton();p.add(J8);J9=new JButton();p.add(J9);J10=new JButton();p.add(J10);J11=new JButton();p.add(J11);J19=new JButton(" - ");p.add(J19);
J12=new JButton();p.add(J12);J13=new JButton();p.add(J13);J14=new JButton("  PI  "); p.add(J14);J15=new JButton(" Ans ");p.add(J15);J16=new JButton(" = ");p.add(J16);
b1=new JButton();p2.add(b1);b2=new JButton();p2.add(b2);b3=new JButton();p2.add(b3);b4=new JButton();p2.add(b4);b5=new JButton();p2.add(b5);
b6=new JButton();p2.add(b6);b7=new JButton();p2.add(b7);b8=new JButton();p2.add(b8);b9=new JButton();p2.add(b9);b10=new JButton();p2.add(b10);
 p.setLayout(new GridLayout(4,5,5,10)); p2.setLayout(null); b1.setBounds(5,95,80,60);b2.setBounds(95,95,80,60);b3.setBounds(185,95,80,60);
 b11=new JButton();p2.add(b11);b12=new JButton();p2.add(b12);
b4.setBounds(275,95,80,60);b5.setBounds(365,95,80,60);b6.setBounds(455,95,80,60);b7.setBounds(5,165,80,60);
b8.setBounds(95,165,80,60);b9.setBounds(185,165,80,60);b10.setBounds(275,165,80,60);b11.setBounds(365,165,80,60);b12.setBounds(455,165,80,60);

J17.setBackground(Color.BLUE);J3.setBackground(Color.RED);J3.setForeground(Color.WHITE);
J17.setForeground(Color.WHITE);b1.setBackground(Color.CYAN);b1.setForeground(Color.BLACK);
J11.setForeground(Color.red);J19.setForeground(Color.red);J7.setForeground(Color.red);J18.setForeground(Color.red);




       
        




    
   


    
    }
  
        }
