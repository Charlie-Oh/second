package innerEx;

interface Ramda3c{
	public abstract void add(int a, int b);
}

//abstract class Ramda3{
//	public abstract void add(int a, int b);
//}
					//익명클래스로 변환하기
public class RamdaEx03_copy {
	public static void main(String[] args) {
		int i=100;
//		static final int j=5;
		final int j=5;
		
			Ramda3c result=new Ramda3c(){
	  			public void add(int p1, int p2) {
//	  				result sum=new result(p1,p2);
	  				int sum=p1+p2;
					final int mul=p1*p2;
					System.out.println("i는 : "+i+", j는 : "+j);
					System.out.println(p1+", "+p2);
					System.out.println("p1과 p2의 합: "+sum);
					System.out.println("p1과 p2의 곱: "+mul);
	  		}
		};
		result.add(5, 5);
	}
}
