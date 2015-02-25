package error;

public class main {
	public static void main(String args[]){
		String s = "三";
		try{
			Integer.parseInt(s);
		}catch(NumberFormatException e){
			System.out.println("例外をキャッチしましたNumberFormatException");
			e.printStackTrace();
		}
		
	}
}
