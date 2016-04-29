package cn.edu.qdu.zuche;

import java.util.Scanner;

public class Bus extends Moto {

	@Override
	public void calcRent(int days) {
		Scanner input = new Scanner(System.in);
		int busbrand = input.nextInt();
		switch (busbrand) {
		case 1:
			setBrand("<=16座 ");
			setRent(800);
			break;
		case 2:
			setBrand("<=16座 ");
			setRent(1500);
			break;

		default:
			break;
		}

		System.out.println("您一共需要为"+getBrand()+"付的租金为：" + days * getRent());

	}

}
