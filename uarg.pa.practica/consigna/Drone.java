public class Drone {
    private String Modelo;
    private int MaxPeso;
    private int Viajes;
    private int Bateria;
    private int Altura;

    public Drone(String Modelo, int MaxPeso, int Viajes, int Bateria, int Altura)
    {
        this.Modelo=Modelo;
        this.MaxPeso=MaxPeso;
        this.Viajes=Viajes;
        this.Bateria=Bateria;
        this.Altura=Altura;
    }


    public int getBateria(){
        return Bateria;
    }
    public boolean Despega(){
        if (Bateria>20){
            return true;
        }
        else{
            return false;
        }
    }
    public void Informe(){
        System.out.println("-Estado del Drone-");
        System.out.println("Modelo:" + Modelo);
        System.out.println("Batería:" + Bateria);
        System.out.println("Cantidad de viajes:" + Viajes);
        
    }
}