package ejercico;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaCandidatos {

private ArrayList<Candidato> candidatos;
private static ListaCandidatos miLista=new ListaCandidatos();

private ListaCandidatos(){
this.candidatos=new ArrayList<Candidato>();
}

public static ListaCandidatos getListaCandidatos()
{
return miLista;
}

private ArrayList<Candidato> getLista() {
return candidatos;
}

public int getTamano()
{
return ListaCandidatos.getListaCandidatos().getLista().size();
}
private Iterator<Candidato> getIterador()
{
return ListaCandidatos.getListaCandidatos().getLista().iterator();
}
public int  buscarCandidato(Candidato pCandidato)
{	
	Candidato unCandidato;
	int min,mitad,max;
	min=0;
	max=this.getTamano()-1;
	mitad=0;
	mitad=(int)(max+min)/2;   	//Redondea a lo bajo
	unCandidato=this.getLista().get(mitad);
	if(this.getTamano()==1&&this.getLista().get(0).compareTo(pCandidato)>0)
	{
		return 0;
	}
	while (min<=max)
	{
		
		if(unCandidato.compareTo(pCandidato)<0)
		{
			min=mitad+1;
		}
		else if (unCandidato.compareTo(pCandidato)>0) 
		{
			max=mitad-1;	
		}
		else
		{
			return mitad;
		}
		mitad=(int)(max+min)/2;
		unCandidato=this.getLista().get(mitad);
	}
	return mitad+1;
}

    
    
public void agregarCandidato(Candidato pCandidato){//Ordenadamente
    if (this.getTamano()==0)
    {
    	ListaCandidatos.getListaCandidatos().getLista().add(0,pCandidato);
    }
    else
    {
	int indice =this.buscarCandidato(pCandidato);
	//System.out.println(indice);
	ListaCandidatos.getListaCandidatos().getLista().add(indice,pCandidato);
    }
    }
    
public void eliminarCandidato(Candidato pCandidato){
	int indice=ListaCandidatos.getListaCandidatos().buscarCandidato(pCandidato);
	if(ListaCandidatos.getListaCandidatos().getTamano()==0){
		System.out.println("Lista vacia imposible borrar");
		}
	else if (ListaCandidatos.getListaCandidatos().getLista().get(indice).compareTo(pCandidato)==0) 
		{	
		ListaCandidatos.getListaCandidatos().getLista().remove(indice);	
			}
		else
			{
			System.out.println("No existe ese candidato");
			}
    }

public void imprimirLista()
{
	Candidato unCandidato;
	Iterator<Candidato> it=this.getIterador();
	while(it.hasNext())
	{
		unCandidato=it.next();
		System.out.println(unCandidato.getApellido()+" "+unCandidato.getNombre());
	}
}
public boolean estaEnLista(Candidato pCandidato)
{
	int indice =this.buscarCandidato(pCandidato);
	if(ListaCandidatos.getListaCandidatos().getLista().get(indice).compareTo(pCandidato)==0)
	{
		return true;
	}
	return false;
}
}
