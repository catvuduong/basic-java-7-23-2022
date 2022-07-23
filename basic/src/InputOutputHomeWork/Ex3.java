package InputOutputHomeWork;

import InputSupporter.Input;

/*
 * Name: dcv
 * Quy đổi ti�?n
Giá USD hiện nay đang là 23.500 VND
Viết chương trình quy đổi từ USD sang VND. 
Cho ngư�?i dùng nhập vào số ti�?n USD. 
Tính và xuất ra số ti�?n sau quy đổi VND. 
Ví dụ: 
Ngư�?i dùng nhập 2 USD => Xuất ra 47.000 VND

 * */

public class Ex3 {
	public static void main(String[] agrs) {
		// Input
		double moneyChange;
		final double VND = 23500;
		double usd = Input.doubleInput("M�?i nhập số usd muốn đổi sang VND");
		// Process
		moneyChange = usd * VND;
		// Output
		System.out.println(usd + " USD qui đổi sang VND là: " + moneyChange + " VND");
	}

}
