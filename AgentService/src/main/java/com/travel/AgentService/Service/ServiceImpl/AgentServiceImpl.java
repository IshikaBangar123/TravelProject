package com.travel.AgentService.Service.ServiceImpl;

import com.travel.AgentService.Dto.AgentDto;
import com.travel.AgentService.Entity.Agent;
import com.travel.AgentService.Entity.Booking;
import com.travel.AgentService.Entity.ModeOfTransport;
import com.travel.AgentService.Repo.AgentRepo;
import com.travel.AgentService.Repo.BookingRepo;
import com.travel.AgentService.Repo.TransportRepo;
import com.travel.AgentService.Service.AgentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AgentServiceImpl implements AgentService {

    @Autowired
    private AgentRepo agentRepo;

    @Autowired
    private BookingRepo bookingRepo;

    @Autowired
    private TransportRepo transportRepo;
    @Override
    public Agent saveAgent(AgentDto dto) {

        Agent agent = new Agent();
        BeanUtils.copyProperties(dto, agent);
        List<Booking> booking = new ArrayList<>();
        BeanUtils.copyProperties(dto, booking);
        List<ModeOfTransport> transport = new ArrayList<>();
        BeanUtils.copyProperties(dto,transport);
        agent.setTransport(transport);
        agent.setBooking(booking);
        bookingRepo.saveAll(booking);
        transportRepo.saveAll(transport);
        agentRepo.save(agent);
        return null;
    }
}
