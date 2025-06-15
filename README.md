# DevCalc API

[![CI Pipeline](https://github.com/maitebelo/devcalc-api/actions/workflows/ci.yml/badge.svg)](https://github.com/maitebelo/devcalc-api/actions/workflows/ci.yml)

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

## GitHub Actions Workflows  
   ```bash
   mvn spring-boot:run
   ```

## GitHub Actions Workflows

1. **Iniciação** (`.github/workflows/main.yml`)
   - Executa quando:
     - Push na main
     - Criação de pull request para a main
   - Passos:
     - Checkout: baixa o código
     - Mensagem: exibe "Pipeline iniciado"

2. **CI Pipeline** (`.github/workflows/ci.yml`)
   - Executa automaticamente quando:
     - Push na main
     - Criação de pull request para a main
     - Execução manual pelo GitHub
   - Passos:
     - Checkout: baixa o código
     - Build: compila o projeto
     - Test: executa os testes
     - Package: gera o arquivo .jar
     - Deploy: simula o deploy

## Depuração do CI

1. **Problema**:
   - O job `build` falhou devido ao comando `exit 1` adicionado. Assim, o job `build` mostra status "Failed" no Github Actions

2. **Ferramentas**:
   - GitHub Actions para ver o status dos jobs;
   - Logs do job para ver a mensagem de erro específica;
   - Editor do workflow para corrigir o comando problemático

3. **Solução**:
   - Removido o `|| exit 1` do comando de build
   - O pipeline voltou a funcionar normalmente após a correção
 
### Execução Automática vs Manual

1. **Execução por Push**:
   - Acionada automaticamente ao fazer push para as branches main ou dev
   - Executa todos os jobs por padrão
   - Útil para garantir que o código está sempre testado

2. **Execução Manual**:
   - Acionada pelo botão "Run workflow" na aba Actions
   - Permite escolher quais verificações executar (testes e linting)
   - Útil para testar partes específicas do pipeline 