package innerEx;
import java.util.*;
import java.util.HashMap;

interface Lamda{
	Scanner si=new Scanner(System.in);
	String c=si.nextLine();
	
	String car="자동차";
	String man="보행자";
	String end="종료";
	void setScan(String a);
	String getScan();
}

public class CarTest_Lamda implements Lamda{
	String value=null;
	String()->{return value;}
	
	public String getScan() {
		return value;
	}
	public void setScan(String a) {
		value=a;
	}
	
	public static void main(String[] args) {
		CarTest ct=new CarTest();
		ct.setScan(Lamda.c);
		Lamda lmd;
		
		
		
		while(true) {
			if(c.equals("자동차")) {
				lmd=()->{
					System.out.println("빨간불 : 멈춘다.\n노란불 : 준비한다.\n파란불 : 출발한다.");
				};
				c="";
				lmd.setScan(car);}
			
				else if(c.equals("보행자")){
				System.out.println(map.get(c));
			}else if(c.equals("종료")){
				System.err.println(map.get(c));
				break;
			}
			else{
				System.err.println("입력값이 잘못되었습니다.\n다시 입력해 주세요.");
				continue;
			}
		}
		
		
	

		
	

		
//		LinkedHashMap<String, String> map=new LinkedHashMap<>();
//		map.put("자동차","빨간불 : 멈춘다.\n노란불 : 준비한다.\n파란불 : 출발한다.");
//		map.put("보행자","빨간불 : 멈춘다.\n파란불 : 출발한다.");
//		map.put("종료","프로그램을 종료합니다.");
		
		
	}
}
//람다식,조건문ok,반복문ok,입력시 필요한 클래스ok