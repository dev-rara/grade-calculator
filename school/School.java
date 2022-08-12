package school;

import java.util.ArrayList;

public class School {
	
	//School은 유일한 객체이므로 singleton pattern 적용
	
	private static School instance = new School();
	private ArrayList<Student> studentList = new ArrayList<>();
	private ArrayList<Subject> subjectList  = new ArrayList<>();
	
	private School() {}
	
	public static School getInstance() {
		
		if(instance == null) {
			return new School();
		}
		return instance;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(ArrayList<Subject> subjectList) {
		this.subjectList = subjectList;
	}

	public static void setInstance(School instance) {
		School.instance = instance;
	}
	
	public void addStudent(Student student) {
		studentList.add(student);
	}
	
	public void addSbuject(Subject subject) {
		subjectList.add(subject);
	}
}
