import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{

  float newValue,oldValue;
  int operator=0;
  float result;
  JFrame mainframe;
  JButton cbutton,dltbutton,percentagebutton,dividbutton,sevenbutton,eighbutton,ninebutton,multbutton,fourbutton,fivebutton,sixbutton,minusbutton,onebutton,twobutton,zerobutton,dotbutton,equaltobutton,plusbutton,threebutton;
  JLabel displaylabel;

  public Calculator() {

    // for make a window

     mainframe = new JFrame("CALCULATOR");
    mainframe.setLayout(null);
    mainframe.setBounds(810, 200, 380, 706);
    mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainframe.setVisible(true);
    mainframe.getContentPane().setBackground(Color.BLACK);
    mainframe.setResizable(false);
    // for dispalying label

    displaylabel = new JLabel();
    displaylabel.setBounds(10, 100, 350, 100);
    displaylabel.setBackground(Color.BLACK);
    displaylabel.setForeground(Color.WHITE);
    displaylabel.setOpaque(true);
    displaylabel.setFont(new Font("Arial", Font.PLAIN, 50));
    displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
    mainframe.add(displaylabel);

    // for make button

    //C button

    cbutton=new JButton("C");
    cbutton.setFont(new Font("Arial", Font.PLAIN, 50));
    cbutton.setBounds(10, 220, 80, 80);
    cbutton.setBackground(new Color(184,184,184));
    cbutton.setForeground(new Color(0,0,0));
    cbutton.setBorderPainted(false);
    cbutton.setFocusPainted(false);
    cbutton.addActionListener(this);
    mainframe.add(cbutton);

    //DL button

    dltbutton=new JButton("D");
    dltbutton.setFont(new Font("Arial", Font.PLAIN, 50));
    dltbutton.setBounds(100, 220, 80, 80);
    dltbutton.setBackground(new Color(184,184,184));
    dltbutton.setForeground(new Color(0,0,0));
    dltbutton.setBorderPainted(false);
    dltbutton.setFocusPainted(false);
    dltbutton.addActionListener(this);
    mainframe.add(dltbutton);

    //% button

    percentagebutton=new JButton("%");
    percentagebutton.setFont(new Font("Arial", Font.PLAIN, 45));
    percentagebutton.setBounds(190, 220, 80, 80);
    percentagebutton.setBackground(new Color(184,184,184));
    percentagebutton.setForeground(new Color(0,0,0));
    percentagebutton.setBorderPainted(false);
    percentagebutton.setFocusPainted(false);
    percentagebutton.addActionListener(this);
    mainframe.add(percentagebutton);

    //÷ button

    dividbutton=new JButton("÷");
    dividbutton.setFont(new Font("Arial", Font.PLAIN, 50));
    dividbutton.setBounds(280, 220, 80, 80);
    dividbutton.setBackground(new Color(255,163,5));
    dividbutton.setForeground(new Color(255,255,255));
    dividbutton.setBorderPainted(false);
    dividbutton.setFocusPainted(false);
    dividbutton.addActionListener(this);
    mainframe.add(dividbutton);



    // 7 button

    sevenbutton = new JButton("7");
    sevenbutton.setBounds(10, 310, 80, 80);
    sevenbutton.setFont(new Font("Arial", Font.PLAIN, 50));
    sevenbutton.setBackground(new Color(36,39,43));
    sevenbutton.setForeground(new Color(255,255,255));
    sevenbutton.setBorderPainted(false);
    sevenbutton.setFocusPainted(false);
    sevenbutton.addActionListener(this);
    mainframe.add(sevenbutton);

    // 8 button

    eighbutton = new JButton("8");
    eighbutton.setBounds(100, 310, 80, 80);
    eighbutton.setFont(new Font("Aria", Font.PLAIN, 50));
    eighbutton.setBackground(new Color(36,39,43));
    eighbutton.setForeground(new Color(255,255,255));
    eighbutton.setBorderPainted(false);
    eighbutton.setFocusPainted(false);
    eighbutton.addActionListener(this);
    mainframe.add(eighbutton);

    // 9 button

    ninebutton = new JButton("9");
    ninebutton.setBounds(190, 310, 80, 80);
    ninebutton.setFont(new Font("Arial", Font.PLAIN, 50));
    ninebutton.setBackground(new Color(36,39,43));
    ninebutton.setForeground(new Color(255,255,255));
    ninebutton.setBorderPainted(false);
    ninebutton.setFocusPainted(false);
    ninebutton.addActionListener(this);
    mainframe.add(ninebutton);

    //× button

    multbutton = new JButton("×");
    multbutton.setBounds(280, 310, 80, 80);
    multbutton.setFont(new Font("Arial", Font.PLAIN, 50));
    multbutton.setBackground(new Color(255,163,5));
    multbutton.setForeground(new Color(255,255,255));
    multbutton.setBorderPainted(false);
    multbutton.setFocusPainted(false);
    multbutton.addActionListener(this);
    mainframe.add(multbutton);

    // 4 button

    fourbutton = new JButton("4");
    fourbutton.setBounds(10, 400, 80, 80);
    fourbutton.setFont(new Font("Arial", Font.PLAIN, 50));
    fourbutton.setBackground(new Color(36,39,43));
    fourbutton.setForeground(new Color(255,255,255));
    fourbutton.setBorderPainted(false);
    fourbutton.setFocusPainted(false);
    fourbutton.addActionListener(this);
    mainframe.add(fourbutton);

    // 5 button

    fivebutton = new JButton("5");
    fivebutton.setBounds(100, 400, 80, 80);
    fivebutton.setFont(new Font("Arial", Font.PLAIN, 50));
    fivebutton.setBackground(new Color(36,39,43));
    fivebutton.setForeground(new Color(255,255,255));
    fivebutton.setBorderPainted(false);
    fivebutton.setFocusPainted(false);
    fivebutton.addActionListener(this);
    mainframe.add(fivebutton);

    // 6 button

    sixbutton = new JButton("6");
    sixbutton.setFont(new Font("Arial", Font.PLAIN, 50));
    sixbutton.setBounds(190, 400, 80, 80);
    sixbutton.setBackground(new Color(36,39,43));
    sixbutton.setForeground(new Color(255,255,255));
    sixbutton.setBorderPainted(false);
    sixbutton.setFocusPainted(false);
    sixbutton.addActionListener(this);
    mainframe.add(sixbutton);

    // − button

    minusbutton = new JButton("−");
    minusbutton.setBounds(280, 400, 80, 80);
    minusbutton.setFont(new Font("Arial", Font.PLAIN, 50));
    minusbutton.setBackground(new Color(255,163,5));
    minusbutton.setForeground(new Color(255,255,255));
    minusbutton.setBorderPainted(false);
    minusbutton.setFocusPainted(false);
    minusbutton.addActionListener(this);
    mainframe.add(minusbutton);

    // 1 button

    onebutton = new JButton("1");
    onebutton.setBounds(10, 490, 80, 80);
    onebutton.setFont(new Font("Arial", Font.PLAIN, 50));
    onebutton.setBackground(new Color(36,39,43));
    onebutton.setForeground(new Color(255,255,255));
    onebutton.setBorderPainted(false);
    onebutton.setFocusPainted(false);
    onebutton.addActionListener(this);
    mainframe.add(onebutton);

    // 2 button

    twobutton = new JButton("2");
    twobutton.setBounds(100, 490, 80, 80);
    twobutton.setFont(new Font("Arial", Font.PLAIN, 50));
    twobutton.setBackground(new Color(36,39,43));
    twobutton.setForeground(new Color(255,255,255));
    twobutton.setBorderPainted(false);
    twobutton.setFocusPainted(false);
    twobutton.addActionListener(this);
    mainframe.add(twobutton);

    // 3 button

    threebutton = new JButton("3");
    threebutton.setBounds(190, 490, 80, 80);
    threebutton.setFont(new Font("Arial", Font.PLAIN, 50));
    threebutton.setBackground(new Color(36,39,43));
    threebutton.setForeground(new Color(255,255,255));
    threebutton.setBorderPainted(false);
    threebutton.setFocusPainted(false);
    threebutton.addActionListener(this);
    mainframe.add(threebutton);

    // + button

    plusbutton = new JButton("+");
    plusbutton.setBounds(280, 490, 80, 80);
    plusbutton.setFont(new Font("Arial", Font.PLAIN, 50));
    plusbutton.setBackground(new Color(255,163,5));
    plusbutton.setForeground(new Color(255,255,255));
    plusbutton.setBorderPainted(false);
    plusbutton.setFocusPainted(false);
    plusbutton.addActionListener(this);
    mainframe.add(plusbutton);

    //0 button

    zerobutton=new JButton("0");
    zerobutton.setFont(new Font("Arial", Font.PLAIN, 50));
    zerobutton.setBounds(10, 580, 165, 80);
    zerobutton.setBackground(new Color(36,39,43));
    zerobutton.setForeground(new Color(255,255,255));
    zerobutton.setBorderPainted(false);
    zerobutton.setFocusPainted(false);
    zerobutton.addActionListener(this);
    mainframe.add(zerobutton);

    // DOT button

    dotbutton=new JButton("∙");
    dotbutton.setFont(new Font("Arial", Font.PLAIN, 50));
    dotbutton.setBounds(185, 580, 85, 80);
    dotbutton.setBackground(new Color(36,39,43));
    dotbutton.setForeground(new Color(255,255,255));
    dotbutton.setBorderPainted(false);
    dotbutton.setFocusPainted(false);
    dotbutton.addActionListener(this);
    mainframe.add(dotbutton);

    //= button

    equaltobutton=new JButton("=");
    equaltobutton.setFont(new Font("Arial", Font.PLAIN, 50));
    equaltobutton.setBounds(280, 580, 80, 80);
    equaltobutton.setBackground(new Color(255,163,5));
    equaltobutton.setForeground(new Color(255,255,255));
    equaltobutton.setBorderPainted(false);
    equaltobutton.setFocusPainted(false);
    equaltobutton.addActionListener(this);
    mainframe.add(equaltobutton);
 }

  

  @Override
  public void actionPerformed(ActionEvent arg0) {

    if(arg0.getSource()==sevenbutton){

     
        displaylabel.setText(displaylabel.getText().concat("7"));
      
     }
    else if(arg0.getSource()==eighbutton){

      displaylabel.setText(displaylabel.getText().concat("8"));
      
  }
    else if(arg0.getSource()==ninebutton){
      displaylabel.setText(displaylabel.getText().concat("9"));
      
  }
    else if(arg0.getSource()==fourbutton){
    
      displaylabel.setText(displaylabel.getText().concat("4"));
      
    }
    else if(arg0.getSource()==fivebutton){
     
      displaylabel.setText(displaylabel.getText().concat("5"));
      
    }
    else if(arg0.getSource()==sixbutton){
   
      displaylabel.setText(displaylabel.getText().concat("6"));
      
    }

    else if(arg0.getSource()==onebutton){
      displaylabel.setText(displaylabel.getText().concat("1"));
      }
    else if(arg0.getSource()==twobutton){
      displaylabel.setText(displaylabel.getText().concat("2"));
    }
    else if(arg0.getSource()==threebutton){
      displaylabel.setText(displaylabel.getText().concat("3"));
    }
    else if(arg0.getSource()==zerobutton){
      displaylabel.setText(displaylabel.getText().concat("0"));
    }
    // +++++

    else if(arg0.getSource()==plusbutton){

      oldValue=Float.parseFloat(displaylabel.getText());

      operator=1;

      displaylabel.setText("");
}
    //-----
    else if(arg0.getSource()==minusbutton){
      oldValue=Float.parseFloat(displaylabel.getText());

      operator=2;

      displaylabel.setText("");

     

    }
    //xxxxxx
    else if(arg0.getSource()==multbutton){
      oldValue=Float.parseFloat(displaylabel.getText());

      operator=3;

      displaylabel.setText("");


    }
    //+-+-+-+-
    else if(arg0.getSource()==dltbutton){


        
    
      String currentText = displaylabel.getText();
if (currentText.length() > 0) {
    String updatedText = currentText.substring(0, currentText.length() - 1);
    displaylabel.setText(updatedText);
}
    }



    
    //%%%%%
    else if(arg0.getSource()==percentagebutton){

      oldValue = Float.parseFloat(displaylabel.getText());

      operator = 5;

      displaylabel.setText("");
    }
    //.....
    else if(arg0.getSource()==dotbutton){

      displaylabel.setText(displaylabel.getText().concat("."));

    }
    else if(arg0.getSource()==dividbutton){
      oldValue = Float.parseFloat(displaylabel.getText());

      operator = 4;

      displaylabel.setText("");

    }
    else if(arg0.getSource()==equaltobutton){


      newValue=Float.parseFloat(displaylabel.getText());

      switch(operator){

        case 1:
        result=oldValue+newValue;
        break;

        case 2:
        result=oldValue-newValue;
        break;

        case 3:
        result=oldValue*newValue;
        break;

        case 4:
        result=oldValue/newValue;
        break;

        case 5:
        result=(oldValue*100)/newValue;
        break;

        default:
        result=0;

      }
      displaylabel.setText(""+result);


    }
    else if(arg0.getSource()==cbutton){

      displaylabel.setText("");
    }
  }


    

public static void main(String ar[]) {
  new Calculator();
}
}







