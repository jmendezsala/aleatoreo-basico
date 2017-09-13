package aleatorios;

import java.util.Random;


public class Aleatorios {

    public static void main(String[] args) {
        int i=0, cantidad=10, rango=10;
        int arreglo[] = new int[cantidad];
        
        arreglo[i]=(int)(Math.random()*rango);
        for(i=1; i<cantidad; i++){
            arreglo[i]=(int)(Math.random()*rango);
            for(int j=0; j<i; j++){
                if(arreglo[i]==arreglo[j]){
                    i--;
                }
            }
        }
        
        for(int k=0; k<cantidad; k++){
            System.out.print((k+1)+".- "+arreglo[k]+"\n");
        }
    }
    
}
