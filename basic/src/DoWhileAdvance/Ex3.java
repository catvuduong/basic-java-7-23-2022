package DoWhileAdvance;

import InputSupporter.Input;

/*
 * Name: dcv
 * Viết chương trình tính tổng số chẵn cộng dồn vào, nếu người dùng nhập số lẻ
 * thì thông báo sai và nhập lại số chẵn, nhấn 0 để dửng chương trình.
 * */
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input
		float n;
		float sum = 0;
		// Process
		do {
			n = Input.floatInput("Mời nhập số chẵn muốn cộng vào, nhấn 0 để" + " dừng chương trình");
			if (n % 2 == 0) {
				sum += n;
				System.out.println("Tổng là: " + sum);
			} else {
				System.out.println("Số nhập vào không phải số chẵn, mời nhập lại");
			}
		} while (n != 0);
		System.out.println("Dừng chương trình");
	}

}
