package com.example.demo.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/////////Non_Prod
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationModel {
	
	private String  rname;
	private String  rpass;
	private String  remail;
	private Long rphone;
}
