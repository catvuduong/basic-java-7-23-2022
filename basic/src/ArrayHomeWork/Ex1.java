package ArrayHomeWork;

import java.util.Scanner;

import InputSupporter.Input;

/*
 * Name: dcv
 *  Ex: 
 * Cho người dùng nhập vào n số nguyên và lưu trữ trong mảng
a. Viết hàm nhập, hàm xuất
b. Tìm số lớn nhất và vị trí của nó trong mảng
c. Tìm số âm đầu tiên và vị trí của nó trong mảng.
d. Tìm số âm lớn nhất và vị trí của nó trong mảng
e. Tính tổng các số chẵn.
f. Đếm có bao nhiêu số âm.
g. Tổng các số âm. Cho người dùng nhập vào x và tìm x có trong mảng đó hay không.
 * */
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input
		Scanner scan = new Scanner(System.in);
		int n = Input.intInput("Mời nhập vào số lượng phần tử có trong mảng");
		int[] a = new int[n];
		inputArray(a);
		outputArray(a);
		int chose;
		do {
			System.out.println("Mời chọn MENU, nhấn 0 để dừng chương trình");
			System.out.println("1. Tìm số lớn nhất và vị trí của nó");
			System.out.println("2. Tìm số âm đầu tiên trong mảng");
			System.out.println("3. Tìm số âm lớn nhất và vị trí của nó");
			System.out.println("4. Tổng các số chẵn");
			System.out.println("5. Đếm có bao nhiêu số âm");
			System.out.println("6. Nhập x và kiểm xem x có trong mảng hay không");
			chose = Integer.parseInt(scan.nextLine());
			switch (chose) {
			case 1: {
				int indexGreatestNumber = findGreatestNumber(a);
				System.out.println("Số lớn nhất trong mảng là: " + a[indexGreatestNumber] + ", ở " + "vị trí: a["
						+ indexGreatestNumber + "]");
				break;
			}
			case 2: {
				int indexNagativeNumber = findNegativeNumber(a);
				if (indexNagativeNumber == -1) {
					System.out.println("Không có số âm trong mảng.");
				} else {
					System.out.println("Số đầu tiên trong mảng là: " + a[indexNagativeNumber] + ", ở " + "vị trí: a["
							+ indexNagativeNumber + "].");
				}

				break;
			}
			case 3: {
				int indexNagativeGreatestNumber = findGreatestNagativeNumber(a);
				if (indexNagativeGreatestNumber == -1) {
					System.out.println("Không có số âm trong mảng.");
				} else {
					System.out.println("Số lớn nhất trong mảng là: " + a[indexNagativeGreatestNumber] + ", ở "
							+ "vị trí: a[" + indexNagativeGreatestNumber + "].");
				}

				break;
			}
			case 4: {
				int evenTotalNumber = evenTotalNumbers(a);
				System.out.println("Tồng các số chẵn trong mảng là: " + evenTotalNumber);
				break;
			}
			case 5: {
				int count = countNagativeNumber(a);
				if (count == 0) {
					System.out.println("Không có số âm trong mảng.");
				} else {
					System.out.println("Có " + count + " số âm trong mảng.");
				}
				break;
			}
			case 6: {
				int isThereX = findX(a);
				if (isThereX != -1) {
					System.out.println("X có trong mảng, ở vị trí a[" + isThereX + "].");
				} else {
					System.out.println("Không có số âm trong mảng.");
				}
				break;
			}
			case 0:
				System.out.println("Dừng chương trình!");
			}
		} while (chose != 0);

	}

	public static void inputArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = Input.intInput("a[" + i + "] = ");
		}
	}

	public static void outputArray(int[] a) {
		System.out.println("Mảng sau khi nhập là: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = " + a[i] + "   ");
		}
		System.out.println("\n");
	}

	public static int findGreatestNumber(int[] a) {
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > a[index]) {
				index = i;
			}
		}
		return index;
	}

	public static int findNegativeNumber(int[] a) {
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				index = i;
				break;
			}
		}
		return index;
	}

	public static int findGreatestNagativeNumber(int[] a) {
		int index = findGreatestNagativeNumber(a);
		if (index != -1) {
			for (int i = index; i < a.length; i++) {
				if (a[i] > a[index]) {
					index = i;
				}
			}
		}
		return index;
	}

	public static int evenTotalNumbers(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				sum += a[i];
			}
		}
		return sum;
	}

	public static int countNagativeNumber(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				count++;
			}
		}
		return count;
	}

	public static int findX(int[] a) {
		int index = -1;
		int x = Input.intInput("Mời nhập vào số x");
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				index = i;
			}
		}
		return index;
	}

}
