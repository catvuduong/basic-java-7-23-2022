package DoWhileAdvance;

import java.util.Scanner;

import InputSupporter.Input;

/*
 * Name: dcv
 * Viết chương trình cho phép người dùng nhập vào 2 số.
In ra một menu, với các option:
- Nhập vào là 1 - Xuất ra tổng 2 số
- Nhập vào là 2 - Xuất ra hiệu 2 số
- Nhập vào là 3 - Xuất ra thương 2 số
- Nhập vào là 4 - Xuất ra tích 2 số
- Nhập vào là 0 - Kết thúc chương trình
*Gợi ý: dùng vòng lặp do - while , điều kiện của while là biến
lựa chọn != 0 )
 * */
public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float number1 = Input.floatInput("Mời nhập vào số thứ nhất");
		float number2 = Input.floatInput("Mời nhập vào số thứ hai");
		// Process // Output
		boolean processing = true;
		do {
			System.out.println("Mời bạn chọn MENU, 0 là dừng chương trình");
			System.out.println("1. Tổng 2 số");
			System.out.println("2. Hiệu 2 số");
			System.out.println("3. Tích 2 số");
			System.out.println("4. Thương 2 số");
			int chose = Integer.parseInt(scan.nextLine());
			switch (chose) {
			case 1: {
				float addition = number1 + number2;
				System.out.println("Tổng 2 số là: " + addition);
				break;
			}
			case 2: {
				float subtraction = number1 - number2;
				System.out.println("Hiệu 2 số là: " + subtraction);
				break;
			}
			case 3: {
				float multiplication = number1 * number2;
				System.out.println("Tích 2 số là: " + multiplication);
				break;
			}
			case 4: {
				float division = number1 / number2;
				System.out.println("Thương 2 số là: " + division);
				break;
			}
			case 0:
				processing = false;
				break;
			default:
				System.out.println("Chọn 1,2,3 hoặc 0 thôi");
				// break;
			}
		} while (processing);
	}

}
