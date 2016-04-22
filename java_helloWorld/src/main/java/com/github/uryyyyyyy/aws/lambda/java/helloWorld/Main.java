package com.github.uryyyyyyy.aws.lambda.java.helloWorld;


import com.amazonaws.services.lambda.runtime.Context;

public class Main {

	public static void main(String args[]){
		System.out.println("Hello World!!");
	}

	public static void hello(int count, Context context){
		System.out.println("Hello World!!");
		System.out.println("count: " + count);
	}
}
