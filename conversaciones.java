package perso;
public class conversaciones{

    public static void main(String[] arg){
        
        persona objPersona1 = new persona("Brayan", "M", 18, "ICINF",2,"Prueba");
        //System.out.println("Su nombre es: " + objPersona1.getnombre());
        objPersona1.carnet();
        objPersona1.razon();
        objPersona1.kstudi();

        System.out.println("********************");
        
        persona objPersona2 = new persona("Alvaro", "M", 19, "ICI", 4 ,"Repaso");
        objPersona2.carnet();
        objPersona2.razon();
        objPersona2.kstudi();
    }
}