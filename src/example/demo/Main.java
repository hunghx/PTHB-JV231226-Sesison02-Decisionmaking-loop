package example.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double BUS_TICKET_PRICE = 7000;
        // khai báo máy nhập
        Scanner sc = new Scanner(System.in);
        // B1 nhập vào tuổi của khách lên xe
//        System.out.println("Hãy nhập tuổi của ban :");
//        int age = Integer.parseInt(sc.nextLine());
//        if (age<6||age>60){  // người già và trẻ em
//            System.out.println("Bạn được miễn phí vé đi xe");
//        }else if (age<=18){  // học sinh tiêu hoc hoac trung hoc
//            System.out.printf("Giá vé của bạn la : %.0f đồng. \n",(7000*0.5));
//        }else { // các đối tươg khác
//            System.out.println("Giá vé của bạn là 7000 đồng.");
//        }

        // switch case
        // bài toán : từ điển anh - việt
        // yêu cầu nhập từ tiếng anh cần dịch   sang tiếng việt
//        System.out.println("Hãy nhập vào từ tiếng anh");
//        String word = sc.nextLine();
//        switch (word) {
//            case "cat":
//            case "kitty":
//                System.out.println("Con mèo");
//                break; // thoát khoi switch case
//            case "dog":
//                System.out.println("Con chó");
//                break;
//            default:
//                System.err.println("Không tìm thấy kết quả phù hợp");
//        }


        // Vòng lặp
        // Vòng lặp FOR I
        // hãy in ra 10 số tự nhiên đầu tiên
//        for (int i = 11; i > 1; i--) {
//            // in ra giá trị của biến i
//            System.out.println("i = " + i);
//        }
//
//        for (int i = 0; i < 10; i++) { // vòng lặp in các hàng
//            for (int j = 0; j < 20; j++) { // vòng lặp in các cột
//                System.out.print(" * ");
//            }
//            System.out.println(); // in xong 1 hàng thì phải xuống dòng
//        }

        // vong lap while và do... while
        // lap vô hạn
//        while (true){
//
//        }
//        System.out.println("Khối lệnh bên dưới lặp vo hạn");

        // yêu cầu : hãy nhập vào 1 so đến khi nhâp vào số 0
        // thì kết thúc và in ra ổng của tất cả các số vừa nhập
        int tong = 0;
//        while (true){
//            System.out.println("Ha nhập 1 số nguyên");
//            int so = Integer.parseInt(sc.nextLine());
//            if (so==0){ // dừng vòng lặp
//                break;
//            }
//            tong += so; // cộng tích lũy lưu vào viến tong
//        }
//        System.out.println("Tổng các số bạn vừa nhập là : "+tong);
//        int so;
//        do {
//            System.out.println("Nhap gia tri la sô nguyên");
//            so = Integer.parseInt(sc.nextLine());
//            tong += so;
//        }while (so!=0);
//        System.out.println("Tổng các số bạn vừa nhập là : "+tong);
        // câu lẹnh nhảy : break , return, continue
        // ví dụ : in ra cac số chẵn < 10
        for (int i = 0; i < 10; i++) {
            if (i%2!=0){
                continue; // bỏ qua vòng lặp hiện tại, nhảy sang vòng lặp mới
            }
            System.out.println(i);
        }
        // vidu : nhập vào 1 chuỗi , nếu chuỗi đó là chuoi rỗng thì dừng vòng lặp , nếu không thì nhập tiếp
//        while (true){
//            System.out.println("Hay nhap vao 1 chuoi");
//            String str = sc.nextLine();
//            if (str.isBlank()){
//                System.err.println("bạn vừa nhập chuỗi rỗng");
//                return; // dừng hàm tại ví đó ngay lập tức và trả về
//            }
//            System.out.println("Chuôi bạn vừa nhạp là : "+str);
//            break;
//        }
//        System.out.println("khối lệnh bên ngoai vòng lặp");
    }
}
