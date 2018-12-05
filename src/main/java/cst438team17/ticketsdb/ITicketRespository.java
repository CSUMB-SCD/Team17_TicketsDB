package cst438team17.ticketsdb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import cst438team17.ticketsdb.entities.ConcertTicket;

@Repository
public interface ITicketRespository extends MongoRepository<ConcertTicket, String> {

}