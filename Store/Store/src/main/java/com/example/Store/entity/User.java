package com.example.Store.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import java.util.List;
import org.hibernate.annotations.ColumnDefault;
@Entity
@Table(name="user_details")
public class User {
	   @Id
	   @GeneratedValue(
	      strategy = GenerationType.IDENTITY
	   )
	   @Column(
	      name = "user_id"
	   )
	   private long id;
	   @Column(
	      name = "first_name"
	   )
	   private String firstName;
	   @Column(
	      name = "last_name"
	   )
	   private String lastName;
	   @Column(
	      name = "phno",
	      unique = true
	   )
	   private String phno;
	   @Column(
	      name = "email",
	      unique = true
	   )
	   private String email;
	   @Column(
	      name = "password"
	   )
	   private String password;
	   @Column(
	      name = "role"
	   )
	   @ColumnDefault("'customer'")
	   private String role;
	   @OneToMany
	   @JoinColumn(
	      name = "user_id"
	   )
	   private List<Address> addressList;

	   public User() {
	   }

	   public long getId() {
	      return this.id;
	   }

	   public void setId(long id) {
	      this.id = id;
	   }

	   public String getFirstName() {
	      return this.firstName;
	   }

	   public void setFirstName(String firstName) {
	      this.firstName = firstName;
	   }

	   public String getLastName() {
	      return this.lastName;
	   }

	   public void setLastName(String lastName) {
	      this.lastName = lastName;
	   }

	   public String getPhno() {
	      return this.phno;
	   }

	   public void setPhno(String phno) {
	      this.phno = phno;
	   }

	   public String getEmail() {
	      return this.email;
	   }

	   public void setEmail(String email) {
	      this.email = email;
	   }

	   public String getPassword() {
	      return this.password;
	   }

	   public void setPassword(String password) {
	      this.password = password;
	   }

	   public String getRole() {
	      return this.role;
	   }

	   public void setRole(String role) {
	      this.role = role;
	   }

	  
	}
