package com.ssw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.ssw.model.MailInfo;

@Service
public class MailServiceIMPL implements MailService {

	@Autowired
	private JavaMailSender sender;

	@Override
	public void SendMail(MailInfo info) {
		SimpleMailMessage message = new SimpleMailMessage();

		message.setFrom(info.getFrom());
		message.setTo(info.getTo());
		message.setSubject(info.getSub());
		message.setText(info.getText());

		sender.send(message);

	}

}
