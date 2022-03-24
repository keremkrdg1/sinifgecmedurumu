import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,fiz,türk,kim,müz;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();
        System.out.print("Fizik notunuz : ");
        fiz = input.nextInt();
        System.out.print("Türkçe notunuz : ");
        türk = input.nextInt();
        System.out.print("Kimya notunuz : ");
        kim = input.nextInt();
        System.out.print("Müzik notunuz : ");
        müz = input.nextInt();

        double toplam=0,ders=0;

        if(mat>=0 && mat<=100 )
        {
            toplam = toplam + mat;
            ders++;
        }
        if(fiz>=0 && fiz<=100 )
        {
            toplam = toplam + fiz;
            ders++;
        }
        if(türk>=0 && türk<=100 )
        {
            toplam = toplam + türk;
            ders++;
        }
        if(kim>=0 && kim<=100 )
        {
            toplam = toplam + kim;
            ders++;
        }
        if(müz>=0 && müz<=100 )
        {
            toplam = toplam + müz;
            ders++;
        }
        double ort = toplam / ders;
        if (ort>=55)
        {
            System.out.println("Sınıfı geçtiniz ortalamanız : "+ort);
        }
        else
        {
            System.out.println("Sınıfta kaldınız ortalamanız : "+ort);
        }

    }
}





