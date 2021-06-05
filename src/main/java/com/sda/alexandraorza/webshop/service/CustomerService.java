package com.sda.alexandraorza.webshop.service;

import com.sda.alexandraorza.webshop.model.Account;
import com.sda.alexandraorza.webshop.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
      private final AccountRepository accountRepository;

      // injected by Spring to the constructor
    public CustomerService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    public void addCustomer(Account account){
        accountRepository.save(account);
    }
    public List<Account> getCustomerAccounts(){
        return accountRepository.getAll();
    }
}
