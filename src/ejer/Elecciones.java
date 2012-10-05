package ejer;

public class Elecciones {

	String pais;
	String año;
	ListaCandidatos listaCandidatos;
	TipoDeEleccion tipoEleccion;
	
	public  Elecciones(String pPais, String pAño, ListaCandidatos pListaCandidatos, TipoDeEleccion pTipoEleccion){
		setPais(pPais);
		setAño(pAño);
		setListaCandidatos(pListaCandidatos);
		setTipoEleccion(pTipoEleccion);
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getAño() {
		return año;
	}

	public void setAño(String año) {
		this.año = año;
	}

	public ListaCandidatos getListaCandidatos() {
		return listaCandidatos;
	}

	public void setListaCandidatos(ListaCandidatos listaCandidatos) {
		this.listaCandidatos = listaCandidatos;
	}

	public TipoDeEleccion getTipoEleccion() {
		return tipoEleccion;
	}

	public void setTipoEleccion(TipoDeEleccion tipoEleccion) {
		this.tipoEleccion = tipoEleccion;
	}
	
	
	
}
