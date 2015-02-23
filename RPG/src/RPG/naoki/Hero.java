package RPG.naoki;

public class Hero {
	String name;
	int hp;
	Sword sword;
	void attack();
	void run(){
		System.out.println(this.name + "は、転んだ");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp +"でした。");
		
	}
	void sit(int sec){
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した。");
	};
	void slip(){
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ");
	}
	void sleep (){
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した。");
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){ this.name = name; }
	public int getHp(){ return hp; }
	public void setHp(int hp){ this.hp = hp;   }
}
