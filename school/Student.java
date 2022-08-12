package school;
import java.util.ArrayList;

public class Student {
 
	private int studentId;          //학번
	private String studentName;     //학생 이름
	private Subject majorSubject;   //전공과목
	
	//학생의 성적 리스트
	private ArrayList<Score> scoreList = new ArrayList<>();
	
	public Student(int studentId, String studentName, Subject majorSubject) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.majorSubject = majorSubject;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentIn(int studentIn) {
		this.studentId = studentIn;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Subject getMajorSubject() {
		return majorSubject;
	}

	public void setMajorSubject(Subject majorSubject) {
		this.majorSubject = majorSubject;
	}

	public ArrayList<Score> getScoreList() {
		return scoreList;
	}

	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}
	
	public void addSubjectScore(Score score) {
		scoreList.add(score);
	}

}
