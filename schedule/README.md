# Santander Bootcamp 2023 Java API

RESTful API para agendamento de serviços construída em Java 17 com Spring Boot 3.

## Principais Tecnologias
 - **Java 17**: Utilizaremos a versão LTS mais recente do Java para tirar vantagem das últimas inovações que essa linguagem robusta e amplamente utilizada oferece;
 - **Spring Boot 3**: Trabalharemos com a mais nova versão do Spring Boot, que maximiza a produtividade do desenvolvedor por meio de sua poderosa premissa de autoconfiguração;
 - **Spring Data JPA**: Exploraremos como essa ferramenta pode simplificar nossa camada de acesso aos dados, facilitando a integração com bancos de dados SQL;
 - **OpenAPI (Swagger)**: Vamos criar uma documentação de API eficaz e fácil de entender usando a OpenAPI (Swagger), perfeitamente alinhada com a alta produtividade que o Spring Boot oferece;
 - **Railway**: facilita o deploy e monitoramento de nossas soluções na nuvem, além de oferecer diversos bancos de dados como serviço e pipelines de CI/CD.

## Diagrama de Classes (Domínio da API)

```mermaid
class Company {
  +name: String
  +address: Address[]
  +contact: Contact[]
  +operation: Operation[]
  +professional: Professional[]
}

class Address {
  +CEP: String
  +street: String
  +number: String
  +complement: String
  +city: String
  +state: String
  +country: String
  +active: Boolean
}

class Contact {
  +type: String
  +value: String
}

class Operation {
  +day: String
  +start: String
  +end: String
}

class Professional {
  +name: String
  +services: Service[]
}

class Service {
  +name: String
  +description: String
  +duration: String
  +price: Float
}

Company *-- Address
Company *-- Contact
Company *-- Operation
Company *-- Professional
Professional *-- Service
```