package com.packt.modern.api.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "address")
public class AddressEntity {

  @Id
  @GeneratedValue
  @Column(name = "ID", updatable = false, nullable = false)
  private UUID id;

}
