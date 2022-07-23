package FunctionHomeWork;

import java.util.Scanner;

import InputSupporter.Input;

/*
 * Name dcv
 *  Ex: Xây dựng chương trình tính toán đơn giản Cộng, Trừ,
Nhân, Chia 2 số nguyên khác không(SỬ DỤNG HÀM) . Xuất thông báo
cho người dùng chọn : Nếu 1 là +, 2 là -, 3 là *, 4 là chia. 
 */

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input
		Scanner scan = new Scanner(System.in);
		int a = Input.intInput("Mời nhập vào số nguyên thứ nhất");
		int b = Input.intInput("Mời nhập vào số nguyên thứ hai");
		// Process
		int chose;
		do {
			System.out.println("Mời chọn MENU, nhấn 0 để dừng chương trình");
			System.out.println("1. Tổng");
			System.out.println("2. Hiệu");
			System.out.println("3. Tích");
			System.out.println("4. Thương");
			chose = Integer.parseInt(scan.nextLine());
			switch (chose) {
			case 1: {
				int add = Addition(a, b);
				System.out.println("Tổng 2 số là: " + add);
				break;
			}
			case 2: {
				int sub = Subtraction(a, b);
				System.out.println("Hiệu 2 số là: " + sub);
				break;
			}
			case 3: {
				int mul = Multiplication(a, b);
				System.out.println("Tích 2 số là: " + mul);
				break;
			}
			case 4: {
				int div = Division(a, b);
				System.out.println("Thương 2 số là: " + div);
				break;
			}
			case 0:
				System.out.println("Dừng chương trình");
			}
		} while (chose != 0);

	}

	public static int Addition(int a, int b) {
		int result = a + b;
		return result;
	}

	public static int Subtraction(int a, int b) {
		int result = a - b;
		return result;
	}

	public static int Multiplication(int a, int b) {
		int result = a * b;
		return result;
	}

	public static int Division(int a, int b) {
		int result = a / b;
		return result;
	}

}
