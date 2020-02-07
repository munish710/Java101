package com.munish;

public class Main {

    public static void main(String[] args) {
	   int a[][]={
               {1,2,3,4},
               {2,4,5,6,4,3}
               {34,5,6,17},
               {22,45,56,6,66,65,34}

       };

	   for(int i=0;i<a.length;i++)
       {
           for(int j=0;j<a[i].length;j++)
           {
               System.out.print(" "+a[i][j]);
           }
           System.out.println();
       }
    }
}
