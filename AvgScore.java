package CS176L;
import java.util.Scanner;

public class AvgScore {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("What is your name? ");
		String name = scanner.nextLine();
		System.out.println("Hello " + name + ",");
		System.out.print("How many exams have you taken? ");
		int numExams = scanner.nextInt();
		
		double totalScore = 0;
        for (int i = 1; i <= numExams; i++) {
        	double score;
        	do {
        		System.out.print("Give me the score of exam " + i + ": ");
                score = scanner.nextDouble();
                if (score < 0 || score > 100) {
                    System.out.println("Invalid score! Please provide a score between 0 and 100.");
                }
            } while (score < 0 || score > 100);

            totalScore += score;
        }

        double averageScore = totalScore / numExams;
        System.out.println("Hi, " + name + ", your average score of " + numExams + " exams is " + averageScore);
    }

	

	}


