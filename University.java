package CS176L;

public class University {
	public String NameofUniversity;
	public int numberStudents;
	
public University (String name, int Students) {
	NameofUniversity = name;
	numberStudents = Students;
}

public String getName() {
	return NameofUniversity;
}

public int totalStudents() {
	return numberStudents;	
}

public static void main(String[] args) {
	University monmouth= new University("Monmouth University", 5000);
	
	
	System.out.println(monmouth.getName());
	System.out.println("Total of Students " + monmouth.totalStudents());
	
}

}
