package telefondzwoniinterface;

public class Main {
    public static void main(String[] args) {

        Telefon telefon = new Telefon();


        telefon.zadzwon("Alicja");
        telefon.zadzwon("Pjoter");
        telefon.zadzwon("Karyna");
        telefon.zadzwonNaNrAlarmowy();


        System.out.println("Total time of call " + telefon.lacznyCzasRozmowy);
    }
}
