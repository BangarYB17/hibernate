package test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer_Details")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="C_id")
	private int id;
	
	@Column(name="C_name")
	private String name;
	@Column(name="C_city")
	private String city; 
	@Column(name="C_mobile_no")
	private String mobile_no;

	public Customer() {
		
	}
	public Customer(String name, String city, String mobile_no) {
		super();
		this.name = name;
		this.city = city;
		this.mobile_no = mobile_no;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

}
