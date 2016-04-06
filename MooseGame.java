import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import java.util.*;

public class MooseGame extends JFrame{


   private final int WINDOW_WIDTH = 600;
   private final int WINDOW_HEIGHT = 800;
   private JButton reset;
   private JButton [] panels = new JButton[4];
   private String filler = "        ";
   private JLabel intro;
   private JLabel results;
   
   
public MooseGame(){
   setTitle("Moose Matching Game");
   setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
   JLabel intro = new JLabel("Click two boxes. Try to match all the pictures.");
   add(intro,BorderLayout.NORTH);
   add(new JLabel (filler), BorderLayout.EAST);
   add(new JLabel (filler), BorderLayout.WEST);
   
   results = new JLabel(filler);
   add (results, BorderLayout.SOUTH);
   //make south region new panel with results and reset button?
   
   
   Panel pPanels = new Panel();
      pPanels.setLayout(new GridLayout(4,4));
      for(int i=0;i<16;i++){
         String panelNum = i+1+"";
         panels[i] = new JButton (panelNum);
         //set font
         //panels[i].addActionListener(this);
         pPanels.add(panels[i]);
         }
      add (pPanels,BorderLayout.CENTER);
      
      setVisible(true);
      
    }

    
  }
   
   
   
   
   
   
