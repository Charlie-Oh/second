package fileEx;

import java.io.IOException;
import java.io.PrintWriter;

public class FileEx04 {

	public static void main(String[] args) throws IOException {
		PrintWriter pw=new PrintWriter(System.out);
		// 표준 출력(모니터 출력)을 의미하는 System.out(PrintWriter 객체)을 이용하여 객체 pw를 생성
		
		pw.print("알기쉽게 해설한 자바! ");
		pw.println('A');
		pw.println(500+500);
		pw.println(40000L);
		pw.println(12.34f);
		pw.printf("%f \n",12.34);
		pw.println(new Integer("1999"));
		pw.close();
	}

}