package com.ibm.crud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ibm.crud.Entity.Cliente;
import com.ibm.crud.Entity.Consumo;
import com.ibm.crud.Entity.Tarjeta;
import com.ibm.crud.Repository.ClienteRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;

@SpringBootApplication
@ComponentScan("com.imb.crud.imbCrud")
@EntityScan("com.ibm.crud.Entity")
@EnableJpaRepositories("com.ibm.crud.Repository")
public class IbmCrudApplication implements CommandLineRunner  {
	
	private static final Logger log = LoggerFactory.getLogger(IbmCrudApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(IbmCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
