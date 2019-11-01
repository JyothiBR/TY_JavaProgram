package com.StaticMembers;

public class Marker 
{
    static int price;
    static String colour;
    
    static void writing()
    {
    	System.out.println("marker of colour " + colour + " is writing");
    }
	public static void main(String[] args) 
	{
		System.out.println(Marker.price);
		System.out.println(Marker.colour);
		Marker.price=100;
		Marker.colour="Black";
		Marker.price=80;
		Marker.colour="Blue";
		System.out.println("Marker Price = "+Marker.price+" Marker Colour = "+Marker.colour);
		writing();
		}
	}
