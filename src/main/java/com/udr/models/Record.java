package com.udr.models;


import javax.persistence.*;

@Entity
@Table(name="records")
public class Record {


	@Id
	@Column(name="id")
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;

	@Column(name="album", length=50, nullable=true)
	private String album;

	@Column(name="artist", length=50, nullable=true)
	private String artist;

	@Column(name="year_of_release", nullable=true)
	private int year_of_release;

	@Column(name="label", nullable=true)
	private String label;

	@Column(name="price", nullable=true)
	private double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getYear_of_release() {
		return year_of_release;
	}

	public void setYear_of_release(int year_of_release) {
		this.year_of_release = year_of_release;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
