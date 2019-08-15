package instrumentalnyinterface;

public class Main {

    public static void main(String[] args) {

        Pianino pianino = new Pianino();
        Instrumentalny gitara = new Gitara();
        Beben beben = new Beben();

        pianino.graj();
        gitara.graj();
        beben.graj();
    }
}
