package example.demo;

import java.util.Scanner;

public class Baitap3 {
    public static void main(String[] args) {
//        byte choice = 0;
        Scanner sc = new Scanner(System.in);
        while (true){
            // hiển thị menu
            System.out.println("******************************Breakfast Menu*************************\n" +
                    "1.\tPhở tôm hùm\n" +
                    "2.\tPhở bò Kobe\n" +
                    "3.\tPhở gà Việt Nam\n" +
                    "4.\tXôi trứng thịt\n" +
                    "5.\tBánh mỳ trứng\n" +
                    "6.\tMỳ tôm không người lái\n" +
                    "7.\tThoát\n");
            System.out.println("Nhập vào lựa chọn :");
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Phở tôm hùm");
                    break;
                case 2:
                    System.out.println("Phở bò Kobe");
                    break;
                case 3:
                    System.out.println("Phở gà Việt Nam");
                    break;
                case 4:
                    System.out.println("Xôi trứng thịt");
                    break;
                case 5:
                    System.out.println("Bánh mỳ trứng");
                    break;
                case 6:
                    System.out.println("Mỳ tôm không người lái");
                    break;
                case 7:
                    System.out.println("Thoát chương trinh");
//                    System.exit(0); // dừng chương trình và trả về mã trang thái
//                    return; // kết thúc ha main()
                    break;
                default:
                    System.err.println("Nhâp lựa chọn ko phù hợp");
            }
            if (choice==7) break;
        }
    }
}
