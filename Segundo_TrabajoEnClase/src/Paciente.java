package src;

public class Paciente {

    private String nombre;
    private String apellido;
    private String tipoSeguro;
    private double peso;

    public Paciente(){

    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public String getTipoSeguro(){
        return tipoSeguro;
    }

    public double getPeso(){
        return peso;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void SetApellido(String apellido){
        this.apellido = apellido;
    }

    public void setTipoSeguro(String tipoSeguro){
        this.tipoSeguro = tipoSeguro;
    }

    public void setPeso( double peso){
        this.peso = peso;
    }

}
