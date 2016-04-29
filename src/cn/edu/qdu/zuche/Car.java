package cn.edu.qdu.zuche;

import java.util.Scanner;

public class Car extends Moto {

	@Override
	public void calcRent(int days) {
		Scanner input = new Scanner(System.in);
		int carbrand = input.nextInt();
		switch (carbrand) {
		case 1:
			setBrand("别克商务");
			setRent(600);

			break;
		case 2:
			setBrand("宝马550i");
			setRent(500);
			break;
		case 3:
			setBrand("别克林萌大道");
			setRent(300);
			break;

		default:
			break;
		}
		System.out.println("您一共需要为"+getBrand()+"付的租金为：" + days * getRent());

	}

}
