package tn.itbs.project.model;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity

public class Machine {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String nom;

    private String etat; // Ex: "Disponible", "En maintenance"

    private LocalDate derniereMaintenance;

}
