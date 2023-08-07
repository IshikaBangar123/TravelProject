package com.travel.AgentService.Repo;

import com.travel.AgentService.Entity.ModeOfTransport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportRepo extends JpaRepository<ModeOfTransport, Long> {
}
