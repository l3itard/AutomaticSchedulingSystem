package org.AutomaticSchedulingSystem.service;

import org.AutomaticSchedulingSystem.model.Request;
import org.AutomaticSchedulingSystem.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestService {
    @Autowired
    private RequestRepository rr;
    public void add(Request request){
        rr.save(request);
    }
}
