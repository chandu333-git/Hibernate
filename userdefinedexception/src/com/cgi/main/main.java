package com.cgi.main;

import java.util.Scanner;

import com.cgi.exception.ZeroValueNotAllowedException;

public class main {

	public static void main(String[] args)  {
		try
		{
         Scanner scan=new Scanner(System.in);
         System.out.println("Enter a number");
         int num=scan.nextInt();
         if(num==0)
         {
        	 throw new ZeroValueNotAllowedException("zero value not allowed");
         }
		}catch(ZeroValueNotAllowedException ex)
		{
		System.out.println(ex.getMessage());
		}
	}}
	
