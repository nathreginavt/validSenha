# Validador de Senha

Aplicação web responsável por validar senha, considerando uma senha como válida ao atender as seguintes regras:

```
• Conter nove ou mais caracteres;
• Conter ao menos 1 dígito;
• Conter ao menos 1 letra minúscula;
• Conter ao menos 1 letra maiúscula;
• Conter ao menos 1 caractere especial ( !@#$%^&*()-+ );
• Não possuir caracteres repetidos dentro do conjunto.
```

Foram utilizadas expressões regex para a lógica de validação na camada de serviço, cada uma em uma variável separada. 
A fim de evitar complexidades desnecessárias e separar as responsabilidades de cada regra, permitindo alterar ou aumentar as técnicas de validação sem precisar modificar código ja existente.

## 🚀 Começando

Essas instruções permitirão que você obtenha uma cópia do projeto em operação na sua máquina local para fins de desenvolvimento e teste.

### 📋 Pré-requisitos

De que coisas você precisa para utilizar o projeto?

```
• Java 17;
• Maven 3.9.9;
• Visual Studio Code, IntelliJ ou outra IDE de sua preferência;
• Postman, Insomnia ou outra ferramenta para executar a API.
```

### 🔧 Instalação

Como obter uma cópia do projeto?

Primeira opção:

```
Fazer download de arquivo ZIP do repositório;
Descompactá-lo no local de preferência na sua máquina.
```

Segunda opção:

```
Realizar o "fork" do repositório na sua conta GitHub;
Clonar na sua máquina o repositório criado.
```

## ⚙️ Executando

Essas instruções permitirão que você execute o projeto ou seus testes unitários, após abrir o repositório local em sua IDE de preferência.

### 🔩 Executando testes

O que é necessário entender para executar os testes?

Os testes unitários, desenvolvidos com a ferramente JUnit, estão presentes no seguinte caminho:

[src/test/java/com/example/demo/service/ValidSenhaServiceTest.java](https://github.com/nathreginavt/validSenha/blob/main/src/test/java/com/example/demo/service/ValidSenhaServiceTest.java)

Nessa classe, é possível executar testes para cada regra de validação da senha. 

Os nomes dos testes indicam o que o mesmo está verificando, por exemplo:

```
testSenhaCurta()
Verifica se uma senha com menos de 9 caracteres está válida.
```

```
testSenhaSemMinuscula()
Verifica se uma senha, não contendo letras minúsculas mas atendendo as demais condições, está válida.
```

Dessa forma, é possível validar senhas com configurações diferentes e verificar todas as regras existentes na lógica da aplicação.

### ⌨️ Executando a API

E como utilizar a API?

Primeiramente, é necessário compilar o projeto em sua IDE de preferência.

Em seguida, com auxílio de alguma ferramenta de teste de API, enviar a seguinte requisição:

```
POST localhost:8080/senha/validar/{senhaAValidar}

```

Onde, no lugar de {senhaAValidar}, deve ser inserida a String desejada para validação. 
Por exemplo:

```
POST localhost:8080/senha/validar/AbTp9!fok

```

Essa requisição vai retornar que a String enviada é, ou não, válida.

## 🛠️ Construído com

O projeto foi desenvolvido com as seguintes tecnologias

* [Springboot](https://spring.io/projects/spring-boot) - Framework web usado
* [Maven](https://maven.apache.org/) - Gerente de Dependência
* [Java](https://www.java.com/) - Linguagem utilizada

## ✒️ Autor

* **Nathália Regina V. Teixeira** - *Desenvolvedora* - [nathreginavt](https://github.com/nathreginavt)