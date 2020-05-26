package app.greencar.customerservice.entity;

import java.util.List;

public class WashPackages {

	private Integer id;
	private String packageName;
	private String addOnIds;
	private List<String> addOnId;
	private Float totalCost;

	public WashPackages() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WashPackages(Integer id, String packageName, String addOnIds, List<String> addOnId, Float totalCost) {
		super();
		this.id = id;
		this.packageName = packageName;
		this.addOnIds = addOnIds;
		this.addOnId = addOnId;
		this.totalCost = totalCost;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getAddOnIds() {
		return addOnIds;
	}

	public void setAddOnIds(String addOnIds) {
		this.addOnIds = addOnIds;
	}

	public List<String> getAddOnId() {
		return addOnId;
	}

	public void setAddOnId(List<String> addOnId) {
		this.addOnId = addOnId;
	}

	public Float getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Float totalCost) {
		this.totalCost = totalCost;
	}

	@Override
	public String toString() {
		return "WashPackages [id=" + id + ", packageName=" + packageName + ", addOnIds=" + addOnIds + ", addOnId="
				+ addOnId + ", totalCost=" + totalCost + "]";
	}

}
