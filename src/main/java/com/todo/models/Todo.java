package com.todo.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Todo {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Todo [id=" + id + ", title=" + title + ", description=" + description + ", date=" + date + ", status="
				+ status + ", deleted=" + deleted + "]";
	}
	public Todo(int id, String title, String description, Date date, boolean status, boolean deleted) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.date = date;
		this.status = status;
		this.deleted = deleted;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	@Column(length = 50)
    private String title;
	@Column(length = 500)
    private String description;
    private Date date;
    private boolean status;
    private boolean deleted;
    
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
