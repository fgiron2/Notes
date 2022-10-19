package com.solera.notes.models;

import java.time.LocalDate;

public class Nota {
	private int id;
	private String description;
	private String text;
	private LocalDate creationDate;
	private LocalDate stimatedDate;
	private LocalDate completionDate;
	private String link;
	private String mentions;
	private NivelPrioridad priority;
	private Status status;
	
	public Nota() {}
	
	public Nota(int id, String description, String text, LocalDate creationDate, LocalDate stimatedDate,
			LocalDate completionDate, String link, String mentions, NivelPrioridad priority, Status status) {
		this.id = id;
		this.description = description;
		this.text = text;
		this.creationDate = creationDate;
		this.stimatedDate = stimatedDate;
		this.completionDate = completionDate;
		this.link = link;
		this.mentions = mentions;
		this.priority = priority;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public LocalDate getStimatedDate() {
		return stimatedDate;
	}

	public void setStimatedDate(LocalDate stimatedDate) {
		this.stimatedDate = stimatedDate;
	}

	public LocalDate getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(LocalDate completionDate) {
		this.completionDate = completionDate;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getMentions() {
		return mentions;
	}

	public void setMentions(String mentions) {
		this.mentions = mentions;
	}

	public NivelPrioridad getPriority() {
		return priority;
	}

	public void setPriority(NivelPrioridad priority) {
		this.priority = priority;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	
	
	
}
