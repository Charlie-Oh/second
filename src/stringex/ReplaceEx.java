package stringex;

public class ReplaceEx {

	public static void main(String[] args) {
		String b="Welcome to Java World";
		System.out.println(b.replace("Java","Computer"));
		System.out.println(b.replaceAll("Java","Computer"));
		
		String str="abcdefghijk";
		System.out.println("result===> "+str.replaceAll("[abchij]","굿"));
		System.out.println("result===> "+str.replaceAll("[^abchij]","굿"));
		
		System.out.println("result===> "+str.replace("a","굿").replace("b","굿").replace("c","굿")
														 .replace("h","굿").replace("i","굿").replace("j","굿"));
		
		System.out.println("result===> "+str.replace("abc","굿~").replace("hij","럭키~"));
	}

}
