package beats.estaticos.core.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Artista {
  @Id
  private String id;
  private String nome;
  private String artistico;
  private String nacionalidade;
  private String atividade;
  private List<String> generos;
  private List<String> influencias;
  private List<String> influenciou;
  private String biografia;
  private List<String> instrumento;
  private List<String> colaboracoes; 
}
