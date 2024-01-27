package org.sid.bank_account_service.DTO;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.bank_account_service.enums.AccountType;

import java.util.Date;
@Data @NoArgsConstructor  @AllArgsConstructor
public class BankAccountRequestDTO {



    private Double balance;
    private String currency;
    private AccountType type;
}
