package com.caiogarcia.devdojo.core.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ApplicationUser implements AbstractEntity{

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @EqualsAndHashCode.Include
  private Long id;

  @NotNull(message = "the field 'username' is mandatory")
  @Column(nullable = false)
  private String username;

  @NotNull(message = "the field 'password' is mandatory")
  @Column(nullable = false)
  private String password;

  @NotNull(message = "the field 'role' is mandatory")
  @Column(nullable = false)
  private String role = "USER";

  public ApplicationUser(@NotNull ApplicationUser applicationUser){
    this.id = applicationUser.getId();
    this.username = applicationUser.getUsername();
    this.password = applicationUser.getPassword();
    this.role = applicationUser.getRole();
  }
}
