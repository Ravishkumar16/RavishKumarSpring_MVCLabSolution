package com.greatLearning.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")

public class Student {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int studentid;

		@Column(name = "name")
		private String name;
		private String department;
		private String country;

		public Student() {
			super();
		}

		public Student(String name, String department, String country) {
			super();
			this.name = name;
			this.department = department;
			this.country = country;
		}

		public int getStudentid() {
			return studentid;
		}

		public void setStudentid(int studentid) {
			this.studentid = studentid;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getdepartment() {
			return department;
		}

		public void setdepartment(String department) {
			this.department = department;
		}

		public String getcountry() {
			return country;
		}

		public void setcountry(String country) {
			this.country = country;
		}

}
