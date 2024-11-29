import java.util.Scanner;

public class hoclai {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	double r,chuvi,dientich;
	System.out.println("Nhap ban kinh r:");
	r=sc.nextDouble();
	
	chuvi=2*Math.PI*r;
	System.out.println("Chu vi="+chuvi);
	dientich=Math.PI*Math.pow(r, 2);
	System.out.println("Dien tich="+dientich);
}
}
