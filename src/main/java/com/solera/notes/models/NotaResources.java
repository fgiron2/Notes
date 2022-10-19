package com.solera.notes.models;
import java.util.ArrayList;

import com.solera.notes.controller.NotaController;
public class NotaResources {
	
	public static void crearNota(Nota a) throws Exception {
		// Validations
		if(a.getStimatedDate().isAfter(a.getCreationDate())){
			throw new Exception("Estimation date can't be earlier than creation date");
		}
		NotaController.listaNotas.add(a);
	}
	
	public Nota showNotes() {
		return new Nota();
	}
	public Link linkType(String link){
		Link type = Link.WEBPAGE;

		if(link.contains(".pdf")){
			type = Link.PDF;
		}

		if(link.contains("youtube")){
			type = Link.YOUTUBE;
		}

		if(link.contains("@")){
			type = Link.EMAIL;
		}
		return type;
	}

	public void editNote() {
	}
	
	public void removeNote(Nota a) {
		
	}
	
}
