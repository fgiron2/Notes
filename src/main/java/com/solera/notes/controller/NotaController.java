package com.solera.notes.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Stream;

import com.solera.notes.models.NivelPrioridad;
import com.solera.notes.models.Nota;
import com.solera.notes.models.Status;

public class NotaController {
	
	public static ArrayList<Nota> listaNotas = new ArrayList<>();

	public static Stream<Nota> crearNotasTestData(){
		return Stream.of(new Nota(1,
				"Primera nota",
				"El contenido de la primera nota",
				LocalDate.now(),
				LocalDate.now().plusDays(1),
				null,
				"https://localhost",
				"Pedro",
				NivelPrioridad.ALTA,
				Status.INPROGRESS));
	}
	
}
