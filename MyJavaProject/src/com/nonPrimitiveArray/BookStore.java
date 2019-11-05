package com.nonPrimitiveArray;

public class BookStore 
{

	public static void main(String[] args) 
	{
		Books b1 = new Books("harrypotor", 400);
		Books b2 = new Books("Heart of darkness", 500);
		Books b3 = new Books("Call of the wild", 200);
		Books b4 = new Books("my friend", 600);
		Books b5 = new Books("war and piece", 800);
		Books[] bookshelf = {b1,b2,b3,b4,b5};
		for(Books ob :bookshelf)
		{
			System.out.println("book name "+ob.name+" book price "+ob.price+" book isbn "+ob.isbn);
			ob.genre("Thriller");
		}

	}

}
