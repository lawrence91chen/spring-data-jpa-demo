package com.github.lawrence91chen.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "sys_prop")
@Entity
@Data
public class SysProp {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	@Column(name = "system")
	private String system;
	@Column(name = "name")
	private String name;
	@Column(name = "value")
	private String value;
}
