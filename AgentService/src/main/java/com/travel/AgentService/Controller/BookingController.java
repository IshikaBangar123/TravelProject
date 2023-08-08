package com.travel.AgentService.Controller;

import com.travel.AgentService.Dto.BookingDto;
import com.travel.AgentService.Entity.Booking;
import com.travel.AgentService.Repo.BookingRepo;
import com.travel.AgentService.Service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/save/booking")
    public Booking save(@RequestBody BookingDto bookingDto){
        return bookingService.saveBooking(bookingDto);
    }

    @GetMapping("/get/booking/{id}")
    public Booking get(@PathVariable Long id){
        return bookingService.getBooking(id);
    }

    @GetMapping("get/booking")
    public List<Booking> getAll(){
        return bookingService.getAll();
    }

    @PostMapping("/update/booking/{id}")
    public Booking update(@RequestBody BookingDto bookingDto, @PathVariable Long id){
        return bookingService.updateBooking(bookingDto, id);
    }

    public String delete(@PathVariable Long id){
        bookingService.deleteBooking(id);
        return "Deleted";
    }
}
