package com.sdet;

public class Reversestring {

	public static void main(String[] args) {			
				   String str= "This is my new String of the class";
				      String arr[]=str.split(" ");
				      for(int i=0;i<arr.length;i++)
				      {
				 
				          for(int j=arr[i].length()-1;j>=0;j--)
				          {   
				          System.out.print(arr[i].charAt(j));
				      }
				        System.out.print(" ");
				          }

				    }
				
			

	}

