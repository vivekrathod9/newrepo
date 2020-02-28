package com.indexial.hbm.OneToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="lib_otm")
public class Library {
@Id
	int libId;
	String libName;
	
	@OneToMany(cascade=CascadeType.ALL)
	List<Book> listOfBook;
	
	
	@Override
	public String toString() {
		return "Library [libId=" + libId + ", libName=" + libName + ", listOfBook=" + listOfBook + "]";
	}
	public Library(int libId, String libName, List<Book> listOfBook) {
		super();
		this.libId = libId;
		this.libName = libName;
		this.listOfBook = listOfBook;
	}
	public int getLibId() {
		return libId;
	}
	public void setLibId(int libId) {
		this.libId = libId;
	}
	public String getLibName() {
		return libName;
	}
	public void setLibName(String libName) {
		this.libName = libName;
	}
	public List<Book> getListOfBook() {
		return listOfBook;
	}
	public void setListOfBook(List<Book> listOfBook) {
		this.listOfBook = listOfBook;
	}
	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
