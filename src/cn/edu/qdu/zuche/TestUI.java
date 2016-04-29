package cn.edu.qdu.zuche;

import java.util.Scanner;

public class TestUI {
	private int cost;
	private Car car = new Car();
	private Bus bus = new Bus();

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	public void welcomeHome() {
		System.out.println("欢迎来到出租车租赁系统！");
		System.out.println("请问你想租几天？");
		Scanner input = new Scanner(System.in);
		int days = input.nextInt();
		System.out.println("请输入你的选择（1.Car 2.Bus）：");
		int userSel = input.nextInt();

		switch (userSel) {
		case 1:
			System.out.println("请输入你的车型（1.别克商务 2.宝马550i 3.别克林萌大道）：");
			// int carbrand=input.nextInt();
			// switch (carbrand) {
			// case 1:
			// car.setRent(600);
			// break;
			// case 2:
			// car.setRent(500);
			// break;
			// case 3:
			// car.setRent(300);
			// break;
			//
			// default:
			// break;
			// }
			car.calcRent(days);

			break;

		case 2:

			System.out.println("请选择你的座位数（1.<=16座  2.<=16座 ）：");
		default:
			break;
		}

	}

	public static void main(String[] args) {
		TestUI test = new TestUI();
		test.welcomeHome();

	}

}
