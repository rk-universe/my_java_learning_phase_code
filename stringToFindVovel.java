package oopj;

import java.util.Scanner;

public class stringToFindVovel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String s1=sc.nextLine();
		int len=s1.length();
		int count = 0;
		for(int i=0;i<len;i++) 
		{
			
			char f=s1.charAt(i);
			if( f == 'a' || f == 'e' || f =='i' || f == 'o' || f =='u' ||f == 's' || f =='A'||f == 'E' || f =='I' ||f == 'O' || f =='U' || f =='S' )
					{
						count++;
				
					}
					
		}System.out.println("Number of Vovels is " + count );
		int c= len-count;
		System.out.println("number of consonants" +c );
		
		
	}

}
