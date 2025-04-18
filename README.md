# Spring Boot com RabbitMQ

[![Java](https://img.shields.io/badge/Java-21-orange.svg)](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.3-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![RabbitMQ](https://img.shields.io/badge/RabbitMQ-3.12-orange.svg)](https://www.rabbitmq.com/)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

Este projeto demonstra a integração entre Spring Boot e RabbitMQ, implementando um sistema de mensageria assíncrono. O exemplo é baseado no guia oficial do Spring, mas com melhorias e atualizações para as versões mais recentes das tecnologias.

## 🚀 Tecnologias Utilizadas

- Java 21
- Spring Boot 3.2.3
- Spring AMQP
- RabbitMQ 3.12
- Docker & Docker Compose
- Oracle Database
- OpenZipkin (para rastreamento distribuído)
- Lombok
- Maven

## 📋 Pré-requisitos

- JDK 21
- Docker e Docker Compose
- Maven 3.6+
- IDE de sua preferência (recomendado: IntelliJ IDEA ou VS Code)

## 🔧 Configuração do Ambiente

1. Clone o repositório:
```bash
git clone https://github.com/marcosvrc/springbootrabbitmq.git
cd springbootrabbitmq
```

2. Inicie os serviços com Docker Compose:
```bash
cd src/main/resources
docker-compose up -d
```

3. Verifique se os serviços estão rodando:
   - RabbitMQ Management: http://localhost:15672/
     - Usuário: guest
     - Senha: guest
   - Zipkin: http://localhost:9411/

## 🏃‍♂️ Executando o Projeto

1. Compile o projeto:
```bash
mvn clean install
```

2. Execute a aplicação:
```bash
mvn spring-boot:run
```

## 🎯 Funcionalidades

- Publicação e consumo de mensagens assíncronas
- Filas durável e não-durável
- Exchanges do tipo Direct, Fanout e Topic
- Dead Letter Queue para tratamento de erros
- Rastreamento distribuído com Zipkin
- Monitoramento via RabbitMQ Management Console

## 📦 Estrutura do Projeto

```
src/
├── main/
│   ├── java/
│   │   └── br/com/springbootrmq/
│   │       ├── config/         # Configurações do RabbitMQ
│   │       ├── controller/     # REST Controllers
│   │       ├── model/         # Entidades
│   │       ├── service/       # Lógica de negócio
│   │       └── Application.java
│   └── resources/
│       ├── application.properties
│       └── docker-compose.yaml
└── test/
    └── java/
        └── br/com/springbootrmq/
            └── # Testes unitários e de integração
```

## 🔍 Monitoramento

- **RabbitMQ Management**: http://localhost:15672/
  - Monitoramento de filas, exchanges e mensagens
  - Visualização de métricas de performance

- **Zipkin**: http://localhost:9411/
  - Rastreamento distribuído
  - Análise de latência

## 🤝 Contribuindo

1. Fork o projeto
2. Crie sua Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a Branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request

## 📝 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## 📫 Contato

Marcos Vinício - [@marcosvrc](https://github.com/marcosvrc)

Link do projeto: [https://github.com/marcosvrc/springbootrabbitmq](https://github.com/marcosvrc/springbootrabbitmq)