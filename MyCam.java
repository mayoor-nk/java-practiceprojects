package com;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;
import java.util.*;
import java.util.Formatter;

public class MyCam {
	public static void main(String args[]) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		String a=String.format("%39s","");
		System.out.println("|"+a+"|" );
		System.out.println("|WELCOME TO MY CAMERA RENTAL APPLICATION|");
		String b=String.format("%39s","BY MAYOOR N K");
		System.out.println("|"+b+"|" );
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("PLEASE LOGIN TO CONTINUE!!");
		System.out.print("USERNAME: ");
		Scanner sc=new Scanner(System.in);
		String username=sc.nextLine();
		System.out.print("PASSWORD: ");
		String password=sc.nextLine();
		optionsSelection();
		
		
		
		
	}
	private static void optionsSelection() {
        String[] arr = {"1. MY CAMERA",
                "2. RENT A CAMERA",
                "3. VIEW ALL CAMERA",
                "4. MY WALLET",
                "5. CLOSE THE APPLICATION",
        };
        ArrayList<camera> cam = new ArrayList<>();
        cam.add(new camera(101,"CANON","EOS C70", 200.0,true));
        cam.add(new camera(102,"NIKON","Z5", 180.0,true));
        cam.add(new camera(103,"NIKON","D6", 250.0,true));
        cam.add(new camera(104,"SONY","A7C", 220.0,true));
        cam.add(new camera(105,"SONY","ZV-E10", 160.0,true));
        cam.add(new camera(106,"PANASONIC","DLSR", 150.0,true));
        cam.add(new camera(107,"GOPRO","HERO9 BLACK", 260.0,true));
        cam.add(new camera(108,"NIKON","D850", 290.0,true));
        cam.add(new camera(109,"CANON","EOS R10", 190.0,true));
        cam.add(new camera(110,"CANON","EOS R7", 180.0,true));
        int[] arr1 = {1,2,3,4,5};
        int  slen = arr1.length;
        System.out.println("\nEnter your choice:\t");
        for(String str:arr){
            System.out.println(str);
        }
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        for(int j=1;j<=slen;j++){
            if(choice==j){
                switch (choice){
                    case 1:
                    	insideOptionSelection();
                        break;
                    case 2:
                        System.out.println("FOLLOWING IS THE LIST OF CAMERA");
                        display();
                        System.out.print("ENTER THE CAMERA ID YOU WANT TO RENT: ");
                        int rent=sc.nextInt();
                        for(camera k:cam) {
                        	if(k.getId()==rent) {
                        		k.setStatus(false);
                        		 System.out.print("YOUR TRANSACTION FOR CAMERA- "+k.getBrand()+" "+k.getModel()+" WITH RENT "+
                        		 k.getPrice()+"HAS SUCCESFULLY COMPLETED");
                        	}
                        }
                       
                        optionsSelection();

                        break;
                    case 3:
                        display();
                        optionsSelection();
                        break;
                    case 4:
                        mywallet();
                        optionsSelection();
                        break;
                    case 5:
                        closeApp();
                        break;
                    default:
                        System.out.println("You have made an invalid choice!");
                        break;
                }
            }
        }
        if(choice>5) {
        	System.out.println("You have made an invalid choice!");
        }
	}
	public static void mywallet() {
		
	}
	public static void insideOptionSelection() {
		String[] arr = {"1. ADD",
                "2. REMOVE",
                "3. VIEW MY CAMERA",
                "4. GO TO PREVIOUS MENU",
        };
		
		ArrayList<camera> cam = new ArrayList<>();
        cam.add(new camera(101,"CANON","EOS C70", 200.0,true));
        cam.add(new camera(102,"NIKON","Z5", 180.0,true));
        cam.add(new camera(103,"NIKON","D6", 250.0,true));
        cam.add(new camera(104,"SONY","A7C", 220.0,true));
        cam.add(new camera(105,"SONY","ZV-E10", 160.0,true));
        cam.add(new camera(106,"PANASONIC","DLSR", 150.0,true));
        cam.add(new camera(107,"GOPRO","HERO9 BLACK", 260.0,true));
        cam.add(new camera(108,"NIKON","D850", 290.0,true));
        cam.add(new camera(109,"CANON","EOS R10", 190.0,true));
        cam.add(new camera(110,"CANON","EOS R7", 180.0,true));
				
		int[] arr1 = {1,2,3,4};
        int  slen = arr1.length;
        System.out.println("\nEnter your choice:\t");
        for(String str:arr){
            System.out.println(str);
        }
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        for(int j=1;j<=slen;j++){
            if(choice==j){
                switch (choice){
                    case 1:
                        System.out.print("ENTER THE CAMERA BRAND: ");
                        String br=sc.nextLine();
                        System.out.print("ENTER THE MODEL: ");
                        String md=sc.nextLine();
                        System.out.print("ENTER THE PER DAY PRICE(INR): ");
                        double pr=sc.nextDouble();
                        int i=111;
                        cam.add(new camera(i,br,md,pr,true));
                        i++;
                        optionsSelection();
                        break;
                    case 2:
                        display();
                        System.out.print("ENTER THE CAMERA ID TO BE REMOVED: ");
                        int rm=sc.nextInt();
                        for(camera k:cam) {
                        	if(k.getId()==rm) {
                        		cam.remove(k);
                        	}
                        }
                        System.out.print("CAMERA SUCCESSFULLY REMOVED FROM THE LIST.");
                        optionsSelection();
                        break;
                    case 3:
                        display();
                        optionsSelection();
                        break;
                    case 4:
                        optionsSelection();
                        break;
                    default:
                        System.out.println("You have made an invalid choice!");
                        break;
                }
            }
        }
        if(choice>5) {
        	System.out.println("You have made an invalid choice!");
        }
	}
	public static void display() {
		ArrayList<camera> cam = new ArrayList<>();
        cam.add(new camera(101,"CANON","EOS C70", 200.0,true));
        cam.add(new camera(102,"NIKON","Z5", 180.0,true));
        cam.add(new camera(103,"NIKON","D6", 250.0,true));
        cam.add(new camera(104,"SONY","A7C", 220.0,true));
        cam.add(new camera(105,"SONY","ZV-E10", 160.0,true));
        cam.add(new camera(106,"PANASONIC","DLSR", 150.0,true));
        cam.add(new camera(107,"GOPRO","HERO9 BLACK", 260.0,true));
        cam.add(new camera(108,"NIKON","D850", 290.0,true));
        cam.add(new camera(109,"CANON","EOS R10", 190.0,true));
        cam.add(new camera(110,"CANON","EOS R7", 180.0,true));
        
		System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%10s %20s %20s %10s %10s", "CAMERA ID", "BRAND", "MODEL", "PRICE", "STATUS");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        for(camera str: cam){
            System.out.format("%10d %20s %20s %10.2f %10b",
            		str.getId(), str.getBrand(), str.getModel(), str.getPrice(), str.isStatus());
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");
	}
	private static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
    }
}
class camera{
	private int id;
    private String brand;
    private String model;
    private double price;
    private boolean status;
	camera(int id, String brand, String model, double price, boolean status) {
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.status = status;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
    
}




