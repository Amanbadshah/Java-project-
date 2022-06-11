package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.DefaultButtonModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Calculator {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextArea textarea = new JTextArea(2, 10);
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	JButton button9 = new JButton();
	JButton button0 = new JButton();

	JButton buttonadd = new JButton();
	JButton buttonsub = new JButton();
	JButton buttonmul = new JButton();
	JButton buttondiv = new JButton();
	JButton buttonclear = new JButton();
	JButton buttondot = new JButton();
	JButton buttonequal = new JButton();

	double number, number2, result;
    int addc=0,mulc=0,divc=0,subc=0;
    
    
    public Calculator() {
    	frame.setSize(340,450);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
       frame.setTitle("DEMO CAL");
       //frame.setResizable(false);
    frame.add(panel);
    panel.setBackground(Color.BLUE);
    Border border=BorderFactory.createLineBorder(Color.BLACK,4);
    
    panel.add(textarea);
    textarea.setBackground(Color.cyan);
    Border tborder=BorderFactory.createLineBorder(Color.DARK_GRAY,3);
    textarea.setBorder(tborder);
    Font font=new Font("arial",Font.BOLD,33);
    textarea.setFont(font);
    textarea.setForeground(Color.green);
    textarea.setPreferredSize(new Dimension(2,10));
    textarea.setLineWrap(true);
     
    
    button1.setPreferredSize(new Dimension(100,40));
    button1.setIcon(null);
    
    }
  





}
