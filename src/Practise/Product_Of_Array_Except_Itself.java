package Practise;

import java.util.Arrays;

public class Product_Of_Array_Except_Itself {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };
		int[] ans = new int[a.length];
		ans[0] = 1;
		for (int i = 1; i < a.length; i++) {
			ans[i] = ans[i - 1] * a[i - 1];
		}
		int suffix = 1;
		for (int i = a.length - 1; i >= 0; i--) {
			ans[i] = ans[i] * suffix;
			suffix *= a[i];
		}
		System.out.println(Arrays.toString(ans));
	}
}
