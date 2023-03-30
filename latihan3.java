import java.util.Scanner;
public class Latihan3 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan detik: ");
        int waktuDalamDetik = inputUser.nextInt();
        int second, hari, jam, menit, detik, i;;
                second =3600;
                //For Days
                if(second >=86400)
                {
                    waktuDalamDetik = second /86400;
                    hari = waktuDalamDetik;
                    for(i=1; i<= waktuDalamDetik; i++)
                    {
                        second -=86400;
                    }
                }
                else
                {
                    hari =0;
                }
                //For Hours
                if(second >=3600)
                {
                    waktuDalamDetik = second /3600;
                    jam = waktuDalamDetik;
                    for(i=1; i<= waktuDalamDetik; i++)
                    {
                        second -=3600;
                    }
                }
                else
                {
                    jam =0;
                }
                //For Minutes
                if(second >=60)
                {
                    waktuDalamDetik = second /60;
                    menit = waktuDalamDetik;
                    for(i=1; i<= waktuDalamDetik; i++)
                    {
                        second -=60;
                    }
                }
                else
                {
                    menit =0;
                }
                //For Seconds
                if(second >=1)
                {
                    detik = second;
                }
                else
                {
                    detik =0;
                }
                System.out.println("Days:"+ hari +" Hours:"+ jam +" Minutes:"+ menit +" Seconds:"+ detik);
    }
}