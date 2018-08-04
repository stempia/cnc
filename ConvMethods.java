import java.util.Arrays;

public class ConvMethods{
	private String num;
	//Minjun
		public static String BtoD(String n) {
			char[] x = n.toCharArray();
			int result = 0;
			int power = 0;
			
			for(int i = x.length-1; i >= 0; i--) {
				result += Math.pow(2, power) * (x[i] - '0');
				power++;
			}
			
			return String.valueOf(result);
		}
		public static String OtoD(String n) {
			char[] x = n.toCharArray();
			int result = 0;
			int power = 0;
			
			for(int i = x.length-1; i >= 0; i--) {
				result += Math.pow(8, power) * (x[i] - '0');
				power++;
			}
			
			return String.valueOf(result);
		}
		public static String HtoD(String n) {
			char[] x = n.toCharArray();
			int result = 0;
			int power = 0;
			
			for(int i = x.length-1; i >= 0; i--) {
				result += (int) (Math.pow(16, power) * (LtoN(x[i])));
				power++;
			}
			
			return String.valueOf(result);
		}
		//Samuel
		public static String DtoB(String n){
			
	        String[] binaryNum = new String[1000];
	  
	        int i = 0;
	        while (Integer.parseInt(n) > 0) 
	        {
	            binaryNum[i] = (Integer.parseInt(n) % 2) + "";
	            n = (Integer.parseInt(n) / 2) + "";
	            i++;
	        }
	        String arr = Arrays.toString(binaryNum).replace(", ", "").replace("[", "").replace("]", "").replace("null","");
	        return new StringBuilder(arr).reverse().toString();
		}
		public static String DtoO(String n){
			int d = Integer.parseInt(n);
			String ans="";
			for(int i=0; d>=1; i++){
				int temp = d%8;
				ans= temp+ans;
				d=d/8;
			}
			return ans;
		}
		public static String DtoH(String n){
			int d = Integer.parseInt(n);
			String ans="";
			for(int i=0; d>=1; i++){
				int temp = d%16;
				ans= NtoL(temp)+ans;
				d=d/16;
			}
			return ans;
		}
		

	public static String NtoL(int n){
			if(n == 10)
				return "A";
			else if(n == 11)
				return "B";
			else if(n == 12)
				return "C";
			else if(n == 13)
				return "D";
			else if(n == 14)
				return "E";
			else if(n ==15)
				return "F";
			else
				return n+"";
		}
	
		public static int LtoN(char x){
			if(x == 'A')
				return 10;
			else if(x == 'B')
				return 11;
			else if(x == 'C')
				return 12;
			else if(x == 'D')
				return 13;
			else if(x == 'E')
				return 14;
			else if(x == 'F')
				return 15;
			else
				return x + '0';
		}
}
