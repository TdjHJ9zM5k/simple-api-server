package it.social.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDTO {
	
    @JsonProperty("username")
    private String username;

    @JsonProperty("password")
    private String password;

    public UserDTO() {}

    public UserDTO(String username, String password) {
        this.username = username;
        this.password = password;
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

}
