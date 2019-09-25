/**************************************************
  *File Name: factoringGui 
  *Purpose: gui panel for factoring problem
  *Programmer: Marcos Tapia
  *Last Updated Date: 12/2/2017
  *************************************************/


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class factoringGui extends JPanel {
	
	//create stack and solve class
	ArrayStack<Double> answer = new ArrayStack<>();
	SolveClass solve = new SolveClass();
	
	//labels and text field
	private JLabel factor;
	private JLabel number;
	private JTextField t1;
	private JTextField t2;
	private JButton solve1;
	private JButton result;
	
	public factoringGui() {
		
		setLayout(new GridLayout(4,2));
		
		setBorder(BorderFactory.createTitledBorder("Factoring"));
		
		BuildGUI();
		
	}
	
	
	private void BuildGUI() {
		
		//labels
		factor = new JLabel("Factor");
		number = new JLabel("Number to factor");
		
		//text fields
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		
		//buttons
		solve1 = new JButton("Solve");
		result = new JButton("Result");
		
		add(factor);
		add(number);
		add(t1);
		add(t2);
		add(solve1);
		solve1.addActionListener(new ButtonFactoring());
		add(result);
		result.addActionListener(new ButtonResults());
	}
	
	
	
	private class ButtonFactoring implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			String input1 = t1.getText();
			String input2 = t2.getText();
			
			String output;
			double results = 0.0;
			
			results = solve.factoring(Double.parseDouble(input2), Double.parseDouble(input1));
			answer.push(results);
			
			//JOptionPane.showMessageDialog(null, solve.factoring(Double.parseDouble(input1), Double.parseDouble(input2)));
			
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
