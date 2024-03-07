package example.demo;

import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Tính điểm trung bình và xếp loại
        double html,css,javascript;
        System.out.println("Nhập điểm HTML");
        html = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập điểm Css");
        css = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập điểm Javascript");
        javascript = Double.parseDouble(sc.nextLine());

        // tih điểm trung bình
        double avgMark = (css+html+javascript)/3;
        System.out.println("DTB : "+avgMark);
        if (avgMark>=0 && avgMark<5){
            System.out.println("Học sinh yêu");
        }else if (avgMark<7){
            System.out.println("Hoc sinh trung bình");
        }else if (avgMark<8){
            System.out.println("Hoc sinh khá");
        }else if (avgMark<9){
            System.out.println("Hoc sinh giỏi");
        }else {
            System.out.println("Học sinh xuất sắc");
        }
    }
}
