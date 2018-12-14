package cst438team17.ticketsdb;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cst438team17.ticketsdb.entities.ConcertTicket;

@RestController
public class HeroController {
    @Autowired
    ITicketRespository ticketRepo;

    @GetMapping ("/allTickets")
    public List<ConcertTicket> getAll() {
        List<ConcertTicket> result = ticketRepo.findAll();
        return result;
    }

    @GetMapping ("/id/{id}")
    public ConcertTicket getTicketById (@PathVariable String id) {
        ConcertTicket result = ticketRepo.findByRepoId(id);
        return result;
    }

    @PutMapping ("/id/{id}")
    public ResponseEntity<ConcertTicket> updateTicket(@PathVariable("id") String id, @RequestBody ConcertTicket ticket) {
 
		Optional<ConcertTicket> ticketData = ticketRepo.findById(id);
 
		if (ticketData.isPresent()) {
            ConcertTicket _ticket = ticketData.get();
            _ticket.setStock(ticket.getStock());
            return new ResponseEntity<>(ticketRepo.save(_ticket), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}