/**************************************************
  *File Name: CentralHub 
  *Purpose: puts together all the gui
  *Programmer: Marcos Tapia
  *Last Updated Date: 12/1/2017
  *************************************************/


//where everything is together

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CentralHub extends JFrame {

	private calcGui cal = new calcGui();
	private AreaOfGui l = new AreaOfGui();
	private SolveGUI solve = new SolveGUI();
	private factoringGui factores = new factoringGui();
	private JPanel panel;
	private JPanel panel2;
	private JButton exitButton;
	private JMenuBar menuBar;
	private JMenu calcType;
	private JMenuItem exitItem;
	private JMenuItem area1;
	
	public CentralHub() {
		
		setTitle("Calculator");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		
		panel2 = new JPanel();
		
		exitButton = new JButton("Exit");
		exitButton.addActionListener(new exitButtonListener());
		
		panel2.add(exitButton);
		
		add(l,BorderLayout.CENTER);
		add(cal,BorderLayout.WEST);
		add(solve,BorderLayout.EAST);
		add(factores,BorderLayout.NORTH);
		add(panel2,BorderLayout.SOUTH);
		
		BuildMenuBar();
		
		pack();
		setVisible(true);
		
	}
	
    private class exitButtonListener implements ActionListener {
        
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
    	
    	new CentralHub();
    }
    
    private void BuildMenuBar() {
    	
    	menuBar = new JMenuBar();
    	
    	//create exit menu item
    	exitItem = new JMenuItem("Exit");
    	exitItem.setMnemonic(KeyEvent.VK_X);
    	exitItem.addActionListener(new exitButtonListener());
    	
    	//add area button
    	area1= new JMenuItem("area");
    	area1.setMnemonic(KeyEvent.VK_B);
    	area1.addActionListener(new callArea());
    	
    	//create new jMenu
    	calcType = new JMenu("Type");
    	calcType.setMnemonic(KeyEvent.VK_F);
    	
    	//calcType.add(area1);
    	calcType.addSeparator();
    	calcType.add(exitItem);
    	
    	menuBar.add(calcType);
    	setJMenuBar(menuBar);
    	
    	
    }
    
    private class callArea implements ActionListener {
        
        public void actionPerformed(ActionEvent e) {
        	
        	 AreaOfGui area = new AreaOfGui();
        }
    }
}
