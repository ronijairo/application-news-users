package com.nisum.application.users.persistence.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import java.io.Serializable;
import javax.persistence.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="phones")
public class PhonesEntity implements Serializable {

	private static final long serialVersionUID = 8336276381379130448L;
	/*
	@Id
	@Column(name = "id", updatable = false, nullable = false)*/
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "id", unique = true, updatable = false, nullable = false)
	private String id;
	@Column(name = "users_id", updatable = false, nullable = false)
	private String users_id;
	private String number;
	private Integer citycode;
	private Integer contrycode;
}
