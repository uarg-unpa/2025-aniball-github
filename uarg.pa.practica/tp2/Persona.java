package tp2;
public class Persona {
   String nombre;
   String apellido;
   int edad;
   int dni;
// Comento solo para tener un cambio
   public Persona(String nombre, String apellido, int edad, int dni)
   {
    this.nombre=nombre;
    this.apellido=apellido;
    this.edad=edad;
    this.dni=dni;
   }
   public String getNombre(String nombre){
    return nombre;
   }
      
   public String setNombre(String nombre){
    this.nombre=nombre;
    return nombre;
   }
   
   public boolean MayorDeEdad(){
   if (edad>=18)
        return true;
   else
        return false;
   }
 
}

