package com.ms.email.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Email;

@Data
public class EmailDto {

	@NotBlank
	private String ownerRef;

	@NotBlank
	@Email
	private String emailFrom;

	@NotBlank
	@Email
	private String emailTo;

	@NotBlank
	private String subject;

	@NotBlank
	private String text;


}
