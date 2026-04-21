
public class EquipoMain {

	public static void main(String[] args) {
		Alumno alumno1 = new Alumno ("Rafa", "1A");
		Alumno alumno2 = new Alumno ("Manuel", "2A");
		Alumno alumno3 = new Alumno ("Hector", "3A");
		
		Equipo equipo1 = new Equipo ("Madrid");
		Equipo equipo2 = new Equipo ("Barcelona");
		
		try {
			equipo1.añadirAlumno(alumno1);
			equipo1.añadirAlumno(alumno2);
			equipo2.añadirAlumno(alumno3);
			equipo2.añadirAlumno(alumno1);
			
			equipo1.alumnoBuscarEnEquipo(alumno3);
			equipo1.separacionEquipos(equipo1, "Vallecanos");
		} catch (AlumnosException e) {
			System.out.println(e.getMessage());
		}
	}

}
