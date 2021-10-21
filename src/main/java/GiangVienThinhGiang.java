public class GiangVienThinhGiang extends Person{
    private String coQuanLamViec;
    private int soGioDay;

    public GiangVienThinhGiang(String name, String email, String address, String phone, String coQuanLamViec, int soGioDay) {
        super(name, email, address, phone);
        this.coQuanLamViec = coQuanLamViec;
        this.soGioDay = soGioDay;
    }

    public String getCoQuanLamViec() {
        return coQuanLamViec;
    }

    public int getSoGioDay() {
        return soGioDay;
    }

    public void setCoQuanLamViec(String coQuanLamViec) {
        this.coQuanLamViec = coQuanLamViec;
    }

    public void setSoGioDay(int soGioDay) {
        this.soGioDay = soGioDay;
    }

    @Override
    public double salary() {
        return this.soGioDay*200000;
    }
}
