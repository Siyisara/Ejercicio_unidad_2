
package Interfaz;

import javax.swing.JOptionPane;

import Operador.Principal;

public class APP {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principal p = new Principal();
		
		int numero = 0;
		while(numero != 5) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite lo que desea" + "\n" + "1: Agregar Empleado"
					+ "\n" + "2: Eliminar empleado" + "\n" + "3: Modificar Empleado" + "\n" + "4: Mostrar Empleados" + "\n" + "5: Salir"));
			
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
				break;
			}
		}

	}

}
