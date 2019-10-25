package com.meritamerica.onlinebank.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long user_id;
	private String first_name;
	private String last_name;
	private String username;
	private String password;
	private String email;
	@Transient
	private String passwordConfirmation;
	@Column(updatable = false)

	private Integer medic_id;
	private Integer is_admin;
	private Integer is_active;
	private Date createdAt;
	private Date updatedAt;

	public User(Long user_id, String first_name, String last_name, String username, String password, String email,
			String passwordConfirmation, Integer medic_id, Integer is_admin, Integer is_active, Date createdAt,
			Date updatedAt) {
		this.user_id = user_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.passwordConfirmation = passwordConfirmation;
		this.medic_id = medic_id;
		this.is_admin = is_admin;
		this.is_active = is_active;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Integer getIs_active() {
		return is_active;
	}

	public void setIs_active(Integer is_active) {
		this.is_active = is_active;
	}

	public User(String first_name, String last_name, String username, String password, String email) {

		this.first_name = first_name;
		this.last_name = last_name;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public User() {
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}

	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
	}

	public Integer getMedic_id() {
		return medic_id;
	}

	public void setMedic_id(Integer medic_id) {
		this.medic_id = medic_id;
	}

	public Integer getIs_admin() {
		return is_admin;
	}

	public void setIs_admin(Integer is_admin) {
		this.is_admin = is_admin;
	}

	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

}
