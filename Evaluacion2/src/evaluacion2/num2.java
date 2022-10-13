/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion2;

import java.util.ArrayList;

/**
 *
 * @author labc205
 */
public class num2 {
    private ArrayList<Empleado> myEmple = new ArrayList<Empleado>();
    
    public num2(ArrayList<Empleado> myEmple) {
        this.myEmple = myEmple;
    }

    public num2() {
    }

    public ArrayList<Empleado> getListPersona() {
        return myEmple;
    }

    public void setListPersona(ArrayList<Empleado> listPersona) {
        this.myEmple = myEmple;
    }
    
    public int agregarPersona(double salario, String nom, Cargo s) {
        
        int b = 0;
        Empleado emple = new Empleado(salario, nom, s);
        myEmple.add(emple);
        b = 1;
        return b;
    }
    
    
}
