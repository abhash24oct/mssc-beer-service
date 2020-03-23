package abhash.springframework.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MvcExceptionHandler {
	
	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<List<String>> validationErrorHandler(ConstraintViolationException  e){
		
		List<String> error = new ArrayList<String>(e.getConstraintViolations().size());
		e.getConstraintViolations().forEach(e1 -> error.add(e1.getMessage()));
		return new ResponseEntity<List<String>>(error,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(BindException.class)
	public ResponseEntity<List<String>> bindErrorHandler(BindException  e){
		
		List<String> error = new ArrayList<String>(e.getErrorCount());
		e.getFieldErrors().forEach(e1 -> error.add(e1.getField() +" "+e1.getDefaultMessage()));
		return new ResponseEntity<List<String>>(error,HttpStatus.BAD_REQUEST);
	}

}
