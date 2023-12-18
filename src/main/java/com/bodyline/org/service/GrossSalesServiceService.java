package com.bodyline.org.service;

import com.bodyline.org.model.GrossSalesService;
import com.bodyline.org.repository.GrossSalesServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class GrossSalesServiceService {
    private final GrossSalesServiceRepository repository;

    @Autowired
    public GrossSalesServiceService(GrossSalesServiceRepository repository) {
        this.repository = repository;
    }

    public Flux<GrossSalesService> getGrossSalesServicesByTherapist(
            String userName,
            String dateNow,
            String lastDate,
            int page,
            int pageSize
    ) {
        int offset = (page - 1) * pageSize;
        return repository.callStoredProc(userName, dateNow, lastDate)
                .skip(offset)
                .take(pageSize);
    }
}
