package keisyou;

public class Computer extends TangibleAsset {
	private String makerName;
	public Computer(String name, int price, String color){
		super (name,color,price);
		this.makerName = makerName;
	}
}
