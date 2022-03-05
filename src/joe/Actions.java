

package joe;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;
public class Actions extends Calc  {
   
   public Actions()         
    { 
  JOptionPane.showMessageDialog(null, "Welcome, مرحبا");
        J12.setText(" 0 ");
       J12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                J12ActionPerformed(evt);
            }

            private void J12ActionPerformed(ActionEvent evt) {
               T.setText(T.getText()+"0");
            }
        });
 
  J8.setText(" 1 ");
       J8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                J8ActionPerformed(evt);
            }

            private void J8ActionPerformed(ActionEvent evt) {
               T.setText(T.getText()+"1");
            }
        });
       J9.setText(" 2 ");
       J9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                J9ActionPerformed(evt);
            }

            private void J9ActionPerformed(ActionEvent evt) {
               T.setText(T.getText()+"2");
            }
        });
       J10.setText(" 3 ");
       J10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                J10ActionPerformed(evt);
            }

            private void J10ActionPerformed(ActionEvent evt) {
               T.setText(T.getText()+"3");
            }
        });
       J4.setText(" 4 ");
       J4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                J4ActionPerformed(evt);
            }

            private void J4ActionPerformed(ActionEvent evt) {
               T.setText(T.getText()+"4");
            }
        });
       J5.setText(" 5 ");
       J5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                J5ActionPerformed(evt);
            }

            private void J5ActionPerformed(ActionEvent evt) {
               T.setText(T.getText()+"5");
            }
        });
       J6.setText(" 6 ");
       J6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                J6ActionPerformed(evt);
            }

            private void J6ActionPerformed(ActionEvent evt) {
               T.setText(T.getText()+"6");
            }
        });
       J0.setText(" 7 ");
       J0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                J0ActionPerformed(evt);
            }

            private void J0ActionPerformed(ActionEvent evt) {
               T.setText(T.getText()+"7");
            }
        });
       J1.setText(" 8 ");
       J1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                J1ActionPerformed(evt);
            }

            private void J1ActionPerformed(ActionEvent evt) {
               T.setText(T.getText()+"8");
            }
        });
       J2.setText(" 9 ");
       J2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                J2ActionPerformed(evt);
            }

            private void J2ActionPerformed(ActionEvent evt) {
               T.setText(T.getText()+"9");
            }
        });
         J13.setText(" . ");
       J13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                J13ActionPerformed(evt);
            }

            private void J13ActionPerformed(ActionEvent evt) {
               T.setText(T.getText()+".");
            }
        });
         J3.setText(" C ");
       J3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                J3ActionPerformed(evt);
            }

            private void J3ActionPerformed(ActionEvent evt) {
               T.setText("");
            }
        });
         J11.setText(" + ");
       J11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                J11ActionPerformed(evt);
            }

            private void J11ActionPerformed(ActionEvent evt) {
               n1=Double.parseDouble(T.getText());
               T.setText("");
               op='+';
            }
        });
        J19.setText(" - ");
       J19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                J19ActionPerformed(evt);
            }

            private void J19ActionPerformed(ActionEvent evt) {
               n1=Double.parseDouble(T.getText());
               T.setText("");
               op='-';
            }
        });
        J7.setText(" X ");
       J7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                J7ActionPerformed(evt);
            }

            private void J7ActionPerformed(ActionEvent evt) {
               n1=Double.parseDouble(T.getText());
               T.setText("");
               op='X';
            }
        });
        J18.setText(" / ");
       J18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                J18ActionPerformed(evt);
            }

            private void J18ActionPerformed(ActionEvent evt) {
               n1=Double.parseDouble(T.getText());
               T.setText("");
               op='/';
            }
        });
           J17.setText(" AC ");
       J17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                J17ActionPerformed(evt);
            }

            private void J17ActionPerformed(ActionEvent evt) {
              System.exit(0);
            }
        });
       J16.setText(" = ");
       J16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                J16ActionPerformed(evt);
            }

            private void J16ActionPerformed(ActionEvent evt) {
             n2=Double.parseDouble(T.getText());
             switch(op)
                     {case '+':result=n1+n2;break; case '-':result=n1-n2;break; case 'X':result=n1*n2;break; case '/':result=n1/n2;break;               
                     }
             T.setText(String.format("%.0f", result));
            
            }
        });
         b1.setText(" DEL ");
       b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b1ActionPerformed(evt);
            }

            private void b1ActionPerformed(ActionEvent evt) {
            String s;
            if(T.getText().length()>0)
            {
                StringBuilder  s2=new StringBuilder(T.getText());
                s2.deleteCharAt(T.getText().length() -1);
                s=s2.toString();
                T.setText(s);
            }
            }
        });
         b2.setText(" +/- ");
       b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b2ActionPerformed(evt);
            }

            private void b2ActionPerformed(ActionEvent evt) {
               double op= Double.parseDouble(String.valueOf(T.getText()));
               op=op*(-1);
               T.setText(String.valueOf(op));
            }
        });
         b3.setText(" Sin ");
       b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b3ActionPerformed(evt);
            }

            private void b3ActionPerformed(ActionEvent evt) {
        double x=Double.parseDouble(String.valueOf(T.getText()));
          x=Math.sin(Math.toRadians(x));
T.setText(String.valueOf(x));

            }
        });
      b4.setText(" Cos ");
       b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b4ActionPerformed(evt);
            }

            private void b4ActionPerformed(ActionEvent evt) {
          x=Double.parseDouble(String.valueOf(T.getText()));
          x=Math.cos(Math.toRadians(x));
         T.setText(String.valueOf(x));
            }
        });
        b5.setText(" Tan ");
       b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b5ActionPerformed(evt);
            }

            private void b5ActionPerformed(ActionEvent evt) {
          x=Double.parseDouble(String.valueOf(T.getText()));
         
         x=Math.tan(Math.toRadians(x));
          T.setText(String.valueOf(x));
            }
        });
        b6.setText(" X^1/2 ");
       b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b6ActionPerformed(evt);
            }

            private void b6ActionPerformed(ActionEvent evt) {
          x=Double.parseDouble(String.valueOf(T.getText()));
          x=Math.sqrt(x);
T.setText(String.valueOf(x));
            }
        });
     b7.setText(" X^2 ");
       b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b7ActionPerformed(evt);
            }

            private void b7ActionPerformed(ActionEvent evt) {
          x=Double.parseDouble(String.valueOf(T.getText()));
          x=Math.pow(x,2);
T.setText(String.valueOf(x));
            }
        });
           b8.setText(" % ");
       b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b8ActionPerformed(evt);
            }

            private void b8ActionPerformed(ActionEvent evt) {
          x=Double.parseDouble(String.valueOf(T.getText()));
          x=x/100;
T.setText(String.valueOf(x));
            }
        });
         b9.setText(" abs ");
       b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b9ActionPerformed(evt);
            }

            private void b9ActionPerformed(ActionEvent evt) {
          x=Double.parseDouble(String.valueOf(T.getText()));
          x=x*(-1);
T.setText(String.valueOf(x));
            }
        });
            b10.setText(" ( ");
       b10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b10ActionPerformed(evt);
            }

            private void b10ActionPerformed(ActionEvent evt) {
         
           T.setText(T.getText()+"(");

            }
        });
                    b11.setText(" ) ");
       b11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b11ActionPerformed(evt);
            }

            private void b11ActionPerformed(ActionEvent evt) {
         
           T.setText(T.getText()+")");

            }
        }); 
         
        b12.setText(" Log ");
       b12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b12ActionPerformed(evt);
            }

           public void b12ActionPerformed(ActionEvent evt) {
          x=Double.parseDouble(String.valueOf(T.getText()));
          x=Math.log(Math.log(x));
T.setText(String.valueOf(x));
            }
        }); 
       J14.setText(" PI ");
       J14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                J14ActionPerformed(evt);
            }

            private void J14ActionPerformed(ActionEvent evt) {
         // x=Double.parseDouble(String.valueOf(T.getText()));
                double x=Math.PI;
T.setText(String.valueOf(x));
            }
        }); 
     
     J15.setText(" Ans ");
       J15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                J15ActionPerformed(evt);
            }

            private void J15ActionPerformed(ActionEvent evt) {
             
             T.setText(String.format("%.0f", result));
            
            }
        });

  
       }
               }
    
