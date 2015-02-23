package error;

public class main {
	public static void main(String args[]){
		String s = null;
		try{
			System.out.println(s.length());
		}catch(NullPointerException e){
			System.out.println("ーースタックトレース（ここから）ーー");
			e.printStackTrace();
		}finally{
			System.out.println("ーースタックトレース（ここまで）ーー");
		}
	}
}
