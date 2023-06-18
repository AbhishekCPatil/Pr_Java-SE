package in.acp.javapr.model;

public class Pattern {
	
	public static void pattern1(int number1) {
		for(int row=1; row <= number1; row++) {
			//for every row,run the column
			//System.out.println(row);
			for(int column=1; column<=row; column++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	public static void pattern2(int number2) {
		
	}

}
