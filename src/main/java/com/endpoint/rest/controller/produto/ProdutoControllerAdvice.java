package com.endpoint.rest.controller.produto;

import com.endpoint.rest.exception.produto.ProductNullException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ProdutoControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ProductNullException.class)
    public ResponseEntity<Object> capturaErroNull() {

        Map<String, Object> body = new HashMap<String, Object>();
        body.put("message", "Preencha os campos do produto");

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
    }

    @ExceptionHandler(ProductNullException.class)
    public ResponseEntity<Object> capturaErroPrecoNegativol() {

        Map<String, Object> body = new HashMap<String, Object>();
        body.put("message", "O preço não pode ser negativo");

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
    }
}
