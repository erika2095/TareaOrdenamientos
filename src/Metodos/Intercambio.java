package Metodos;


public class Intercambio {
    public static void intercambiar(int []a, int i, int j)
    {
        int aux = a[i];
        a[i] = a[j];
        a[j] = aux;
    }
    
    public static void ordIntercambio(int a[])
    {
        int i, j;
        for(i = 0; i < a.length-1; i++)
        {
            // SITUA MINIMO DE A[I+1]...A[N-1] EN A[I]
            for(j = i+1; j < a.length; j++)
            {
                if(a[i] > a[j])
                {
                    intercambiar(a, i, j);
                }
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
