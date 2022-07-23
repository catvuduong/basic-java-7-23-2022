package DoWhileAdvance;
/*
 * Name: dcv
 *  Tìm số nguyên dương n nhỏ nhất sao cho :
	1 + 2 + … + n > 5000
 * */

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input
		int n = 1;
		int sum = 0;
		// Process
		while (sum <= 5000) {
			sum += n;
			n++;
		}
		// Output
		System.out.println("Số nguyên dương nhỏ nhất thỏa biểu thức (1 + 2 + ... + n > 5000)" + " là: " + n);

	}

}
