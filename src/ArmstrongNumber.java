import java.util.Scanner;

public class ArmstrongNumber {
	
	void amrstrongNum(){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //153
		int input = num;
		int sum = 0;
		while(num>0)
		{
			int rem = num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		System.out.println(sum+" summm");
		if(input==sum)
		{
		System.out.println(input+" is armstrong number");
		}
		else {
			System.out.println(input+" is not an armstrong number");
		}
		
	}

	public static void main(String[] args) {
		
		ArmstrongNumber am = new ArmstrongNumber();
		am.amrstrongNum();
		
	}

}
