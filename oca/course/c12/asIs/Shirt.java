package course.c12.asIs;

public class Shirt {
	
	private int itemID = 0;
	private String description = "-description required-";
	private char colorCode = 'U';
	private double price = 0.0;
	
	public Shirt(char fit, int itemID, String description, char colorCode, double price) {
		this.fit = fit;
		this.itemID = itemID;
		this.description = description;
		this.colorCode = colorCode;
		this.price = price;
	}

	private char fit = 'U'; //S=Small,M=Medium,L=Large, U=Unset
	public char getFit() {
		return fit;
	}
	public void setFit(char fit) {
		this.fit = fit;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public int getItemID() {
		return itemID;
	}

	public char getColorCode() {
		return colorCode;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setColorCode(char colorCode) {
		this.colorCode = colorCode;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void display() {
		System.out.println("Item ID: " + getItemID());
		System.out.println("Item description: " + getDescription());
		System.out.println("Item price: " + getPrice());
		System.out.println("Color code: " + getColorCode());
		System.out.println("Fit: " + getFit());
	}

}
