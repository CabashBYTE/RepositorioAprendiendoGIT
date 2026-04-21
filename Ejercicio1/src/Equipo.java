import java.util.HashSet;

public class Equipo {

	private String nombre;
	private HashSet<Alumno> Alumnos;

	public Equipo(String nombre) {
		this.nombre = nombre;

		Alumnos = new HashSet<Alumno>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		
		return "Alumnos: " + this.Alumnos;
	}

	public void añadirAlumno(Alumno alumnoAAñadir) throws AlumnosException {
		if (Alumnos.contains(alumnoAAñadir)) {
			throw new AlumnosException("El alumnos ya está añadido");
		} else {
			Alumnos.add(alumnoAAñadir);
		}

	}
	
	public void borrarAlumno(Alumno alumnoABorrar) throws AlumnosException {
		if (!Alumnos.contains(alumnoABorrar)) {
			throw new AlumnosException("El alumno no existe");
		}else {
			Alumnos.remove(alumnoABorrar);
		}
	}
	
	public Alumno alumnoBuscarEnEquipo(Alumno alumnoABuscar) {
		if (!Alumnos.contains(alumnoABuscar)) {
			return null;
		}else {
			return alumnoABuscar;
		}
	}
	
	public Equipo unionEquipos(Equipo equipo1, String nombre) {
		Equipo equipoUnion = new Equipo (nombre);
		
		equipoUnion.Alumnos.addAll(Alumnos);
		equipoUnion.Alumnos.addAll(equipo1.Alumnos);
		
		return equipoUnion;
		
	}
	
	public Equipo separacionEquipos(Equipo equipo1, String nombre) {
		
		Equipo equipoSeparacion = new Equipo(nombre);
		
		for(Alumno Alumnos : this.Alumnos) {
			if (equipo1.Alumnos.contains(Alumnos)) {
				equipoSeparacion.Alumnos.add(Alumnos);
			}
		}
		
		return equipoSeparacion;
	}

}
