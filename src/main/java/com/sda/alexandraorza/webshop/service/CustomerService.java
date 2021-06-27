package com.sda.alexandraorza.webshop.service;

import com.sda.alexandraorza.webshop.model.Account;
import com.sda.alexandraorza.webshop.model.Customer;
import com.sda.alexandraorza.webshop.repository.AccountRepository;
import com.sda.alexandraorza.webshop.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CustomerService {
    private final AccountRepository accountRepository;
    private final CustomerRepository customerRepository;

    // injected by Spring to the constructor(@Autowired)
    public CustomerService(AccountRepository accountRepository, CustomerRepository customerRepository) {
        this.accountRepository = accountRepository;
        this.customerRepository = customerRepository;
    }
    @Transactional
    public void addCustomer(Account account, Customer customer) {
        accountRepository.save(account);
        customerRepository.save(customer);
    }

    public Iterable<Account> getCustomerAccounts() {
        return accountRepository.findAll();
    }
}
