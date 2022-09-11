package com.ds.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchDemo 
{

	private void lenearSearch() throws NumberFormatException, IOException 
	{
		int no;
		int size;
		System.out.println("Enter Size of array : ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		size=Integer.parseInt(br.readLine());
		int [] arr=new int [size];
		System.out.println("Enter "+size+" numbers : ");
		for(int i=0;i<size;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter number to search in array : ");
		no=Integer.parseInt(br.readLine());
		
		for(int i=0;i<size;i++)
		{
			if(arr[i]==no)
			{
				System.out.println("Number "+no+" is present at index "+i);
			}
			if(i==size)
			{
				System.out.println("Given number is not present in array.");
			}
		}
	}
	
	private void binarySearch() throws NumberFormatException, IOException
	{
		int size;
		int search;
		int middle;
		int start=0;
		int end;
		
		System.out.println("Enter size of an array : ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		size=Integer.parseInt(br.readLine());
		int [] array=new int[size];
		end=size-1;
		
		System.out.println("Enter "+size+" elements : ");
		for(int i=0;i<size;i++)
		{
			array[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println("Enter element to find : ");
		search=Integer.parseInt(br.readLine());
		
		middle=(start+end)/2;
		
		while(start<=end)
		{
			if(array[middle]<search)
			{
				start=middle+1;
			}
			else if(array[middle]==search)
			{
				System.out.println("Element found at "+middle+" index.");
				break;
			}
			else
			{
				end=middle-1;
			}
			middle=(start+end)/2;
		}
		if(start>end)
		{
			System.out.println("Given element is not found in array.");
		}

	}
	
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		SearchDemo sd=new SearchDemo();
		//sd.lenearSearch();
		sd.binarySearch();
	}

}
