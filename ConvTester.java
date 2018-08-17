import java.io.*;
import java.util.*;

public class ConvTester extends ConvDisplay{

	public static void main(String[] args) throws IOException{
		
		while(getCancel()==0) {
			convFirst();
			convSecond();
			dispInput();
			dispOutput();
			System.out.println(getAns());
			dispCancel();
		}
		
	}
	

}