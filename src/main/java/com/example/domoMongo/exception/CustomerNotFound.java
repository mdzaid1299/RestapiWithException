package com.example.domoMongo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "customer id is not found that you requested")
public class CustomerNotFound extends Exception {
}
