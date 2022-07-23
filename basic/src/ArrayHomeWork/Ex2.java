package ArrayHomeWork;

import java.net.Inet4Address;
import java.util.Scanner;

import InputSupporter.Input;

/*
 * Name: dcv
 * Ex: Cho người dùng nhập vào n số nguyên và lưu trữ trong mảng
a. Làm menu cho người dùng chọn thực hiện các chức năng bên dưới. 
b. Tổng các số dương. 
c. Tính tổng các số lẻ.
d. Đếm có bao nhiêu số dương.
e. Tìm số nhỏ nhất trong mảng.
f. Tìm số dương nhỏ nhất trong mảng
g. Tìm số chẵn cuối cùng trong mảng 1 chiều các số nguyên. Nếu mảng không có giá trị chẵn 
thì trả về -1
h. Viết hàm tìm số chẵn đầu tiên trong mảng các số nguyên. Nếu mảng không có giá trị chẵn 
thì trả về -1
i. Tìm số nguyên tố đầu tiên trong mảng 1 chiều các số nguyên. Nếu mảng không có số 
nguyên tố thì trả về – 1
j. Tìm số dương cuối cùng trong mảng số thực. Nếu mảng không có giá trị dương thì trả về -1
k. Hãy tìm giá trị chẵn nhỏ nhất trong mảng 1 chiều các số nguyên. Nếu mảng không có số 
chẵn thì trả về -1
 * */
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = Input.intInput("Mời nhập vào số lượng phần tử có trong mảng");
		int[] a = new int[n];
		inputArray(a);
		outputArray(a);
		int chose;
		do {
			System.out.println("Mời chọn MENU, nhấn 0 để dừng chương trình");
			System.out.println("1. Tổng các số dương");
			System.out.println("2. Tổng các số lẻ");
			System.out.println("3. Đếm có bao nhiêu số dương");
			System.out.println("4. Tìm số nhỏ nhất trong mảng");
			System.out.println("5. Tìm số dương nhỏ nhất trong mảng");
			System.out.println("6. Tìm số chẵn cuối cùng trong mảng");
			System.out.println("7. Tìm số chẵn đầu tiên trong mảng");
			System.out.println("8. Tìm số nguyên tố đầu tiên trong mảng");
			System.out.println("9. Tìm số chẵn nhỏ nhất trong mảng");
			chose = Integer.parseInt(scan.nextLine());
			switch (chose) {
			case 1: {
				int totalPositiveNumber = sumOfPositiveNumbers(a);
				System.out.println("Tổng các số dương trong mảng là: " + totalPositiveNumber);
				break;
			}
			case 2: {
				int totalOddNumber = sumOfOddNumbers(a);
				System.out.println("Tổng các số lẻ trong mảng là: " + totalOddNumber);
				break;
			}
			case 3: {
				int countPositiveNumber = countPositiveNumber(a);
				if (countPositiveNumber == 0) {
					System.out.println("Không có số dương trong mảng");
				} else {
					System.out.println("Có " + countPositiveNumber + " trong mảng.");
				}
				break;
			}
			case 4: {
				int indexOfPositiveNumber = findLowestPositiveNumer(a);
				if (indexOfPositiveNumber == -1) {
					System.out.println("Không có số dương trong mảng");
				} else {
					System.out.println("Số dương nhỏ nhất trong mảng là: " + a[indexOfPositiveNumber] + ", tại "
							+ "vị trí a[" + indexOfPositiveNumber + "].");
				}
				break;
			}
			case 5: {
				int indexOfLowestNumber = findLowestNumber(a);
				System.out.println("Số nhỏ nhất trong mảng là: " + a[indexOfLowestNumber] + ", tại " + "vị trí a["
						+ indexOfLowestNumber + "].");
				break;
			}
			case 6: {
				int indexOfFinalEvenNumer = findFinalEvenNumber(a);
				if (indexOfFinalEvenNumer == -1) {
					System.out.println("Không có số chẵn trong mảng.");
				} else {
					System.out.println("Số chẵn cuối cùng trong mảng là: " + a[indexOfFinalEvenNumer] + ", tại "
							+ "vị trí a[" + indexOfFinalEvenNumer + "].");
				}
				break;
			}
			case 7: {
				int indexOfFirstEvenNumber = findFirstEvenNumber(a);
				if (indexOfFirstEvenNumber == -1) {
					System.out.println("Không có số chẵn trong mảng.");
				} else {
					System.out.println("Số chẵn đầu tiên trong mảng là: " + a[indexOfFirstEvenNumber] + ", tại "
							+ "vị trí a[" + indexOfFirstEvenNumber + "].");
				}
				break;
			}
			case 8: {
				int indexOfPrimeNumber = findFirstPrimenumber(a);
				if (indexOfPrimeNumber == -1) {
					System.out.println("Không có số nguyên tố trong mảng.");
				} else {
					System.out.println("Số số nguyên tố  đầu tiên trong mảng là: " + a[indexOfPrimeNumber] + ", tại "
							+ "vị trí a[" + indexOfPrimeNumber + "].");
				}
				break;
			}

			// Mảng số thực không làm vì tạo cũng như mảng số nguyên.

			case 9: {
				int indexOfLowestEvenNumber = findLowestEvenNumber(a);
				if (indexOfLowestEvenNumber == -1) {
					System.out.println("Không có số nguyên tố trong mảng.");
				} else {
					System.out.println("Số chẵn nhỏ nhất trong mảng là: " + a[indexOfLowestEvenNumber] + ", tại "
							+ "vị trí a[" + indexOfLowestEvenNumber + "].");
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

	public static int sumOfPositiveNumbers(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				sum += a[i];
			}
		}
		return sum;
	}

	public static int sumOfOddNumbers(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				sum += a[i];
			}
		}
		return sum;
	}

	public static int countPositiveNumber(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				count++;
			}
		}
		return count;
	}

	public static int findLowestNumber(int[] a) {
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < a[index]) {
				index = i;
			}
		}
		return index;
	}

	public static int findPositiveNumber(int[] a) {
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				index = i;
				break;
			}
		}
		return index;
	}

	public static int findLowestPositiveNumer(int[] a) {
		int index = findPositiveNumber(a);
		for (int i = 0; i < a.length; i++) {
			if (a[i] < a[index] && a[i] > 0) {
				index = i;
			}
		}
		return index;
	}

	public static int findFinalEvenNumber(int[] a) {
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				index = i;
			}
		}
		return index;
	}

	public static int findFirstEvenNumber(int[] a) {
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				index = i;
				break;
			}
		}
		return index;
	}

	public static boolean checkPrimeNumber(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int findFirstPrimenumber(int[] a) {
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			if (checkPrimeNumber(a[i])) {
				index = i;
				break;
			}
		}
		return index;
	}

	public static int findLowestEvenNumber(int[] a) {
		int index = findFirstEvenNumber(a);
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0 & a[i] < a[index]) {
				index = i;
			}
		}
		return index;
	}

}
