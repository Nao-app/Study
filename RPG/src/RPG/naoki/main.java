package RPG.naoki;

public class main {
	public static void main(String[] args){
		//1.勇者を生成
		Hero h1 = new Hero();
		Hero h2 = new Hero();
		//魔法使いを生成
		Wizard w = new Wizard();
		//お化けキノコを二体生成
		Matango m1 = new Matango();
		m1.hp  = 50;
		m1.suffix ='A';
		
		Matango m2 = new Matango();
		m2.hp = 50;
		m2.suffix = 'B';
		//2.フィールドに初期値を設定
		h1.setName("ミナト");
		h1.setHp(100);
		h2.setName("アサカ");
		h2.setHp(100);
		
		w.setName("なおき");
		w.setHP(50);
		System.out.println("勇者" + h1.getName() + "を生み出しました");
		//3.勇者のメソッドを呼び出していきます
		h1.sit(5);
		h1.slip();
		h1.sit(25);
		w.heal(h1);;
		w.heal(h2);
		w.heal(h2);
		h1.run();
		
	}
}
