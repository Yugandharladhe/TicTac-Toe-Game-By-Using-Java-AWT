import java.awt.*;
import java.awt.event.*;

import javax.swing.event.MouseInputAdapter;
public class TicTacToe extends Frame{
    Panel p1;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Button reset,newgame;
    public Label l1,l2,l3;
    int play=1;
    public TicTacToe()
    {
        l1=new Label("Player 1 => O *");
        l2=new Label("Player 2 => X");
        l3=new Label("");
        add(l1);
        add(l2);
        add(l3);
        l1.setLocation(700,100);
        l2.setLocation(700,150);
        l1.setSize(130,40);
        l2.setSize(130,40);
        l3.setLocation(700,200);
        l3.setSize(170,40);
        //game buttons
        b1=new Button("");
        b2=new Button("");
        b3=new Button("");
        b4=new Button("");
        b5=new Button("");
        b6=new Button("");
        b7=new Button("");
        b8=new Button("");
        b9=new Button("");
        //special buttons
        reset=new Button("Reset");
        newgame=new Button("Close");
        p1=new Panel();
        p1.setLayout(new GridLayout(3,3));
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(b7);
        p1.add(b8);
        p1.add(b9);
        p1.setSize(500,500);
        p1.setLocation(30,80);
        setLayout(null);
        add(p1);
        add(reset);
        add(newgame);
        reset.setLocation(600,450);
        reset.setSize(70,50);
        newgame.setLocation(700,450);
        newgame.setSize(80,50);

        b1.addMouseListener(new Event());
        b2.addMouseListener(new Event());
        b3.addMouseListener(new Event());
        b4.addMouseListener(new Event());
        b5.addMouseListener(new Event());
        b6.addMouseListener(new Event());
        b7.addMouseListener(new Event());
        b8.addMouseListener(new Event());
        b9.addMouseListener(new Event());
        reset.addMouseListener(new ResetAndNewGame());
        newgame.addMouseListener(new ResetAndNewGame());
    }
    class Event extends MouseAdapter
    { 
        public void check(String s)
        {
            if(s==b1.getLabel() && s==b2.getLabel() && s==b3.getLabel())
            {
               if(s=="X")
               {
                l3.setText("Player 2 is winner");
               }
               if(s=="O")
               {
                l3.setText("Player 1 is winner");
               }
            }
            if(s==b4.getLabel() && s==b5.getLabel() && s==b6.getLabel())
            {
               if(s=="X")
               {
                l3.setText("Player 2 is winner");
               }
               if(s=="O")
               {
                l3.setText("Player 1 is winner");
               }
            }
            if(s==b7.getLabel() && s==b8.getLabel() && s==b9.getLabel())
            {
               if(s=="X")
               {
                l3.setText("Player 2 is winner");
               }
               if(s=="O")
               {
                l3.setText("Player 1 is winner");
               }
            }
            if(s==b1.getLabel() && s==b4.getLabel() && s==b7.getLabel())
            {
               if(s=="X")
               {
                l3.setText("Player 2 is winner");
               }
               if(s=="O")
               {
                l3.setText("Player 1 is winner");
               }
            }
            if(s==b2.getLabel() && s==b5.getLabel() && s==b8.getLabel())
            {
               if(s=="X")
               {
                l3.setText("Player 2 is winner");
               }
               if(s=="O")
               {
                l3.setText("Player 1 is winner");
               }
            }
            if(s==b3.getLabel() && s==b6.getLabel() && s==b9.getLabel())
            {
               if(s=="X")
               {
                l3.setText("Player 2 is winner");
               }
               if(s=="O")
               {
                l3.setText("Player 1 is winner");
               }
            }
            if(s==b1.getLabel() && s==b5.getLabel() && s==b9.getLabel())
            {
               if(s=="X")
               {
                l3.setText("Player 2 is winner");
               }
               if(s=="O")
               {
                l3.setText("Player 1 is winner");
               }
            }
            if(s==b3.getLabel() && s==b5.getLabel() && s==b7.getLabel())
            {
               if(s=="X")
               {
                l3.setText("Player 2 is winner");
               }
               if(s=="O")
               {
                l3.setText("Player 1 is winner");
               }
            }
            if(s==b1.getLabel() && s==b2.getLabel() && s==b3.getLabel())
            {
               if(s=="X")
               {
                l3.setText("Player 2 is winner");
               }
               if(s=="O")
               {
                l3.setText("Player 1 is winner");
               }
            }
        }
        public void mouseClicked(MouseEvent me)
        {
            Button btn=(Button)me.getComponent();
            if(play==1)
            {
                btn.setLabel("O");
                l1.setText("Player 1 =>O");
                l2.setText("Player 2 => X *");
                play=0;
                check("O");
            }
            else{
                btn.setLabel("X");
                l1.setText("Player 1 =>O *");
                l2.setText("Player 2 => X");
                play=1;
                check("X");
            }
            btn.setEnabled(false);
        }
    }
    class ResetAndNewGame extends MouseAdapter
    {
        public void mouseClicked(MouseEvent me)
        {
            Button btn=(Button)me.getComponent();
            if(btn==reset)
            {
                b1.setEnabled(true);
                b1.setLabel("");
                b2.setEnabled(true);
                b2.setLabel("");
                b3.setEnabled(true);
                b3.setLabel("");
                b4.setEnabled(true);
                b4.setLabel("");
                b5.setEnabled(true);
                b5.setLabel("");
                b6.setEnabled(true);
                b6.setLabel("");
                b7.setEnabled(true);
                b7.setLabel("");
                b8.setEnabled(true);
                b8.setLabel("");
                b9.setEnabled(true);
                b9.setLabel("");l3.setText("");
                l1.setText("Player 1 =>O *");
                l2.setText("Player 2 => X");

            }
            else{
                dispose();
            }
        }
    }
    public static void main(String a[])
    {
        TicTacToe t1=new TicTacToe();
        t1.setVisible(true);
        t1.setTitle("TicTacToe");
        t1.setSize(900,900);
        t1.setBackground(Color.red);
    }
}
