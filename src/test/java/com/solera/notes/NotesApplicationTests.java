package com.solera.notes;

import com.solera.notes.controller.NotaController;
import com.solera.notes.models.Link;
import com.solera.notes.models.Nota;
import com.solera.notes.models.NotaResources;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class NotesApplicationTests {

	@Test
	void contextLoads() {
	}
	
	//Test crear nota
	@ParameterizedTest
	@MethodSource("com.solera.notes.controller.NotaController#crearNotasTestData")
	void crearNotaTest(Nota nota) {
		try {
			NotaResources.crearNota(nota);
			}catch(Exception e) {
				System.out.println();
			}
		Assert.isTrue(NotaController.listaNotas.contains(nota), "La nota especificada no se ha creado");
	}
	
	@ParameterizedTest
	@MethodSource("com.solera.notes.controller.NotaController#crearNotasTestData")
	void checkLink(Nota nota) {
		try {
		NotaResources.crearNota(nota);
		}catch(Exception e) {
			System.out.println();
		}
		Assert.isTrue(NotaResources.linkType(nota.getLink()) == Link.PDF, "No es pdf");
	}
	
	@ParameterizedTest
	@MethodSource("com.solera.notes.controller.NotaController#crearNotasTestData")
	void checkDate(Nota nota) {
		nota.setStimatedDate(LocalDate.now().minusDays(5));
		try {
			NotaResources.crearNota(nota);
		}catch(Exception e) {
			fail("Error");
		}
	}
	
}
