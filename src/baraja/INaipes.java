package baraja;

public interface INaipes 
{
	
	/**
	* Traduce el n�mero de la carta por su nombre:
	* Ej.:
	* 1 = As de oros
	* 2 = Dos de oros
	* ...
	* 20 = Rey de copas
	* ...
	* @param numCarta (del 1 al 40)
	* @return El nombre de la carta, o "" si numCarta no es v�lido.
	*/
	public String traducir(int numCarta);
	/**
	* Baraja las cartas que haya en el mazo de manera aleatoria.
	*/
	public void barajar();
	/**
	* Extrae una carta al azar de las que haya en el mazo
	* y disminuye el n�mero de cartas.
	* @return devuelve el valor de la carta (del 1 al 40)
	*/
	public int extraerCartaAlAzar();
	/**
	* Extrae la carta superior del mazo y disminuye el n�mero de cartas.
	* @return devuelve el valor de la carta (del 1 al 40)
	*/
	public int extraerCartaArriba();
	/**
	* @param posicion (las posiciones comienzan desde la 1, hasta el n�mero
	* de cartas que tenga el mazo en cada momento)
	* @return -1 si no encuentra la posicion
	*/
	public int extraerCarta(int posicion);
	/**
	* A�ade la carta indicada por par�metro sobre el mazo
	* @param numCarta (las cartas v�lidas van del 1 al 40)
	* @return false si la carta ya existe, true si se a�ade correctamente
	*/
	public boolean ponerCarta(int numCarta);
	/**
	* Devuelve el n�mero de cartas existentes.
	* @return N�mero de cartas actuales en el mazo.
	*/
	public int getNumCartas();
	/**
	* Ordena las cartas existentes en el mazo por palo (oros, copas, espadas y
	* bastos) y dentro de cada palo por puntos.
	*/
	public void ordenar();
}
