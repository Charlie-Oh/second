package innerEx;

interface Ramda4c {
	public void showString(String string);
}

//public class RamdaEx04_copy {
//	public static void main(String[] args) {
//		Ramda4c lamda4=s->System.out.println(s);
//		lamda4.showString("매개변수로 람다식 전달하기");
//		
//		showMyString(lamda4);
//	}
//
//	public static void showMyString(Ramda4c r) {
//		r.showString("전달한 람다식 이용하여 출력");
//	}
//}
			//익명클래스로 변환
	public class RamdaEx04_copy {
	public static void main(String[] args) {
		Ramda4c lamda4=new Ramda4c() {
			public void showString(String s) {
				System.out.println(s);
			}
		};
		lamda4.showString("매개변수로 람다식 전달하기");
		showMyString(lamda4);
	}
	public static void showMyString(Ramda4c r) {
		r.showString("전달한 람다식 이용하여 출력");
	}
}