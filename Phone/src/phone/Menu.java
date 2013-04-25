package phone;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Menu extends JPanel{
	int currentMenuItem = 0;
	int prevMenuItem = 1;
	MenuItem[] itemList;
	
	public Menu(MenuItem[] items) {
		
		itemList = items;
		this.setLayout(new GridLayout(items.length, 1)); 
		
		for (MenuItem item : itemList) {
			
			this.add(item); 
			
		}
		
		items[0].selected(true);
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
		if(currentMenuItem < itemList.length -1){
			currentMenuItem ++;
			SetActive();
		}
		
	}
	public void SetActive(){
		itemList[currentMenuItem] .setBackground(Color.GRAY);
		itemList[prevMenuItem].setBackground(Color.DARK_GRAY);
	}
	
}
