	package 조건문;

import javax.swing.JOptionPane;

public class 조건문2 {

	public static void main(String[] args) {
		
		//1.입력
		//입력을 데이터를 입력을 받아서 처리해보자
		String score = JOptionPane.showInputDialog("당신의 점수는?");
		//String을 int로 변환해서, score에 넣어준다
		int score1 = Integer.parseInt(score);
		
		//2.처리
		String result = null;//선언: 램에 공간 할당
		//처음에 공간을 할당할 때 쓰레기값이 들어있는 공간이 할당이 됨. 
		//쓰레기 값은 프린트도 안되고, 연산도 불가능
		//공간을 깨끗히하는 작업을 처음에 초기에 해두는 것이 좋다
		//변수 초기화
		//System.out.println(result);
		
		if (score1 >= 90) {
			result = "A";
		}else if (score1 >= 80) {
			result = "B";
		}else if (score1 >= 70) {
			result = "C";
		}else{
			result = "F";
		}
		
		//3.출력
		System.out.println("당신의 학점은 " + result +"학점입니다");
	}

}
