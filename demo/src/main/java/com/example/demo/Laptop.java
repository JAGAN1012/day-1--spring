package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
@Autowired
Hardware har;
public void compile() {
	System.out.println("i am from lap calss");
	har.dell();
}
}
