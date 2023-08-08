package com.travel.AgentService.Service.ServiceImpl;

import com.travel.AgentService.Dto.ModeOfTransportDto;
import com.travel.AgentService.Entity.ModeOfTransport;
import com.travel.AgentService.Repo.TransportRepo;
import com.travel.AgentService.Service.TransportService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportServiceImpl implements TransportService {

    @Autowired
    private TransportRepo transportRepo;

    @Override
    public ModeOfTransport saveTransport(ModeOfTransportDto dto) {
        ModeOfTransport transport = new ModeOfTransport();
        BeanUtils.copyProperties(dto, transport);
        return transportRepo.save(transport);
    }

    @Override
    public ModeOfTransport getTransport(Long id) {
        return transportRepo.findById(id).get();
    }

    @Override
    public List<ModeOfTransport> getAll() {
        return transportRepo.findAll();
    }

    @Override
    public ModeOfTransport updateTransport(ModeOfTransportDto dto, Long id) {
        ModeOfTransport transport = transportRepo.findById(id).get();
        BeanUtils.copyProperties(dto, transport);
        return transportRepo.save(transport);
    }

    @Override
    public void deleteTransport(Long id) {
       transportRepo.deleteById(id);
    }
}
