/**************************************************
  *File Name: SolveGui
  *Purpose: gui for solve class
  *Programmer: Marcos Tapia
  *Last Updated Date: 12/2/2017
  *************************************************/



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SolveGUI extends JPanel {

	//create SolveClass and stack object
	ArrayStack<Double> answer = new ArrayStack<>();
	SolveClass solve = new SolveClass();
	
	private JLabel x1;
	private JLabel x2;
	private JLabel y1;
	private JLabel y2;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JButton result;
	private JButton solve1;
	
	public SolveGUI() {
		
		setLayout(new GridLayout(5,2));
		
		setBorder(BorderFactory.createTitledBorder("Slope"));
		
		BuildSolveGUI();
	}
	
	private void BuildSolveGUI() {
		
		//labels
		x1 = new JLabel("Enter x1:");
		x2 = new JLabel("Enter x2:");
		y1 = new JLabel("Enter y1:");
		y2 = new JLabel("Enter y2:");
		
		//text fields
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);
		t4 = new JTextField(10);
		
		//button
		result = new JButton("Results");
		solve1 = new JButton("solve");
		
		
		add(x1);
		add(t1);
		add(x2);
		add(t2);
		add(y1);
		add(t3);
		add(y2);
		add(t4);
		add(result);
		result.addActionListener(new ButtonResults());
		add(solve1);
		solve1.addActionListener(new SlopeButton());
	}
	
	
	private class SlopeButton implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			String input1 = t1.getText();
			String input2 = t2.getText();
			String input3 = t3.getText();
			String input4 = t4.getText();
			
			String output = "The Slope is:";
			double results = 0.0;
			
			solve.setX1(Double.parseDouble(input1));
			solve.setX2(Double.parseDouble(input2));
			solve.setY1(Double.parseDouble(input3));
			solve.setY2(Double.parseDouble(input4));
			
			results = solve.slope();
			answer.push(results);
			
			JOptionPane.showMessageDialog(null, output + results);
		}
	}
	

	
	private class ButtonResults implements ActionListener {
		
		public void actionPerformed(ActionEvent e) { 
			
			String r = "The result of the previous operation is: ";
			
			if(!answer.isEmpty()) {
				JOptionPane.showMessageDialog(null, r + answer.pop());
			}
			
		}
		
	}
}
