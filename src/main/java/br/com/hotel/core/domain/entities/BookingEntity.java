package br.com.hotel.core.domain.entities;

import java.time.LocalDateTime;

import br.com.hotel.core.domain.enums.Status;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingEntity {

	private Integer id;
	private LocalDateTime placedAt;
	private LocalDateTime start;
	private LocalDateTime end;
	private Status status;
}
