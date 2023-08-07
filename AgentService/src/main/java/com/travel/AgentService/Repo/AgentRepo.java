package com.travel.AgentService.Repo;

import com.travel.AgentService.Entity.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgentRepo extends JpaRepository<Agent, Long>{
}
