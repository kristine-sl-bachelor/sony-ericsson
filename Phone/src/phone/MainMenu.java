package phone;

@SuppressWarnings("serial")
public class MainMenu extends Menu{

	private static MenuItem[] items = {
			new MenuItem("Item 1", "Menu 1"), 
			new MenuItem("Item 2", "Menu 2"), 
			new MenuItem("Item 3", "Menu 3"), 
			new MenuItem("Item 4", "Menu 4"), 
			new MenuItem("Item 5", "Menu 5"), 
	};
	
	public MainMenu() {
		
		super(items); 
		
	}
}
