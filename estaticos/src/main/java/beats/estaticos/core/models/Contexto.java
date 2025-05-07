package beats.estaticos.core.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Contexto {
  @Id
  private String id;
  private List<String> decadas;
  private List<String> eventos;
  private List<String> relevantes;
  private List<String> tendencias;
  private List<String> tecnologias;
}
