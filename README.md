# Contagem de Palavras em Java utilizando Map

Este projeto implementa um contador de palavras em Java, utilizando a interface `Map` para armazenar as palavras e suas respectivas contagens de ocorrência em um texto. O programa oferece operações básicas como adicionar, remover palavras, exibir as contagens e encontrar a palavra mais frequente.

## Funcionalidades

A classe `ContagemPalavras` implementa as seguintes operações:

- **adicionarPalavra(String palavra, Integer contagem):** Adiciona uma palavra e a sua contagem ao mapa de contagens. Se a palavra já estiver presente, sua contagem será incrementada.
- **removerPalavra(String palavra):** Remove uma palavra do mapa de contagens.
- **exibirContagemPalavras():** Exibe todas as palavras e suas respectivas contagens de ocorrência.
- **encontrarPalavraMaisFrequente():** Encontra a palavra mais frequente no texto e retorna a palavra e a sua contagem.

## Estrutura do Projeto

O projeto contém uma classe chamada `ContagemPalavras`, que utiliza um `Map<String, Integer>` para armazenar as palavras e suas contagens. O `Map` é a estrutura de dados que possibilita associar cada palavra à quantidade de vezes que ela aparece no texto.

## Tecnologias Utilizadas

- Java (JDK 8 ou superior)
- HashMap para implementação de Map
