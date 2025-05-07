package beats.estaticos.core.dtos;

import java.util.List;

import lombok.Data;

@Data
public class ContextoDTO {
  private String id;
  private List<String> decadas;
  private List<String> eventos;
  private List<String> relevantes;
  private List<String> tendencias;
  private List<String> tecnologias;
}
