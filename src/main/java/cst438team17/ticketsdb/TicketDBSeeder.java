package cst438team17.ticketsdb;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import cst438team17.ticketsdb.entities.Artist;
import cst438team17.ticketsdb.entities.ConcertTicket;
import cst438team17.ticketsdb.entities.Date;
import cst438team17.ticketsdb.entities.Venue;

@Component
public class TicketDBSeeder implements CommandLineRunner{
    @Autowired
    ITicketRespository ticketRepo;

    @Override
    public void run(String... args) throws Exception {
        ConcertTicket twentyonepilots = new ConcertTicket("Twenty One Pilots", "9/13/19", "Greek Theatre", 10, 10, 30.00, "Test");
        ConcertTicket eminem = new ConcertTicket("Eminem","10/13/19", "Civic Center", 10, 10, 30.00, "Test");
        ConcertTicket thestrokes = new ConcertTicket("The Strokes", "1/13/19", "SAP Center", 10, 10, 30.00, "Test");
        ConcertTicket dillonfrancis = new ConcertTicket("Dillon Francis", "3/4/19", "Fox Theater", 10, 10, 30.00, "Test");
        ConcertTicket drake = new ConcertTicket("Drake", "1/2/19", "The Regency Ballroom", 10, 10, 30.00, "Test");
        ConcertTicket greenday = new ConcertTicket(("Green Day"), "5/26/19", "Shoreline Ampitheatre", 10, 10, 30.00, "Test");
        ConcertTicket boypablo = new ConcertTicket("Boy Pablo", "1/2/19", "The Regency Ballroom", 10, 10, 30.00, "Test");
        ConcertTicket kendricklamar = new ConcertTicket("Kendrick Lamar", ("12/6/18"), "The Regency Ballroom", 10, 10, 30.00, "Test");


        ticketRepo.deleteAll();
        List<ConcertTicket> concerts = Arrays.asList(twentyonepilots, eminem, thestrokes, dillonfrancis, drake, greenday, boypablo, kendricklamar);
        ticketRepo.saveAll(concerts);
    }

}