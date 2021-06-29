package 문제풀이;

import java.util.Random;

import javax.swing.JOptionPane;

public class 게임계속문제 {

	public static void main(String[] args) {
		//1.무한루프
		//2.게임 계속 물어보고
		//3.답변 다르게 처리
		
		//랜덤한 숫자 출력
		Random r = new Random();
		
		//임의의 수를 생성하는 코드
		int num1 = r.nextInt();
		int num2 = r.nextInt();
		
		
		while (true) { 
			String data = JOptionPane.showInputDialog("계속하시겠습니까? 1:게임 중지 0:게임 계속");
			
			//String->int로 변환해주는 처리
			int data2 = Integer.parseInt(data);
			if (data2 == 1) {//조건이 true 일때 출력
				JOptionPane.showMessageDialog(null, "게임을 중지합니다");
				break;//입력한 값과 조건이 동일할 때 멈춤
			} else {//조건이 false 일때 출력
				JOptionPane.showMessageDialog(null, "게임을 계속합니다");
				//입력한 값과 조건이 동일할 때 계속 진행
				
				
				String data3 = JOptionPane.showInputDialog("첫번째 숫자를 입력해주세요");
				String data4 = JOptionPane.showInputDialog("두번째 숫자를 입력해주세요");
				
				//String->int로 변환해주는 처리
				int data5 = Integer.parseInt(data3);
				int data6 = Integer.parseInt(data4);
				
				if (data5 > data6) {//첫번째로 입력한 숫자가 높을 경우의 조건과 메시지
					JOptionPane.showMessageDialog(null, "첫번째 사람이 승리");
				} else if (data5 < data6) {//두번째로 입력한 숫자가 높을 시 조건과 메시지
					JOptionPane.showMessageDialog(null, "두번째 사람이 승리");
				}else //첫번 째와 두번 째 숫자가 같을 시
					JOptionPane.showMessageDialog(null, "무승부");
					System.exit(0);//프로그램 종료
			}
		}

	}

}
