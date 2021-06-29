package 순차문;

import java.util.Date;//날짜,요일,시간을 표시

public class 시간부품 {

	public static void main(String[] args) {
		// 25년 Date
		Date date = new Date();
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		System.out.println(hour + "시" + min + "분" + sec + "초" );
		
		int year = date.getYear() + 1900;//1900년부터 몇년이 지났는지 알려주기 때문에 + 1900를 입력
		int month = date.getMonth() + 1 ;//음력으로 나오기 때문에 +1 입력
		int today = date.getDate();
		System.out.println( year + "년" + month + "월" + today + "일" );
		
		int day = date.getDay();
		System.out.println(day);
		if (day == 0) {
			System.out.println("Sunday");
		}else if (day == 1) {
			System.out.println("Monday");
		}else if (day == 2) {
			System.out.println("Tuesday");	
		}else if (day == 3) {
			System.out.println("Wednesday");
		}else if (day == 4) {
			System.out.println("Thursday");
		}else if (day == 5) {
			System.out.println("Friday");
		}else if (day == 6) {
			System.out.println("Saturday");
		}
		
		}
	
				
	}

}
