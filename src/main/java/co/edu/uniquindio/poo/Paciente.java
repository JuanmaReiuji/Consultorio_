package co.edu.uniquindio.poo;

import java.time.LocalDate;

public record Paciente(String nombre, String id, int edad, String telefono,
                       LocalDate fechaUltimaConsulta, int cantTratamientosRealizados, String direccion,
                       String infoHistoriaClinica){}
