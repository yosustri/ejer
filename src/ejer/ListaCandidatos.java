package ejercico;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaCandidatos {

	public static void main(String[] args) 
	{
	 Candidato c1,c2,c3,c4,c5;
	 Partido p1;
	// Distrito d1;
	//ListaDistritos listd1;
	Municipio m1;

		m1=new Municipio("Barakaldo");
		p1=new Partido("PNV");
		//d1=new Distrito("0001",m1);
		c1=new Candidato("Pepe", "Alvarez",p1);
		c2=new Candidato("Ana", "Arenaza", p1);
		c3=new Candidato("Maria", "Bonilla", p1);
		c4=new Candidato("Juana", "Zapata", p1);
		c5=new Candidato("Pedro", "Alvarez", p1);
		miLista.agregarCandidato(c5);
		miLista.agregarCandidato(c1);
		miLista.agregarCandidato(c4);
		miLista.agregarCandidato(c2);
		miLista.agregarCandidato(c3);
		miLista.eliminarCandidato(c1);
		/*miLista.eliminarCandidato(c2);
		miLista.eliminarCandidato(c3);
		miLista.eliminarCandidato(c4);*/
		miLista.imprimirLista();
	}  

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
boolean enc=false;
min=0;
max=this.getTamano()-1;
mitad=(int)(max+min)/2;   	//Redondea a lo bajo
unCandidato=this.getLista().get(mitad);
if(this.getTamano()==1&&this.getLista().get(0).compareTo(unCandidato, pCandidato)>0)
{
	return 0;
}
while (!enc)
{
	if(unCandidato==pCandidato)
	{
		enc=true;
		return mitad;
	}
		if(unCandidato.compareTo(unCandidato, pCandidato)<0)
	{
		min=mitad+1;
	}
	else
	{
		max=mitad-1;
	}
	mitad=(int)(max+min)/2;
	unCandidato=this.getLista().get(mitad);
	if(min>max)
	{
		return mitad+1;
	}
}
return -1;
}

    
    
public void agregarCandidato(Candidato pCandidato){//Ordenadamente
    if (this.getTamano()==0)
    {
    	ListaCandidatos.getListaCandidatos().getLista().add(0,pCandidato);
    }
    else
    {
	int indice =this.buscarCandidato(pCandidato);
	ListaCandidatos.getListaCandidatos().getLista().add(indice,pCandidato);
    }
    }
    
public void eliminarCandidato(Candidato pCandidato){
	if(this.getTamano()==0){
		System.out.println("Lista vacia imposible borrar");
		}
	else{
		int indice=this.buscarCandidato(pCandidato);
		if(this.getLista().get(indice)!=pCandidato)
			{
			System.out.println("No existe ese candidato");
			}
		else
			{
			ListaCandidatos.getListaCandidatos().getLista().remove(indice);	
			}
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
}
