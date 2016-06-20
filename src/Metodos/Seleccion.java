package Metodos;


public class Seleccion {
    
    public static void intercambiar(int []a, int i, int j)
    {
        int aux = a[i];
        a[i] = a[j];
        a[j] = aux;
    }
    
    public static void ordSeleccion(int a[])
    {
        int indiceMenor, i, j, n;
        n = a.length;
        
        for(i = 0; i < n-1; i++)
        {
            // comienzo la exploacion en indice i
            indiceMenor = i;
            // j explora la sublista a[i+1]...a[n-1]
            for(j = i+1; j < n; j++)
            {
                if(a[j] < a[indiceMenor])
                    indiceMenor = j;
                
                //situa el elemento mas pequenio en a[i]
                
                if(i != indiceMenor)
                    intercambiar(a, i, indiceMenor);
            }
        }
    }
    
    public static void imprimir(int a[])
    {
        for(int i =  0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}
