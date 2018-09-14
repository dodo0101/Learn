package p1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;


public class Example extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JTextField textfield1, textfield2, textfield3;
	static JLabel picLabel;
	
    public Example() {
        initUI();
    }

    public final void initUI() {
        JButton button1 = new JButton("С ДЭРЭ");
        //JTextComponent text =  new JTextComponent();

        //JButton button2 = new JButton("Button2");
        button1.setBounds(50, 60, 100, 30);
        //button2.setBounds(180, 60, 100, 30);
				getContentPane().setLayout(null);
        getContentPane().add(button1);
        //getContentPane().add(button2);

		button1.addActionListener(this);
				//button2.addActionListener(this);
        setSize(200, 320);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
	    
        
    }
    
    

		public void actionPerformed(ActionEvent e){
				System.out.println("Oui!");
				textfield1.setText("Счастья!");
				textfield2.setText("Здоровья!");
				textfield3.setText("Удачи))))");
				picLabel.setVisible(true);
				textfield1.setVisible(true);
			    textfield2.setVisible(true);
			    textfield3.setVisible(true);
				
		}
		
    public static void main(String[] args) throws IOException {
        Example ex = new Example();
        ex.setVisible(true);
        
        ex.getContentPane().setLayout(new FlowLayout());
	    textfield1 = new JTextField("",10);
	    textfield2 = new JTextField("",10);
	    textfield3 = new JTextField("",10);
	    //BufferedImage myPicture = ImageIO.read(new File("C:\\Users\\Fedor\\Downloads\\animated-fireworks-image-0037.gif"));
	    Icon icon = new ImageIcon("C:\\Users\\Fedor\\Downloads\\animated-fireworks-image-0037.gif");
	    picLabel = new JLabel(icon);
	    //picLabel.setSize(1, 1);
	    ex.add(picLabel);
	    textfield1.setVisible(false);
	    textfield2.setVisible(false);
	    textfield3.setVisible(false);
	    picLabel.setVisible(false);
	    
		Font font1 = new Font("SansSerif", Font.BOLD, 20);
	    textfield1.setFont(font1);
	    textfield2.setFont(font1);
	    textfield3.setFont(font1);
	    ex.getContentPane().add(textfield1);
	    ex.getContentPane().add(textfield2);
	    ex.getContentPane().add(textfield3);
	   
	    //ex.pack();
	    ex.setVisible(true);
        
        
        
    }

}
//It is of course possible to define externally the action listener class as follows.




class MyActionListener implements ActionListener{
	public MyActionListener(String msg){
		this.msg = msg;
	}
	public void actionPerformed(ActionEvent e){
		System.out.println(msg);
	}
	String msg;
}
