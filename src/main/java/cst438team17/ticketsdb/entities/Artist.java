package cst438team17.ticketsdb.entities;

public class Artist {
    private String name;

    public Artist(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}