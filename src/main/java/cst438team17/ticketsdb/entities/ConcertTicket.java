package cst438team17.ticketsdb.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ConcertTicket")
public class ConcertTicket {
    @Id
    private String id;
    private String artist;
    private String date;
    private String venue;
    private int numberOfTickets;
    private double price;
    private String description;

    public ConcertTicket(String artist, String date, String venue, int numberOfTickets, double price, String description) {
        this.artist = artist;
        this.date = date;
        this.venue = venue;
        this.numberOfTickets = numberOfTickets;
        this.price = price; 
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setArtist (String artist) {
        this.artist = artist;
    }

    public String getArtist () {
        return artist;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setVenue (String venue) {
        this.venue = venue;
    }

    public String getVenue() {
        return venue;
    }

    public void setNumberOfTickets (int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setPrice (double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setDescription (String desc) {
        this.description = desc;
    }

    public String getDescription () {
        return description;
    }
}