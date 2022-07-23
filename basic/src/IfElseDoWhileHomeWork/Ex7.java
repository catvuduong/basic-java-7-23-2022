package IfElseDoWhileHomeWork;
/*
 * Name: dcv
 *  * Ex:
 * Viết chương trình nhập vào thông tin 1 sinh viên: Họ tên, Toan, Ly, Hoa.
Tính điểm trung bình (Điểm TB) và xuất kết quả xếp loại theo bảng xếp loại sau:
● Loại Giỏi: Điểm TB>8,5
● Loại Khá: 6,5=<Điểm TB<=8,5
● Loại TB: 5=<Điểm TB<=6,5
● Loại Yếu: Điểm TB<5
*Gợi ý: Dùng toán tử && để nối 2 kết quả luận lý
 * */

import InputSupporter.Input;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input
		String name = Input.stringInput("Mời nhập tên sinh viên");
		float math = Input.floatInput("Mời nhập điểm môn toán");
		float physics = Input.floatInput("Mời nhập điểm môn lý");
		float chemistry = Input.floatInput("Mời nhập điểm môn hóa");
		float avg;
		// Process and Output
		avg = (math + physics + chemistry) / 3;
		System.out.print("Tên: " + name + "\t Điểm trung bình: " + avg);
		if (avg > 8.5) {
			System.out.println("\t Loại giỏi");
		} else if (avg <= 8.5 && avg >= 6.5) {
			System.out.println("\t Loại Khá");
		} else if (avg < 6.5 && avg >= 5) {
			System.out.println("\t Loại trung bình");
		} else if (avg < 5 && avg >= 3.5) {
			System.out.println("\t Loại yếu");
		} else if (avg < 3.5) {
			System.out.println("\t Loại kém");
		}

	}

}
