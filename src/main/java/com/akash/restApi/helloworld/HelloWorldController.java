package com.akash.restApi.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(path = "/hello-world")
	public String HelloWorld() {
		return "Hello World";
	}

	@GetMapping(path = "/hello")
	public String Hello() {
		return "Hello this is Akash";
	}

	@GetMapping(path = "/hello-bean")
	public HellworldBean helloWorldBean() {
		return new HellworldBean("Hello World");
	}
	
	@GetMapping(path = "/hello-world/path-var/{name}")
	public HellworldBean helloWorldVar(@PathVariable String name) {
		return new HellworldBean("Hello World " + name);
	}
}