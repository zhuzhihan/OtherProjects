package com.jt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix = "jdbc")
@PropertySource("classpath:/properties/jdbc.properties")
public class JDBCController {
	private String driver;
	private String name;
	private String password;

//	@Value(value = "${jdbc.driver}")
//	private String driver;
//	@Value(value = "${jdbc.name}")
//	private String name;
//	@Value(value = "${jdbc.password}")
//	private String password;
	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@RequestMapping("/doString")
	public String toString() {
		return driver + name + password;
	}
}
