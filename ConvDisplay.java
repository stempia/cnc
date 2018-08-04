import java.util.*;
public class ConvDisplay extends ConvMethods{
	Scanner in = new Scanner(System.in);
private static String inputBase;
//input option (1 = B, 2 = 0; 3 = H, 4 = D)
private static String outputBase; //output type "
private static String input; //input number
private static String ans; //answer

public String inputBase(){
	char x = in.next();
	return x;
}

public String getY(){
	return y;
}

public String ans(){
	return null;
}

public void dispInput(){
	
}

public void convInput(){
	if(x == 1) ans = BtoD();
	else if(x == 2) ans = OtoD();
	else if(x == 3) ans = HtoD
}

}
