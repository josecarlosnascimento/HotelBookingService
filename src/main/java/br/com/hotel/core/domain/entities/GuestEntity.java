package br.com.hotel.core.domain.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GuestEntity {

	private Integer id;
	private String name;
	private String lastName;
	private String email;
	
}
