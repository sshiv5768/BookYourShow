package com.example.jsppractice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
	@GeneratedValue
	@Column(name="movieID")
	private Integer movieID;
	@Column(name="movieName")
	private String movieName;
	@Column(name="language")
	private String languages;
	@Column(name="duration")
	private Integer duration;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getMoiveID() {
		return movieID;
	}
	public void setMoiveID(Integer movieID) {
		this.movieID = movieID;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		this.languages = languages;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	

}
	
	