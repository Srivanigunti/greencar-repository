package app.greencar.customerservice.entity;

import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

@Document(collection = "CustomerDetails")
public class Customer {

	@Transient
	public static final String SEQUENCE_NAME = "users_sequence";
	@Id
	public long id;
	@Indexed(unique = true)
	private String firstName;
	private String lastName;
	public String password;
	@Indexed(unique = true)
	public String emailId;
	public String phNum;
	public String address;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer id, String firstName, String lastName, String password, String emailId, String phNum,
			String address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.emailId = emailId;
		this.phNum = phNum;
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setId(long l) {
		this.id = l;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhNum() {
		return phNum;
	}

	public void setPhNum(String phNum) {
		this.phNum = phNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", password=" + password
				+ ", emailId=" + emailId + ", phNum=" + phNum + ", address=" + address + "]";
	}

}
