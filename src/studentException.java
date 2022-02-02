import java.util.Scanner;

public class studentException {
	
	public static void main(String args[]) throws MyException2 {
		
		Scanner sc = new Scanner(System.in);
		int studentId = sc.nextInt();
		sc.nextLine();
		String StudentName = sc.nextLine();
		int marks = sc.nextInt();
		
		if(marks < 0 || marks > 100) {
			throw new MyException2();
		}
		
		System.out.print("studentId: "+ studentId + " StudentName: " + StudentName + " marks: " + marks);
	}
}
