# Diferença entre Workflows e Actions no GitHub

## Explicação de workflow:
- É uma sequência de passos que o GitHub vai seguir, e fica em `.github/workflows/`, e define QUANDO e O QUE vai acontecer (ex: quando alguém faz push, roda os testes)

## Explicação de action:
- É uma tarefa específica que já vem pronta para usar, e pode ser reutilizada em vários workflows, ficando no GitHub Marketplace ou no próprio repositório

## Exemplo prático de ambas:
No nosso projeto, usamos a action `actions/setup-java@v4`:
```yaml
- name: Setup Java
  uses: actions/setup-java@v4
  with:
    java-version: '21'
    distribution: 'adopt'
```
- `uses:` diz qual action vamos usar
- `with:` passa os parâmetros que a action precisa

## Como uma action é feita:
Uma action precisa de um arquivo `action.yml` que define:
- Quais informações ela precisa receber, o que ela vai fazer, e o que ela vai retornar. É como uma função na programação que recebe dados, faz algo e retorna um resultado. 