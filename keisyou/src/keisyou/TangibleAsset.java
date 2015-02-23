package keisyou;

public abstract class TangibleAsset {
	private String name;
	private int price;
	private String color;

	public TangibleAsset(String name,String color,int price){	
		this.name = name;
		this.color = color;
		this.price = price;
		}
	
	public String getName(){	return this.name;	}
	public int getPrice(){return price; }
	public String getColor() {return color; }
}
