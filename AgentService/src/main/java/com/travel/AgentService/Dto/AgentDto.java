package com.travel.AgentService.Dto;

import com.travel.AgentService.Entity.Booking;
import com.travel.AgentService.Entity.ModeOfTransport;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AgentDto {

    private Long id;
    private String name;
    private String agentLic;
    private String mobileNo;
    private String address;
    private List<Booking> booking;
    private List<ModeOfTransport> transport;
}
