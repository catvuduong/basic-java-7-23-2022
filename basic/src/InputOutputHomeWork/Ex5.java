package InputOutputHomeWork;

import InputSupporter.Input;

/*
 * Name: dcv
 * Tính tổng 2 ký số
Viết chương trình nhập vào 1 số có 2 chữ số (VD: 12, 44, 83)
Tính tổng 2 ký số của số vừa nhập. 
Ví dụ:
12 => Tổng là 1 + 2 = 3
44 => Tổng là 4 + 4 = 8
Gợi ý: 
Cách lấy số hàng đơn vị: int so_hang_dv = so % 10; 
Cách lấy số hàng chục: int so_hang_chuc = so / 10
 * */

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input
		int n = Input.intInput("Mời nhập vào số có 2 chữ số");
		int sum;
		// Process
		sum = n % 10 + n / 10;
		// Output
		System.out.println("Tổng của 2 ký số là: " + sum);

	}

}
