package tn.itbs.project.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Employe {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private String poste;

    @ManyToOne
    @JoinColumn(name = "machine_id")
    private Machine machineAssignee;
}
