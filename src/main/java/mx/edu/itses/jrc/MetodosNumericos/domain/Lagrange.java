/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itses.jrc.MetodosNumericos.domain;

import java.util.ArrayList;
import lombok.Data;

/**
 *
 * @author juras
 */
@Data
public class Lagrange {
  private Integer orden;              
    private ArrayList<Double> xs;       
    private ArrayList<Double> ys;       
    private Double xEval;               
    private Double yEval;        
}
