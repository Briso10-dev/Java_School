package lista;


public class TestLista {

	public static void main(String[] args) {
		Lista lista = new Lista(); 

		
		lista.insertarAlFrente( -1 );
		System.out.println(lista.toString());
		lista.insertarAlFrente( 0 );
		System.out.println(lista.toString());
		lista.insertarAlFinal( 1 );
		System.out.println(lista.toString());
		lista.insertarAlFinal( 5 );
		System.out.println(lista.toString());



		Object objetoEliminado = lista.borrarPrimero();
		System.out.printf( "%s eliminado\n", objetoEliminado );
		System.out.println(lista.toString());

		objetoEliminado = lista.borrarPrimero();
		System.out.printf( "%s eliminado\n", objetoEliminado );
		System.out.println(lista.toString());

		objetoEliminado = lista.borrarUltimo();
		System.out.printf( "%s eliminado\n", objetoEliminado );
		System.out.println(lista.toString());

		objetoEliminado = lista.borrarUltimo();
		System.out.printf( "%s eliminado\n", objetoEliminado );
		System.out.println(lista.toString());


	}

}
