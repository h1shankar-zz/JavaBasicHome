package apr_19;

import java.util.ArrayList;
import java.util.Collections;

public class Comp {

	public static void main(String[] args) {
	
		
		
		String str="123";
		System.out.println("sr to int "+ Integer.parseInt(str));
		
		
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(101,"Vijay",23));
		al.add(new Student(106,"Ajay",27));
		al.add(new Student(103,"Hari",28));
		al.add(new Student(105,"Jai",21));
      
	
	
		for(Student st:al){
		System.out.println(st.rollno+" "+st.name+" "+st.age);
		  }
       Collections.sort(al);
       
       System.out.println("after sorting.....");
      
       for(Student st:al){
   		System.out.println(st.rollno+" "+st.name+" "+st.age);
   		  }
	}
}
	class Student implements Comparable<Student> {
		int rollno;
		String name;
		int age;
		Student(int rollno,String name,int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
		}
		 public int compareTo(Student s) 
		    { 
		        return this.rollno - s.rollno; 
		    } 

	}

