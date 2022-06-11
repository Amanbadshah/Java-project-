package com.song;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class main {
	private static ArrayList<Album> albums=new ArrayList<>();
	public static void main(String []args) {
		
		
		Album album=new Album(  "Album1", "AC/DC");
		album.addSong( "tnt",4.5);
		album.addSong("highway", 3.5);
		album.addSong("Thunder Stuck",5.0 );
		albums.add(album);
		
		
		album =new Album("Album2","Eminem");
		album.addSong("Rap God", 4.5);
		album.addSong("Not Afraid", 3.5);
		album.addSong("Lose your self", 4.5);
		albums.add(album);
		
		
		LinkedList<music> playList_1=new LinkedList<>();
		albums.get(0).addToplaylist("tnt", playList_1);
		albums.get(0).addToplaylist("highway", playList_1);
		albums.get(0).addToplaylist("Thunder Stuck",playList_1);
		albums.get(1).addToplaylist("Lose your self", playList_1);
		albums.get(1).addToplaylist("Rap God", playList_1);
		albums.get(1).addToplaylist("Not Afraid", playList_1);
		  
		
		play(playList_1);
		
		
	}
	private static void play(LinkedList<music>playList) {
		Scanner sc=new Scanner(System.in);
		boolean quit=false;
		boolean forward=true;
		ListIterator<music>listIterator=playList.listIterator();
		if(playList.size()==0) {
			System.out.println("this playlist have no song");
			
		}
		else {
			System.out.println("Now playing"+listIterator.next().toString());
			printMenu();
		}
		while(!quit) {
			int action=sc.nextInt();
			sc.nextLine();
			switch(action) {
			case 0:
				System.out.println("playlist complete");
				quit=true;
				break;
			case 1:
				if(!forward) {
				if(listIterator.hasNext()) {
					listIterator.next();
				}
				forward=true;
				
				}
				if(listIterator.hasNext()) {
					System.out.println("Now playing"+listIterator.next().toString());
				}
				else {
					System.out.println("no Song");
					forward=false;
					
				}
				break;
			case 2:
				if(forward) {
					if(listIterator.hasNext()) {
						listIterator.previous();
					}
					forward=false;
					
				}
				if(listIterator.hasPrevious()) {
					System.out.println("Now playing "+listIterator.previous().toString());
				}
				else {
					System.out.println("no pervious ");
					forward=false;
					
				
				}
				break;
			case 3:
				if(forward) {
					if(listIterator.hasPrevious()) {
						System.out.println("Now playing song"+listIterator.previous().toString());
						forward=false;
						
					}
					else {
						System.out.println("we are the start of the list");
					}
				}
				else {
					if(listIterator.hasNext()) {
						System.out.println("now playing "+listIterator.next().toString());
					forward=true;
					
					}
					else {
						System.out.println("we have reached to the end of list ");
					}
					
				}
				break;
			case 4:
				printList(playList);
				break;
			case 5:
				printMenu();
				break;
			case 6:
				if(playList.size()>0) {
					listIterator.remove();
					if(listIterator.hasNext()) {
						System.out.println("now playing "+ listIterator.next().toString());
						
							
					}
					else {
						if(listIterator.hasPrevious())
						System.out.println("now playing  "+listIterator.previous().toString());
					}
				}
			}
		}
		
	}
	private static void printMenu() {
		System.out.println("Availabe options \n press ");
		System.out.println("0-to quit\n"+
		"1- to play next song\n"+
		"2- to play previous song\n"+
		"3- to replay the current song\n"+
		"4- list of all song\n "+
		"5- print all  available  option\n"+
		"6- delete current song");
	}
	private static void  printList(LinkedList<music>playList) {
		Iterator<music> iterator=playList.iterator();
		System.out.println("---------------");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("---------------");
	}

}
