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

## 🛠️ Como instalar e configurar o XAMPP + MariaDB

### 📥 1. Instalação do XAMPP

1. Acesse o site oficial: [https://www.apachefriends.org](https://www.apachefriends.org)
2. Baixe a versão compatível com seu sistema operacional.
3. Instale normalmente.
4. Após instalar, abra o **Painel de Controle do XAMPP**.

### 🟢 2. Iniciando o banco de dados

1. No Painel do XAMPP, clique em **Start** no módulo **MySQL** (usa o MariaDB por padrão).
2. Clique em **Admin** ao lado do MySQL para abrir o **phpMyAdmin**.
3. No phpMyAdmin, vá até a aba **"Databases"** e crie um novo banco de dados, com nome de "livraria".

### ⚙️ 3. Configuração no `application.properties`

Abra o arquivo `src/main/resources/application.properties` e configure com os dados do seu XAMPP:

```properties
spring.application.name=livraria

spring.datasource.url=jdbc:mariadb://localhost:3306/livraria
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MariaDBDialect
```

---

## 🧪 Testando a API

Use o Postman para testar os endpoints da API:


![image](https://github.com/user-attachments/assets/31338759-d967-4114-9d8c-bea3c8f00bd1)
