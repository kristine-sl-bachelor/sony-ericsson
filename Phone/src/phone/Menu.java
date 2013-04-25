package phone;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.List;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Menu extends JPanel{
	int currentMenuItem = 0;
	int prevMenuItem = 1;
	String[] menuItems = {
			"Item 1", 
			"Item 2", 
			"Item 3", 
			"Item 4", 
			"Item 5"
		}; 
	ArrayList<JTextField> fieldList = new ArrayList<JTextField>();
	public Menu(Color clrBack, Color clrFront) {
		this.setLayout(new GridLayout(menuItems.length, 1));
		for(String item : menuItems) {
			JTextField tf = new JTextField(item); 
			tf.setHorizontalAlignment(SwingConstants.CENTER); 
			tf.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16)); 
			tf.setBackground(Color.DARK_GRAY); 
			tf.setForeground(Color.WHITE); 
			tf.setEditable(false); 
			fieldList.add(tf);
			add(tf); 
		}
		SetActive();
	}
	public void buttonUp(){
		prevMenuItem = currentMenuItem;
		if(currentMenuItem > 0){
			currentMenuItem --;
			SetActive();
		}
		
	}
	public void buttonDown(){
		prevMenuItem = currentMenuItem;
		if(currentMenuItem < menuItems.length -1){
			currentMenuItem ++;
			SetActive();
		}
		
	}
	public void SetActive(){
		fieldList.get(currentMenuItem).setBackground(Color.GRAY);
		fieldList.get(prevMenuItem).setBackground(Color.DARK_GRAY);
	}
}
