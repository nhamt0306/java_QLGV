import java.util.Scanner;
public class main {
    //In ra danh sách giảng viên
    public static void printGV (Person[] arrGV ) {
        System.out.println("           =====> DANH SÁCH TOÀN BỘ GIẢNG VIÊN <=====");
        for (Person gv: arrGV){
            if (gv instanceof GiangVienCoHuu) {
                System.out.println("              --------------------------------------------");
                System.out.println("              Giảng Viên Cơ Hữu");
                System.out.println("              Tên: " + gv.getName());
                System.out.println("              Địa chỉ: " + gv.getAddress());
                System.out.println("              Điện thoại: " + gv.getPhone());
                System.out.println("              Email: " + gv.getEmail());
                System.out.println("              Số giờ quy định: " + ((GiangVienCoHuu) gv).getSoGioDay() + " giờ");
                String luong = String.format("%,.0f",((GiangVienCoHuu) gv).getLuongThoaThuan());
                System.out.println("              Lương thỏa thuận: " + luong + " VNĐ");
                System.out.println("              Số giờ dạy: " + ((GiangVienCoHuu) gv).getSoGioDay());
            }
            else {
                System.out.println("              --------------------------------------------");
                System.out.println("              Giảng Viên Thỉnh Giảng");
                System.out.println("              Tên: " + gv.getName());
                System.out.println("              Địa chỉ: " + gv.getAddress());
                System.out.println("              Điện thoại: " + gv.getPhone());
                System.out.println("              Email: " + gv.getEmail());
                System.out.println("              Cơ quan làm việc: " + ((GiangVienThinhGiang) gv).getCoQuanLamViec());
                System.out.println("              Số giờ dạy: " + ((GiangVienThinhGiang) gv).getSoGioDay() + " giờ");
            }
        }
        System.out.println("            ====================> END <==================");
    }

    //In ra danh sách giảng viên cơ hữu
    public static void printGVCH (Person[] arrGV ){
        System.out.println("           =====> DANH SÁCH GIẢNG VIÊN CƠ HỮU <=====");
        for (Person gv: arrGV){
            if (gv instanceof GiangVienCoHuu) {
                System.out.println("              -----------------------------------------");
                System.out.println("              Tên: " + gv.getName());
                System.out.println("              Địa chỉ: " + gv.getAddress());
                System.out.println("              Điện thoại: " + gv.getPhone());
                System.out.println("              Email: " + gv.getEmail());
                System.out.println("              Số giờ quy định: " + ((GiangVienCoHuu) gv).getSoGioDay() + " giờ");
                String luong = String.format("%,.0f",((GiangVienCoHuu) gv).getLuongThoaThuan());
                System.out.println("              Lương thỏa thuận: " + luong + " VNĐ");
                System.out.println("              Số giờ dạy: " + ((GiangVienCoHuu) gv).getSoGioDay() + " giờ");
            }
        }
        System.out.println("            ====================> END <==================");
    }


    //In ra danh sách giảng viên thính giáng
    public static void printGVTG (Person[] arrGV ){
        System.out.println("           =====> DANH SÁCH GIẢNG VIÊN THỈNH GIẢNG <=====");
        for (Person gv: arrGV){
            if (gv instanceof GiangVienThinhGiang) {
                System.out.println("              -----------------------------------------");
                System.out.println("              Tên: " + gv.getName());
                System.out.println("              Địa chỉ: " + gv.getAddress());
                System.out.println("              Điện thoại: " + gv.getPhone());
                System.out.println("              Email: " + gv.getEmail());
                System.out.println("              Cơ quan làm việc: " + ((GiangVienThinhGiang) gv).getCoQuanLamViec());
                System.out.println("              Số giờ dạy: " + ((GiangVienThinhGiang) gv).getSoGioDay() + " giờ");
            }
        }
        System.out.println("            ====================> END <==================");
    }


    //Tính tổng tiền lương
    public static void tongLuong(Person[] arrGV ){
        double totalSalary = 0;
        for (Person gv : arrGV)
        {
            totalSalary = totalSalary + gv.salary();
        }
        System.out.println("           =====> THỐNG KÊ LƯƠNG <=====");
        System.out.println("      => Tổng lương của tất cả giảng viên là: " + String.format("%,.0f",totalSalary) + " VNĐ");
    }

    //Lương giảng viên cao nhất:
    public static void maxSalary(Person[] arrGV ){
        double salaryGVCH = 0, salaryGVTG = 0;
        for (Person gv : arrGV)
        {
            if (gv instanceof GiangVienCoHuu)
            {
                salaryGVCH = salaryGVCH + gv.salary();
            } else {
                salaryGVTG = salaryGVTG + gv.salary();
            }
        }
        System.out.println("           =====> THỐNG KÊ LƯƠNG <=====");
        System.out.println("        - Tổng lương của giảng viên cơ hữu là:" + String.format("%,.0f",salaryGVCH) + " VNĐ");
        System.out.println("        - Tổng lương của giảng viên thỉnh giảng là:" + String.format("%,.0f",salaryGVTG) + " VNĐ");
        if (salaryGVCH > salaryGVTG)
        {
            System.out.println("            => Giảng viên cơ hữu có tổng lương cao nhất.");
        } else
        {
            System.out.println(" => Giảng viên thỉnh giảng có tổng lương cao nhất.");
        }
    }

    //Hàm Main
    public static void main(String[] args) {
        GiangVienCoHuu gv1 = new GiangVienCoHuu("Nha", "nha@hcmute.edu.vn","Phu Yen","0965163425",70,20000000,40);
        GiangVienCoHuu gv2 = new GiangVienCoHuu("Thang", "thang@hcmute.edu.vn", "TP HCM", "0125638475", 80, 20000000, 40);
        GiangVienCoHuu gv3 = new GiangVienCoHuu("HA", "haln@hcmute.edu.vn", "Vung Tau", "0235438485", 86, 20000000, 40);

        GiangVienThinhGiang gv4 = new GiangVienThinhGiang("Hien","hien@hcmute.edu.vn","Can Tho","0345264537","DH SPKT",80);
        GiangVienThinhGiang gv5 = new GiangVienThinhGiang("Giau","giau@hcmute.edu.vn","TP HCM","0345264537","DH SPKT",70);

        Person[] arrGV = {gv1, gv2, gv3, gv4, gv5};


        int choice = 8;
        Scanner inputChoice = new Scanner(System.in);

        while (choice != 0) {

            System.out.println("----------------------MENU TASK----------------------");
            System.out.println("1. Xuất danh sách toàn bộ giảng viên.");
            System.out.println("2. Xuất danh sách giảng viên cơ hữu");
            System.out.println("3. Xuất danh sách giảng viên thỉnh giảng");
            System.out.println("4. Tổng số tiền lương phải trả cho giảng viên.");
            System.out.println("5. Loại giảng viên có tổng lương cao nhất.");
            System.out.println("0. Exit");

            choice = inputChoice.nextInt();

            switch (choice) {
                case 1:
                    printGV(arrGV);
                    break;
                case 2:
                    printGVCH(arrGV);
                    break;
                case 3:
                    printGVTG(arrGV);
                    break;
                case 4:
                    tongLuong(arrGV);
                    break;
                case 5:
                    maxSalary(arrGV);
                    break;
                default:
                    break;
            }
        }
    }
}