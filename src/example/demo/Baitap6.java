package example.demo;

import java.util.Scanner;

public class Baitap6 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("NNhap so dien dau thang ");
        int dau = Integer.parseInt(sc.nextLine());
        System.out.println("NNhap so dien cuối thang ");
        int cuoi = Integer.parseInt(sc.nextLine());
        // tính số iện tiêu thu
        int used = cuoi - dau;
        int rank  = used/50;
        int mod = used%50;

        // tinnh số ddienj theo rank  50(tổng các mư tiêu thụ đến rank đó)
        int tongNguyen = 50*(rank*(2*10000+(rank-1)*5000)/2);
        int tongDu = (10000+rank*5000) * mod;

        System.out.println("tổng số diẹn = "+(tongNguyen+tongDu));
    }
}
