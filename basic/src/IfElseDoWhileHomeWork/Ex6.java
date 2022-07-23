package IfElseDoWhileHomeWork;
/*
 * Name: dcv
 *  * Ex:
 * Viết chương trình cho phép nhập tên và năm
sinh của 3 sinh viên.(Tương tự bài 4)
Xuất ra tên và TUỔI của 3 sinh viên trên theo
thứ tự từ trẻ đến già.
*Gợi ý: Sử dụng toán tử && hoặc if lồng if
 */

import InputSupporter.Input;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input
		String stu1 = Input.stringInput("Mời nhập tên sinh viên thứ nhất");
		int birthOfStu1 = Input.intInput("Mời nhập năm sinh cùa sinh viên thứ nhất");
		String stu2 = Input.stringInput("Mời nhập tên sinh viên thứ hai");
		int birthOfStu2 = Input.intInput("Mời nhập năm sinh cùa sinh viên thứ hai");
		String stu3 = Input.stringInput("Mời nhập tên sinh viên thứ ba");
		int birthOfStu3 = Input.intInput("Mời nhập năm sinh cùa sinh viên thứ ba");
		// Process and Output
		if (birthOfStu1 > birthOfStu2 && birthOfStu1 > birthOfStu3) {
			if (birthOfStu2 > birthOfStu3) {
				System.out.println("Sinh viên theo thứ tự từ trẻ đến già:" + "\n" + stu1 + "\t" + birthOfStu1 + "\n"
						+ stu2 + "\t" + birthOfStu2 + "\n" + stu3 + "\t" + birthOfStu3);

			} else {
				System.out.println("Sinh viên theo thứ tự từ trẻ đến già:" + "\n" + stu1 + "\t" + birthOfStu1 + "\n"
						+ stu3 + "\t" + birthOfStu3 + "\n" + stu2 + "\t" + birthOfStu2);
			}
		} else if (birthOfStu2 > birthOfStu1 && birthOfStu2 > birthOfStu3) {
			if (birthOfStu1 > birthOfStu3) {
				System.out.println("Sinh viên theo thứ tự từ trẻ đến già:" + "\n" + stu2 + "\t" + birthOfStu2 + "\n"
						+ stu1 + "\t" + birthOfStu1 + "\n" + stu3 + "\t" + birthOfStu3);

			} else {
				System.out.println("Sinh viên theo thứ tự từ trẻ đến già:" + "\n" + stu2 + "\t" + birthOfStu2 + "\n"
						+ stu3 + "\t" + birthOfStu3 + "\n" + stu1 + "\t" + birthOfStu1);
			}
		} else if (birthOfStu3 > birthOfStu1 && birthOfStu3 > birthOfStu2) {
			if (birthOfStu1 > birthOfStu2) {
				System.out.println("Sinh viên theo thứ tự từ trẻ đến già:" + "\n" + stu3 + "\t" + birthOfStu3 + "\n"
						+ stu1 + "\t" + birthOfStu1 + "\n" + stu2 + "\t" + birthOfStu2);

			} else {
				System.out.println("Sinh viên theo thứ tự từ trẻ đến già:" + "\n" + stu3 + "\t" + birthOfStu3 + "\n"
						+ stu2 + "\t" + birthOfStu2 + "\n" + stu1 + "\t" + birthOfStu1);
			}
		}
	}

}
