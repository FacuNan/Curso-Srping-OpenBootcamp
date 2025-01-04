package com.db_spring_boot.db_springboot;

import com.db_spring_boot.db_springboot.Repository.BookRepository;
import com.db_spring_boot.db_springboot.Entity.Book;
import java.time.LocalDate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication

public class DbSpringbootApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(DbSpringbootApplication.class, args);
                
                BookRepository repository = context.getBean(BookRepository.class);
               /**Guardar Objeto)**/
                Book libro1 = new Book("los tres chanchos","yo", 20.0, 25, LocalDate.of(1991, 03, 12), true);
                repository.save(libro1);
                
                /**Consultar Objeto**/
                System.out.println("Cantidad de libros en base de datos " + repository.findAll().size());
                
                /**Eliminar Objeto**/
        
                repository.deleteById(1L);
                
                System.out.println("Cantida de libros en base de datos: " + repository.findAll().size());
	}

}
