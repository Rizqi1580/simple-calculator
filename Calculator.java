/**
 * Write a description of class Calculator here.
 *
 * @author Rizqi Ar Rasyid
 * @version 1.0
 */
import java.util.Scanner;
public class Calculator{
    private CalcLogic Logic;

    public Calculator(){
        Logic = new CalcLogic();
    }


    public void calc(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan angka pertama: ");
        float angka1 = scanner.nextFloat();
        
        System.out.println("Masukkan operasi : (+ - / *)");
        char op = scanner.next().charAt(0);
        
        System.out.println("Masukkan angka kedua: ");
        float angka2 = scanner.nextFloat();
        
        float hasil = 0;
        
        if(op == '+')hasil = Logic.tambah(angka1, angka2);
        else if(op == '-') hasil = Logic.kurang(angka1, angka2);
        else if(op == '/') hasil = Logic.bagi(angka1, angka2);
        else if(op == '*') hasil = Logic.kali(angka1, angka2);
        
        System.out.println("" + hasil);
    }
}
