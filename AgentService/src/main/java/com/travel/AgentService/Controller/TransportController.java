package com.travel.AgentService.Controller;

import com.travel.AgentService.Dto.BookingDto;
import com.travel.AgentService.Dto.ModeOfTransportDto;
import com.travel.AgentService.Entity.Booking;
import com.travel.AgentService.Entity.ModeOfTransport;
import com.travel.AgentService.Service.BookingService;
import com.travel.AgentService.Service.TransportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransportController {

    @Autowired
    private TransportService transportService;

    @PostMapping("/save/transport")
    public ModeOfTransport save(@RequestBody ModeOfTransportDto dto){
        return transportService.saveTransport(dto);
    }

    @GetMapping("/get/transport/{id}")
    public ModeOfTransport get(@PathVariable Long id){
        return transportService.getTransport(id);
    }

    @GetMapping("get/transport")
    public List<ModeOfTransport> getAll(){
        return transportService.getAll();
    }

    @PostMapping("/update/transport/{id}")
    public ModeOfTransport update(@RequestBody ModeOfTransportDto dto, @PathVariable Long id){
        return transportService.updateTransport(dto, id);
    }

    public String delete(@PathVariable Long id){
        transportService.deleteTransport(id);
        return "Deleted";
    }
}
