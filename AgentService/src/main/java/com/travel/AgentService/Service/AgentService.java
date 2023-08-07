package com.travel.AgentService.Service;

import com.travel.AgentService.Dto.AgentDto;
import com.travel.AgentService.Entity.Agent;

public interface AgentService {

    Agent saveAgent(AgentDto dto);
}
