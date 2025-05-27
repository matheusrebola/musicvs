package beats.estaticos.core.dtos;

import java.util.List;

import lombok.Data;

@Data
public class MusicaDTO {
  private String id;
  private String nome;
  private List<String> albuns; 
  private List<String> artistas;
  private String lancamento;
  private Float duracao;
  private String tom;
  private Byte andamento;
  private String cifra;
  private String letra;
  private List<String> estruturas;
  private List<String> estilos;
  private List<String> emocoes;
  private List<String> assuntos;
  private List<String> idioma;
}
