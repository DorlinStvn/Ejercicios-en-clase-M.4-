package model;

public class Personajes {

    private String nombre;
    private String raza;
    private int nivelPoder;
    private String planetaOrigen;
    private String tecnicaEspecial;
    private int edad;

    public Personajes(String nombre, String raza, int nivelPoder, String planetaOrigen, String tecnicaEspecial, int edad) 
    {
        this.nombre = nombre;
        this.raza = raza;
        this.nivelPoder = nivelPoder;
        this.planetaOrigen = planetaOrigen;
        this.tecnicaEspecial = tecnicaEspecial;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getNivelPoder() {
        return nivelPoder;
    }

    public void setNivelPoder(int nivelPoder) {
        this.nivelPoder = nivelPoder;
    }

    public String getPlanetaOrigen() {
        return planetaOrigen;
    }

    public void setPlanetaOrigen(String planetaOrigen) {
        this.planetaOrigen = planetaOrigen;
    }

    public String getTecnicaEspecial() {
        return tecnicaEspecial;
    }

    public void setTecnicaEspecial(String tecnicaEspecial) {
        this.tecnicaEspecial = tecnicaEspecial;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
Personajes Krilin = new Personajes(
        "Krilin",
        "Humano",
        850,
        "Tierra",
        "Kienzan",
        35
 
);
}