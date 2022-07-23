package DoWhileAdvance;
/*
 * Name: dcv
 * Viết chương trình cộng tổng số người dùng nhập vào, nhấn 0 để dừng
 * chương trình
 * */

import InputSupporter.Input;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input
		float n, sum = 0;
		// Process
		do {
			n = Input.floatInput("Mời nhập số muốn cộng dồn vào");
			sum += n;
			System.out.println("Tổng là: " + sum);
		} while (n != 0);
		System.out.println("Chương trình đã dừng");
	}

}
