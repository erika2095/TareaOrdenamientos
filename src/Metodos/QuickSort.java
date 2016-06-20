package Metodos;


public class QuickSort {
    public static void quicksort(int vector[], int izq, int der)
    {
        int privote = vector[izq];
        int i = izq;
        int d = der;
        int aux;
        
        while(i<d)
        {
            while(vector[d] > privote)
            {
                d--;
            }
            while(vector[i] <= privote && i < d)
            {
                i++;
            }
            if(i<d)
            {
                aux = vector[i];
                vector[i] = vector[d];
                vector[d] = aux;
            }
        }
        vector[izq] = vector[d];
        vector[d] = privote;
        if(izq < d -1)
        {
            quicksort(vector, izq, d-1);
        }
        if(d + 1 < der)
        {
            quicksort(vector, d+1, der);
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
