package com.deyvisson.todo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deyvisson.todo.domain.Todo;
import com.deyvisson.todo.repositories.TodoRepository;

@Service
public class DBService {
	@Autowired

	private TodoRepository repository;

	public void instanciaBaseDeDados() throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Todo t1 = new Todo(null, "Estudar", "Programação em Java Web", sdf.parse("03/01/2024"), true);
		Todo t2 = new Todo(null, "Ler", "Programação Full Stack em Java", sdf.parse("02/02/2024"), false);
		Todo t3 = new Todo(null, "Jogar", "Counter-Strike Source", sdf.parse("20/01/2024"), false);
		Todo t4 = new Todo(null, "Trabalhar", "No LeParc", sdf.parse("08/01/2024"), false);

		repository.saveAll(Arrays.asList(t1, t2, t3, t4));
	}
}