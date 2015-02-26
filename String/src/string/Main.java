package string;

import java.util.HashSet;
import java.util.Set;
public class Main {
	public static void main(String[] args){
		Set<String> Colors = new HashSet<String>();
		Colors.add("赤");
		Colors.add("青");
		Colors.add("黄");
		System.out.println("色は" + Colors.size() + "種類");
		for(String s : Colors){
			System.out.print(s + "→");
		}
	}
}
