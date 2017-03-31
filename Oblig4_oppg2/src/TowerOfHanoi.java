import java.util.Scanner;

public class TowerOfHanoi {

	
	
	static int steg = 0;
	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
		System.out.print("Gi inn antall plater: ");
		int n = input.nextInt();
		
		// Finner løsningen rekursivt
		System.out.println("Steggene er: ");
		flyttPlater(n, 'A', 'B','C' );
		
		System.out.print( "Antall steg: " + steg);
		input.close();
	}

	public static void flyttPlater(int n, char fromTower, char toTower, char auxTower) {
		
		steg++;
		if ( n == 1) //stop betingelse
			System.out.println("Flytt plate " + n + " fra " + fromTower + " til " + toTower);
		else {
			flyttPlater(n - 1, fromTower, auxTower, toTower);
			System.out.println("Flytt plate " + n + " fra " + fromTower + " til " + toTower);
			flyttPlater(n-1, auxTower,toTower, fromTower);
		}
		
	}
	
	}



