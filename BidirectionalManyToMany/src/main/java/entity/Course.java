//package entity;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//
//@Entity
//public class Course {
//@Id
//@GeneratedValue(strategy = GenerationType.AUTO)
//	private int id;
//	private String name;
//	private double price;
//	
//	public Course() {
//		
//	}
//
//	public Course( String name, double price) {
//		
//		this.name = name;
//		this.price = price;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public double getPrice() {
//		return price;
//	}
//
//	public void setPrice(double price) {
//		this.price = price;
//	}
//	
//}
package entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String name;
private int price;
@ManyToMany
@JoinTable(joinColumns = @JoinColumn(name="c_id"),
inverseJoinColumns = @JoinColumn(name="s_id")
		)

private List<Student> student;
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public List<Student> getStudent() {
	return student;
}

public void setStudent(List<Student> student) {
	this.student = student;
}

public Course(){
	
}

public Course(String name, int price) {
	
	this.name = name;
	this.price = price;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

@Override
public String toString() {
	return "Course [id=" + id + ", name=" + name + ", price=" + price + "]";
}


}
