package com.gn;

class Student {
	String name;
	int rollno;
	

	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;//
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}


	public static void main(String[] args) {
		Student s1=new Student("gopal", 101);
		
		Student s2=new Student("preety", 102);
		System.out.println(s1);
	}

}
