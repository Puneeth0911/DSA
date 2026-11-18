package Practise;

public class Birthday_Candle_Height {
	public static void main(String[] args) {
		int[] a= {4,4,2,5,7};
		int max=Integer.MIN_VALUE;
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
				count=1;
			} else if(a[i]==max) {
				count++;
			}
		}
		System.out.println(max);
		System.out.println(count);
	}
}
