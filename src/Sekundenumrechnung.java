public class Sekundenumrechnung {

    public static void main (String args[]){

        int minisekunden = 158036522;
        int jahre;
        int minuten;
        int stunden;
        int sekunden;
        int tagen;

        jahre= minisekunden/60/60/24/365;
        sekunden= minisekunden%60;
        minuten= minisekunden/60%60;
        stunden= minisekunden/60/60%24;
        tagen= minisekunden/60/60/24%365;

        System.out.println("Jahre:"+jahre);
        System.out.println("Sekunden:"+sekunden);
        System.out.println("Minuten:"+minuten);
        System.out.println("Stunden:"+stunden);
        System.out.println("Tagen:"+tagen);


    }
}
