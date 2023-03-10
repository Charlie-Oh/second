package javautilEx;
import java.util.Arrays;
public class UtilEx01 {

	public static void main(String[] args) {
		int[] a= {0,1,2,3,4,5,6,7,8,9};
		arrayPrint("초기 배열 : ",a); // 해당 멤버 메소드
		System.out.println();
		
		Arrays.fill(a,3,5,33); // 배열의 3~4번 요소를 33으로 채움
		arrayPrint("fill() 수행 후 : ",a);
		System.out.println();
		
		Arrays.sort(a);
		arrayPrint("sort() 수행 후 : ",a);
		System.out.println();
		
		System.out.println("33은 배열의 "+Arrays.binarySearch(a, 33)+"번 요소");
		System.out.println("-3은 배열의 "+Arrays.binarySearch(a, -3)+"번 요소");
		// 배열에 없는 값을 탐색하는 경우 해당 값을 정렬시킨 후 상대적으로 값 출력 (-1부터 셈)
		System.out.println("53은 배열의 "+Arrays.binarySearch(a, 53)+"번 요소");
		System.out.println("4는 배열의 "+Arrays.binarySearch(a, 4)+"번 요소");
		
//		for(int i=0; i<a.length; i++) Arrays.fill(a,i,i+1,i);
//		Arrays.sort(a);
//		arrayPrint("sort() 수행 후 : ",a);
//		System.out.println();
		
		int[] b= {0,1,2,3,4,5,6,7,8,9};
		System.out.println("배열a와 배열b가 같은가 : "+Arrays.equals(a, b));
		System.out.println();
		
		int[] c=new int[5];
		// System.arraycopy(배열1, 배열1의 복사시작번호, 배열2, 배열2의 복사시작번호, 복사길이)
		System.arraycopy(b,1,c,0,5);
		arrayPrint("c : ",c);
		System.out.println();
		
		b[3]=15;
		arrayPrint("b : ",b);
		arrayPrint("c : ",c);
		System.out.println();
		
		Book[] book1=new Book[3];
		Book[] book2=new Book[3];
		book1[0]=new Book("동백꽃필무렵","김유정");
		book1[1]=new Book("태백산맥","조정래");
		book1[2]=new Book("수난이대","하근찬");
		System.arraycopy(book1, 1, book2, 0, 2);
		book2[2]=new Book("진주목걸이","모파상");
		arrayPrint("(1) book1 : ", book1);
		arrayPrint("(1) book2 : ", book2);
		System.out.println();
		
		book1[1].setBookName("운수좋은날");
		book1[1].setAuthor("현진건");
		arrayPrint("(2) book1 : ", book1);
		arrayPrint("(2) book2 : ", book2);
		System.out.println();
		
		book2[2]=(Book) book1[1].clone();
		arrayPrint("(3) book1 : ", book1);
		arrayPrint("(3) book2 : ", book2);
		System.out.println();
		
		book1[1].setBookName("그많던싱아는누가다먹었을까");
		book1[1].setAuthor("박완서");
		arrayPrint("(4) book1 : ", book1);
		arrayPrint("(4) book2 : ", book2);
		System.out.println();
		
		book2[0]=(Book) book2[2].clone();
		arrayPrint("(5) book1 : ", book1);
		arrayPrint("(5) book2 : ", book2);
		System.out.println();
		
	}

	static void arrayPrint(String s, int[] a) {
		System.out.print(s);
		for(int i:a) {
			System.out.println(i+" ");
		}
		System.out.println();
	}
	
	static void arrayPrint(String s, Book[] a) {
		System.out.println(s);
		for(Book i:a) {
			i.showBookInfo();
		}
		System.out.println();
	}
}
