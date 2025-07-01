
package mx.edu.itses.jrc.MetodosNumericos.domain;
import lombok.Data;

@Data
public class NewtonRaphson {
 private String FX;
 private double Xi;
 private double FXi;
 private String DFXi;
 private double Xi1;
 private double Ea;
 private int IteracionesMaximas;
 
}
