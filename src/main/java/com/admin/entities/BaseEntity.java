package com.admin.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = -5375372246132547423L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	private Date createdDate;

	@Column(name = "last_updated_by")
	private String lastUpdatedBy;

	@Column(name = "last_updated_date")
	private Date lasteUpdatedDate;

	@Column(name = "description")
	private String description;

	@Version
	@Column(name = "version")
	private Long version;

	@Column(name = "is_enabled", nullable = false, columnDefinition = "boolean default true")
	private Boolean isEnabled = Boolean.TRUE;

}
