package co.edu.uniquindio.poo;

public enum Especialidad{

    ODONTOLOGIA_GENERAL(0), ORTODONCIA(1), ENDODONCIA(2), CIRUGIA_ORAL(3);

    private final int valor;

    Especialidad(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return valor;
    }

}
