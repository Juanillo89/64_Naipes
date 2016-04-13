package baraja;

public class Baraja implements INaipes 
{
	
	int[] cartas;
	String[] nombresCartas;
	String[] nombresPalos;
	
	public Baraja()
	{
		nombresCartas = new String[]
				{"As",
				 "Dos",
				 "Tres",
				 "Cuatro",
				 "Cinco",
				 "Seis",
				 "Siete",
				 "Sota",
				 "Caballo",
				 "Rey"};
		nombresPalos = new String[]
				{"de oros.",
				 "de copas.",
				 "de espadas.",
				 "de bastos."};
		cartas = new int[40];
		for (int i = 0; i < cartas.length; i++) 
		{
			cartas[i] = i + 1;
		}
	}
	@Override
	public String traducir(int numCarta) 
	{
		String traduccion = "";
		traduccion = nombresCartas[(numCarta % 10) - 1] + nombresPalos[(numCarta / 10) - 1];	
		return traduccion;
	}

	@Override
	public void barajar() 
	{
		
	}

	@Override
	public int extraerCartaAlAzar() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int extraerCartaArriba() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int extraerCarta(int posicion) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean ponerCarta(int numCarta) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getNumCartas() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void ordenar() {
		// TODO Auto-generated method stub
		
	}

}
