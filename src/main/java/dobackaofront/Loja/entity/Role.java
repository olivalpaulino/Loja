package dobackaofront.Loja.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "roles")
public class Role implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, length = 20)
    private String nome_da_permissao;

    @ManyToMany(mappedBy = "roles")
    private List<Usuario> usuarios;
}
