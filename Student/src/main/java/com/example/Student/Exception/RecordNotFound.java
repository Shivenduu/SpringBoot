package com.example.Student.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_GATEWAY, reason="No Record available")
public class RecordNotFound extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public RecordNotFound()
	{
		super();
		
	}
	
	public RecordNotFound(String message)
	{
		super(message);
	}

}
