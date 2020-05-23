package com.annotation.dependson;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn
public class PersonalLoanCalculator {

	public PersonalLoanCalculator() {
		System.out.println("personalLoanCalculator");
	}
	          
}
