public class Main {
    public static void main(String[] args) throws Exception {
        Persona persona = new Persona();
        persona.setEdad(33);
        persona.setNombre("deyner oliver");
        persona.setTelefono("+57 3113322258");
        System.out.println("Su nombre es: "+persona.getNombre());
        System.out.println("Su edad es: "+persona.getEdad());
        System.out.println("Su Telefono es: "+persona.getTelefono());
       
    }
}
class Persona{
    private int edad;
    private String nombre;
    private String telefono;
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }
}