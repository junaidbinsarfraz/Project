package com.unilib.controller;

import com.unilib.model.Validation;

public interface BookOrderingController {
	
	public Validation orderBook(Integer studentId, String studentPin, String bookIsbn);
	
}
