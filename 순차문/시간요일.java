package 순차문;

import java.util.Date;

public class 시간요일 {

	public static void main(String[] args) {
		// 시간을 구해보자
		//10시 전이면 굿모닝
		//15시 전이면 굿이브닝
		//20시 전이면 굿나잇
		
		Date date = new Date();
		int hour = date.getHours();
		
		if (hour < 10) {
			System.out.println("굿모닝");
		}else if (hour < 15) {
			System.out.println("굿애프터눈");
		}else if (hour<20) {
			System.out.println("굿이브닝");
		}else{
			System.out.println("굿나잇");
		}
		
		
		int day = date.getDay();
		
		if (day==6 && day==0) {
			System.out.println("Take a Rest");
		}else {
			System.out.println("달려요");
		}
		
		int month = date.getMonth() + 1;
		System.out.println(month);
		
		
		if (month >= 2 && month <= 4 ) {
			System.out.println("봄");
		}else if(month >= 5  && month <= 7) {
			System.out.println("여름");
		}else if (month <= 8 && month >= 10) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}
		
		
	}

}
