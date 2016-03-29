package principalvector;

import javax.swing.JOptionPane;

public class PrincipalVector {
    
    public PrincipalVector()
    {
        int h = 0;
        Lectura lec = new Lectura();
        Vector vector = null;
        int num = 0;
        do
        {
           try
            {
                num = lec.leerEntero("Ingrese el tamaño del vector");
                vector = new Vector(num);
            }catch(NegativeArraySizeException ex)
            {
                JOptionPane.showMessageDialog(null, "El valor no debe ser negativo");
            }
        }while(num < 1);
          //int num =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del vector"));
            
            vector.cargar();
            vector.mostrar();
            vector.ordenar();
            vector.mostrar();
        do        
        {
            //int bus =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a buscar en el vector"));
            int bus = lec.leerEntero("Ingrese el numero a buscar en el vector");
            vector.buscar(bus);  
            h = JOptionPane.showConfirmDialog(null, "Desea volver a buscar de nuevo en el vector");
        }while(h == 0);
         
    }

    public static void main(String[] args) {
        new PrincipalVector();
    }
    
}
