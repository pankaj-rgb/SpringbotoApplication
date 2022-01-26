package com.springbootdemo;

import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class SpringController {

	
	@Value("${server.port}")
	private int servervalue;
	
	@GetMapping
	public String getAlluser()
	{
		return "get all data";
	}
	
	@GetMapping("/new")
	public ResponseEntity<String> createCustomers()
	{
		System.out.println(servervalue);
		String response="data is fine";
		return new ResponseEntity<String>(response,HttpStatus.OK);
	}
	
	@GetMapping("/data/{valuess}")
	public String newPrints(@PathVariable ("valuess") int values)
	{
		return "new values is :"+values;
	}
	@GetMapping("/change/{datas}")
	public String getDetails(@PathVariable ("datas") int data) throws NoSuchDetailsException
	{
		if(data==0)
		throw new NoSuchDetailsException("value is not there");
//		else
			return "fine everythig";
	}
	
	@PostMapping("/changes3")
	public String changes2()
	{
		return "changes successdull";
	}
	
	@PostMapping("/changes2")
	public ResponseEntity createCustomer(@Valid @RequestBody CustomerDTO customerDTO, Errors errors )
	{
		System.out.println("hers ");
		String response="";
		if(errors.hasErrors())
		{
			response=errors.getAllErrors().stream().map(ObjectError::getDefaultMessage).collect(Collectors.joining(","));
			ErrorMessages er=new ErrorMessages();
			er.setErrorCode(HttpStatus.NOT_ACCEPTABLE.value());
			er.setErrorMessage(response);
			return ResponseEntity.ok(er);
		}
		else
		{
			response="value is there";
			return ResponseEntity.ok(response);
		}
	}
}
