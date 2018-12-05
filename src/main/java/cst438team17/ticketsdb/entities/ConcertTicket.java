package cst438team17.ticketsdb.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ConcertTicket")
public class ConcertTicket {
    @Id
    private String id;
    private Artist artist;
    private Date date;
    private Venue venue;
    private int numberOfTickets;

    public ConcertTicket(Artist artist, Date date, Venue venue, int numberOfTickets) {
        this.artist = artist;
        this.date = date;
        this.venue = venue;
        this.numberOfTickets = numberOfTickets;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setArtist (Artist artist) {
        this.artist = artist;
    }

    public Artist getArtist () {
        return artist;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setVenue (Venue venue) {
        this.venue = venue;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setNumberOfTickets (int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }
}