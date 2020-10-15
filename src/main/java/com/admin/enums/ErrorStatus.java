package com.admin.enums;

import lombok.Getter;

@Getter
public enum ErrorStatus {

	USER_ID_REQUIRED(1, "User Id is Required", "User Id is Required"),
	USER_NOT_EXIST(2, "User not exist", "User not exist");

	private Integer id;

	private String message;

	private String description;

	ErrorStatus(Integer id, String message, String description) {
		this.id = id;
		this.message = message;
		this.description = description;
	}

}
