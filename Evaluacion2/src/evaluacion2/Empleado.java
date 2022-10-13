/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion2;

/**
 *
 * @author labc205
 */
public class Empleado {
    private String nombre;
    private double salario;
    private Cargo cargo;

    public Empleado() {
    }

    public Empleado(double salario, String nombre, Cargo cargo) {
        this.nombre = nombre;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", salario=" + salario + ", cargo=" + cargo + '}';
    }

    
    
    
}


