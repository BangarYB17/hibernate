																																																																																																															package test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Emp_Details")
public class Employee {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name = "E_Id")
	private int id;
	@Column(name = "E_Name")
	private String name;
	@Column(name = "E_Salary")
	private double salary;

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
