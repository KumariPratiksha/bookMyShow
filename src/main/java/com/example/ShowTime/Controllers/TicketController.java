package com.example.ShowTime.Controllers;

import com.example.ShowTime.EntryDtos.TicketEntryDto;
import com.example.ShowTime.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ticekt")
public class TicketController {
    @Autowired
    TicketService ticketService;

    @PostMapping("addTicket")
    public ResponseEntity addTicket(@RequestBody TicketEntryDto ticketEntryDto) throws Exception{
        try {
            return ticketService.addTicket(ticketEntryDto);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

//    @DeleteMapping("cancelTicket")
//    public ResponseEntity cancelTicket(@RequestBody DeleteTicketEntryDto deleteTicketEntryDto) throws Exception{
//        try{
//            return ticketService.cancelTicket(deleteTicketEntryDto);
//        } catch (Exception e) {
//            return new ResponseEntity(e.getMessage().toString(), HttpStatus.BAD_REQUEST);
//        }
//    }
}
