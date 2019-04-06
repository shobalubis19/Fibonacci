/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner s = new Scanner(System.in);
        int n;
        int jml = 0;

        System.out.print("jumlah deret Fibonacci: ");
        n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            int x = cari(i);
            jml += x;
            
        }
        System.out.print(jml);
    }
    
    public static int cari(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return cari(n - 1) + cari(n - 2);
        }
    }
    
}
