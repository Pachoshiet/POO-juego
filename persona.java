package perso;

public class persona{
    //atributos
    private String nombre;
    private String Sexo;
    private int edad;
    private String clase;
    private int tiempo;
    private String motivo;
    
    //metodos
public persona(String nombre, String Sexo, int edad, String clase, int tiempo, String motivo){         
    this.nombre = nombre;
    this.Sexo = Sexo;
    this.edad = edad;
    this.clase = clase;
    this.tiempo = tiempo;
    this.motivo = motivo;
}
//accesadores creo que son 
public String getnombre(){
    return nombre;
}
public String getSexo(){
    return Sexo;
}
public int getedad(){
    return edad;
}
public String getclase(){
    return clase;
}
public int gettiempo(){
    return tiempo;
}
public String getmotivo(){
    return motivo;
}

//lo que se va a mostrar en dialogo supongo 
public void carnet(){
    System.out.println("Tome mi carnet");
    System.out.println("Nombre: " + this.getnombre()); 
    System.out.println("Edad: " + this.getedad());
    System.out.println("Genero: " + this.getSexo());
}
public void razon(){
    if(this.getmotivo() =="Prueba"){
        System.out.println("Vine a dar una una prueba");
    }
    else{
        System.out.println("Solo vengo por un repaso");
    }
    System.out.println("Y estare ahi por unas " + this.gettiempo() + " horas");
}

public void kstudi(){
    System.out.println("Vengo a " + this.getclase());
}
}