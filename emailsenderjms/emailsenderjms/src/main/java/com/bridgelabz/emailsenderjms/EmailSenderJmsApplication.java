package com.bridgelabz.emailsenderjms;


import com.bridgelabz.emailsenderjms.services.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;


@SpringBootApplication
public class EmailSenderJmsApplication {

	@Autowired
	private EmailSenderService senderService;

	public static void main(String[] args) {
		System.out.println("Welcome To Email Sender Project");
		SpringApplication.run(EmailSenderJmsApplication.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
//	public void triggerMail() throws MessagingException {
	public void sendMail(){
		senderService.sendSimpleEmail("************@gmail.com",
				"This is email body",
				"This is email subject");

	}
}
