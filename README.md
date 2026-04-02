# Sistema de Olimpíadas

 o objetivo de simular um sistema de provas, contendo participantes, questões e tentativas.


## O que o sistema faz

O sistema permite:

* Cadastrar participantes
* Cadastrar provas
* Criar questões com alternativas
* Aplicar questões aos participantes
* Registrar respostas
* Calcular a nota final


## Refatoração do código

O código foi reorganizado para melhorar a organização e facilitar o entendimento.

* As classes do pacote `model` ficaram responsáveis apenas por representar os dados do sistema
* As classes do pacote `service` ficaram responsáveis pelas regras de funcionamento
* A classe `App` ficou responsável por executar o sistema e interagir com o usuário


## Aplicação dos princípios SOLID

### SRP - Princípio da Responsabilidade Única


Isso evita que uma mesma classe tenha muitas funções diferentes.



### OCP - Princípio Aberto/Fechado

O sistema foi organizado de forma que seja possível adicionar novas funcionalidades sem alterar o que já está funcionando.

Isso ajuda a evitar erros e facilita futuras alterações.


## Estrutura do projeto

O projeto está dividido da seguinte forma:

* `model`: contém as classes que representam os dados do sistema
* `service`: contém as regras de negócio
* `App.java`: classe principal responsável pela execução



## Considerações finais

O principal objetivo do projeto foi aplicar conceitos de organização de código e boas práticas de programação.
A refatoração ajudou a deixar o sistema mais estruturado e mais fácil de entender.

- App: execução
