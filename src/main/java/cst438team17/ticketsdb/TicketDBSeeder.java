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
        ConcertTicket twentyonepilots = new ConcertTicket("Twenty One Pilots", "9/13/19", "Greek Theatre", 10, 10, 30.00, "Watch as singer Tyler Joseph and drummer Josh Dun put on a two-man show on an Emotional Roadshow you won't forget!");
        ConcertTicket eminem = new ConcertTicket("Eminem","10/13/19", "Civic Center", 10, 10, 30.00, "See Rap God Eminem as he tours across the U.S. performing hits like The Real Slim Shady and Without Me!");
        ConcertTicket thestrokes = new ConcertTicket("The Strokes", "1/13/19", "SAP Center", 10, 10, 30.00, "Rock out with The Strokes while listening to their alternative classic, Reptilia!");
        ConcertTicket dillonfrancis = new ConcertTicket("Dillon Francis", "3/4/19", "Fox Theater", 10, 10, 30.00, "Get your trap on as Dillon Francis drops the beat in the Fox Theater!");
        ConcertTicket drake = new ConcertTicket("Drake", "1/2/19", "The Regency Ballroom", 10, 10, 30.00, "Listen to Drake as he dishes out lyrical, mellow tracks in The Regency Ballroom!");
        ConcertTicket greenday = new ConcertTicket(("Green Day"), "5/26/19", "Shoreline Ampitheatre", 10, 10, 30.00, "Green Day is back again with a classic rock show around the country. Watch them now before it's too late!");
        ConcertTicket boypablo = new ConcertTicket("Boy Pablo", "1/2/19", "The Regency Ballroom", 10, 10, 30.00, "See Boy Pablo while he's killing every show in the Bay Area at The Regency Ballroom!");
        ConcertTicket kendricklamar = new ConcertTicket("Kendrick Lamar", ("12/6/18"), "The Regency Ballroom", 10, 10, 30.00, "Hear Kendrick Lamar live as he debuts his newest hit album HUMBLE across the nation!");


        ticketRepo.deleteAll();
        List<ConcertTicket> concerts = Arrays.asList(twentyonepilots, eminem, thestrokes, dillonfrancis, drake, greenday, boypablo, kendricklamar);
        ticketRepo.saveAll(concerts);
    }

}