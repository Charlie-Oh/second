package stringex;

public class IndexOfClass {

	public static void main(String[] args) {
		String a="Good Afternoon!!";
		System.out.println("1번. "+a.indexOf("noon")); //10
		System.out.println("2번. "+a.indexOf(" Af")); //4
		
		String hello="HelloWorld_MyWorld";
		System.out.println("3번. "+hello.indexOf("World")); //5
		System.out.println("4번. "+hello.indexOf("World,10")); //13
		System.out.println("5번. "+hello.lastIndexOf("World")); //13
		System.out.println("6번. "+hello.lastIndexOf("World",13)); //13
		
		hello="AaBbCc"; //아스키코드 값으로 인덱스 찾기
		System.out.println("7번. "+hello.indexOf(65));
		System.out.println("8번. "+hello.indexOf(99));
	}

}
