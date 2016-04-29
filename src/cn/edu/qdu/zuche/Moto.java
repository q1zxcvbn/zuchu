package cn.edu.qdu.zuche;

public abstract class Moto {

	private String brand;
	private int rent;

	public abstract void calcRent(int days);

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

}
