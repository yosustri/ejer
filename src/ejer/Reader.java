package ejer;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
	
public class Reader {

		//#######################################################
		//Atributos
		//#######################################################
		private String archivoEn;		//Indica la ruta donde esta el archvio de texto

		//#######################################################
		//Constructor
		//#######################################################
		public	Reader(){
			setArchivoEn();				//Se establece la ubicacion del archvio de texto
		}
		
		//#######################################################
		//Leer palabras
		//#######################################################
		public ArrayList<String> leerArchivo(){
			ArrayList<String> palabras = new ArrayList<String>();
			
			File archivoen = null;
			FileReader fr = null;
			BufferedReader br = null;
			
			try{
				archivoen = new File(getArchivoEn());
				fr = new FileReader(archivoen);
				br = new BufferedReader(fr);
				String fila;
				while((fila=br.readLine())!=null){
					//this.leerLineaDeArchivo(palabras, fila);
				}
			 }catch(Exception e){
				e.printStackTrace();
			 }finally{
				try{
						fr.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			 }
			
			return palabras;
	 
		}
		
		private void leerLineaDeArchivo(ArrayList<Lectura> pLecturas, Lectura Lectura, String pLinea){
			StringTokenizer tokens=new StringTokenizer(pLinea, ";"); //split
		        while(tokens.hasMoreTokens()){
		            String str=tokens.nextToken();
		            str.trim();
		        }
		}
		
		//#######################################################
		//Ruta del fichero Get and Set
		//#######################################################
		public void setArchivoEn(){
			JFileChooser hh = new JFileChooser();
			hh.showOpenDialog(hh);
			this.archivoEn = hh.getSelectedFile().getAbsolutePath().toString();
		}
		
		private String getArchivoEn(){
			return this.archivoEn;
		}
		
		public int busquedaDicotomica(ArrayList<Lectura> lecturas, Lectura lectura){	//Ha de esta ordenado por nombre-apellido

			if(lecturas.size()==0){				//En caso vacio
				return -1;
			}else if(lecturas.size()==1){			//En caso de ser uno
				if((lecturas.get(0).getNombre()+lecturas.get(0).getApellido()).equals((lectura.getNombre()+lectura.getApellido()))){
					return 0; 	
				}else{
					return -1;
				}
			}else{
				
				int L = (lecturas.size()/2);
				int i;
				
				if((lecturas.size()%2)==0){ //paridad
					i = (lecturas.size()/2);
				}else{
					i = (lecturas.size()/2)+1;
				}
				
				int l = (int) (Math.log10(lecturas.size())/Math.log10(2));
				
				while(l>=0){	// de 0 a X-1
					
					i=(i/2);
					
					if((lecturas.get(L-1).getNombre()+lecturas.get(L-1).getApellido()).equals((lectura.getNombre()+lectura.getApellido()))){
						return (L-1);
					}else if((lecturas.get(L-1).getNombre()+lecturas.get(L-1).getApellido()).compareTo((lectura.getNombre()+lectura.getApellido()))>0){ //letras > "2"
						L = (L - i);
					}else if((lecturas.get(L-1).getNombre()+lecturas.get(L-1).getApellido()).compareTo((lectura.getNombre()+lectura.getApellido()))<0){
						L = (L + i);
					}
					
					l--;
					
				}
				
				if(lecturas.get(L).getNombre().equals(lectura.getNombre())){ //X
					return L;
				}
				
				return -1;
			}
			
		}
		
		public boolean esPar(int pN){
			if(pN%2==0){return true;}{return false;}
		}
		
		
}


