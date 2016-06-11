package com.udr.record.domain;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name = "records")
public class Record {

    private static final Logger log = LoggerFactory.getLogger(Record.class);

    @ManyToOne
    @JoinColumn(name = "idusers", insertable = false, updatable = false)
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "album", length = 50, nullable = true)
    private String album;

    @Column(name = "artist", length = 50, nullable = true)
    private String artist;

    @Column(name = "date_of_release")
    private Date date_of_release;

    @Column(name = "label", nullable = true)
    private String label;

    @Column(name = "idusers", nullable = false)
    private int idusers;

    public int getIdusers() {
        return idusers;
    }

    public void setIdusers(int idusers) {
        this.idusers = idusers;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Column(name = "format", nullable = true)
    private String format;

    @Column(name = "price", nullable = true)
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

    public Date getdate_of_release() {
        return date_of_release;
    }

    public void setdate_of_release(Date date_of_release) {
        this.date_of_release = date_of_release;
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

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", artist='" + artist + '\'' +
                ", album='" + album + '\'' +
                '}';
    }


}
//
//class PriceCompare implements Comparator<Record> {
//    @Override
//    public int compare(Record one, Record two) {
//        return (String)one.getPrice().compareTo(((String)two.getPrice()));
//    }
//}



