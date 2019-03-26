package com.br.savit0h.batchservicedemo.web;


import org.springframework.http.HttpHeaders;

public interface FactoryHeaders {

    HttpHeaders createHeaderWithAuthBasic(final String userName, final String password);

    HttpHeaders createHeaderWithoutAuth();
}
