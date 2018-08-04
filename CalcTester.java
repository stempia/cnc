import java.io.*;
import java.util.*;

public class CalcTester extends CalcDisplay{

	public static void main(String[] args) throws IOException{
		
		while(getCancel()==0) {
			dispFirst();
			dispOptr();
			dispSecond();
			dispOutput();
			System.out.println(getAns());
			dispCancel();
		}
		
	}
	

}
