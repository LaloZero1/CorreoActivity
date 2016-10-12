/**
 * Created by Lalo on 10/10/2016.
 */
public class Usuario {
    private int id;
    private String nombre;
    private int edad;
    private float altura;
    private boolean activo;

    public Usuario(){

        id = 0;
        nombre = "";
        edad = 0:
        altura = 0f;
        activo = false;
    }

    public Usuario(int id) {
        this.id = id;
        nombre = "";
        edad = 0:
        altura = 0f;
        activo = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
