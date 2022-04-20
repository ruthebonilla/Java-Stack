package com.codingdojo.dojosninjas.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="ninjas")
public class Ninja {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	
	
	@NotNull
	@Size(min = 2, max = 20, message="field cannot be blank, must be 2-20 characters")
	private String firstName;
	
	
	@NotNull
	@Size(min = 2, max = 20, message="field cannot be blank, must be 2-20 characters")
	private String lastName;
	
	
	@NotNull(message="field cannot be empty")
	@Min(18)
	private Integer age;
    //-----------------------------------------------------------------

	
	

	// This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    //-----------------------------------------------------------------
    
    
    //Creating the many to one relationship with Dojo class
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="dojo_id")
    private Dojo dojo;
    //-----------------------------------------------------------------

    
    //Constructors
    public Ninja() {
		super();
	}
    
    
    public Ninja(Long id,
			@NotNull @Size(min = 2, max = 20, message = "field cannot be blank, must be 2-20 characters") String firstName,
			@NotNull @Size(min = 2, max = 20, message = "field cannot be blank, must be 2-20 characters") String lastName,
			@NotNull(message = "field cannot be empty") @Min(18) @NotNull(message = "field cannot be empty") @Min(18) Integer age, Date createdAt, Date updatedAt,
			Dojo dojo) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.dojo = dojo;
	}


	public Ninja(
			@NotNull @Size(min = 2, max = 20, message = "field cannot be blank, must be 2-20 characters") String firstName,
			@NotNull @Size(min = 2, max = 20, message = "field cannot be blank, must be 2-20 characters") String lastName,
			@NotNull(message = "field cannot be empty") @Min(18) @NotNull(message = "field cannot be empty") @Min(18) Integer age, Dojo dojo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.dojo = dojo;
	}
    //-----------------------------------------------------------------

	


	//Getters and Setters
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public @NotNull(message = "field cannot be empty") @Min(18) Integer getAge() {
		return age;
	}


	public void setAge(@NotNull(message = "field cannot be empty") @Min(18) Integer age) {
		this.age = age;
	}


	public Date getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public Date getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}


	public Dojo getDojo() {
		return dojo;
	}


	public void setDojo(Dojo dojo) {
		this.dojo = dojo;
	}
    //-----------------------------------------------------------------

	
	
	
    
    //gets times put into database
  	@PrePersist
      protected void onCreate(){
          this.createdAt = new Date();
      }


	@PreUpdate
      protected void onUpdate(){
          this.updatedAt = new Date();
      }
	
}
