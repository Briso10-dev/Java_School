package lista;

public class Lista {
	private Nodo primerNodo;
	private Nodo ultimoNodo;
	private String nombre; 


	public Lista(){ 
		this( "*lista*" ); 
	} 


	public Lista( String nombreLista ){
		nombre = nombreLista;
		primerNodo = ultimoNodo = null;
	} 

	public boolean estaVacia(){ 
		return primerNodo == null; 
	} 

	

	public void insertarAlFrente( Object nodoAInsertar ){
		if ( estaVacia() ) {
			ultimoNodo = new Nodo( nodoAInsertar );
			primerNodo = ultimoNodo;
		}
		else {
			primerNodo = new Nodo( nodoAInsertar, primerNodo );
		}
	} 


	public void insertarAlFinal( Object nodoAInsertar ){
		if ( estaVacia() ) {
			ultimoNodo = new Nodo( nodoAInsertar );
			primerNodo = ultimoNodo;
		}
		else {
			ultimoNodo.setSiguienteNodo(new Nodo( nodoAInsertar ));
			ultimoNodo = ultimoNodo.getSiguienteNodo();
		}
	} 


	public Object borrarPrimero() {
		Object datoBorrado = null;
		if ( !estaVacia() ) {
			datoBorrado = primerNodo.getObject(); 
			if ( primerNodo == ultimoNodo ){
				primerNodo = null;
				ultimoNodo = null;
			}
			else{
				primerNodo = primerNodo.getSiguienteNodo();
			}
		}
		return datoBorrado; 
	} 


	public Object borrarUltimo() {
		Object nodoBorrado = null;
		if ( !estaVacia() ) {
			nodoBorrado = ultimoNodo.getObject(); 

			if ( primerNodo == ultimoNodo ) {
				primerNodo = null;
				ultimoNodo = null;
			}
			else{ 
				Nodo actual = primerNodo;

				while ( actual.getSiguienteNodo() != ultimoNodo ){
					actual = actual.getSiguienteNodo();
				}

				ultimoNodo = actual; 
				actual.setSiguienteNodo(null);
			} 
		}
		return nodoBorrado; 
	} 

	
	public String toString(){
		if ( estaVacia() ) 		{
			return String.format( "La lista %s esta vacia\n", nombre );
		} 
		else {
			String cadena = String.format("El contenido de la lista %s es: ", nombre );
			
			Nodo actual = primerNodo;

			while ( actual != null ) {
				cadena = cadena + String.format( "%s ", actual.getObject() );
				actual = actual.getSiguienteNodo();
			} 

			return cadena;
		}
	} 
}
