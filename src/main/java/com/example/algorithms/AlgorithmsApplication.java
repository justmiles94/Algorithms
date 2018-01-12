package com.example.algorithms;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgorithmsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(AlgorithmsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
	}
	
	public void printArr(int ...arr) {
		System.out.println(Arrays.toString(arr));
	}
	
}
