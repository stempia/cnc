import java.util.*;
public class ConvDisplay extends ConvMethods{
	
private static String inputBase; //input type
//input option (1 = B, 2 = 0; 3 = H, 4 = D)
private static String outputBase; //output type "
private static String input; //input number
private static String ans; //answer
private static int cancel;
public ConvDisplay(){
	inputBase = "";
	outputBase = "";
	input = "";
	ans = "";
	cancel = 0;
}
public String GetInput(){
	return input;
}

public String GetInputBase(){
	return inputBase;
}

public String getAns(){
	return ans;
}

public String outputBase(){
	return outputBase;
}
public static void convFirst() {
	if(Integer.parseInt(inputBase)==1) input = BtoD(input);
	else if(Integer.parseInt(inputBase)==2) input = OtoD(input);
	else if(Integer.parseInt(inputBase)==3) input = HtoD(input);
}
public static void convSecond() {
	if(Integer.parseInt(outputBase)==1) ans = BtoD(ans);
	else if(Integer.parseInt(outputBase)==2) ans = OtoD(ans);
	else if(Integer.parseInt(outputBase)==3) ans = HtoD(ans);
}

static Scanner in = new Scanner(System.in);
public static void dispInput(){
	System.out.println("Choose the Number System for input!");
	System.out.println("1. Binary System");
	System.out.println("2. Octal System");
	System.out.println("3. HexaDecimal System");
	System.out.println("4. Decimal System");
	inputBase = in.nextLine();
	System.out.println("Please type in the number in form of your selected number system for input!");
	input = in.nextLine();
	convFirst();
}

public static void dispOutput() {
	System.out.println("Choose the Number System for output!");
	System.out.println("1. Binary System");
	System.out.println("2. Octal System");
	System.out.println("3. HexaDecimal System");
	System.out.println("4. Decimal System");
	outputBase = in.nextLine();
	convSecond();
}

public static void dispCancel() {
	System.out.println();
	System.out.println("Would you like to exit?");
	System.out.println("Type 1 to EXIT and 0 to TRY AGAIN");
	cancel = in.nextInt();
	
}

}
