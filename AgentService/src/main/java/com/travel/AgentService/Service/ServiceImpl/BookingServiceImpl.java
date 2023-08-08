package com.travel.AgentService.Service.ServiceImpl;

import com.travel.AgentService.Dto.BookingDto;
import com.travel.AgentService.Entity.Booking;
import com.travel.AgentService.Exception.ResourceNotFoundException;
import com.travel.AgentService.Repo.BookingRepo;
import com.travel.AgentService.Service.BookingService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepo bookingRepo;
    @Override
    public Booking saveBooking(BookingDto dto) {
        Booking booking = new Booking();
        BeanUtils.copyProperties(dto, booking);
        if(dto.getDropDestination() == null){
            throw new ResourceNotFoundException("Not Valid");
        }
        return bookingRepo.save(booking);
    }

    @Override
    public Booking getBooking(Long id) {
        return bookingRepo.findById(id).get();
    }

    @Override
    public List<Booking> getAll() {
        return bookingRepo.findAll();
    }

    @Override
    public Booking updateBooking(BookingDto dto, Long id) {
        Booking booking = bookingRepo.findById(id).get();
        BeanUtils.copyProperties(dto, booking);
        return bookingRepo.save(booking);
    }

    @Override
    public void deleteBooking(Long id) {
           bookingRepo.deleteById(id);
    }
}
