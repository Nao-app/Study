package classren;
public class Main {
	public static void main(String[] args) throws Exception{
		CalcLogic.doWarusa();
		CalcLogic.doTogame();
		callDeae();
		showMondokoro();
	}
	public static void callDeae(){
		System.out.println("えぇい、こしゃくな。曲者だ！であえい！");
	}
	public static void showMondokoro() throws Exception{
		System.out.println("飛車さん、角さん。もういいでしょう");
		System.out.println("この紋所が目に入らぬか");
		CalcLogic.doTogame();
	}
}
	
