package com.sda.alexandraorza.webshop;

import com.sda.alexandraorza.webshop.model.Account;
import com.sda.alexandraorza.webshop.service.CustomerService;
import com.sda.alexandraorza.webshop.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class WebshopApplication implements CommandLineRunner {
	@Autowired
	private CustomerService customerService;
	@Autowired
	private MailService mailService;

	public static void main(String[] args) {

		SpringApplication.run(WebshopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.refresh();

		//put here your code
		Account account1 = new Account();
		account1.setId(1L);
		customerService.addCustomer(account1);
		customerService.getCustomerAccounts().forEach(account-> System.out.println(account1));
		mailService.sendMail("aralexandracornelia@gmail.com",
				 "client@example.com",
				 "Mock mail subject",
				 "Mock mail content"
				);
	}
}
