
  package com.dxc.banking.dao;
  
  import org.springframework.data.mongodb.repository.MongoRepository; import
  org.springframework.stereotype.Repository;
  
  import com.dxc.banking.models.UserCredentials;
  
  @Repository public interface LogonRepository extends  MongoRepository<UserCredentials, String>{
  
  }
 