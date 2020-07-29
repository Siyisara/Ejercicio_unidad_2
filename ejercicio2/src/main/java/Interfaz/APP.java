
package Interfaz;

import javax.swing.JOptionPane;

import Operador.Principal;

public class APP {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principal p = new Principal();
		
		int numero = -1;
		try {
			while(numero != 0) {
				numero = Integer.parseInt(JOptionPane.showInputDialog("Digite lo que desea" + "\n" + "0: Salir                                " + "             1: Agregar Empleado"
						+ "\n" + "2: Eliminar empleado      "+ "             3: Modificar Empleado" + "\n" + "4: Mostrar Empleados    " + "             5: Empleado mayor salario"
								+ "\n" + "6: Empleado menor salario        "+ "7: Ordenar por nombre la lista" + "\n" + "8: Total de Apellidos por 'A'        " +"9: Cinco empleados con mayor salario" + "\n" + "10: Sumatoria salarios mayores a 700k"));
		
				switch (numero) {
				case 1:
					try {
						int id = Integer.parseInt(JOptionPane.showInputDialog("Digite id"));
						String nombre = JOptionPane.showInputDialog("Digite Nombre");
						String apellido = JOptionPane.showInputDialog("Digite Apellido");
						double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite salario"));
						
						if(p.agregar(id, nombre, apellido, salario)) {
							JOptionPane.showMessageDialog(null, "Agregó");
						}
						break;
					}
					catch (Exception e) {
						JOptionPane.showMessageDialog(null, e.getMessage());
					}
					break;
					
				case 2:
					try {
						int id = Integer.parseInt(JOptionPane.showInputDialog("Digite id"));
						if (p.eliminar(id)) {
							JOptionPane.showMessageDialog(null, "Eliminó");
						}
						break;
					}
					catch (Exception e) {
						JOptionPane.showMessageDialog(null, e.getMessage());
					}
					break;
					
				case 3:
					try {
						int id = Integer.parseInt(JOptionPane.showInputDialog("Digite id"));
						String nombre = JOptionPane.showInputDialog("Digite Nombre");
						String apellido = JOptionPane.showInputDialog("Digite Apellido");
						double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite salario"));
						
						if(p.modificar(id, nombre, apellido, salario)) {
							JOptionPane.showMessageDialog(null, "Modificó");
						}
						break;
					}
					catch (Exception e) {
						JOptionPane.showMessageDialog(null, e.getMessage());
					}
					break;
				
				case 4:
					try {
						JOptionPane.showMessageDialog(null, p.mostrar());
						break;
					}
					catch (Exception e) {
						JOptionPane.showMessageDialog(null, e.getMessage());
					}
					break;
					
				case 5:
					try {
						JOptionPane.showMessageDialog(null, p.empleadoConMayorSalario());
					} catch (Exception e) {
						
					}
					break;
					
				case 6:
					try {
						JOptionPane.showMessageDialog(null, p.empleadoConMenorSalario());
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Algo salio mal");
					}
					break;
						
				case 7:
					try {
						JOptionPane.showMessageDialog(null, p.ordenarPorNombre());
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Algo salio mal");
					}
					break;
					
				case 8:
					try {
						JOptionPane.showMessageDialog(null, p.mostrarNumeroTotalDeNombresPorA());
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Algo salio mal");
					}
					break;
				
				case 9:
					try {
						JOptionPane.showMessageDialog(null, p.cincoEmpleadosConMayorSalario());
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Algo salio mal");
					}
					break;
					
				case 10: 
					try {
						JOptionPane.showMessageDialog(null, p.sumaSalariosMayorSiete());
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Algo salio mal");
					}
				}
			}
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Uy! revisa que hiciste amigo");
		}
	}

}
