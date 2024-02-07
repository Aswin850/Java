import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		int noOfDays;
		Scanner sc=new Scanner(System.in);
		System.out.println("How days of temp u are going to enter?");
		noOfDays=sc.nextInt(); 
		AverageTempApp app=new AverageTempApp(noOfDays);
		
		for(int i=0;i<noOfDays;i++) {
			System.out.print("Tempature of Day "+(i+1) +" is: ");
			app.insert(i, sc.nextFloat());
			
		}
		
		app.displayAverage();

	}

}
