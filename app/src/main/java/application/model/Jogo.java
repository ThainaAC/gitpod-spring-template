package application.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "jogos")
public class Jogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;    
    private int anoDelancamento;
    
    public int getAnoDelancamento() {
        return anoDelancamento;
    }
    public void setAnoDelancamento(int anoDelancamento) {
        this.anoDelancamento = anoDelancamento;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
  public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
} 