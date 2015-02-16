package method;

public class method {
	public static void main(String[] args){
		System.out.println("メソッドを呼び出します");
		hello("港");
		hello("あすか");
		hello("菅原");
		System.out.println("メソッドの呼び出しが終わりました");
	}
	public static void hello(String name){
		System.out.println(name + "さんこんにちは");
	}
}
