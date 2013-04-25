package phone;

public class MainMenu extends Menu{

	private static MenuItem[] items = {
			new MenuItem("Item 1"), 
			new MenuItem("Item 2"), 
			new MenuItem("Item 3"), 
			new MenuItem("Item 4"), 
			new MenuItem("Item 5"), 
	};
	
	public MainMenu() {
		
		super(items); 
		
	}
}
