package InputOutputHomeWork;
/*
 * Name: dcv
 * Tính diện tích, chu vi hình chữ nhật
Viết chương trình nhập vào 2 chiều dài và chiều rộng của 
HCN (hình chữ nhật).
Tính và xuất ra diện tích, chu vi của HCN đó. 
Công thức:

- Diện tích = dài * rộng
- Chu vi = ( dài + rộng ) * 2
 * */

import InputSupporter.Input;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input
		float a = Input.floatInput("Mời nhập chiều dài hình chữ nhật");
		float b = Input.floatInput("Mời nhập chiều rộng hình chữ nhật");
		float s, p;
		// Process
		p = (a + b) * 2;
		s = a * b;
		// Output
		System.out.println("Chu vi hình chữ nhật là: " + p);
		System.out.println("Diện tích hình chữ nhật là: " + s);
	}

}
