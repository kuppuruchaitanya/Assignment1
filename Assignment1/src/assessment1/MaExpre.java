package assessment1;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaExpre {
	

	public static void main(String[] args) throws  IOException {
		int num,temp = 0;
		// TODO Auto-generated method stub
		System.out.println("Please enter the itteration number ");
		//Scanner sc =new Scanner(System.in);
		BufferedReader brr=new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(brr.readLine());
		for(int itteration=1;itteration<=num;itteration++) {
			 temp += (itteration*itteration);
			
		}
		System.out.println("Output: "+temp);

	}

}