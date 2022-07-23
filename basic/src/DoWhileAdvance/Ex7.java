package DoWhileAdvance;
/*
 * Name: dcv
 * Người và máy sẽ chơi với nhau.
Ngẫu nhiên cho máy một lựa chọn, gợi ý:
- Quy ước 1 = Bao, 2 = Búa, 3 = Kéo
int lua_chon_cua_may = (int) (Math.random() * 3 + 1);
Nếu người dùng nhập > 3 hoặc < 0 thì báo lỗi, bắt người dùng
nhập lại.
Nếu người dùng nhập 0 thì dừng trò chơi.
Tính và xuất ra xem ai sẽ là người thắng nhiều nhất và tỉ số
là bao nhiêu.
 * */

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choseNumber;
		int randomNumber;
		Scanner scan = new Scanner(System.in);
		int youWin = 0;
		int pcWin = 0;
		do {
			randomNumber = (int) (Math.random() * 3 + 1);
			System.out.println("Mời bạn chọn, nhấn 0 là dừng chơi");
			System.out.println("1. Bao, 2. Búa, 3. Kéo");
			choseNumber = Integer.parseInt(scan.nextLine());
			if (choseNumber == 1) {
				if (randomNumber == 1) {
					System.out.println("Bạn và máy đều ra bao");
					System.out.println("Hòa nhau");
				} else if (randomNumber == 2) {
					System.out.println("Bạn ra bao, máy ra búa");
					System.out.println("Bạn thắng");
					youWin++;
				} else if (randomNumber == 3) {
					System.out.println("Bạn ra bao, máy ra kéo");
					System.out.println("Bạn thua");
					pcWin++;
				}
			} else if (choseNumber == 2) {
				if (randomNumber == 1) {
					System.out.println("Bạn ra búa, máy ra bao");
					System.out.println("Bạn thua");
					pcWin++;
				} else if (randomNumber == 2) {
					System.out.println("Bạn và máy đều ra búa");
					System.out.println("Hòa nhau");
				} else if (randomNumber == 3) {
					System.out.println("Bạn ra búa, máy ra kéo");
					System.out.println("Bạn thắng");
					youWin++;
				}
			} else if (choseNumber == 3) {
				if (randomNumber == 1) {
					System.out.println("Bạn ra kéo, máy ra bao");
					System.out.println("Bạn thắng");
					youWin++;
				} else if (randomNumber == 2) {
					System.out.println("Bạn ra kéo, máy ra búa");
					System.out.println("Bạn thua");
					pcWin++;
				} else if (randomNumber == 3) {
					System.out.println("Bạn và máy đều ra kéo");
					System.out.println("Hòa nhau");
				}
			}

		} while (choseNumber != 0);
		if (youWin > pcWin) {
			System.out.println("Bạn thắng: " + youWin + " lần" + "\nMáy thắng: " + pcWin + " lần");
			System.out.println("Bạn là người chiến thắng");
		} else if (youWin < pcWin) {
			System.out.println("Bạn thắng: " + youWin + " lần" + "\nMáy thắng: " + pcWin + " lần");
			System.out.println("Bạn là người thua cuộc");
		} else if (youWin == pcWin) {
			System.out.println("Bạn thắng: " + youWin + " lần" + "\nMáy thắng: " + pcWin + " lần");
			System.out.println("Tỷ số hòa");
		}
	}

}
