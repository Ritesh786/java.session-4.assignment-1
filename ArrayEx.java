import java.lang.reflect.Array;

public class ArrayEx {

	public static void main(String[] args) {
         
		int arr[]={5,6,7,8,9,10,11};
	  int end=arr.length - 1;
		int n=arr.length;
		
		for(int j=0;j<n/2;j++){
			int m=arr[j];
			arr[j]=arr[end];
			arr[end]=m;
			end--;
			System.out.println(+m);
		}
		
		for(int k=0;k<n;k++){
			System.out.println(" Reverse Array = "+arr[k]);
		}

	}

}
