
package Operador;
import java.util.ArrayList;

public class Principal {
    private ArrayList<Empleado> lista;

	public Principal() {
		
		lista = new ArrayList<Empleado>();

	}
	
	public ArrayList<Empleado> darLista(){
		return lista;
	}
	
	public Empleado buscarEmpleado( int id ) {
		
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == id) {
				return lista.get(i);
			}
		}
		return null;
	}
	
	public boolean agregar(int id, String nombre, String apellido, double salario) throws Exception {
		if (buscarEmpleado(id) != null) {
			throw new Exception("No se puede agregar por que ya existe el id");
		}
		else {
			Empleado nuevo = new Empleado(id, nombre, apellido, salario); 
			lista.add(nuevo);
			return true;
		}
	}
	
	
	public boolean eliminar( int id) throws Exception{
		Empleado eliminar = buscarEmpleado(id);
		if (eliminar != null) {
			lista.remove(eliminar);
			return true;
		}
		else {
			throw new Exception("No existe el empleado que desea eliminar, revise que no se haya eliminado antes o que el id sea el correcto");
		}
	
	}
	
	
	public boolean modificar(int id, String nombre, String apellido, double salario)throws Exception {
		
		Empleado amodificar = buscarEmpleado(id);
		if (amodificar != null) {
			amodificar.setNombre(nombre);
			amodificar.setApellido(apellido);
			amodificar.setSalario(salario);
			return true;
		}
		else {
			throw new Exception("No existe, no se puede continuar");
		}
		
	}
	
	
	public String mostrar() {
		String res  = "";
		for (int i = 0; i < lista.size(); i++) {
			res += lista.get(i).toString() + "\n";
		}
		return res;
	}
}
