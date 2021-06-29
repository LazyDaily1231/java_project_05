package 문제풀이;

import java.util.Random;

import javax.swing.JOptionPane;

public class 랜덤문제 {

	public static void main(String[] args) {
		//랜덤한 숫자를 2개 발생기켜
		//첫번째 랜덤한 숫자가 더 크면 첫번째가 더 커요
		//두번째 랜던한 숫자가 더 크면 두번째가 더 커요 
		
		//랜덤한 숫자를 발생 시키는 코드 (한번만 사용한다)
		Random r = new Random();
		
		//첫번째 숫자 랜덤 출력 코드
		int num1 = r.nextInt(100);
		System.out.println(num1);
		
		//두번째 숫자 랜덤 출력 코드
		
		int num2 = r.nextInt(100);
		System.out.println(num2);
		//괄호 안의 숫자까지의 범위 무작위 출력
		
		
		
		//첫번째 숫자가 두번째 숫자보다 높을 때의 조건 
		if (num1 > num2) {////비교연산자의 결과는 항상 boolean(논리데이터, true/false),조건 쓰기
			
			System.out.println("첫 번째 숫자가 더 커요");
		//두번째 숫자가 첫번째 숫자보다 높을 때의 조건
		} if(num1 < num2) {
			System.out.println("두 번째 숫자가 더 커요");
		}
	}
}
