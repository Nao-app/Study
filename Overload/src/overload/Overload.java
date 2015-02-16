package overload;

public class Overload{
	public static void email(String title, String address, String text){
		System.out.println("『"+ address + "』に以下のメールを送信しました");
		System.out.println("件名:" + title);
		System.out.println("本文" + text);
	}
	public static void main(String[] args){
		email("明日は○◯","XXXX@mail.com","本文を表示");
	}
}
