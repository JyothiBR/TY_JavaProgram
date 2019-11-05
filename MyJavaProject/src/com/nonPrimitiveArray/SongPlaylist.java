package com.nonPrimitiveArray;

public class SongPlaylist 
{

	public static void main(String[] args) 
	{
		Song[] playlist = new Song[5];
		playlist[0] = new Song("ABC","abc",123);
		playlist[1] = new Song("DEF","def",124);
		playlist[2] = new Song("GHi","ghi",125);
		playlist[3] = new Song("JKL","jkl",126);
		playlist[4] = new Song("MNO","mno",127);
		System.out.println("using for loop");
		for(int i=0;i<playlist.length;i++)
		{
			System.out.println("details "+playlist[i].name+ " "+ playlist[i].singer+" "+playlist[i].likes);
		}
		System.out.println("               ");
		System.out.println("using for each loop");
		for(Song ob : playlist )
		{
			System.out.println("name: "+ob.name);
			System.out.println("singer: "+ob.singer);
			System.out.println("likes: "+ob.likes);
			
		}
	}

}
