package com.PetShop.domain.service;

import com.PetShop.domain.repository.VeterinarianDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeterinarianService {
    @Autowired
    private VeterinarianDomainRepository veterinarianDomainRepository;


}
