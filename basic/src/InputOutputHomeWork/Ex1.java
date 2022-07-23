package InputOutputHomeWork;

import java.util.Scanner;

import InputSupporter.Input;

/*
 * Name: dcv
 * Ex: Tính ti�?n lương nhân viên
Viết chương trình tính ti�?n lương nhân viên. 
Lương 1 ngày: 100.000 
Cho ngư�?i dùng nhập vào số ngày làm. 
Công thức tính lương: Lương 1 ngày * số ngày làm

 * */

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input
		float salADay = 100000;
		float sal;
		int days = Input.intInput("M�?i nhập số ngày làm");
		// Process
		sal = salADay * days;
		// Output
		System.out.println("Lương của của nhân viên là: " + sal);
	}

}
