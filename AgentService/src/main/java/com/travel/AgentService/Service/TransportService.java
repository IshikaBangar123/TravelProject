package com.travel.AgentService.Service;

import com.travel.AgentService.Dto.BookingDto;
import com.travel.AgentService.Dto.ModeOfTransportDto;
import com.travel.AgentService.Entity.Booking;
import com.travel.AgentService.Entity.ModeOfTransport;

import java.util.List;

public interface TransportService {

    ModeOfTransport saveTransport(ModeOfTransportDto dto);

    ModeOfTransport getTransport(Long id);

    List<ModeOfTransport> getAll();

    ModeOfTransport updateTransport(ModeOfTransportDto dto, Long id);

    void deleteTransport(Long id);

}
