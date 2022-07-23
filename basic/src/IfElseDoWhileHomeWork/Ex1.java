package IfElseDoWhileHomeWork;
/*
 * Name: dcv
 *  Ex: Viết chương trình nhập vào 2 số nguyên m và n.
Xuất ra màn hình số nguyên lớn nhất trong 2 số vừa nhập.
 * */

import InputSupporter.Input;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input
		int n = Input.intInput("Mời nhập vào số nguyên thứ nhất");
		int m = Input.intInput("Mời nhập vào số nguyên thứ hai");
		// Output
		if (n > m) {
			System.out.println("Số lớn nhất là: " + n);
		} else if (n < m) {
			System.out.println("Số lớn nhất là: " + m);
		} else {
			System.out.println("Hai số vừa nhập bằng nhau, giá trị là: " + n);
		}

	}

}
