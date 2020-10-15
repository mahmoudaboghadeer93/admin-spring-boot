package com.admin.dtos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.admin.entities.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class BaseDTO implements Serializable {

	private static final long serialVersionUID = 247788148929554035L;

	private Long id;

	private String createdBy;

	private Date createdDate;

	private String lastUpdatedBy;

	private Date lasteUpdatedDate;

	private String description;

	private Long version;

	private Boolean isEnabled = Boolean.TRUE;

	private List<ErrorDTO> errors;

	protected abstract BaseDTO toDTO(BaseEntity baseEntity);

	protected abstract BaseEntity toEntity();

	public BaseDTO toBaseDTO(BaseEntity baseEntity) {
		id = baseEntity.getId();
		createdBy = baseEntity.getCreatedBy();
		createdDate = baseEntity.getCreatedDate();
		lastUpdatedBy = baseEntity.getLastUpdatedBy();
		lasteUpdatedDate = baseEntity.getLasteUpdatedDate();
		description = baseEntity.getDescription();
		version = baseEntity.getVersion();
		isEnabled = baseEntity.getIsEnabled();
		return this;
	}

	public BaseEntity toBaseEntity(BaseEntity baseEntity) {
		baseEntity.setId(id);
		baseEntity.setCreatedBy(createdBy);
		baseEntity.setCreatedDate(createdDate);
		baseEntity.setLastUpdatedBy(lastUpdatedBy);
		baseEntity.setLastUpdatedBy(lastUpdatedBy);
		baseEntity.setIsEnabled(isEnabled);
		return baseEntity;
	}

}
