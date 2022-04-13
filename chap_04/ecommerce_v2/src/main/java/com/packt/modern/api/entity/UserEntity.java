package com.packt.modern.api.entity;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "user")
public class UserEntity {

  @Id
  @GeneratedValue
  @Column(name = "ID", updatable = false, nullable = false)
  private UUID id;

  private String username;
  private String password;
  private String firstName;
  private String lastName;
  private String email;
  private String phone;
  private String userStatus;
  private List<AddressEntity> addresses = Collections.emptyList();

}
