package jdbcdemo.domain;

public class Car implements IHaveId {

	private int id;
	private String brand;
	private String registration;
	
	public int getId() {
		return id;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public String GetSurname() {
		return null;
	}

	@Override
	public int age() {
		return 0;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getRegistration() {
		return registration;
	}
	public void setRegistration(String registration) {
		this.registration = registration;
	}
	
}
