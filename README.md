## Projeto Livraria - Spring Boot + MariaDB
Este projeto é um exemplo de aplicação CRUD usando Spring Boot, JPA e MariaDB. O sistema gerencia **autores** e **livros**, com relacionamento entre eles.

## Estrutura do Projeto

```
Livraria
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── livraria
│   │   │               ├── LivrariaApplication.java
│   │   │               ├── controller
│   │   │                   └── AutorController.java
│   │   │                   └── LivroController.java
│   │   │               ├── model
│   │   │                   └── Autor.java
│   │   │                   └── Livro.java
│   │   │               ├── repository
│   │   │                   └── AutorRepository.java
│   │   │                   └── LivroRepository.java
│   │   │               └── service
│   │   │                   └── AutorService.java
│   │   │                   └── LivroService.java
│   │   └── resources
│   │       ├── application.properties

├── pom.xml
└── README.md
```
---
## 🔧 Tecnologias usadas

- Java 22
- Spring Boot 3.4.4
- Spring Data JPA
- MariaDB
- Xampp
- Maven

---

## 📌 Funcionalidades

### 🔹 Autor
- Criar autor
- Listar todos
- Atualizar
- Deletar

### 🔹 Livro
- Criar livro (relacionado a um autor)
- Listar todos
- Atualizar
- Deletar

---
