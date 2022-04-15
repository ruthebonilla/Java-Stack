package com.codingdojo.savetravel.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="expense")
public class Expense {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    @NotNull
    @Size(min = 3, max = 100, message="field cannot be blank, must be 3-100 characters")
	private String name;
	
    
    @NotNull
    @Size(min = 3, max = 100, message="field cannot be blank, must be 3-100 characters")
	private String vendor;
	
    
    @NotNull(message="field cannot be blank")
    @Min(1)
    private Integer amount;
	
    
    @NotNull
    @Size(min = 5, max = 200, message="field cannot be blank, must be 5-200 characters")
	private String description;
    
    //-----------------------------------------------------------------
    
    
    
    // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    //-----------------------------------------------------------------

    
    
    //constructor
    public Expense() {
    	super();
    }
    

    public Expense(@NotNull @Size(min = 3, max = 100, message = "field cannot be blank") String name,
			@NotNull @Size(min = 3, max = 100, message = "field cannot be blank") String vendor,
			@NotNull(message = "nothing is free these days...") @Min(1) Integer amount,
			@NotNull @Size(min = 5, max = 200, message = "field cannot be blank") String description) {
		super();
		this.name = name;
		this.vendor = vendor;
		this.amount = amount;
		this.description = description;
	}
    
    
	public Expense(Long id, @NotNull @Size(min = 3, max = 100, message = "field cannot be blank") String name,
			@NotNull @Size(min = 3, max = 100, message = "field cannot be blank") String vendor,
			@NotNull(message = "nothing is free these days...") @Min(1) Integer amount,
			@NotNull @Size(min = 5, max = 200, message = "field cannot be blank") String description, Date createdAt,
			Date updatedAt) {
		super();
		this.id = id;
		this.name = name;
		this.vendor = vendor;
		this.amount = amount;
		this.description = description;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
    

	//-----------------------------------------------------------------

	//getters and setters
    public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getVendor() {
		return vendor;
	}


	public void setVendor(String vendor) {
		this.vendor = vendor;
	}


	public Integer getAmount() {
		return amount;
	}


	public void setAmount(Integer amount) {
		this.amount = amount;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
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
	
	//-----------------------------------------------------------------


 
    //gets times put into db
	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
	
	@PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
	
	
	
}
