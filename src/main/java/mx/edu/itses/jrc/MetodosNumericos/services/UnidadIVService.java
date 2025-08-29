/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.edu.itses.jrc.MetodosNumericos.services;

import mx.edu.itses.jrc.MetodosNumericos.domain.DDNewton;
import mx.edu.itses.jrc.MetodosNumericos.domain.Lagrange;

/**
 *
 * @author juras
 */
public interface UnidadIVService {

        public DDNewton AlgoritmoDDNewton(DDNewton model);
        public Lagrange AlgoritmoLagrange(Lagrange model);
}
