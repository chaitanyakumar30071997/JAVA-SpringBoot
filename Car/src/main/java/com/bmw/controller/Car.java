package com.bmw.controller;

import org.springframework.stereotype.Component;

@Component //By using annotation @component  Normal java class change  into web class 
public class Car {
	
	public Car() {
		
		System.out.println("This car controller ");
	}

}

/* Normal Java.class file Carservice Now change to web.class files service 
 ** Now create one packages , 
 ** Packages  name must be same //com.bmw.
---> src/main/java -->
 ** com.bmw --> Base Package (Or)  Parent package.
 ** com.bmw.controller :- Child package .
 ** com.bmw.Service :- also child packing
1 Now change normal java class into web class 
2 By using annotation @component  Normal java class change  into web class 
3 Now create one packages  name must be same .
4 Com.codingtips.services -->  CarService.java .


* 
*/
