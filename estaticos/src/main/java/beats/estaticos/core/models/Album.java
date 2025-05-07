package beats.estaticos.core.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Album {
  @Id
  private String id;
  private List<String> artista;
  private String lancamento;
  private List<String> generos;
  private String gravadora;
  private List<String> produtores;
  private Byte faixas;
  private Float duracao;
  private String tipo;
}
