package telefondzwoniinterface;

import java.util.Random;

public class Telefon implements Dzwoni {

    protected String numerTelefonu;
    int lacznyCzasRozmowy;

    public void zadzwon(String numerTelefonu) {
        int czasJednejRozmowy;
        int odebrane;
        Random random = new Random();


        odebrane = random.nextInt(100);

        if (odebrane<= 10){
            System.out.println("Telefon nie odbiera");
        } else {
            System.out.println("Hallo, tutaj " + numerTelefonu +  " słucham, kto mówi?");
            czasJednejRozmowy = random.nextInt(20)+ 1;
            System.out.println("czas jednej rozmowy " + czasJednejRozmowy);
            lacznyCzasRozmowy = lacznyCzasRozmowy + czasJednejRozmowy;
        }

    }

    public void zadzwonNaNrAlarmowy() {
        System.out.println("Hallo tu numer alarmowy. W czym mogę pomóc");
    }
}
