package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	 private int id;
	 private String co_name;
	 private int co_max_stnt;
	 
	 public Course() {};
	 public Course( String co_name, int co_max_stnt) {
				
		this.co_name = co_name;
		this.co_max_stnt = co_max_stnt;
	 }
	 public int getId() {
		 return id;
	 }
	 public void setId(int id) {
		 this.id = id;
	 }
	 public String getCo_name() {
		 return co_name;
	 }
	 public void setCo_name(String co_name) {
		 this.co_name = co_name;
	 }
	 public int getCo_max_stnt() {
		 return co_max_stnt;
	 }
	 public void setCo_max_stnt(int co_max_stnt) {
		 this.co_max_stnt = co_max_stnt;
	 }
	 
}
