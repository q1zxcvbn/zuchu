package cn.edu.qdu.zuche;

import java.util.Scanner;

public class Car extends Moto {

	@Override
	public void calcRent(int days) {
		Scanner input = new Scanner(System.in);
		int carbrand = input.nextInt();
		switch (carbrand) {
		case 1:
			setBrand("�������");
			setRent(600);

			break;
		case 2:
			setBrand("����550i");
			setRent(500);
			break;
		case 3:
			setBrand("������ȴ��");
			setRent(300);
			break;

		default:
			break;
		}
		System.out.println("��һ����ҪΪ"+getBrand()+"�������Ϊ��" + days * getRent());

	}

}
