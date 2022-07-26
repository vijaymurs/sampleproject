/**
 * 
 */
package com.sampleproject.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * @author Vijayakumar
 *
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserRequest {

	@JsonProperty("userId")
	public Integer userId;
	@JsonProperty("username")
	public String username;
	@JsonProperty("passwords")
	public String passwords;
	@JsonProperty("firstName")
	public String firstName;
	@JsonProperty("lastName")
	public String lastName;
	@JsonProperty("email")
	public String email;

}
