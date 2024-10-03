package com.PetShop.persistence.mapper;

import com.PetShop.domain.VeterinarianDomain;
import com.PetShop.persistence.entity.Veterinarian;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface VeterinarianMapper {
    @Mappings({
            @Mapping(source = "veterinarianID", target = "veterianarianID"),
            @Mapping(source = "veterinarianFirstName", target = "veterinarianFirstName"),
            @Mapping(source = "veterinarianLastName", target = "veterinarianLastName"),
            @Mapping(source = "degree", target = "degree"),
            @Mapping(source = "veterinarianPhone", target = "veterinarianPhone"),
            @Mapping(source = "veterinarianEmail", target = "veterinarianEmail"),
            @Mapping(source = "age", target = "age")
    })
    VeterinarianDomain toVeterinarianDomain (Veterinarian veterinarian);

    @InheritInverseConfiguration
    @Mapping(target = "medicalAppointments", ignore = true)
    @Mapping(target = "medicalHistory", ignore = true)
    Veterinarian toVeterinarian (VeterinarianDomain veterinarianDomain);
}
