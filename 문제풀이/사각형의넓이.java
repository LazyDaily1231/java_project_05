package 문제풀이;

import javax.swing.JOptionPane;

public class 사각형의넓이 {

	public static void main(String[] args) {
		//사각형의 넓이를 구하자
		
		String width = JOptionPane.showInputDialog("사각형의 가로값은?");
		String height = JOptionPane.showInputDialog("사각형의 세로값은?");
		
		
		
		
		double width1 = Double.parseDouble(width);
		double height1 = Double.parseDouble(height);
		
		double result = width1 * height1; 
		
		JOptionPane.showMessageDialog(null, result);
		
	}

}
