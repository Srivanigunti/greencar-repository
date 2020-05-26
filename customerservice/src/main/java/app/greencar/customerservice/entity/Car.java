package app.greencar.customerservice.entity;

public class Car {
	
	public Integer id;
	public Integer carName;
	public String carNumber;
	public String carImage;
	public String carColor;
	public String ownerName;
	public String carLocation;
	
	public Car(Integer id, Integer carName, String carNumber, String carImage, String carColor, String ownerName,
			String carLocation) {
		super();
		this.id = id;
		this.carName = carName;
		this.carNumber = carNumber;
		this.carImage = carImage;
		this.carColor = carColor;
		this.ownerName = ownerName;
		this.carLocation = carLocation;
	}

	public Car() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCarName() {
		return carName;
	}

	public void setCarName(Integer carName) {
		this.carName = carName;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getCarImage() {
		return carImage;
	}

	public void setCarImage(String carImage) {
		this.carImage = carImage;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getCarLocation() {
		return carLocation;
	}

	public void setCarLocation(String carLocation) {
		this.carLocation = carLocation;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", carName=" + carName + ", carNumber=" + carNumber + ", carImage=" + carImage
				+ ", carColor=" + carColor + ", ownerName=" + ownerName + ", carLocation=" + carLocation + "]";
	}
	

}
