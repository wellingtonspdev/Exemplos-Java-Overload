# Exemplos de Sobrecarga de Métodos (Overload) em Java ☕

Este repositório contém exemplos práticos que demonstram o conceito de sobrecarga de métodos (method overloading) na linguagem de programação Java. A sobrecarga de métodos permite que uma classe tenha múltiplos métodos com o mesmo nome, desde que suas listas de parâmetros sejam diferentes.

## O que é Sobrecarga de Métodos?

A sobrecarga de métodos é um recurso da programação orientada a objetos que aumenta a legibilidade do programa. Métodos podem ter o mesmo nome contanto que difiram em:

* **Número de parâmetros:** Um método pode ter dois parâmetros, enquanto outro com o mesmo nome pode ter três.
* **Tipo dos parâmetros:** Um método pode aceitar um `int` e um `String`, enquanto outro com o mesmo nome pode aceitar dois `int`.
* **Ordem dos tipos dos parâmetros:** Um método pode aceitar `(int, String)` e outro `(String, int)`.

**Importante:** O tipo de retorno do método, por si só, não é suficiente para diferenciar métodos sobrecarregados.

## Conteúdo do Repositório

Este repositório inclui os seguintes exemplos:

1.  **`Calculadora.java` (dentro de `ExemploOverload.java` ou similar):**
    * Demonstra a sobrecarga de um método `somar` com diferentes **tipos de parâmetros** (um que soma `int` e outro que soma `double`).
2.  **`Display.java` (dentro de `ExemploOverload2.java` ou similar):**
    * Mostra a sobrecarga de um método `exibir` com um **número diferente de parâmetros** (um que aceita uma `String` e outro que aceita duas `String`).
3.  **`Processador.java` (dentro de `ExemploOverload3.java` ou similar):**
    * Ilustra a sobrecarga de um método `processar` com uma **ordem diferente dos tipos de parâmetros** (um que aceita `(String, int)` e outro que aceita `(int, String)`).

## Como Usar os Exemplos

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/SEU_USUARIO/NOME_DO_REPOSITORIO.git](https://github.com/SEU_USUARIO/NOME_DO_REPOSITORIO.git)
    cd NOME_DO_REPOSITORIO
    ```
    (Substitua `SEU_USUARIO` e `NOME_DO_REPOSITORIO` pelos seus dados)

2.  **Pré-requisitos:**
    * Certifique-se de ter o JDK (Java Development Kit) instalado em sua máquina. Você pode verificar com `java -version` e `javac -version`.

3.  **Compile e Execute:**
    Navegue até o diretório onde o arquivo `.java` do exemplo está localizado.

    * Para compilar um arquivo Java (por exemplo, `ExemploOverload.java`):
        ```bash
        javac ExemploOverload.java
        ```
    * Para executar o arquivo compilado (que contém o método `main`):
        ```bash
        java ExemploOverload
        ```
    Repita o processo para os outros exemplos.

