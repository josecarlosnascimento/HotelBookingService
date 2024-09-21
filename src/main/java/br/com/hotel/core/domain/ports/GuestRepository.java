package br.com.hotel.core.domain.ports;

import br.com.hotel.core.domain.entities.RoomEntity;

public interface GuestRepository {

	RoomEntity getById(Integer id);
	
}
