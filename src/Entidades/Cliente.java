/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Telyman
 */
public class Cliente {

    //Atributos
   
    private int id_cliente;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String residencia;
    private boolean existe;
    
    //Constructores
     public Cliente(int id_cliente, String nombre, String apellidos, String telefono, String residencia) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.residencia = residencia;
        this.existe = true;
    }
     public Cliente() {
       this.existe = true;
    }
    
    //Gets y Sets
     public int getId_cliente() {    
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public boolean isExiste() {
        return existe;
    }
    public void setExiste(boolean existe) {
        this.existe = existe;
    }
    
}
