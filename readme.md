<img src="https://www.calendariodovestibular.com.br/wp-content/uploads/2020/08/vestibular-fiap-2022.jpg" />
<br />

## Recrutador
Atividade Enterprise Connection BRQ
Equipe NinjaBit

**Requer instalado**
* apache maven
* java 17 ou superior
* Postman

**Instruções**
  * clonar o repositorio https://github.com/deaxavier/recrutador.git
  * importar a collection Recrutador.postman_collection.json no postman
  * abrir a pasta do projeto em um terminal
  * rodar o comando mvn spring-boot:run

## Descrição dos endpoints

### BuscarTodasAsVagas
_Retorna vagas abertas no sistema_ <br/>
* endereço: http://localhost:8080/vagas
  * verbo: GET
  
### BuscarCandidatosVaga
_Retorna candidatos da vaga ordenado pela classificação (candidato mais aderente aos skils da vaga)_ <br/>
* endereço: http://localhost:8080/vagas/{idVaga}/candidatos
  * verbo: GET