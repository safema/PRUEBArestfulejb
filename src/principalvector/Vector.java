package principalvector;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Vector 
{
    private int[] a;
    
    public Vector(int num)
    {
        a = new int[num];
    }
    
    public void cargar()
    {
        Lectura lec = new Lectura();
        for(int i = 0; i < a.length; i++)
        {
            /*a[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la "
                    + "posision numero " + (i + 1) + " del vector"));*/
            a[i] = lec.leerEntero("Ingrese el valor de la "
                    + "posision numero " + (i + 1) + " del vector");
        }
    }
    
    public void mostrar()
    {
        String s = "Vector: ";
        for(int i = 0; i < a.length; i++)
        {
            s = s + " " + a[i];
        }
        JOptionPane.showMessageDialog(null, s);
    }
    
    public void buscar(int d)
    {
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] == d)
                JOptionPane.showMessageDialog(null, "El numero esta en la posision: " + (i+1));
        }
    }
    
    public void ordenar()
    {
        Arrays.sort(a);
    }
}
