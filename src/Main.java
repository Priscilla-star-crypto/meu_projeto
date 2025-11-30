//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Filmes f = new Filmes("pear harbor" , "romance", 184, 2001 , 10);
        f.status();
        System.out.println("-------Caracteristicas-------");
        f.metragem();
        f.nnota();

        Filmes f1 = new Filmes("Gladiador 2" , "ação", 60, 2024 , 10);
        f1.status();
        System.out.println("-------Caracteristicas-------");

        f1.metragem();
        f1.nnota();

    }
}