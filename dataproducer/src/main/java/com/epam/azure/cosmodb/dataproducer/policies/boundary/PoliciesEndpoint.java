package com.epam.azure.cosmodb.dataproducer.policies.boundary;

import com.epam.azure.cosmodb.dataproducer.policies.control.PolicyRepository;
import com.epam.azure.cosmodb.dataproducer.policies.entity.Policy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PoliciesEndpoint {
    private final PolicyRepository policyRepository;

    @Autowired
    public PoliciesEndpoint(PolicyRepository policyRepository) {
        this.policyRepository = policyRepository;
    }

    @PostMapping("/policies")
    public Policy createPolicy(@RequestBody Policy newPolicy) {
        return this.policyRepository.save(newPolicy);
    }

    @GetMapping("/policies")
    public Iterable<Policy> policies() {
        return this.policyRepository.findAll();
    }
}
