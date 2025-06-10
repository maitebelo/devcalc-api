# DevCalc API

## Descrição
DevCalc é uma API REST desenvolvida em Java que fornece operações matemáticas básicas. Este projeto serve como base para a implementação e validação de pipelines de CI/CD utilizando GitHub Actions.

## Tecnologias Utilizadas
- Java
- Spring Boot
- Maven (ferramenta de build)
- JUnit (para testes)
- GitHub Actions (para CI/CD)

## Pré-requisitos
- Java JDK 17 ou superior
- Maven 3.8.x ou superior
- Git

## Como Executar Localmente

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/devcalc-api.git
cd devcalc-api
```

2. Compile o projeto:
```bash
mvn clean install
```

3. Execute a aplicação:
```bash
mvn spring-boot:run
```

A API estará disponível em `http://localhost:8080`

## Endpoints Disponíveis

- `GET /add?a={valor1}&b={valor2}` - Realiza a soma de dois números
- `GET /subtract?a={valor1}&b={valor2}` - Realiza a subtração de dois números
- `GET /multiply?a={valor1}&b={valor2}` - Realiza a multiplicação de dois números
- `GET /divide?a={valor1}&b={valor2}` - Realiza a divisão de dois números

## Estrutura do Projeto
```
src/
├── main/
│   └── java/
│       └── com/
│           └── devcalc/
└── test/
    └── java/
        └── com/
            └── devcalc/
```

## Pipeline CI/CD
O projeto inclui workflows do GitHub Actions para:
- Verificação de código
- Testes automatizados
- Build
- Empacotamento
- Simulação de deploy

Os workflows estão localizados no diretório `.github/workflows/` 