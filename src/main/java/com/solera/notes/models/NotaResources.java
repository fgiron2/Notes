package com.solera.notes.models;
import java.util.ArrayList;

import com.solera.notes.controller.NotaController;
public class NotaResources {
	
	public static void crearNota(Nota a) {
		Nota nueva = new Nota(a.getId(), a.getDescription(), a.getText(), a.getCreationDate(), a.getStimatedDate(), a.getCompletionDate(), a.getLink(), a.getMentions(), a.getPriority(), a.getStatus());
		NotaController.listaNotas.add(a);
	}
	
	public Nota showNotes() {
		return new Nota();
	}
	
	public void editNote() {
	}
	
	public void removeNote(Nota a) {
		
	}
	
}
