package CS176L;

public class Student 
{	
	public String studentName;
	public int score;
	public int totalScore;
	public int average;
	private int numberQuiz=5;
	
	
	
	public Student(String name) {
		studentName = name;
	}
	
	
int getScore() {
	return totalScore;
}
void addQuiz(int score) {
	totalScore=totalScore+score;}
	
int getAverageScore() {
	int average= totalScore/numberQuiz;
			return average;
	
}


String getName() {
	return studentName;
}
	
public static void main(String[] args) {
		Student liv = new Student("Olivia");
		liv.addQuiz(78);
		liv.addQuiz(88);
		liv.addQuiz(90);
		liv.addQuiz(95);
		liv.addQuiz(88);
		System.out.println("Student Name" + " " + liv.getName());
		System.out.println("Total Score:" + " " + liv.getScore());
		System.out.println("Average Score:" + " " + liv.getAverageScore());
		
	}	
}
