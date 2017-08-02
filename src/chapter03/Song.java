package chapter03;

import java.time.Year;

public class Song {
	
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int i) {
		this.year = i;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	public Song()
	{
		
	}
	
	//생성자를 하나라도 만들면 기본 생성자가 사라진다.
	public Song(String title, String artist, String album, String composer, int year, int track)
	{
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	public void show()
	{
		System.out.println(artist + " " + title + "( " + album + ", " + year + ", "
				+ track+ "번 track, " + composer + " 작곡)");
	}

}
