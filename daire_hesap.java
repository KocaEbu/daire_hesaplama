import java.util.Scanner;

public class daire_hesap {
    public static void main(String[] args) {

        double r, pi=3.14,alpha;
        double alan,cevre;
        Scanner input= new Scanner(System.in);

        System.out.print("Dairenin yari capini giriniz: ");
        r= input.nextDouble();

        System.out.print("Bulmak istediginiz daire alaninin acisini giriniz: ");
        alpha= input.nextDouble();

        alan=(pi*r*r*alpha)/360;
        cevre=2*pi*r;

        System.out.println("Yari cap = "+r);
        System.out.println("Aci = "+alpha);
        System.out.println("Alan="+alan);
        System.out.println("Cevre="+cevre);


    }

}
