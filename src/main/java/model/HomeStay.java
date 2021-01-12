package model;

import java.util.List;

public class HomeStay {
    private int homestayID;
    private int sophong;
    private String tenhomestay, diachi, sdt, tienich;
    private double giaphong;
    private String anh, anh1, anh2, anh3, thongtin, thongtin1, thongtin2, thongtin3;
    private List<HomeStay> homeStayList;

    public List<HomeStay> getHomeStayList() {
        return homeStayList;
    }

    public void setHomeStayList(List<HomeStay> homeStayList) {
        this.homeStayList = homeStayList;
    }

    public HomeStay(int homestayID, String tenhomestay, String diachi, String sdt, double giaphong, int sophong, String tienich, String anh, String anh1, String anh2, String anh3, String thongtin, String thongtin1, String thongtin2, String thongtin3) {
        this.homestayID = homestayID;
        this.tenhomestay = tenhomestay;
        this.diachi = diachi;
        this.sdt = sdt;
        this.tienich = tienich;
        this.giaphong = giaphong;
        this.sophong = sophong;
        this.anh = anh;
        this.anh1 = anh1;
        this.anh2 = anh2;
        this.anh3 = anh3;
        this.thongtin = thongtin;
        this.thongtin1 = thongtin1;
        this.thongtin2 = thongtin2;
        this.thongtin3 = thongtin3;
    }

    public HomeStay() {
    }

    public int getHomestayID() {
        return homestayID;
    }

    public void setHomestayID(int homestayID) {
        this.homestayID = homestayID;
    }

    public int getSophong() {
        return sophong;
    }

    public void setSophong(int sophong) {
        this.sophong = sophong;
    }

    public String getTenhomestay() {
        return tenhomestay;
    }

    public void setTenhomestay(String tenhomestay) {
        this.tenhomestay = tenhomestay;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getTienich() {
        return tienich;
    }

    public void setTienich(String tienich) {
        this.tienich = tienich;
    }

    public double getGiaphong() {
        return giaphong;
    }

    public void setGiaphong(double giaphong) {
        this.giaphong = giaphong;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public String getAnh1() {
        return anh1;
    }

    public void setAnh1(String anh1) {
        this.anh1 = anh1;
    }

    public String getAnh2() {
        return anh2;
    }

    public void setAnh2(String anh2) {
        this.anh2 = anh2;
    }

    public String getAnh3() {
        return anh3;
    }

    public void setAnh3(String anh3) {
        this.anh3 = anh3;
    }

    public String getThongtin() {
        return thongtin;
    }

    public void setThongtin(String thongtin) {
        this.thongtin = thongtin;
    }

    public String getThongtin1() {
        return thongtin1;
    }

    public void setThongtin1(String thongtin1) {
        this.thongtin1 = thongtin1;
    }

    public String getThongtin2() {
        return thongtin2;
    }

    public void setThongtin2(String thongtin2) {
        this.thongtin2 = thongtin2;
    }

    public String getThongtin3() {
        return thongtin3;
    }

    public void setThongtin3(String thongtin3) {
        this.thongtin3 = thongtin3;
    }

    @Override
    public String toString() {
        return "HomeStay{" +
                "homestayID=" + homestayID +
                ", sophong=" + sophong +
                ", tenhomestay='" + tenhomestay + '\'' +
                ", diachi='" + diachi + '\'' +
                ", sdt='" + sdt + '\'' +
                ", tienich='" + tienich + '\'' +
                ", giaphong=" + giaphong +
                ", anh='" + anh + '\'' +
                ", anh1='" + anh1 + '\'' +
                ", anh2='" + anh2 + '\'' +
                ", anh3='" + anh3 + '\'' +
                ", thongtin='" + thongtin + '\'' +
                ", thongtin1='" + thongtin1 + '\'' +
                ", thongtin2='" + thongtin2 + '\'' +
                ", thongtin3='" + thongtin3 + '\'' +
                '}';
    }
}
