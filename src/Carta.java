
public class Carta {
	int numero;
	int palo;
	
	public Carta(int n, int p) {		
		this.numero = n;
		this.palo = p;
	}
	
	public void imprimir()
	{
		String[] nombresDelPalo = {"oro", "basto", "copa", "espada"};
		System.out.println(numero + " de " + nombresDelPalo[palo]);
	}
		
}







