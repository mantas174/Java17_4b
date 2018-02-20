package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 4b.
        //​
        // Paprašyti vartotojo nurodyti kiek skaičių jis ketina įvesti, tuomet duoti jam įvesti tiek
        //skaičių, kiek jis pasirinko. Po įvedimo atvaizduoti tik tuos skaičius kurie buvo didesni nei 100.

        Scanner in = new Scanner(System.in);
        int n;
        ArrayList<Integer> skaiciuSarasas = new ArrayList<Integer>();

        System.out.print("Iveskite kiek noresite ivesti skaiciu: ");
        n = in.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print("Iveskite " + (i+1) + " skaiciu ");
            skaiciuSarasas.add(in.nextInt());
        }


        System.out.println("Skaiciai didesni nei 100");
        for (int sk : skaiciuSarasas){
            if(sk > 100){
                System.out.println(sk);
            }
        }

    }
}
