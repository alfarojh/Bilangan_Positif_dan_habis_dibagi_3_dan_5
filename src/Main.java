import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bilangan = scanner.nextInt();

        System.out.println(cekKondisi(bilangan));
    }
    // function untuk mengecek bilangan termasuk positif dan habis dibagi 3 dan 5
    public static String cekKondisi(int bil){
        /* Jika bil diatas 0 akan dianggap bilangan positif
        * bil % 15 merupakan gabungan dari bil % 3 && bil % 5*/
        if(bil > 0 && bil % 15 == 0){
            return "Bilangan " + bil + " memenuhi kondisi";
        } else{
            return "Bilangan " + bil + " tidak memenuhi kondisi";
        }

    }
}