import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
		System.out.print("Gi inn antall disker: ");
		int n = input.nextInt();
		
		// Finner løsningen rekursivt
		System.out.println("Flyttingene er: ");
		flyttDisker(n, 'A', 'B','C' );
		
		input.close();
	}

	public static void flyttDisker(int n, char fromTower, char toTower, char auxTower) {
		if ( n == 1) //stop betingelse
			System.out.println("Flytt disk " + n + " fra " + fromTower + " til " + toTower);
		else {
			flyttDisker(n - 1, fromTower, auxTower, toTower);
			System.out.println("Flytt disk " + n + " fra " + fromTower + " til " + toTower);
			flyttDisker(n-1, auxTower,toTower, fromTower);
		}
		
	}
	
	}



