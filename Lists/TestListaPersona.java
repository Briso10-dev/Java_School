package lista;


public class TestListaPersona {

	public static void main(String[] args) {
		Lista lista = new Lista("Lista de personas"); 


		lista.insertarAlFrente( new Persona("La primera", 20, 170) );
		System.out.println(lista.toString());
		lista.insertarAlFrente( new Persona("La segunda", 21, 171) );
		System.out.println(lista.toString());
		lista.insertarAlFinal( new Persona("La tercera", 22, 172) );
		System.out.println(lista.toString());
		lista.insertarAlFinal( new Persona("La cuarta", 23, 173) );
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
