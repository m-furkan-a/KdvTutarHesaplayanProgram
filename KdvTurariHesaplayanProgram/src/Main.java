import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    double tutar,kdvOran = 0.18,kdvTutar,kdvliTutar;
	    System.out.print("Para değerini giriniz : ");
	    tutar   = input.nextDouble();

		if (tutar>0 && tutar<1000)
		{
			kdvTutar = tutar*kdvOran;
			kdvliTutar =tutar+kdvTutar;
			System.out.println("KDV 'siz Fiyat : "+tutar);
			System.out.println("KDV 'li Fiyat : "+kdvliTutar);
			System.out.println("KDV Tutarı : "+kdvTutar);
			System.out.println("KDV Oranı : "+kdvOran);
		}
		else if (tutar>= 1000)
		{
			kdvOran = 0.8;
			kdvTutar = tutar*kdvOran;
			kdvliTutar =tutar+kdvTutar;
			System.out.println("KDV 'siz Fiyat : "+tutar);
			System.out.println("KDV 'li Fiyat : "+kdvliTutar);
			System.out.println("KDV Tutarı : "+kdvTutar);
			System.out.println("KDV Oranı : "+kdvOran);
		}
    }
}
