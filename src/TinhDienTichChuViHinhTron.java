import java.util.Scanner;

public class TinhDienTichChuViHinhTron {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double r,Chuvi,DienTich;
	System.out.println("Nhap ban kinh r:");
	r=sc.nextDouble();
	//tinh chu vi
	Chuvi=2*Math.PI*r;
	System.out.println("Chu vi hinh tron:"+Chuvi);
	System.out.println("Chu vi hinh tron:"+Math.round(Chuvi));
	//Tinh dien tich
	DienTich=Math.PI*Math.pow(r,2);
	System.out.println("Dien tich hinh tron:"+DienTich);
	System.out.println("Dien tich hinh tron:"+Math.round(DienTich));
	
}
}
