package phone;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class MenuItem extends JTextField{
	String menuPointer;
	public MenuItem(String text, String menuPointer) {
		
		super(text); 
		
		this.menuPointer = menuPointer;
		
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
