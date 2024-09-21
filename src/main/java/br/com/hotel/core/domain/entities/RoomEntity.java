package br.com.hotel.core.domain.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoomEntity {

	private Integer id;
	private String name;
	private Integer level;
	private boolean inMaintanance;
	
	public boolean isAvailable() {
		return !inMaintanance && !hasGuest();
	}

	private boolean hasGuest() {
		return false;
	}
}
