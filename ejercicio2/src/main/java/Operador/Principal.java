
package Operador;
import java.util.ArrayList;
import java.util.Comparator;

public class Principal {
    private ArrayList<Empleado> lista;

	public Principal() {
		
		private ArrayList<Empleado> lista;

	public Principal() {
		
		lista = new ArrayList<Empleado>();
		lista.add(new Empleado( 1,"Diego", "Melo", 1200000.0));
        lista.add(new Empleado(2, "Wilson", "Calderón", 1300000.0));
        lista.add(new Empleado(10,"Dayana", "Ovalle",  500000.0));
        lista.add(new Empleado(4,"Sebastián", "Alarcón",  200000.1));
        lista.add(new Empleado(11,"Julián", "Muñoz",  400000.1));
        lista.add(new Empleado(15,"Santiago", "Goyes",  300000.5));

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
	
	public String empleadoConMayorSalario() {
		return lista.stream()
                .max(Comparator.comparing(Empleado::getSalario))
                .map(Empleado::toString)
                .orElse("No hay empleados");
	}
	
	public String empleadoConMenorSalario() {
		return lista.stream()
                .min(Comparator.comparing(Empleado::getSalario))
                .map(Empleado::toString)
                .orElse("No hay empleados");
	}
	
	public String ordenarPorNombre() {
		String res = "";
		res = lista.stream()
        .sorted(Comparator.comparing(Empleado::getNombre))
        .map(Empleado::toString)
        .reduce(" ", (a,b) -> {
        	return a+"\n"+b; 
        });
		
		return res;
	}
	
	public long mostrarNumeroTotalDeNombresPorA() {
		return lista.stream()
        .filter(empleado -> empleado.getApellido().toUpperCase().startsWith("A"))
        .count();
		
	}
	
	public String cincoEmpleadosConMayorSalario() {
		 return lista.stream()
                .sorted(Comparator.comparing(Empleado::getSalario).reversed())
                .map(Empleado::toString)
                .limit(5)
                .reduce(" ", (a,b) -> {
                	return a+"\n"+b; 
                });
	}
	
	public double sumaSalariosMayorSiete() {
		return lista.stream().filter((lista) -> {
			return lista.getSalario() > 700000;
		})
		.map(Empleado::getSalario)
		.reduce(0.0, (a,b) ->{
			return a+b;
		});
	}
	
	public String mostrar() {
		String res  = "";
		for (int i = 0; i < lista.size(); i++) {
			res += lista.get(i).toString() + "\n";
		}
		return res;
	}
}
