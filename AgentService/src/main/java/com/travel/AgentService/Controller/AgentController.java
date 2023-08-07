package com.travel.AgentService.Controller;

import com.travel.AgentService.Dto.AgentDto;
import com.travel.AgentService.Entity.Agent;
import com.travel.AgentService.Service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgentController {

    @Autowired
    private AgentService agentService;

    @PostMapping("/save")
    public Agent saveData(@RequestBody AgentDto dto){
        return agentService.saveAgent(dto);
    }
}
