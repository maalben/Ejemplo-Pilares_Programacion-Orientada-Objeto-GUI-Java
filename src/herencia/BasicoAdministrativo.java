/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import clases.Valores;
import interfaces.ISalario;

/**
 *
 * @author usuario
 */
public class BasicoAdministrativo extends Valores implements ISalario {

    @Override
    public double calcular() {
        return (this.getHorasTrabajadas() * this.getValorHora() + 500000);
    }    
    
    @Override
    public String realizarFuncion(String funcion){
        return "Realizar funciones " + funcion;
    }

}
