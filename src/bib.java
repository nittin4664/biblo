/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/12/12
 * Time: 10:16 AM
 * To change this template use File | Settings | File Templates.
 */


import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class bib extends SplitPane  implements ActionListener {


    public JLabel l1= new JLabel("welcome");

    public JButton jb1=new JButton("view books");
    public JButton jb2=new JButton("reserve books");
    public JFrame jf;
    public Font f = new Font("Times New roman" , Font.BOLD , 20);
    public Container c;
    String nam;
    info info[]=new info[4];
    SplitPane sp=new SplitPane();

    bib()
    {

        info[0]=new info("abc",3);
        info[1]=new info("def",4);
        info[2]=new info("pqr",1);
        info[3]=new info("xyz",0);
        jf = new JFrame("bib");
        c = jf.getContentPane();
        c.setLayout(null);
        jf.setSize(900, 900);
        jf.setResizable(true);
        c.setBackground( Color.blue);

        jb1.addActionListener(this);
        jb2.addActionListener(this);

        l1.setBounds(200,50, 900,45);
        l1.setFont(f);

        jb1.setBounds(200, 100, 200,50);
        jb1.setForeground( Color.GRAY);

        sp.setBounds(200, 100, 200,50);


        jb2.setBounds(200, 200, 200,50);
        jb2.setForeground(Color.gray);

        c.add(l1);
        c.add(sp.splitPane);
        c.add(jb1);
        c.add(jb2);
        jf.setVisible(true);
    }





    public static void main (String args[])
    {
        new bib();

    }
    public void reservebook()
    {

    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==jb1){
            System .out.println("Button Clicked is "+jb1.getText() );
            sp.splitPane.setBounds(200, 200, 400,400);
            sp.splitPane.setForeground( Color.GRAY);

            jb2.setBounds(200, 650, 200,50);
            jb2.setForeground(Color.gray);

        }
        if(e.getSource()==jb2){
            System .out.println("Button Clicked is " + jb2.getText());
            nam=sp.sndvalue();
            System .out.println("book reserved is " + nam );
            for(int i=0;i<3;i++)
            {
                if(nam.equals(info[i].name))
                {
                    if(info[i].amount > 0 )
                    {
                        System .out.println("book "+ nam +" has been reserved....enjoy reading  "  );
                        info[i].amount--;
                        JOptionPane.showMessageDialog(jf,"book "+ nam +" has been reserved....enjoy reading  "  );
                    }
                    else
                    {
                        System .out.println("book "+ nam +" is not available....plz select another book "  );
                        JOptionPane.showMessageDialog(jf,"book "+ nam +" is not available....plz select another book ");
                    }

                }

            }

        }

    }

}
