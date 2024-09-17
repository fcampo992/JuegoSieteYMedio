import java.util.Random;

public class Mazo {
	Carta[] cartas;
	int siguiente;
	
	public Mazo() {
		this.siguiente=0;
		this.cartas = new Carta[40];
		int posicion = 0;
		for (int p = 0; p <= 3; p++) {
			for (int n = 1; n <= 7; n++) {
				this.cartas[posicion] = new Carta(n, p);
				posicion++;
			}
			for (int n = 10; n <= 12; n++) {
				this.cartas[posicion] = new Carta(n, p);
				posicion++;
			}
		}
	}

	public void imprimir() {
		for (int i = 0; i < this.cartas.length; i++) {
			this.cartas[i].imprimir();
		}
	}

	public void mezclar() {
		Random rand = new Random();
		for (int i = 0; i < cartas.length; i++) {
			int pos = rand.nextInt(40);
			Carta c = this.cartas[pos];

			this.cartas[pos] = this.cartas[i];
			this.cartas[i] = c;
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	public Carta dameCarta() {
		Carta c = this.cartas[siguiente];
		siguiente++;
		return c;
	}

}









