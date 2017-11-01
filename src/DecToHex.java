import java.util.Scanner;
public class DecToHex {
	
	public static String chars = "0123456789ABCDEF";
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		while (true) {
			int dec = key.nextInt();
			int sub = key.nextInt();
			anyConvr(dec, sub);
			System.out.println();
		}
		
	}
	
	public static void Hexy(int dec) {
		if (dec/16 > 0)
			Hexy(dec/16);
		System.out.print(chars.charAt(dec%16));
	}
	
	public static void anyConvr(int dec, int sub) {
		if (dec/sub > 0)
			anyConvr(dec/sub, sub);
		System.out.print(chars.charAt(dec%sub));
	}
}
