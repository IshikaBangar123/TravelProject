package com.travel.AgentService.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModeOfTransportDto {
    private Long id;
    private String vehicelType;
    private String vehicle;
    private String vehicleNumber;

}
