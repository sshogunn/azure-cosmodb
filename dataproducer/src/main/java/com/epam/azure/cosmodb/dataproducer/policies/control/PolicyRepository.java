package com.epam.azure.cosmodb.dataproducer.policies.control;

import com.epam.azure.cosmodb.dataproducer.policies.entity.Policy;
import com.microsoft.azure.spring.data.cosmosdb.repository.DocumentDbRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PolicyRepository extends DocumentDbRepository<Policy, String> {
    List<Policy> findByName(String name);
}

