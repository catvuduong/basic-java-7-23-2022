package DoWhileAdvance;
/*
 * Name: dcv
 * Viết chương trình cho phép người dùng nhập vào số n.
Tính và xuất ra giai thừa của số n.
*Gợi ý:
6! = 1 * 2 * 3 * 4 * 5 * 6
n! = 1 * 2 * 3 * … * n
0! = 1
 */

import InputSupporter.Input;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input
		int n = Input.intInput("Mời nhập số muốn tình giai thừa");
		int count = 1;
		int factorial = 1;
		if (n < 0) {
			System.out.println("Không thể tính số âm giai thừa");
		} else if (n == 0) {
			System.out.println("Giai thừa của " + n + " là: 1");
		} else {
			do {
				factorial *= count;
				count++;
			} while (count <= n); // n != count
			System.out.println("Giai thừa của " + n + " là: " + factorial);
		}
	}

}
