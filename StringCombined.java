// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
import java.util.*;
public class StringCombined{
	public static void main(String args[]){
	Scanner sc  = new Scanner(System.in);
	int n = sc.nextInt();
	int totalLength = 0;
	
	String arr[] = new String[n];
	
	for(int i = 0; i<n; i++){
		arr[i] = sc.next();
		totalLength = totalLength+arr[i].length();
	}
		System.out.println(totalLength);
	
	}
}
	
	
