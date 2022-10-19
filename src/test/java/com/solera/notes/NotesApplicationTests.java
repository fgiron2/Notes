package com.solera.notes;

import com.solera.notes.controller.NotaController;
import com.solera.notes.models.Nota;
import com.solera.notes.models.NotaResources;
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

	@ParameterizedTest
	@MethodSource("com.solera.notes.controller.NotaController#crearNotasTestData")
	void crearNotaTest(Nota nota) {
		NotaResources.crearNota(nota);
		Assert.isTrue(NotaController.listaNotas.contains(nota), "La nota especificada no se ha creado");
	}

}
