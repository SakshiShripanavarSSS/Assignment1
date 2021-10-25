package com.tdd.example;

public class CountPrimeNumber {

	public static int countPrimeNumber(int[] arr) {
		int count=0,flag;
		for(int i=0;i<arr.length;i++) {
			int j=2;
			flag=1;
			while (j < arr[i]) {
				if(arr[i]%j==0 ) {
					flag=0;
					break;
				}
				j++;
			}
			if(flag==1) {
				count++;
			}
		}

		return count;
	}
}



package com.tdd.example;

public class DuplicateStringArray {

	public static boolean findDuplicateString(String[] str) {
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					return true;
				}
			}
		}
		return false;
	}
}

package com.tdd.example;

public class FourthMaxArray {

		public static int findFourthMax(int arr[]) {
			int temp;

			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]<arr[j]) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;	
					}
				}
			}

			return arr[3];

		}
}
