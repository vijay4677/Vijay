package com.test.demo;

import java.util.Arrays;

public class sum {

	public static void main(String[] args) {
		int a[]= {1,2};
		int b[]= {3,4};
		int l=a.length+b.length;
		int c[]=new int [a.length+b.length];
		int k=0;
	    for (int i=0;i<a.length;i++) {
	    	c[k++]=a[i];
	    }
		for (int j=0;j<b.length;j++) {
			c[k++]=b[j];
		}
		Arrays.sort(c);
		System.err.println(Arrays.toString(c));
		if(l%2==0) {
			double aa=((double)(c[l/2]+c[l/2-1])/2);
			System.out.println(aa);
		}
		else
		{ double aaa=c[l/2];
			System.out.println(aaa);}
			
	}
}
