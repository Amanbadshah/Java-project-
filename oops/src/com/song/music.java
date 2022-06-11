package com.song;

public class music {
String title;
double duration;
public music(String title , double duration) {
	super();
	this.title = title;
	this.duration = duration;
}
public music() {
	
}
public String getTitle() {
	return title;
}

public double getDuration() {
	return duration;
}
public String toString() {
	return "song{"+
     "title='" + title +  
     ", duration="+ duration +
     '}';
	
}

}
