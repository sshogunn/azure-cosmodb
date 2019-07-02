package com.epam.azure.cosmodb.dataproducer.policies.entity;

import com.microsoft.azure.spring.data.cosmosdb.core.mapping.Document;
import com.microsoft.azure.spring.data.cosmosdb.core.mapping.PartitionKey;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@Builder
@Document(collection = "policies")
public class Policy {
    @Id
    private String id;
    @PartitionKey
    private String name;
    private int version;
    private Date creationDate;
}
