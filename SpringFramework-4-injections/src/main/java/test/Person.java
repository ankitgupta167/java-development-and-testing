package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
public class Person {
	// this is called field injection
//	@Value("101")
//	private int id;
//	@Value("Ankit")
//	private String name;
//	@Autowired
//	private Mobile mobile;
//	
//	public int getId() {
//		return id;
//	}

	// this is my setter injection code
//	private int id;
//	private String name;
//	private Mobile mobile;
//	@Override
//	public String toString() {
//		return "Person [id=" + id + ", name=" + name + ", mobile=" + mobile + "]";
//	}
//	@Value("101")
//	public void setId(int id) {
//		this.id = id;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	@Value("ankitt")
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public Mobile getMobile() {
//		return mobile;
//	}
//	@Autowired
//	public void setMobile(Mobile mobile) {
//		this.mobile = mobile;
//	}
	
	private int id;
	private String name;
	private Mobile mobile;
	
	public Person(@Value("101") int id,@Value("dhiraj") String name,@Autowired Mobile mobile) {
		
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", mobile=" + mobile + "]";
	}
	
}
