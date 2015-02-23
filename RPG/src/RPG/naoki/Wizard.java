package RPG.naoki;

//魔法使いのクラス
public class Wizard{
	private String name;
	private int hp;
	private int mp;
	private Wand wand;
	
	public String getName(){
		return this.name;
	}
	public void setName(String name){ this.name = name; }
	public int getHp(){ return hp; }
	public void setHP(int hp){ this.hp = hp;   }
	public int getMp(){ return mp;}
	public void setMp(int mp){ this.mp = mp; }
	public Wand getWand(){return wand;}
	public void setWand(Wand wand){
		if(wand == null){
			throw new IllegalArgumentException("設定されようとしている杖がnullです");
		}
	}
	public void heal(Hero h){
		int basePoint = 10;
		int recovPoint = (int)(basePoint * this.getWand().getPower());
		h.setHp(h.getHp() + recovPoint);
		
		System.out.println(h.name + "のHPを10回復した");
	}
}