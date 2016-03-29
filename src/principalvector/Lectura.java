package principalvector;

import javax.swing.JOptionPane;

public class Lectura 
{
    public static int leerEntero(String msj)
    {
        String temp;
        int num, res = 0;
        while(true)
        {
           try
            {
                do
                {
                  temp = JOptionPane.showInputDialog(msj);
                    if(temp == null)
                    {
                        res = JOptionPane.showConfirmDialog(null, "Seguro que desea cerrar");
                        if(res == 0)
                        {
                        System.exit(0); 
                    }
                }  
                }while(res == 1);
                
                num = Integer.parseInt(temp);
                return num;
                //return Integer.parseInt(JOptionPane.showInputDialog(msj));
            }catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(null, "Error en el dato ingresado");
            }
        }
        
    }
}
