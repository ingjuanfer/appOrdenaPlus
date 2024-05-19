package com.ordenaplus.modelo;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalDate;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String DNI;
	private String Nombre_Usuario;
	private String UserSesion;
	private String ClaveSesion;
	private Date FechaRegistro;
	private Boolean Activo;
	private String Tel_Movil;
	private String Email;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(int id, String dNI, String nombre_Usuario, String userSesion, String claveSesion, Date fechaRegistro,
			Boolean activo, String tel_Movil, String email) {
		super();
		Id = id;
		DNI = dNI;
		Nombre_Usuario = nombre_Usuario;
		UserSesion = userSesion;
		ClaveSesion = claveSesion;
		FechaRegistro = fechaRegistro;
		Activo = activo;
		Tel_Movil = tel_Movil;
		Email = email;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre_Usuario() {
		return Nombre_Usuario;
	}

	public void setNombre_Usuario(String nombre_Usuario) {
		Nombre_Usuario = nombre_Usuario;
	}

	public String getUserSesion() {
		return UserSesion;
	}

	public void setUserSesion(String userSesion) {
		UserSesion = userSesion;
	}

	public String getClaveSesion() {
		return ClaveSesion;
	}

	public void setClaveSesion(String claveSesion) {
		ClaveSesion = claveSesion;
	}

	public Date getFechaRegistro() {
		return FechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		FechaRegistro = fechaRegistro;
	}
	
    @PrePersist
    protected void onCreate() {
    	FechaRegistro = Date.valueOf(LocalDate.now());
    }

	public Boolean getActivo() {
		return Activo;
	}

	public void setActivo(Boolean activo) {
		Activo = activo;
	}

	public String getTel_Movil() {
		return Tel_Movil;
	}

	public void setTel_Movil(String tel_Movil) {
		Tel_Movil = tel_Movil;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

}
