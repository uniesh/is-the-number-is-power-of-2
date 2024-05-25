import java.util.*;
public class Main {
	static public void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if((n&(n-1))==0) {
			System.out.print("yes");
		}
		else {
			System.out.print("no");
		}
	}

}
