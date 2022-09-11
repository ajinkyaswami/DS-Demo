package com.ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Demo {

	private int [] arr;
	private int size=0;
	private int fix=0;
	
	private void getChoice(Demo d)throws NumberFormatException, IOException
	{
		if(size!=fix)
			size=fix;
		
		System.out.println();
		System.out.println("Please enter your choice : ");
		System.out.println();
		System.out.println("1. Insert Operation");
		System.out.println("2. Delete Operation");
		System.out.println("3. Show Array");
		System.out.println("4. Exit");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int choice=Integer.parseInt(br.readLine());
		
		if(choice==1)
		{
			System.out.println(Arrays.toString(d.insertDemo()));
			d.getChoice(d);
		}
		else if(choice==2)
		{
			d.deleteDemo();
		}
		else if(choice==3)
		{
			d.showArray();
		}
		else if(choice==4)
		{
			System.out.println("Closing...!");
			System.exit(0);
		}
		else
		{
			System.out.println("Please enter valid choice");
			this.getChoice(d);
		}
	}
	
	private int[] insertDemo() throws NumberFormatException, IOException
	{
		int no=0;
		int index=0;
		
		System.out.println("--------------- insertDemo() -----------");
		System.out.println("Enter number to be inserted : ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		no=Integer.parseInt(br.readLine());
		System.out.println("Enter index to where insert the given number : ");
		index=Integer.parseInt(br.readLine());
		int [] array=new int[size+1];
		for(int i=0;i<=size;i++)
		{
			if(i<index-1)
			{
				array[i]=arr[i];
			}
			else if(i==index-1)
			{
				array[i]=no;
			}
			else
			{
				array[i]=arr[i-1];
			}
			
		}
		
		return array;
		
	}
	
	private void deleteDemo() throws NumberFormatException, IOException
	{
		System.out.println("------------------- deleteDemo() --------------- \n");
		System.out.println("Please enter the index for delete the element form array : ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int index=Integer.parseInt(br.readLine());
		
		for(int i=index;i<size-1;i++)
		{
			arr[i]=arr[i+1];
		}
		size=size-1;
		System.out.println(Arrays.toString(arr));
		this.getChoice(this);
	}
	
	private void showArray() throws NumberFormatException, IOException
	{
		System.out.println("-------------- showArray() ------------");
		System.out.println(size);
		System.out.println(arr.length);
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		this.getChoice(this);
	}
	
	private void addElements(Demo d) throws NumberFormatException, IOException
	{
		System.out.println("------------- addElements() ---------------");
		System.out.println("Please size for an Array :");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		size=Integer.parseInt(br.readLine());
		fix=size;
		arr=new int [size];
		
		System.out.println("Please enter "+size+" numbers : ");
		
		for(int i=0;i<size;i++) 
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		d.getChoice(d);
	}

	public static void main(String[] args) throws NumberFormatException, IOException  
	{
		Demo d=new Demo();
		d.addElements(d);
	}

}
