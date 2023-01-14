package innerEx;
import java.util.*;
public class CarTest {

	public static void main(String[] args)
	{LinkedHashMap<String, String> map=new LinkedHashMap<>();
	map.put("자동차","빨간불 : 멈춘다. 노란불 : 준비한다. 파란불 : 출발한다.");
	map.put("보행자","빨간불 : 멈춘다. 파란불 : 출발한다.");
	map.put("종료","프로그램을 종료합니다.");
	
	Scanner s=new Scanner(System.in);

		while(true) {
			String c=s.nextLine();

			if(c.equals("자동차")) {
				System.out.println(map.get(c));
			}else if(c.equals("보행자")){
				System.out.println(map.get(c));
			}
			else if(c.equals("종료")){
				System.err.println(map.get(c));
				break;
			}else{
				System.err.println("다시 입력하시오.");
				continue;
			}
		}
	}
}
