package no.kristoss.myCalender;

import java.util.Scanner;
// I denne oppgaven så valge jeg å bruke en del metoder på utsiden av main for å teste om denne virker.

public class Calender {
    public static void main(String[] args) {

        Calender cal = new Calender();
        cal.scannerYear();
//        Her blir get metoden brukt.
        cal.isLeapYear(cal.getYear());
    }
//Bruker getter og setter til at scanneren skal bruke disse for å
//    endre input i isLeapYear.
    int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int scannerYear(){
        int year;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any Year:");
        year = scan.nextInt();
        scan.close();
//        Her blir setYear metoden brukt.
        setYear(year);
        return year;
    }
    public boolean isLeapYear(int year){

        boolean isLeap = false;

        // Sjekker om kravene er innenfor.
//         Har ikke valgt å gå etter bonus oppgaven på 4000

        if(year % 4 == 0) {
        if( year % 100 == 0) {
            if ( year % 400 == 0)
                isLeap = true;
            else
                isLeap = false;
            }else
            isLeap = true;
             }else {
                 isLeap = false;
              }
              if(isLeap)
            System.out.printf("%d er et skuddår%n", year);
              else
            System.out.printf("%d er ikke et skuddår.", year);



//      Så tilslutt blir verdien returnet til true or false
//        Siden dette er en boolean. Og da går det å bruke dette til testing.
        return isLeap;
    }
}
