package com.nisum.application.users.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class UsersEntity implements Serializable {

	private static final long serialVersionUID = 7616485375821505100L;
	
	@Id
	@Column(name = "id", updatable = false, nullable = false)
	private String id;
	private String name;
	private String email;
	private String password;
	@OneToMany(mappedBy="users_id",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<PhonesEntity> phones;
	@Temporal(TemporalType.DATE)
	private Date created;
	@Temporal(TemporalType.DATE)
	private Date modified;
	@Column(name = "last_login")
	@Temporal(TemporalType.DATE)
	private Date lastLogin;
	private String token;
	private boolean isactive;
}
