package app.greencar.customerservice.entity;

public class CustomerReviews {
	public Integer id;
	public Integer custId;
	public Integer washerId;
	public Integer rating;

	public CustomerReviews() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerReviews(Integer id, Integer custId, Integer washerId, Integer rating) {
		super();
		this.id = id;
		this.custId = custId;
		this.washerId = washerId;
		this.rating = rating;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public Integer getWasherId() {
		return washerId;
	}

	public void setWasherId(Integer washerId) {
		this.washerId = washerId;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "CustomerReviews [id=" + id + ", custId=" + custId + ", washerId=" + washerId + ", rating=" + rating
				+ "]";
	}

}
