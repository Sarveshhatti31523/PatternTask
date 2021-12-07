package example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) throws FileNotFoundException {
		
		File Fileright = new File("C:\\Users\\hp\\abc.txt");
		PrintWriter out = new PrintWriter(Fileright); 
        int count=1;	
        System.out.println("Enter the Height of the tree");
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		
		for(int i=1;i<=a;i++) {
		  for(int k=1;k<=Math.pow(2,i-1);k++) {
            
			  if(i==k) {
				  out.print("   ");
			  }
			  
			  if(i>=count) {
				  out.print("   ");
			  }
			 
			  out.print(" "+count+" ");
			  count++;
			  	   
		}	 
		  
		out.println();
		
		}
    out.close();
	}

}

