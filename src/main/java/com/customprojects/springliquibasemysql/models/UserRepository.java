package com.customprojects.springliquibasemysql.models;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    // This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
}
