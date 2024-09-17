import java.util.Random;
import java.util.Scanner;

import javax.swing.JPanel;

public class Juego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Mazo m = new Mazo();
		Mano jugador1 = new Mano();
		boolean turno = true;
		m.mezclar();
		Random n = new Random ();
		boolean juego = true;
		boolean nextTurn = false;
		
//		Inicio del juego
		System.out.println("***************************************************************************************************");
		System.out.println("\r");
		System.out.println("Bienvenido al juego del 7 y 1/2");
		System.out.println("\r");
		System.out.println("REGLAS: Tomaras una carta por turno e iras sumando puntos hasta que juntes 7 y 1/2 o muy proximo \n");
		System.out.println("***************************************************************************************************");
		System.out.println("\r");
		
		int i = 0;	
		do {
		
			
				
				
				
				if (turno) {
				jugador1.agregarCarta(m.cartas[i]);	
				System.out.println("___________________________");
				System.out.println("\n Tomas la siguiente carta");
				System.out.println("___________________________\n");
				
				jugador1.cartas[i].imprimir();
				
				System.out.println("* Puntos acumulados: " + jugador1.puntos());
				
				if (jugador1.puntos() > 7.5) {
					juego = false;
					System.out.println("PERDISTE!!! Terminaste con " + jugador1.puntos() + " puntos.");

				}else {
				
				System.out.println("___________________________");
				System.out.println("\n Queres tomar otra carta?");
				System.out.println("___________________________\n");
				
				nextTurn = scan.nextBoolean();	
				}
			}
			else {
				System.out.println("Termino con " + jugador1.puntos() + " puntos.");
			}
		
		
		
		
	
		i++;
		}while(juego == true);	
	
		
		


		
	}

}
