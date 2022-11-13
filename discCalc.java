import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

public class discCalc
{

	static JFrame f;
	JLabel lh, l1, l2, l3, l4, l5, l6, lm;
	JTextField t1, t2, t3, t4, t5, t6;
	JPanel p1, p2, p3;
	JRadioButton rb1, rb2, rb3;
	ButtonGroup bg1;
	JButton bCal, bClo;

	Border border;
	Font header, content;
	

	discCalc()
	{

		f = new JFrame("Discount Calculator");
		f.setSize(700,500);
		f.setLayout(null);

		lh = new JLabel("Happy Shopping");
		l1 = new JLabel("Item Name:");
		l2 = new JLabel("Rate (per unit)");
		l3 = new JLabel("Quantity");
		l4 = new JLabel("Total Amount");
		l5 = new JLabel("Discount");
		l6 = new JLabel("Net Amount:");
		lm = new JLabel("Membership Card");

		t1 = new JTextField("Enter product name");
		t2 = new JTextField("Price");
		t3 = new JTextField("Quantity");		
		t4 = new JTextField();
		t5 = new JTextField();
		t6 = new JTextField();

		p1 = new JPanel();
		p1.setLayout(null);
		p2 = new JPanel();
		p2.setLayout(null);
		p3 = new JPanel();
		p3.setLayout(null);

		bg1 = new ButtonGroup();
		
		rb1 = new JRadioButton("Platinum");
		rb2 = new JRadioButton("Gold");
		rb3 = new JRadioButton("Silver");
		
		bCal = new JButton("Calculate");
		bClo = new JButton("Close");

		border = BorderFactory.createLineBorder(Color.black);

		header =  new Font("Arial", Font.BOLD, 20);
		content = new Font("Arial", Font.BOLD, 17);



	}

	public void userPanel()
	{

		p1.setBounds(10, 65, 175, 350);

		p2.setBounds(200, 65, 250, 350);

		p3.setBounds(455, 150, 150, 150);
		p3.setBorder(border);

	}


	public void userLabel()
	{
		lh.setFont(header);
		lh.setBounds(250, 25, 175, 25);

		l1.setFont(content);
		l1.setBounds(25, 25, 100, 25);

		l2.setFont(content);
		l2.setBounds(25, 75, 150, 25);

		l3.setFont(content);
		l3.setBounds(25, 125, 150, 25);

		l4.setFont(content);
		l4.setBounds(25, 200, 150, 25);

		l5.setFont(content);
		l5.setBounds(25, 250, 150, 25);

		l6.setFont(content);
		l6.setBounds(25, 300, 150, 25);

		lm.setFont(content);
		lm.setBounds(460, 130, 150, 25);
	}

	public void userTextField()
	{
		t1.setBounds(5, 25, 225, 25);
		t1.addFocusListener(new FocusListener() {
   			 public void focusGained(FocusEvent e) {
   	    		 t1.setText("");
 	 	 	}

  		  	public void focusLost(FocusEvent e) {
  	      
  		  	}
		});

		t2.setBounds(10, 75, 75, 25);
		t2.addFocusListener(new FocusListener() {
   			 public void focusGained(FocusEvent e) {
   	    		 t2.setText("");
 	 	 	}

  		  	public void focusLost(FocusEvent e) {
  	      
  		  	}
		});

		t3.setBounds(10, 125, 75, 25);
		t3.addFocusListener(new FocusListener() {
   			 public void focusGained(FocusEvent e) {
   	    		 t3.setText("");
 	 	 	}

  		  	public void focusLost(FocusEvent e) {
  	      
  		  	}
		});

		t4.setBounds(10, 200, 125, 25);
		t4.setEditable(false);

		t5.setBounds(10, 250, 125, 25);
		t5.setEditable(false);

		t6.setBounds(5, 300, 175, 25);
		t6.setEditable(false);
	}



	public void userRadioButton()
	{

		bg1.add(rb1);
		bg1.add(rb2);
		bg1.add(rb3);
		
		rb1.setBounds(30, 25, 75, 25);
		rb2.setBounds(30, 65, 75, 25);
		rb3.setBounds(30, 105, 75, 25);

	}

	public void userButton()
	{	
		bCal.setBounds(455, 325, 100, 25);
		bCal.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				if( !(t1.getText().equals(null) || Integer.parseInt(t2.getText()) <= 0 || t3.getText().equals("") )){
					
					int per=0;
					
					if(rb1.isSelected()) per=10;
					else if(rb2.isSelected()) per=6;
					else if(rb3.isSelected()) per=3;

					String s1 = t2.getText();
					String s2 = t3.getText();
					
					float rate = Float.parseFloat(s1);
					float qua = Float.parseFloat(s2);

					float amt = rate*qua;
					float dis = (rate*qua*per)/100.0f;
					float res = amt - dis;
					
					t4.setText(String.format("%.2f",amt));
					t5.setText(String.format("%.2f",dis));
					t6.setText(String.format("%.2f",res));			
				}
				
				else{
					JOptionPane.showMessageDialog(f,"Please enter Valid Input","ERROR",JOptionPane.ERROR_MESSAGE);
				}
			}

			
		});

		bClo.setBounds(455, 360, 75, 25);
		bClo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				f.dispose();
			}
		});

	}


	public void addComp()
	{
		f.add(lh);

		p1.add(l1);
		p1.add(l2);
		p1.add(l3);
		p1.add(l4);
		p1.add(l5);
		p1.add(l6);

		p2.add(t1);
		p2.add(t2);
		p2.add(t3);
		p2.add(t4);
		p2.add(t5);
		p2.add(t6);

		p3.add(rb1);
		p3.add(rb2);
		p3.add(rb3);

		f.add(lm);

		f.add(p1);
		f.add(p2);
		f.add(p3);

		f.add(bCal);
		f.add(bClo);


	}

	public static void main(String[] args)
	{
		discCalc ob = new discCalc();
		ob.userPanel();
		ob.userLabel();
		ob.userTextField();
		ob.userRadioButton();
		ob.userButton();

		ob.addComp();

		f.setVisible(true);
		

	}
}