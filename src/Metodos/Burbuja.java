package Metodos;


public class Burbuja {
    public static void ordBurbuja (long a[])
    {
        int interruptor = 1;
        int pasada, j;
        int n = a.length;
        
        for(pasada = 0; pasada < n-1 &&  interruptor != 0; pasada++)
        {
            interruptor = 0;
            for(j=0; j< n-pasada-1;j++)
            {
                if(a[j] > a[j+1])
                {
                    long aux;
                    interruptor = 1;
                    aux = a[j];
                    a[j] = a[j+1];
                    a[j+1] = aux;
                }
            }
        }
    }
    
    public static void imprimir(long a[])
    {
        for(int i =  0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}
