package homework;

import java.util.*;

class Student implements Comparable<Student>{
   private int id;
   private String fname;
   private double cgpa;
    
    public Student(int id, String fname, double cgpa){
       super();
       this.id = id;
       this.fname =fname;
       this.cgpa = cgpa;
   }
    
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
    
      public int compareTo(Student obj){
       int comp = Double.valueOf(cgpa).compareTo(obj.cgpa);
       if(comp != 0)return -comp;
       comp = fname.compareTo(obj.fname);
       if(comp != 0)return comp;
       comp = Integer.valueOf(id).compareTo(obj.id);
       return comp;
      }
}

public class Sort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      
	      List<Student> studentList = new ArrayList<Student>();
	      while(testCases>0){
	         int id = in.nextInt();
	         String fname = in.next();
	         double cgpa = in.nextDouble();
	         
	         Student st = new Student(id, fname, cgpa);
	         studentList.add(st);
	         
	         testCases--;
	      }
	         Collections.sort(studentList);
	         for(Student st: studentList){
	         System.out.println(st.getFname());
	      }
	}

}
