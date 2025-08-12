
package mx.edu.itses.jrc.MetodosNumericos.domain;

import java.util.ArrayList;
import lombok.Data;

@Data
public class ReglaCramer {
    private int MN; //tamaño de la matriz
    private ArrayList<Double> matrizA;
    private ArrayList<Double> vectorB;
    private ArrayList<Double> vectorX;
    private ArrayList<Double> Determinantes;
    private int NumeroRenglon;
    
    public int IncrementarRenglon(){
    return NumeroRenglon++;
    }
}
