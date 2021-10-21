public class GiangVienCoHuu extends Person{
    private int soGioDay;
    private double luongThoaThuan;
    private int soGioChung;
    private int luongThuong = 100000;

    public GiangVienCoHuu(String name, String email, String address, String phone, int soGioDay, int luongThoaThuan, int soGioChung) {
        super(name, email, address, phone);
        this.soGioDay = soGioDay;
        this.luongThoaThuan = luongThoaThuan;
        this.soGioChung = soGioChung;
    }

    public int getSoGioDay() {
        return soGioDay;
    }

    public double getLuongThoaThuan() {
        return luongThoaThuan;
    }

    public int getSoGioChung() {
        return soGioChung;
    }

    public void setSoGioDay(int soGioDay) {
        this.soGioDay = soGioDay;
    }

    public void setLuongThoaThuan(int luongThoaThuan) {
        this.luongThoaThuan = luongThoaThuan;
    }

    public void setSoGioChung(int soGioChung) {
        this.soGioChung = soGioChung;
    }

    @Override
    public double salary() {
        return this.luongThoaThuan + (this.soGioDay - 40)*this.luongThuong;
    }
}
