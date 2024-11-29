import java.util.Scanner;

public class ViDu {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double a,b;
	System.out.println("Nhap a:");
	a=sc.nextDouble();
	System.out.println("Nhap b");
	b=sc.nextDouble();
	//gia tri tuyet doi
	System.out.println("|a|=" +Math.abs(a));
	//ceil
	System.out.println("a="+Math.ceil(a));
	//floor
	System.out.println("b="+Math.floor(b));
	//min
	System.out.println("min(a,b)="+Math.min(a, b));
	//max
	System.out.println("max(a,b)="+Math.max(a, b));
	//can bac 2
	System.out.println("sqrt(a)="+Math.sqrt(a));
	//a^b
	System.out.println("a^b="+Math.pow(a, b));
}
}
