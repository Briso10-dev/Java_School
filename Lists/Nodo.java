package lista;

public class Nodo {
	private Object dato; 
	private Nodo siguienteNodo; 

	
	public Nodo( Object object ){ 
		this( object, null ); 
	} 

	
	public Nodo( Object object, Nodo nodo ){
		dato = object;    
		siguienteNodo = nodo;  
	} 
	
	
	public Object getObject(){ 
		return dato; 
	} 

	
	public Nodo getSiguienteNodo() {
		return siguienteNodo;
	}


	public void setSiguienteNodo(Nodo nodo) {
		siguienteNodo = nodo;
	} 
}
