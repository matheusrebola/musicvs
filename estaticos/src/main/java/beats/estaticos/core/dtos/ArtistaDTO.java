package beats.estaticos.core.dtos;

import java.util.List;

import lombok.Data;

@Data
public class ArtistaDTO {
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
