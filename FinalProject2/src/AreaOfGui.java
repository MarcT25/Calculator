/**************************************************
  *File Name: AreaOfGui
  *Purpose: areaOf gui
  *Programmer: Marcos Tapia
  *Last Updated Date: 12/2/2017
  *************************************************/


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AreaOfGui extends JPanel {
	
	//area class object
	AreaOf l = new AreaOf();
	ArrayStack<Double> results = new ArrayStack<>();
	
	private final int height = 1000;
	private final int width = 1000;
	
	private JPanel areaPanel;
	private JTextField base;
	private JTextField longBase;
	private JTextField height1;
	private JTextField length;
	private JTextField radius;
	private JTextField width1;
	
	private JTextField digit3;
	private JLabel numero3;
	
	private JLabel baseL;
	private JLabel longBaseL;
	private JLabel height1L;
	private JLabel lengthL;
	private JLabel radiusL;
	private JLabel width1L;
	
	private JRadioButton areaOfTriangle;
	private JRadioButton areaOfCircle;
	private JRadioButton areaOfSquare;
	private JRadioButton areaOfRectangle;
	private JRadioButton areaOfTrapezoid;
	private JRadioButton areaOfParallelogram;
	private JRadioButton areaOfEllipse;
	private ButtonGroup group2;
	private JButton r;
	
	
	public AreaOfGui() {
		//JPanel panel = new JPanel();
		setLayout(new GridLayout(2,2));
		
		
		
		setSize(width,height);
		
		
		BuildAreaPanel();
		
		//add(panel);

		add(areaPanel, BorderLayout.WEST);
		areaPanel.setBorder(BorderFactory.createTitledBorder("Area"));
		
		
		setVisible(true);
	}
	
	private void BuildAreaPanel() {
		

		areaPanel = new JPanel();
		areaPanel.setLayout(new GridLayout(7,3));		
		
		
		//radio buttons
		areaOfTriangle = new JRadioButton("Triangle");
		areaOfCircle = new JRadioButton("Circle");
		areaOfSquare = new JRadioButton("Square");
		areaOfRectangle = new JRadioButton("Rectangle");
		areaOfTrapezoid = new JRadioButton("Trapezoid");
		areaOfParallelogram = new JRadioButton("Parallelogram");
		areaOfEllipse = new JRadioButton("Ellipse");
		r = new JButton("result");
		
		//text fields
		digit3 = new JTextField(10);
		base = new JTextField(10);
		longBase = new JTextField(10);
		height1 = new JTextField(10);
		length = new JTextField(10);
		radius = new JTextField(10);
		width1 = new JTextField(10);
		
		// labels
		numero3 = new JLabel("enter a number: ");
		baseL = new JLabel("Base");
		longBaseL = new JLabel("Long Base");
		height1L = new JLabel("Height");
		lengthL = new JLabel("Length");
		radiusL = new JLabel("Radius");
		width1L = new JLabel("Width");
		
		//add to radio group2
		group2 = new ButtonGroup();
		group2.add(areaOfTriangle);
		group2.add(areaOfCircle);
		group2.add(areaOfSquare);
		group2.add(areaOfRectangle);
		group2.add(areaOfTrapezoid);
		group2.add(areaOfParallelogram);
		group2.add(areaOfEllipse);
		
		
		areaPanel.add(baseL);
		areaPanel.add(base);
		areaPanel.add(longBaseL);
		areaPanel.add(longBase);
		areaPanel.add(height1L);
		areaPanel.add(height1);
		areaPanel.add(lengthL);
		areaPanel.add(length);
		areaPanel.add(radiusL);
		areaPanel.add(radius);
		areaPanel.add(width1L);
		areaPanel.add(width1);
		
		//add to areaPanel
		areaPanel.add(areaOfTriangle);
		areaOfTriangle.addActionListener(new ButtonListener());
		areaPanel.add(areaOfCircle);
		areaOfCircle.addActionListener(new ButtonListener());
		areaPanel.add(areaOfSquare);
		areaOfSquare.addActionListener(new ButtonListener());
		areaPanel.add(areaOfRectangle);
		areaOfRectangle.addActionListener(new ButtonListener());
		areaPanel.add(areaOfTrapezoid);
		areaOfTrapezoid.addActionListener(new ButtonListener());
		areaPanel.add(areaOfParallelogram);
		areaOfParallelogram.addActionListener(new ButtonListener());
		areaPanel.add(areaOfEllipse);
		areaOfEllipse.addActionListener(new ButtonListener());
		r.addActionListener(new ButtonResult());
		
		
		//areaPanel.add(numero3);
		//areaPanel.add(digit3);
		areaPanel.add(r);
	}
	
	public static void main(String[] args ) {
		
		new AreaOfGui();
	}

	 private class ButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			String base0 = base.getText();
			String longBase0 = longBase.getText();
			String height0 = height1.getText();
			String length0 = length.getText();
			String radius0 = radius.getText();
			String width0 = width1.getText();
			String area = "";
			double result = 0.0;
			
			if(e.getSource() == areaOfTriangle) {
				l.setBase(Double.parseDouble(base0));
				l.setHeight(Double.parseDouble(height0));
				area = "The area of a triangle is: ";
				result = l.areaOfTriangle();
				results.push(result);
			} else if(e.getSource() == areaOfCircle) {
				l.setRadius(Double.parseDouble(radius0));
				area = "The area of a circle is: ";
				result = l.areaOfCircle();
				results.push(result);
			} else if(e.getSource() == areaOfSquare) {
				l.setLength(Double.parseDouble(length0));
				area = "The area of a square is: ";
				result = l.areaOfSquare();
				results.push(result);
			} else if(e.getSource() == areaOfRectangle) {
				l.setHeight(Double.parseDouble(height0));
				l.setWidth(Double.parseDouble(width0));
				area = "The area of a rectangle is: ";
				results.push(result);
				result = l.areaOfRectangle();
			} else if(e.getSource() == areaOfTrapezoid) {
				l.setBase(Double.parseDouble(base0));
				l.setLongBase(Double.parseDouble(longBase0));
				l.setHeight(Double.parseDouble(height0));
				area = "The area of a Trapezoid is: ";
				result = l.areaOfTrapezoid();
				results.push(result);
			} else if(e.getSource() == areaOfParallelogram) {
				l.setBase(Double.parseDouble(base0));
				l.setHeight(Double.parseDouble(height0));
				area = "The area of a Parallelogram is: ";
				result = l.areaOfParallelogram();
				results.push(result);
			} else if(e.getSource() == areaOfEllipse) {
				l.setBase(Double.parseDouble(base0));
				l.setLongBase(Double.parseDouble(longBase0));
				area = "The area of a Ellipse is: ";
				result = l.areaOfEllipse();
				results.push(result);
			}
			JOptionPane.showMessageDialog(null, area + result);
		}
		
	 }
	 
	 private class ButtonResult implements ActionListener{
		 
			
		public void actionPerformed(ActionEvent e) {
			
			String t = "The result of the previous operations is:";
			
			if(!results.isEmpty()) {
				JOptionPane.showMessageDialog(null, t + results.pop());
			}
			
		}
		
	 }
	
}
