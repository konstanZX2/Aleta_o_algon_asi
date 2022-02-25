import java.time.LocalDate;

public class Atleta {
    public String nombre;

    public Atleta(String nombre, Genero genero, LocalDate nacimiento) {
        this(nombre, genero, nacimiento, null, null);
    }

    public Atleta(String nombre, Genero genero, LocalDate nacimiento, LocalDate fechaDebut) {
        this(nombre, genero, nacimiento, fechaDebut, null);
    }

    public Atleta(String nombre, Genero genero, LocalDate nacimiento, LocalDate fechaDebut, LocalDate finCarrera) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.fechaDebut = fechaDebut;
        this.finCarrera = finCarrera;
        this.genero = genero;
    }

    public LocalDate nacimiento;
    public LocalDate fechaDebut;
    public LocalDate finCarrera;

    Genero genero;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public LocalDate getFechaDebut() {
        return fechaDebut;
    }

    public void setFechaDebut(LocalDate fechaDebut) {
        this.fechaDebut = fechaDebut;
    }

    public LocalDate getFinCarrera() {
        return finCarrera;
    }

    public void setFinCarrera(LocalDate finCarrera) {
        this.finCarrera = finCarrera;
    }

    public Enum getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    int edad() {
        return 0;
    }

    boolean debutar(LocalDate fechaDebut) {
        if (fechaDebut != null)
            return false;

        this.fechaDebut = fechaDebut;
        return true;
    }

    boolean retirar(LocalDate finCarrera) {
        if(finCarrera != null)
            return false;

        this.finCarrera = finCarrera;
        return true;
    }

    boolean estaActivo(LocalDate fecha) {
        if (finCarrera.isAfter(fecha) && fechaDebut.isBefore(fecha) && fechaDebut ){
            return true;

        }

    }

    int diasActivo(LocalDate dias) {
        return 0;
    }
}
