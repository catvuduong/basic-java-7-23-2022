package IfElseDoWhileHomeWork;
/*
 * Name: dcv
 * Ex: Viết chương trình cho nhập vào tên, số lượng và đơn giá
 *  cho mặt hàng.
 *  Tính hóa đơn cho mặt hàng, nếu số lượng lớn hơn 100 thì giảm giá 12%,
 *  nếu từ 50 trở lên thì giảm giá 8%.
 * */

import InputSupporter.Input;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = Input.stringInput("Mời nhập tên hàng hóa");
		int amount = Input.intInput("Mới nhập số lượng hàng hóa");
		double unitPrice = Input.doubleInput("Mời nhập đơn giá cho mặt hàng");
		double total;
		// Process
		if (amount > 100) {
			total = amount * unitPrice * 0.88;
		} else if (amount >= 50) {
			total = amount * unitPrice * 0.92;
		} else {
			total = amount * unitPrice;
		}
		// Output
		System.out.println("Tên hàng hóa: " + name + "\t Số lượng: " + amount + "" + "\tHóa đơn thanh toán: " + total);
	}

}
