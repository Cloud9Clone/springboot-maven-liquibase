package com.customprojects.springliquibasemysql.models;

import org.springframework.data.repository.CrudRepository;

public interface AdvertisementRepository extends CrudRepository<Advertisement, Integer> {
    // This will be AUTO IMPLEMENTED by Spring into a Bean called advertisementRepository
}
