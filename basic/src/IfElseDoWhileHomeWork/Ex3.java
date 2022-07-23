package IfElseDoWhileHomeWork;

import InputSupporter.Input;

/*
 * Name; dcv
 *  Ex:Viết chương trình nhập vào 5 số nguyên.
Xuất ra có bao nhiêu số lẻ và bao nhiêu số
chẵn.

 * */
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input
		int a = Input.intInput("Mời nhập vào số thứ nhất");
		int b = Input.intInput("Mời nhập vào số thứ hai");
		int c = Input.intInput("Mời nhập vào số thứ ba");
		int d = Input.intInput("Mời nhập vào số thứ bốn");
		int e = Input.intInput("Mời nhập vào số thứ năm");
		int sumEven = 0;
		int sumOdd = 0;
		// Process
		if (a % 2 == 0) {
			sumEven++;
		}
		if (b % 2 == 0) {
			sumEven++;
		}
		if (c % 2 == 0) {
			sumEven++;
		}
		if (d % 2 == 0) {
			sumEven++;
		}
		if (e % 2 == 0) {
			sumEven++;
		}
		sumOdd = 5 - sumEven;
		// Output
		System.out.println("Có " + sumEven + " số chẵn và " + sumOdd + " số lẻ.");
	}
}
