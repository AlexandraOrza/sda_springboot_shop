package com.sda.alexandraorza.webshop;

import com.sda.alexandraorza.webshop.model.Account;
import com.sda.alexandraorza.webshop.model.Customer;
import com.sda.alexandraorza.webshop.repository.AccountRepository;
import com.sda.alexandraorza.webshop.service.CustomerService;
import com.sda.alexandraorza.webshop.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.sda.alexandraorza.webshop.repository")
@EntityScan(basePackages = "com.sda.alexandraorza.webshop.model")

public class WebshopApplication implements CommandLineRunner {
	@Autowired
	private CustomerService customerService;
	@Autowired
	private MailService mailService;
	@Autowired
	private AccountRepository accountRepository;

	public static void main(String[] args) {
		SpringApplication.run(WebshopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.refresh();

		Account account1 = new Account();
		//account1.setId(1L);
		Customer customer = new Customer();
		customer.setId(1L);
		customerService.addCustomer(account1,customer);

		customerService.getCustomerAccounts().forEach(account-> System.out.println(account));
		mailService.sendMail("aralexandracornelia@gmail.com",
				 "client@example.com",
				 "Mock mail subject",
				 "Mock mail content"
				);
		accountRepository.findAllByIsClosed(false).forEach(System.out::println);
	}
}
