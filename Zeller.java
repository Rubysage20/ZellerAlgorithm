import java.util.Scanner;
public class Zeller {
public static void main(String[] args) {
		
  // Create scanner
	Scanner scan = new Scanner(System.in);
		
// initiate variables
			int counter = 0; // number of entries
			int month, day = 0, year = 0;
			int M, K, C, D;
			String c, d;
		
// display title
			  System.out.println("\t Zeller's Algorithm");
				System.out.println(" ");
		
// ask user to enter the month
			System.out.print("Enter month MM ( or 0 to exit ): \t");
			 month = scan.nextInt();
		
// while loop with sentinel month != 0
				while (month != 0)
						  {
			
 // validate month
				while (month < 1 || month > 12)
				{ 
// ask user to enter month
			System.out.print("Please enter a valid month MM: \t \t");
			month = scan.nextInt();
				}
	// ask user to enter day
				System.out.print("Enter day DD: \t \t \t \t");
				day = scan.nextInt();
								
	// validate day
				  while (day < 1 || day > 31)
					{
					System.out.print("Please enter a valid day DD: \t \t");
					day = scan.nextInt();
					}
				
  // ask user to enter year
					System.out.print("Enter year YYYY: \t \t \t");
					year = scan.nextInt();
			
	// initialize M and K
	// correct month number of January and February 
	// to 11 and 12 of previous year
				if (month == 1 || month == 2)
					{ 
				 M = month + 10; // jan is 11 and feb is 12 for months
				 K = day;
				 year = year - 1; // jan and feb apart of previous year
					}
				else
					{
					M = month - 2; // subtract 2 from month # as M
					K = day;
					}
			
		// convert year to string to get index numbers
				 String yearString = Integer.toString(year);
			
    // use c d to get substrings of the string yearString
					c = yearString.substring(0,2);
					d = yearString.substring(2,4);
			
			// convert c, d to integer using wrapper class 
			//to initialize C and D
					C = Integer.parseInt(c);
					D = Integer.parseInt(d);
			
				// apply formula of g
				// use A variable to represent first part of g formula 
				// calculate g as int
				// and cast as an int
					 int A = (int) (2.6*M - 0.2);
					 int g = (A + K + D + (D/4) + (C/4) - (2*C)) % 7; 
						if (g < 0)
								g = g + 7;
			
// convert int G to string g 
//to use switch statement as char at index 0
						char G = Integer.toString(g).charAt(0);
			
// display the day of the week using switch statement
						  switch (G)
							{
							case '0': 
							System.out.println("\t The day is Sunday.");
							break;
							case '1':
							System.out.println("\t The day is Monday.");
							break;
							case '2':
							System.out.println("\t The day is Tuesday.");
							break;
							case '3':
							System.out.println("\t The day is Wednesday.");
							break;
							case '4':
							System.out.println("\t The day is Thursday.");
							break;
							case '5':
							System.out.println("\t The day is Friday.");
							break;
							case '6':
							System.out.println("\t The day is Saturday.");
							break;
							default:
							System.out.println("\t Error trying to retrieve day of the week.");
								}
			
// ask for month again or 0 to quit
							System.out.println(" ");
							System.out.print("Enter month MM ( or 0 to exit ): \t");
							month = scan.nextInt();;
			
// add counter
								counter++;	
					
								} 
										// output of # of entries
								System.out.println("Number of entries = " +counter);
								
										// close scanner
								scan.close();			
		}
	
		
	}



// Create Class 
class RightTriangle {
	//Declare attributes
	double base;
	double height;
	double hypotenuse;
	
	// Constructor without parameters 
	public RightTriangle() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the base of the triangle: ");
		this.base = scan.nextDouble();
		System.out.print("Enter the height of the triangle: ");
		this.height = scan.nextDouble();
		this.hypotenuse = calculateHypotenuse();
	}
	// Constructor with parameters 
	public RightTriangle(double base, double height) {
		this.base = base;
		this.height = height;
		this.hypotenuse = calculateHypotenuse();
	}
	private double calculateHypotenuse() {
		return Math.sqrt((base * base) + (height * height));			
		}
	public double getHypotenuse() {
		return hypotenuse;
	}
	
	public void setBase(double base) {
		this.base = base;
		this.hypotenuse = calculateHypotenuse();
	}
	
	public double getBase() {
		return base;
	}
	
	public void setHeight(double height) {
		this.height = height;
		this.hypotenuse = calculateHypotenuse();
	}
	
	public double getPerimeter() {
		return base + height + hypotenuse;
	}
	
	public double getArea() {
		return (base * height)/2;
	}
	
	// Create triangle without parameters
	RightTriangle triangle = new RightTriangle();
	
	// Create triangle with parameters 
	RightTriangle triangle1 = new RightTriangle(3,4);

	//Print the hypotenuse, area and perimeter of the triangle without parameters
	System.out.println("Triangle 1");
	System.out.println("Hypotenuse: " + triangle.getHypotenuse());
	System.out.println("Area: " + triangle.getArea());
	System.out.println("Perimeter: " + triangle.getPerimeter());
	
	// Print the hypotenuse, area, and perimeter of triangle1
	System.out.println("Triangle 2");
	System.out.println("Hypotenuse: " +triangle1.getHypotenuse());
	System.out.println("Area: " + triangle1.getArea());
	System.out.println("Perimeter: " + triangle1.getPerimeter());
}

	
	

