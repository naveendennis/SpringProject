package com.dennis.repositories;

import org.springframework.data.repository.CrudRepository;

import com.dennis.entity.Appointment;

public interface AppointmentRepository extends CrudRepository<Appointment, Long>{

}
