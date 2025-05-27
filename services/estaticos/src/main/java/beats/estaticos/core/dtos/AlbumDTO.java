package beats.estaticos.core.dtos;

import java.util.List;

import lombok.Data;

@Data
public class AlbumDTO {
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
