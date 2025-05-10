package co.edu.uniquindio.poo;

public class Odontologo{
    private String id;
    private String nombre;
    private String licenciaProfecional;
    private Especialidad especialidad;

    public Odontologo(String id, String nombre, String licenciaProfecional, Especialidad especialidad){
        this.id = id;
        this.nombre = nombre;
        this.licenciaProfecional = licenciaProfecional;
        this.especialidad = especialidad;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLicenciaProfecional() {
        return licenciaProfecional;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    @Override
    public String toString(){
        return nombre + "( " + especialidad + "). Numero de licencia: " + licenciaProfecional + ". ID: " + id;
    }
}