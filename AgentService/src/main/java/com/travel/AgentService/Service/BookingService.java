package com.travel.AgentService.Service;

import com.travel.AgentService.Dto.BookingDto;
import com.travel.AgentService.Entity.Booking;

import java.util.List;

public interface BookingService {

    Booking saveBooking(BookingDto dto);

    Booking getBooking(Long id);

    List<Booking> getAll();

    Booking updateBooking(BookingDto dto, Long id);

    void deleteBooking(Long id);
}
