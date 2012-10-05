package ejer;

import java.util.ArrayList;

public class ListaDeElecciones {
	
	private static ListaDeElecciones listaDeElecciones = new ListaDeElecciones();
	
    private ListaDeElecciones() {}
 
    public static ListaDeElecciones getInstance() {
        return listaDeElecciones;
    }
	
	ArrayList<Elecciones> elecciones;
	
	
}
