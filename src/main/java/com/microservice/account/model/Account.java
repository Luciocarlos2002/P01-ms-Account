package com.microservice.account.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Account {


    @Id
    private String id;
    private String typeAccount;
    private String numberAccount;
    private int keyAccount;
    private double availableBalanceAccount;
    private String dateCreationAccount;
    private String statusAccount;
    private String idEmployeeCreation;
    private String idCustomer;


}
