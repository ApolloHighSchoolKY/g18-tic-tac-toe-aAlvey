//© A+ Computer Science  -  www.apluscompsci.com
//Name - Asher Alvey
//Date - 2/19/25
//Class - AP Comp Sci
//Lab  - TicTacToe

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("lab24d.dat"));

		int x = file.nextInt();

		file.nextLine();

		TicTacToe game = new TicTacToe(file.nextLine());
		
		while (file.hasNextLine()){
			char [][] result = new char[3][3];

			for (int i = 0; i < x; i++){
				
				
				result[i] = file.nextLine().charAt();
				
			}
		}
	

		
		
		//for (int i = 0; i < x; i++){
			

			
		//}
		



	}
}



