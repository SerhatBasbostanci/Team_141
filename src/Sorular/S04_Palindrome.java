package Sorular;

import java.util.Scanner;

public class S04_Palindrome {


    public static void main(String[] args) {

        Scanner scan = new Scanner ( System.in );
        System.out.println ("Lutfen palindrome olup olmadigi kontrol edilecek bir cumle giriniz ");
        String input = scan.nextLine ();
        boolean sonuc = palindromeKontrolEt(input);
        System.out.println (sonuc);

    }

    private static boolean palindromeKontrolEt(String input) {

        if (input.length () == 0 || input.length () == 1 ){
            return true;
        }else{
            if (input.substring (0,1).equalsIgnoreCase ( input.substring ( input.length()-1 ) )){
                return palindromeKontrolEt ( input.substring(1,(input.length ()-1))) ;

                }else{
                    return false;
                }
            }
        }



    }



