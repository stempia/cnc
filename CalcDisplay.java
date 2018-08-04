import java.io.*;
import java.util.*;

public class CalcDisplay extends ConvMethods{
	
	private static String first;
	private static String firstBase;
	private static char optr;
	private static String second;
	private static String secondBase;
	private static String ans;
	private static String ansBase;
	public CalcDisplay() {
		first = "";
		firstBase = "";
		optr = '0';
		second = "";
		secondBase = "";
		ans = "";
		ansBase = "";
	}
	public String getFirst() {
		return first;
	}
	public String getFirstBase() {
		return firstBase;
	}
	public char getOptr() {
		return optr;
	}
	public String getSecond() {
		return second;
	}
	public String getSecondBase() {
		return secondBase;
	}
	public String getAns() {
		return ans;
	}
	public String getAnsBase() {
		return ansBase;
	}
	public void convFirst() {
		if(Integer.parseInt(firstBase)==1) first = BtoD(first);
		else if(Integer.parseInt(firstBase)==2) first = OtoD(first);
		else if(Integer.parseInt(firstBase)==3) first = HtoD(first);
	}
	public void convSecond() {
		if(Integer.parseInt(secondBase)==1) second = BtoD(second);
		else if(Integer.parseInt(secondBase)==2) second = OtoD(second);
		else if(Integer.parseInt(secondBase)==3) second = HtoD(second);
	}
	public void calcOutput() {
		if(optr == '+') ans = (Integer.parseInt(first) + Integer.parseInt(second)) + "";
		else if(optr == '-') ans = (Integer.parseInt(first) - Integer.parseInt(second)) + "";
		else if(optr == '*') ans = (Integer.parseInt(first) * Integer.parseInt(second)) + "";
		else if(optr == '/') ans = (Integer.parseInt(first) / Integer.parseInt(second)) + "";
	}
	public void convOutput() {
		if(Integer.parseInt(ansBase)==1) ans = BtoD(ans);
		else if(Integer.parseInt(ansBase)==2) ans = OtoD(ans);
		else if(Integer.parseInt(ansBase)==3) ans = HtoD(ans);
	}
	Scanner in = new Scanner(System.in);
	public void dispFirst() {
		System.out.println("Choose the Number System for input!");
		System.out.println("1. Binary System");
		System.out.println("2. Octal System");
		System.out.println("3. HexaDecimal System");
		System.out.println("4. Decimal System");
		firstBase = in.nextLine();
		System.out.println("Please type in the number in form of your selected number system for input!");
		first = in.nextLine();
		convFirst();
	}
	public void dispOptr() {
		System.out.println("Choose the Operator (+, -, *, /)");
		optr = in.nextLine().charAt(0);
	}
	public void dispSecond() {
		System.out.println("Choose the Number System for input!");
		System.out.println("1. Binary System");
		System.out.println("2. Octal System");
		System.out.println("3. HexaDecimal System");
		System.out.println("4. Decimal System");
		secondBase = in.nextLine();
		System.out.println("Please type in the number in form of your selected number system for input!");
		second = in.nextLine();
		convSecond();
	}
	public void dispOutput() {
		System.out.println("Choose the Number System for input!");
		System.out.println("1. Binary System");
		System.out.println("2. Octal System");
		System.out.println("3. HexaDecimal System");
		System.out.println("4. Decimal System");
		ansBase = in.nextLine();
		calcOutput();
		convOutput();
	}
	
}
