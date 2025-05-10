package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Consultorio consultorio = new Consultorio("Consultorio UQ", "123456789");

        Odontologo odontologo1 = new Odontologo("OD001", "Dr. Juan Pérez", "LIC12345", Especialidad.ORTODONCIA);
        Odontologo odontologo2 = new Odontologo("OD002", "Dra. Ana Gómez", "LIC67890", Especialidad.ENDODONCIA);

        consultorio.getListaOdontologos().add(odontologo1);
        consultorio.getListaOdontologos().add(odontologo2);

        System.out.println(consultorio.registrarPaciente("Carlos López", "P001", 30, "3214567890",
                LocalDate.of(2024, 3, 15), 6, "Calle 123", "Historial sin problemas"));

        System.out.println(consultorio.registrarPaciente("María Torres", "P002", 25, "3209876543",
                LocalDate.of(2024, 1, 20), 3, "Carrera 45", "Historial con ortodoncia"));

        System.out.println(consultorio.registrarPaciente("Carlos López", "P001", 30, "3214567890",
                LocalDate.of(2024, 3, 15), 6, "Calle 123", "Historial sin problemas")); // Intento de duplicado
        

        System.out.println("\nPacientes con más de 5 tratamientos:");
        for (Paciente p : consultorio.obtenerPacientesEspeciales()) {
            System.out.println(p);
        }
    }
}