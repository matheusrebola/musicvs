package beats.estaticos.core.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Musica {
  @Id
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
