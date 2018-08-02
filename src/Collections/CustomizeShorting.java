package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {

	private String name;
	private int roll;

	public Student(String name, int roll) {
		this.name = name;
		this.roll = roll;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String toString() {
		return name + "   " + roll;

	}
}

public class CustomizeShorting {

	public static void main(String[] args) {
		List<Student> person = new ArrayList<Student>();
		person.add(new Student("zahid", 200));
		person.add(new Student("anand", 300));
		person.add(new Student("abhinav", 500));
		person.add(new Student("rahul", 800));
		Collections.sort(person, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});
		System.out.println(person);

	}

}
