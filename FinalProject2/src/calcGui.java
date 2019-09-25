/**************************************************
  *File Name: calcGui
  *Purpose: gui panel for calculator
  *Programmer: Marcos Tapia
  *Last Updated Date: 12/2/2017
  *************************************************/



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


//panel for calculator
public class calcGui extends JPanel {
	
	//create Calculator Object
	Calculator calc = new Calculator();
	ArrayStack<Double> results = new ArrayStack<>();
	
	
	private final int height = 1000;
	private final int width = 1000;
	
	private JPanel resultado; 
	private JTextField digit1;
	private JTextField digit2;
	private JLabel numero1;
	private JLabel numero2;
	private JButton r;
	private JRadioButton sum;
	private JRadioButton subtract;
	private JRadioButton divide;
	private JRadioButton multiply;
	private ButtonGroup RadioGroup;
	
	
	public calcGui() {
		//JPanel panel = new JPanel();
		setLayout(new GridLayout());
		
		Buildresultado();
		
		//add(panel);
		setBorder(BorderFactory.createTitledBorder("Calculator"));
		
		
		//pack();
		setVisible(true);
	}

	private void Buildresultado() {
		setLayout(new GridLayout(5,2));
		
		r = new JButton("Result");
		sum = new JRadioButton("add");
		subtract = new JRadioButton("subtract");
		multiply = new JRadioButton("multiply");
		divide = new JRadioButton("divide");
		
		// text fields
		digit1 = new JTextField(20);
		digit2 =  new JTextField(20);
		
		//labels
		numero1 = new JLabel("enter a number: ");
		numero2 = new JLabel("Enter another number: ");
		
		RadioGroup = new ButtonGroup();
		RadioGroup.add(sum);
		sum.addActionListener(new ButtonListener());
		RadioGroup.add(subtract);
		subtract.addActionListener(new ButtonListener());
		RadioGroup.add(multiply);
		multiply.addActionListener(new ButtonListener());
		RadioGroup.add(divide);
		divide.addActionListener(new ButtonListener());
		r.addActionListener(new ButtonResults());
		
		add(numero1);
		add(digit1);
		add(numero2);
		add(digit2);
		add(sum);
		add(subtract);
		add(multiply);
		add(divide);
		add(r);
	}
	
	public static void main(String[] args) {
		
		new calcGui();
	}
	
	private class ButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			String input1 = digit1.getText();
			String input2 = digit2.getText();
			String resultOf = "";
			double result = 0.0;
			
			if(e.getSource() == sum) {
				calc.setNum1(Double.parseDouble(input1));
				calc.setNum2(Double.parseDouble(input2));
				resultOf = "sum is: ";
				result = calc.add();
				results.push(result);
			} else if(e.getSource() == subtract) {
				calc.setNum1(Double.parseDouble(input1));
				calc.setNum2(Double.parseDouble(input2));
				resultOf = "subtraction is: ";
				result = calc.sub();
				results.push(result);
			} else if(e.getSource() == multiply) {
				calc.setNum1(Double.parseDouble(input1));
				calc.setNum2(Double.parseDouble(input2));
				resultOf = "multiplication is: ";
				result = calc.mult();
				results.push(result);
			}  else if(e.getSource() == divide) {
				calc.setNum1(Double.parseDouble(input1));
				calc.setNum2(Double.parseDouble(input2));
				resultOf = "divition is: ";
				result = calc.div();
				results.push(result);
			} 
			
			JOptionPane.showMessageDialog(null, resultOf + result);
		}
	}
	
	private class ButtonResults implements ActionListener {
		
		public void actionPerformed(ActionEvent e) { 
			
			String r = "The result of the previous operation is: ";
			
			if(!results.isEmpty()) {
				JOptionPane.showMessageDialog(null, r + results.pop());
			}
			
		}
		
	}
}
