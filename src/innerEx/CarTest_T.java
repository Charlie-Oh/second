package innerEx;

import java.util.HashMap;
import java.util.Scanner;

interface Ram<T, R>{
	R objmd(T obj);
}

public class CarTest_T {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ram<String, Boolean> ram = obj -> {
			System.out.println(obj+"인 경우");
			HashMap<String, Integer> map = new HashMap<>();
			map.put("자동차", 3);
			map.put("보행자", 2);
			map.put("종료", 0);
			if(map.containsKey(obj)) {
				String[] s = {"빨간불 : 멈춘다.", "파란불 : 출발한다.", "노란불 : 준비한다."};
				if(map.get(obj)>0) {
					for(int i = 0; i < map.get(obj); i++) {
						System.out.println(s[i]);
					}
				}else{
					System.out.println("프로그램을 종료한다.");
					return false;
				}
				System.out.println();
			}else {
				System.out.println("잘못된 값이 입력되었습니다.");
			}
			return true;
		};
		
		
		Ram<Integer, Integer> ram1 = obj -> obj * obj;
		
		while(true) {
			String s = sc.nextLine();
			if(!ram.objmd(s)) break;
			int i = sc.nextInt();
			if(ram1.objmd(i) <= 0) break;
			else System.out.println(ram1.objmd(i));
		}

	}

}
