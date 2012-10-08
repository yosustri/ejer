package ejercico;

public class Candidato {
private String nombre;
private String apellido;
private Partido partido;
private ListaDistritos distrito;

public Candidato(String pNombre, String pApellido, Partido pPartido){//, ListaDistritos pDistrito){
this.setNombre(pNombre);
this.setApellido(pApellido);
this.setPartido(pPartido);

}

public ListaDistritos getDistrito() {
return distrito;
}

public void setDistrito(ListaDistritos pDistrito) {
this.distrito = pDistrito;
}

public String getNombre() {
return nombre;
}
public void setNombre(String nombre) {
this.nombre = nombre;
}
public String getApellido() {
return apellido;
}
public void setApellido(String apellido) {
this.apellido = apellido;
}
public Partido getPartido() {
return partido;
}
public void setPartido(Partido partido) {
this.partido = partido;
}
public int compareTo (Candidato c1)
{
	return (this.getApellido()+this.getNombre()).compareTo(c1.getApellido()+c1.getNombre());
}
}

