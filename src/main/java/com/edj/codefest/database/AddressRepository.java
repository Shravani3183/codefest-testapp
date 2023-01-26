package com.edj.codefest.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, String>{
	
	Address findByAddressId(@Param("addressId") String addressId);

}
