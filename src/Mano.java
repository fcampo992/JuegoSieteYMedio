
public class Mano {
	Carta[] cartas;
	int siguiente;
	
	public Mano()
	{
		this.cartas = new Carta[14];
		this.siguiente = 0;
	}
	
	public void agregarCarta(Carta c)
	{
		this.cartas[this.siguiente] = c;
		this.siguiente++;
	}
	
	public double puntos()
	{
		double suma = 0;
		for(int i = 0; i < this.siguiente; i++) {
			if(this.cartas[i].numero <= 7)
				suma += this.cartas[i].numero;
			else
				suma += 0.5;
		}
		return suma;
	}
	 	
	
	
	
	
	
}
