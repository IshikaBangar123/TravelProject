package com.travel.AgentService.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Timer;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingDto {
    private Long id;
    private String pickUp;
    private String dropDestination;
    private String routeTo;
    private String routeFrom;
    private LocalDateTime departureDate;
    private LocalDateTime reachDate;
    private String travellingTime;
}
