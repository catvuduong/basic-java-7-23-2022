package DoWhileAdvance;
/*
 * Name: dcv
 * Chương trình cho phép máy tính phát sinh ngẫu nhiên một số từ
1 đến 1000. Người dùng sẽ đoán và nhập, nếu đúng với kết quả
của máy, game sẽ dừng.
Ngược lại máy sẽ báo bạn đang nhập một số LỚN HƠN hoặc NHỎ
HƠN số bí mật.
Xuất thêm người chơi cần bao nhiêu lần đoán để tìm ra số bí
ẩn.
Hàm tạo số ngẫu nhiên :
*Gợi ý: int so_ngau_nhien = (int) (Math.random() * 999 + 1);
Câu lệnh trên cho phép tạo ra một số random từ 1 - 1000
 * */

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int randomNumber = (int) (Math.random() * 999 + 1);
		int choseNumber;
		int time = 0;
		do {
			System.out.println("Mời nhập số mà bạn đoán");
			choseNumber = Integer.parseInt(scan.nextLine());
			if (choseNumber > randomNumber) {
				System.out.println("Sai rồi, số nhỏ hơn số mà bạn đoán");
			} else if (choseNumber < randomNumber) {
				System.out.println("Sai rồi, số lớn hơn số mà bạn đoán");
			}
			time++;
		} while (choseNumber != randomNumber);
		System.out.println("Đúng rồi hay thế, số lần đoán của bạn là: " + time + " lần");
	}

}
