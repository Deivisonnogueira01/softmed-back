package com.ifms.softmed.domain.model;

/* 
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tb_pessoa")
public class Pessoa implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     protected Integer id;

     @Column(unique = true)
     protected String email;

     protected String senha;
     
     @ElementCollection(fetch = FetchType.EAGER)
     @CollectionTable(name = "PERFIS")
     protected Set<Perfil> perfils = new HashSet<>();

     @JsonFormat(pattern = "dd/mm/yyyy")
     protected LocalDate dataCriacao = LocalDate.now();
     
}*/
