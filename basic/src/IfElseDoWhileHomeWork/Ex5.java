package IfElseDoWhileHomeWork;

import InputSupporter.Input;

/*
 * Name: dcv
 * Ex: Xây dựng chương trình cho người dùng nhập vào số có 2 chữ số, máy sẽ
 * xuât ra cách đọc cho số đó.
 * */
public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input
		int n = Input.intInput("Mời nhập vào số có 2 chữ số");
		int dozens = n / 10;
		int units = n % 10;
		// Process and Output
		switch (dozens) {
		case 1: {
			System.out.print("Mười");
			break;
		}
		case 2: {
			System.out.print("Hai mươi");
			break;
		}
		case 3: {
			System.out.print("Ba mươi");
			break;
		}
		case 4: {
			System.out.print("Bốn mươi");
			break;
		}
		case 5: {
			System.out.print("Năm mươi");
			break;
		}
		case 6: {
			System.out.print("Sáu mươi");
			break;
		}
		case 7: {
			System.out.print("Bảy mươi");
			break;
		}
		case 8: {
			System.out.print("Tám mươi");
		}
		case 9: {
			System.out.print("Chín mươi");
		}

		}
		switch (units) {
		case 1: {
			if (dozens == 1) {
				System.out.println(" một");
			} else {
				System.out.println(" mốt");
			}
			break;
		}

		case 2: {
			System.out.println(" hai");
			break;
		}
		case 3: {
			System.out.println(" ba");
			break;
		}
		case 4: {
			System.out.println(" bốn");
			break;
		}
		case 5: {
			System.out.println(" lăm");
			break;
		}
		case 6: {
			System.out.println(" sáu");
			break;
		}
		case 7: {
			System.out.println(" bảy");
			break;
		}
		case 8: {
			System.out.println(" tám");
			break;
		}
		case 9: {
			System.out.println(" chín");
		}
		}
	}

}
