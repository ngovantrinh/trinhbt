package baitap;

import java.util.Scanner;

public class Preson {

    public String ten;
    public String gioitinh;
    public int namsinh;
    public String diachi;

    public Preson() {
    }

    public Preson(String ten, String gioitinh, int namsinh, String diachi) {
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.namsinh = namsinh;
        this.diachi = diachi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void inputInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên học sinh: ");
        ten = scanner.nextLine();

        System.out.println("Nhập giới tính: ");
        gioitinh=scanner.nextLine();

        System.out.println("Nhập nam sinh: ");
        namsinh=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nhập địa chỉ: ");
        diachi=scanner.nextLine();
    }

    public void showInfo(){
        System.out.println(ten+" giới tính "+gioitinh+" sinh ngày "+namsinh+" địa chỉ: "+diachi);
    }
}
