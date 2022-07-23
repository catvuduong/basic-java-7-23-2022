package IfElseDoWhileHomeWork;
/*
 * Name: dcv
 * Viết chương trình cho nhập số cộng dồn vào tổng,
 *  nhấn 0 thì dừng chương trình.
 * */

import InputSupporter.Input;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input
		float n, sum = 0;
		// Process and Output
		do {
			n = Input.floatInput("Mời nhập số muốn cộng vào, nhấn 0 ngừng chương trình");
			sum += n;
			System.out.println("Tổng là: " + sum);
		} while (n != 0);
	}

}
