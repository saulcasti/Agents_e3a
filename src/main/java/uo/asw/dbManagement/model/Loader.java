package uo.asw.dbManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.Date;

@XmlRootElement
@Entity
@Table(name = "loader")
public class Loader {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	@Column(name = "contrasena")
	private String contraseña;
	@NotNull
	private String nombreUsuario;
	@NotNull
	private String kind;
	@NotNull
	@Column(unique = true)
	private String dni;
	@NotNull
	private String nombre;
	@NotNull
	private String apellidos;
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;
	@NotNull
	private String email;
	@NotNull
	private String direccionPostal;
	@NotNull
	private String nacionalidad;
	@NotNull
	private String latitud;
	@NotNull
	private String longitud;
	
	private String kindCode;
	
	public Loader(){}
	
	

	public Loader(String contraseña, String nombreUsuario, String dni,
			String nombre, String apellidos, Date fechaNacimiento,
			String email, String direccionPostal, String nacionalidad, 
			String kind, String latitud, String longitud) {
		super();
		this.contraseña = contraseña;
		this.nombreUsuario = nombreUsuario;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.email = email;
		this.direccionPostal = direccionPostal;
		this.nacionalidad = nacionalidad;
		this.kind = kind;
		this.latitud = latitud;
		this.longitud = longitud;
	}



	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccionPostal() {
		return direccionPostal;
	}

	public void setDireccionPostal(String direccionPostal) {
		this.direccionPostal = direccionPostal;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getDni() {
		return dni;
	}
	
	public Long getId(){
		return id;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loader other = (Loader) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Loader [id=" + id + ", contraseña=" + contraseña + ", nombreUsuario=" + nombreUsuario + ", kind=" + kind
				+ ", dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento="
				+ fechaNacimiento + ", email=" + email + ", direccionPostal=" + direccionPostal + ", nacionalidad="
				+ nacionalidad + ", latitud=" + latitud + ", longitud=" + longitud + ", kindCode=" + kindCode + "]";
	}



	public void setKindCode(String string) {
		this.kindCode = string;
	}
	
	public String getKindCode() {
		return kindCode;
	}



	public String getKind() {
		return kind;
	}



	public void setKind(String kind) {
		this.kind = kind;
	}
	

	
}
