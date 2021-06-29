package 복습;

import javax.swing.JOptionPane;

public class 입력처리출력 {

	public static void main(String[] args) {
		// 1)입력
		String hobby = JOptionPane.showInputDialog("당신의 취미는?");
		String when = JOptionPane.showInputDialog("언제하시나요?");
		String time = JOptionPane.showInputDialog("몇 시간이나 하시나요?");
		
		//2.처리
		String result = when + "에 " + hobby +  "을 하는군요";
		
		//String->int로 변환해주는 처리
		int time2 = Integer.parseInt(time);
		
		if (time2 >= 3) { //비교연산자의 결과는 항상 boolean(논리데이터, true/false)
			//조건이 true일 때 실행되는 부분
			JOptionPane.showMessageDialog(null, "운동량이 충분합니다" );
		} else {
			//조건이 false일 때 실행되는 부분
			JOptionPane.showMessageDialog(null, "운동량이 부족합니다");
		}
		
		//3.출력
		//JOptionPane.showMessageDialog(null, result);

	}

}
