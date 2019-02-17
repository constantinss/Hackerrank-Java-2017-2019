// java 8
package homework;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Student{

	private int id_;
	private String name_;
	private double cgpa_;
	
	public Student(int id, String name, double cgpa) {
		super();
		this.id_ = id;
		this.name_ = name;
		this.cgpa_ = cgpa;
	}
	
    public int getID() {
		return id_;
	}
    public String getName() {
		return name_;
	}
    public double getCGPA() {
		return cgpa_;
	}
}

class Priorities{
	public List<Student> getStudents(List<String>events){
		PriorityQueue<Student> stQueue = new PriorityQueue<>(Comparator.comparing(Student::getCGPA).reversed().thenComparing(Student::getName).thenComparing(Student::getID));
		List <Student> students = new ArrayList <Student>();
		
		
	for (String s : events) {
		Scanner in = new Scanner(s);
		String event = in.next();
		if(event.equals("ENTER")) {
			String name = in.next();
			double cgpa = in.nextDouble();
			int id = in.nextInt();
			
			Student student = new Student(id, name, cgpa);
			stQueue.add(student);
		}else if(event.equals("SERVED")) {
			@SuppressWarnings("unused")
			Student first = stQueue.poll();
		} 
		in.close();
    }
	Student first = stQueue.poll();
	if(first == null) {
		return students;
	}else {
		while(first != null) {
			students.add(first);
			first = stQueue.poll();
		}
		return students;
	}
  }
}

public class PriorityQueueClass {
	private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
	public static void main(String[] args) {
		 int totalEvents = Integer.parseInt(scan.nextLine());    
	        List<String> events = new ArrayList<>();
	        
	        while (totalEvents-- != 0) {
	            String event = scan.nextLine();
	            events.add(event);
	        }
	        
	        List<Student> students = priorities.getStudents(events);
	        
	        if (students.isEmpty()) {
	            System.out.println("EMPTY");
	        } else {
	            for (Student st: students) {
	                System.out.println(st.getName());
	            }
	        }

	}

}
