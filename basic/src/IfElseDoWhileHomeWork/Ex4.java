package IfElseDoWhileHomeWork;
/*
 * Name: dcv
 * Viết chương trình cho phép nhập tên và năm
sinh của 3 sinh viên.
Xuất ra tên và năm sinh của sinh viên trẻ
nhất.
 * */

import InputSupporter.Input;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input
		String stu1 = Input.stringInput("Mời nhập tên sinh viên thứ nhất");
		int birthOfStu1 = Input.intInput("Năm sinh của sinh viên thứ nhất");
		String stu2 = Input.stringInput("Mời nhập tên sinh viên thứ hai");
		int birthOfStu2 = Input.intInput("Năm sinh của sinh viên thứ hai");
		String stu3 = Input.stringInput("Mời nhập tên sinh viên thứ ba");
		int birthOfStu3 = Input.intInput("Năm sinh của sinh viên thứ ba");
		// Process and Output
		if (birthOfStu1 > birthOfStu2 && birthOfStu1 > birthOfStu3) {
			System.out.println("Sinh viên trẻ nhất là : " + stu1 + " sinh năm: " + birthOfStu1);
		} else if (birthOfStu2 > birthOfStu1 && birthOfStu2 > birthOfStu3) {
			System.out.println("Sinh viên trẻ nhất là : " + stu2 + " sinh năm: " + birthOfStu2);
		} else if (birthOfStu3 > birthOfStu2 && birthOfStu3 > birthOfStu1) {
			System.out.println("Sinh viên trẻ nhất là : " + stu3 + " sinh năm: " + birthOfStu3);
		}
		if (birthOfStu1 == birthOfStu2 && birthOfStu1 > birthOfStu3) {
			System.out.println("Sinh viên trẻ nhất là : " + stu1 + " và " + stu2 + " sinh năm: " + birthOfStu1);
		}
		if (birthOfStu1 == birthOfStu3 && birthOfStu1 > birthOfStu2) {
			System.out.println("Sinh viên trẻ nhất là : " + stu1 + " và " + stu3 + " sinh năm: " + birthOfStu1);

		}
		if (birthOfStu2 == birthOfStu3 && birthOfStu2 > birthOfStu1) {
			System.out.println("Sinh viên trẻ nhất là : " + stu2 + " và " + stu3 + " sinh năm: " + birthOfStu2);

		}
		if (birthOfStu1 == birthOfStu2 && birthOfStu1 == birthOfStu3) {
			System.out.println("Cả 3 sinh viên đều bằng nhau, sinh năm: " + birthOfStu1);
		}
	}

}
