package InputOutputHomeWork;
/*
 * Name: dcv
 * Tính giá trị trung bình 
Viết chương trình nhập vào 5 số thực.
Tính giá trị trung bình của 5 số này và xuất 
ra màn hình. 
Gợi ý: Giá trị trung bình là tổng của 5 số 
ngư�?i dùng nhập chia cho 5.

 * */

import InputSupporter.Input;

public class Ex2 {
	public static void main(String[] agrs) {
		// Input
		float average;
		System.out.println("M�?i nhập 5 số thực");
		float a = Input.floatInput("M�?i nhập số thực thứ nhất");
		float b = Input.floatInput("M�?i nhập số thực thứ hai");
		float c = Input.floatInput("M�?i nhập số thực thứ ba");
		float d = Input.floatInput("M�?i nhập số thực thứ bốn");
		float e = Input.floatInput("M�?i nhập số thực thứ năm");
		// Process
		average = (a + b + c + d + e) / 5;
		// Output
		System.out.println("Trung bình cộng của 5 số thực là: " + average);
	}

}
