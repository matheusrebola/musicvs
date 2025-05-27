package beats.estaticos.core.dtos;

import java.util.List;

import lombok.Data;

@Data
public class GeneroCreateDTO {
  private String nome;
  private List<String> origem;
  private List<String> caracteristicas;
  private List<String> subgeneros;
  private List<String> generos;
}
