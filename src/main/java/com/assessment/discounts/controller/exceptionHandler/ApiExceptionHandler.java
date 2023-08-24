package com.assessment.discounts.controller.exceptionHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(
        {
            MethodArgumentNotValidException.class,
            HttpMessageNotReadableException.class
        }
    )
    public ResponseEntity<ExceptionResponse> handleValidationException(Throwable throwable) {
        logger.error("Error while handling request: " + throwable);
        return new ResponseEntity<>(
                new ExceptionResponse(HttpStatus.BAD_REQUEST, throwable.getLocalizedMessage()),
                HttpStatus.BAD_REQUEST
        );
    }

    private final Logger logger = LoggerFactory.getLogger(ApiExceptionHandler.class);

}
