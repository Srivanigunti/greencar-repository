package app.greencar.customerservice.entity;

class WashAddons {
	public Integer id;
	public String addOnType;
	public Float cost;
	
	public WashAddons() {
		super();
	}

	public WashAddons(Integer id, String addOnType, Float cost) {
		super();
		this.id = id;
		this.addOnType = addOnType;
		this.cost = cost;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddOnType() {
		return addOnType;
	}

	public void setAddOnType(String addOnType) {
		this.addOnType = addOnType;
	}

	public Float getCost() {
		return cost;
	}

	public void setCost(Float cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "WashAddons [id=" + id + ", addOnType=" + addOnType + ", cost=" + cost + "]";
	} 
	
}
