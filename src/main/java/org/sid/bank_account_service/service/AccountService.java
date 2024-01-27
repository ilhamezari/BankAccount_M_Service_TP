package org.sid.bank_account_service.service;

import org.sid.bank_account_service.DTO.BankAccountRequestDTO;
import org.sid.bank_account_service.DTO.BankAccountResponseDTO;

public interface AccountService {
 BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountRequestDTO);

    BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountRequestDTO);
}

