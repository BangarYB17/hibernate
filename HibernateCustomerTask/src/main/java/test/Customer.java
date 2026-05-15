package test;

public class Customer {
       private int id;
       private String name,city,mobile_no;
       
       public Customer(){
    	   
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
