# API Java Utilizando Spring Boot

Projeto realizado durante o bootcamp de Java da plataforma [DIO](https://web.dio.me/) 📚📕

## Tecnologias Utilizadas 🔍
- Java 17: últimas inovações que essa linguagem robusta e amplamente utilizada oferece;
- Sprong Boot 3: O Spring Boot ao longo dos últimos anos vem recebendo diversas atualizações, e atualmente está na versão 3.X que saiu ao final de 2022, e com essa nova versão temos mudanças muito importantes e diversas melhorias;
- Spring Data JPA: Ferramenta que possui o objetivo de facilitar o processo de persistência de dados em aplicações Spring, nos ajudando na integração de banco de dados SQL;
- OpenAPI (Swagger): Documenteção de API fácil e eficaz;
- Railway: Facilita o deploy e monitoramento de nossas soluções na nuvem, além de oferecer diversos bancos de dados como serviço;

URL Projeto Railway: https://java-api-rest.up.railway.app/swagger-ui/index.htm

## Diagrama de classes ✅
``` mermaid
classDiagram
    class User {
        +String name
        +Account account
        +List~Feature~ features
        +Card card
        +List~News~ news
    }

    class Account {
        +String number
        +String agency
        +double balance
        +double limit
    }

    class Feature {
        +String icon
        +String description
    }

    class Card {
        +String number
        +double limit
    }

    class News {
        +String icon
        +String description
    }

    User "1" *-- "1" Account
    User "1" *-- "N" Feature
    User "1" *-- "1" Card
    User "1" *-- "N" News

```
