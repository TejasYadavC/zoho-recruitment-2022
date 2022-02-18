import java.util.Scanner;

public class TejasZoho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan = new Scanner(System.in);
         String str=scan.next();
         char[] ch = str.toCharArray();
         for(int i=ch.length/2;i<=ch.length-1;i++)
         {
        	 
        	 System.out.print(ch[i]);
        	 
         }
         for(int i=0;i<ch.length/2;i++)
         {
        	 System.out.print(ch[i]);
         }
         
	}

}
