import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("Pepe", Genero.MASCULINO, LocalDate.of(1995, 3, 2));
        Atleta atleta2 = new Atleta("Antonio", Genero.MASCULINO, LocalDate.of(1997,2,9),LocalDate.of(2010,5,10),LocalDate.of(2022,6,11));
        Atleta atleta3 = new Atleta("Juana",Genero.FEMENINO, LocalDate.of(1978,7,2),LocalDate.of(2012,11,6));
        atleta2.estaActivo(LocalDate.of(2015 , 8, 7));
        System.out.println(atleta1.getGenero());


    }
}
