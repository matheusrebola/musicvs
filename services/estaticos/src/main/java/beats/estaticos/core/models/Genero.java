package beats.estaticos.core.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Genero {
  @Id
  private String id;
  private String nome;
  private List<String> origem;
  private List<String> caracteristicas;
  private List<String> subgeneros;
  private List<String> generos;
}
