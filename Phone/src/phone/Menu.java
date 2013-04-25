package phone;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Menu extends JPanel{

	public Menu() {
		
		String[] menuItems = {
			"Item 1", 
			"Item 2", 
			"Item 3", 
			"Item 4", 
			"Item 5"
				
		}; 
		
		this.setLayout(new GridLayout(menuItems.length, 1)); 
		
		for(String item : menuItems) {
			JTextField tf = new JTextField(item); 
			tf.setHorizontalAlignment(SwingConstants.CENTER); 
			tf.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16)); 
			tf.setBackground(Color.GRAY); 
			tf.setForeground(Color.WHITE); 
			tf.setEditable(false); 
			add(tf); 
		}
		
	}
	
}
