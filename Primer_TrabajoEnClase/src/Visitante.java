public class Visitante {
    
    private String nombre;
    private String cedula;
    private int edad;


    public Visitante(){
        setEdad(0);
        setNombre("");
        setCedula("");
    }

    public Visitante(int edad, String nombre, String cedula){
        setEdad(edad);
        setNombre(nombre);
        setCedula(cedula);
    }


    public String getNombre(){
        return nombre;
    }

    public String getCedula(){
        return cedula;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

     public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public void setCedula(String cedula){
        this.cedula= cedula;
    }

}
