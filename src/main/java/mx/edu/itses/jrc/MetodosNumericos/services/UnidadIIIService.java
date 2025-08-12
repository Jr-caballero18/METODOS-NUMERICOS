/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.edu.itses.jrc.MetodosNumericos.services;

import mx.edu.itses.jrc.MetodosNumericos.domain.Gauss;
import mx.edu.itses.jrc.MetodosNumericos.domain.ReglaCramer;


public interface UnidadIIIService {
    
    
    public ReglaCramer AlgoritmoReglaCramer(ReglaCramer modelCramer);
    
    public Gauss AlgoritmoGauss(Gauss modelGauss);
}
