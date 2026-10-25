package edu.fran.fichajes;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.fran.fichajes.entities.Equipo;
import edu.fran.fichajes.entities.Fichaje;
import edu.fran.fichajes.entities.Jugador;
import edu.fran.fichajes.repositories.IEquipoRepository;
import edu.fran.fichajes.repositories.IFichajeRepository;
import edu.fran.fichajes.repositories.IJugadorRepository;

@SpringBootApplication
public class FichajesApplication implements CommandLineRunner {

	@Autowired 
	private IJugadorRepository jugadorRepository;

	@Autowired
	private IEquipoRepository equipoRepository;

	@Autowired
	private IFichajeRepository fichajeRepository;

	public static void main(String[] args) {
		SpringApplication.run(FichajesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Jugador pedroJugador = new Jugador("Pedro");
		Jugador luisJugador = new Jugador("Luis");

		Equipo deportivoEquipo = new Equipo("Deportivo");
		Equipo celtaEquipo = new Equipo("Celta");

		jugadorRepository.save(pedroJugador);
		jugadorRepository.save(luisJugador);

		equipoRepository.save(deportivoEquipo);
		equipoRepository.save(celtaEquipo);

		

		Fichaje fichaje1 = new Fichaje(LocalDate.of(2026, 9, 01));
		fichaje1.setJugador(pedroJugador);
		fichaje1.setEquipo(deportivoEquipo);

		fichajeRepository.save(fichaje1);

		Fichaje fichaje2 = new Fichaje(LocalDate.of(2026, 10, 15));
		fichaje2.setJugador(pedroJugador);
		fichaje2.setEquipo(celtaEquipo);

		fichajeRepository.save(fichaje2);

		Fichaje fichaje3 = new Fichaje(LocalDate.of(2027, 11, 20));
		fichaje3.setJugador(pedroJugador);
		fichaje3.setEquipo(deportivoEquipo);

		fichajeRepository.save(fichaje3);

		for (Fichaje fichaje : fichajeRepository.findAll()) {
			System.out.println(fichaje);
			System.out.println("Jugador: " + fichaje.getJugador().getNombre());
			System.out.println("Equipo: " + fichaje.getEquipo().getNombre());
		}















		
	}
}
