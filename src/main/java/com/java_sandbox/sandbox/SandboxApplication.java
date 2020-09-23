package com.java_sandbox.sandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

@SpringBootApplication
public class SandboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SandboxApplication.class, args);
		//FizzBuzz.doFizzBuzzFirstAttempt();
//		StringSandbox.reverseString("hakuna matata");
//	StringSandbox.PanagramTest("abcdfghijklmnnnopqrsuvwxyz");
		StringSandbox.StringCount("hello");
	}

}
