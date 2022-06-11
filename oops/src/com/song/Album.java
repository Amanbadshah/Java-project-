package com.song;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
	private String name;
	private String artist;
	private ArrayList<music> songs;
	
	public Album(String name, String artist) {
		super();
		this.name = name;
		this.artist = artist;
		this.songs = new ArrayList<music>();
		
	}
	public Album() {
		
	}
	public music findSong(String title) {
		for(music checkedSong :songs) {
			if(checkedSong.getTitle().equals(title))
				return checkedSong;
			
		}
		return null;
		
	}
	public boolean addSong(String title,double duration) {
		if(findSong(title)==null) {
			songs.add(new music(title,duration));
			//System.out.println(title +"Successfully added  to the list");
			return true;
			
		}
		else {
			 //System.out.println("Song with name " + title + "already exist in the list");
			 return false;
			 
		}
	}
	public boolean addToplaylist(int trackNumber, LinkedList<music> playList) {
		int index= trackNumber -1;
		if(index >0 && index<=this.songs.size()) {
			playList.add(this.songs.get(index));
				return true;
				
			}
			//System.out.println("this album  does not have song with tacknumber"+ trackNumber);
			return false;
		}	
	public boolean addToplaylist(String title, LinkedList<music> playList) {
		for(music checkedSong: this.songs) {
			if(checkedSong.getTitle().equals(title)) {
				playList.add(checkedSong);
				return true;
				 	
			}
		}
		//System.out.println(title +"there is no such song in album");
		return false;
	}
	}
	


