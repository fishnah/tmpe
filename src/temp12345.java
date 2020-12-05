import java.util.Scanner;
public class temp12345 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String city[]=
            {"Riyadh","Dammam","Mecca","Jeddah"};
		int n1;
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < city.length; ++i)
	        System.out.println((i+1)+" "+city[i]);
	        System.out.println("enter cn for city temp");
	        n1 =(input.nextInt())-1;
	        
	        tmpe(n1);
			}
	        static void tmpe(int n1) {

	        if( n1 == 0 ) {
	            System.out.print("Temperature in Riyadh = 40");
	        }
	 
	        else if( n1 == 1 ) {
	            System.out.print("Temperature in dammam = 35");
	        }
	 
	        else if( n1 == 2 ) {
	            System.out.print("Temperature in Mecca = 32");
	        }
	 
	        else if( n1 == 3 ) {
	            System.out.print("Temperature in Jeddah = 37");
	        }
	 
	        else {
	            System.out.print("Error number");
	        }

	        
	        
	    
	        
	        
	}

}
