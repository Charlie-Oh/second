package stringex;

public class ContainEx {

	public static void main(String[] args) {
		String str="my java test";
		
		System.out.println(str.contains("java"));
		System.out.println(str.contains(" my"));
		System.out.println(str.contains("JAVA"));
		System.out.println(str.contains("java test"));
	}

}
