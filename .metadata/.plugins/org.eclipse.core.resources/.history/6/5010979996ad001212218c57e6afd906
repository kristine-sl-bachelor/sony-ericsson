package phone;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MenuItem extends JTextField{

	private String text; 
	private Color color; 
	
	public MenuItem(String text) {
		
		super(text); 
		
		this.setBackground(Color.DARK_GRAY); 
		this.setForeground(Color.WHITE);
		this.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16)); 
		this.setHorizontalAlignment(SwingConstants.CENTER); 
		this.setEditable(false); 
	}
	
	public void selected(boolean itemSelected) {
		
		if(itemSelected) this.setBackground(Color.GRAY); 
		
	}
}
