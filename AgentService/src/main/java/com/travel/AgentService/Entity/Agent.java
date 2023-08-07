package com.travel.AgentService.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String agentLic;
    private String mobileNo;
    private String address;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Booking> booking;
    @OneToMany(cascade = CascadeType.ALL)
    private List<ModeOfTransport> transport;

}
