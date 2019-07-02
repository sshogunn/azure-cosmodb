package com.epam.azure.cosmodb.dataproducer.policies.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PolicyHolder {
    private String firstName;
    private String surname;
}
