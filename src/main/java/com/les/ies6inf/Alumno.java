package com.les.ies6inf;

import org.springframework.stereotype.Component;

@Component
public class Alumno {
	
	private String DNI;
	private String Nombre;
	private String Apellido;
	private String Dirección;
	private String Teléfono;
	private boolean Estado;
	
	public String getDNI()	{ 
		return this.DNI;
}
	public String getNombre()	{ 
		return this.Nombre;
}
	
	public String getApellido()	{ 
		return this.Apellido;
}
	public String getDirección()	{ 
		return this.Dirección;
}
	public String getTeléfono()	{ 
		return this.Teléfono;
}
	public boolean setEstado()	{ 
		return this.Estado;
}
}