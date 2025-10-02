# Automação de Testes da Petstore API


Este projeto contém uma suíte de testes automatizados para a [API Petstore v2](https://petstore.swagger.io/), desenvolvida com foco na validação de saúde (Health Check), contratos (Swagger/OpenAPI) e funcionalidades da API.

---

## Arquitetura e Estrutura de Pastas

O projeto segue uma estrutura padrão Maven, com uma separação clara entre os tipos de testes e as configurações da pipeline.

    petstore-api-tests/
    │
    ├── .github/
    │   └── workflows/
    │       └── ci-pipeline.yml         # Define a pipeline de CI/CD no GitHub Actions
    │
    ├── src/
    │   ├── main/
    │   │   └── resources/
    │   │       └── specs/
    │   │           └── openapi.yaml    # Contrato da API (Swagger/OpenAPI)
    │   └── test/
    │       ├── java/br/com/api/
    │       │   ├── base/               # Classe base com configurações (BaseTest)
    │       │   ├── dataprovider/       # Provedores de massa de dados para os testes
    │       │   ├── factory/              # Modelos (POJOs) gerados pelo OpenAPI Generator
    │       │   └── test/
    │       │       ├── contract/       # Testes de Contrato
    │       │       ├── functional/     # Testes Funcionais
    │       │       └── healthcheck/    # Teste de Health Check
    │       └── resources/
    │
    ├── allure-results/                 # (Gerado) Resultados brutos do Allure
    ├── allure-report/                  # (Gerado) Relatório HTML do Allure
    ├── target/                         # (Gerado) Artefatos de build do Maven
    │
    ├── pom.xml                         # Arquivo de configuração do projeto Maven
    ├── testng-healthcheck.xml          # Suíte de teste para o Health Check
    ├── testng-contract.xml             # Suíte de teste para Contrato
    └── testng-functional.xml           # Suíte d

---

##  Tecnologias e Versões Utilizadas

* **Linguagem:** Java `23`
* **Build Tool:** Maven
* **Framework de Teste:** TestNG `7.11.0`
* **Cliente HTTP:** REST-assured `5.5.5`
* **Validação de Contrato:** Atlassian OpenAPI Validator `2.45.1`
* **Relatórios:** Allure Report `2.29.0`
* **CI/CD:** GitHub Actions

---

##  Pré-requisitos e Instalação

### Pré-requisitos

Para executar este projeto localmente, você precisará ter instalado:
1.  **JDK 23:** [Download via Adoptium (Temurin)](https://adoptium.net/)
2.  **Apache Maven:** [Guia de Instalação](https://maven.apache.org/install.html)
3.  **Allure Commandline:** Para visualizar os relatórios localmente. [Guia de Instalação](https://allurereport.org/docs/gettingstarted-installation-commandline/)

### Instalação

1.  Clone o repositório:
    ```bash
    git clone [https://github.com/BrunoZanotta/petstore-api-tests.git](https://github.com/BrunoZanotta/petstore-api-tests.git)
    cd petstore-api-tests
    ```

2.  O Maven instalará todas as dependências do projeto automaticamente. Para garantir que tudo está baixado, você pode rodar:
    ```bash
    mvn clean install
    ```

---

## Execução dos Testes

### Execução Local

Você pode executar cada suíte de teste individualmente através da linha de comando, usando os arquivos `testng.xml` apropriados. Os resultados do Allure serão gerados na pasta `target/allure-results`.

* **Executar o Health Check:**
    ```bash
    mvn clean test -Dsurefire.suiteXmlFiles=testng-healthcheck.xml
    ```

* **Executar os Testes de Contrato:**
    ```bash
    mvn clean test -Dsurefire.suiteXmlFiles=testng-contract.xml
    ```

* **Executar os Testes Funcionais:**
    ```bash
    mvn clean test -Dsurefire.suiteXmlFiles=testng-functional.xml
    ```

### Visualizando o Relatório Localmente

Após executar qualquer um dos comandos acima, você pode gerar e abrir o relatório HTML do Allure:

1.  **Gere o relatório:**
    ```bash
    allure generate target/allure-results --clean -o allure-report
    ```

2.  **Abra o relatório no seu navegador:**
    ```bash
    allure serve target/allure-results
    ```

### Execução via CI/CD (GitHub Actions)

A pipeline é acionada automaticamente a cada `push` na branch `main`. Ela executa os testes na seguinte sequência:
1.  **HealthCheck**
2.  **Contract Test**
3.  **Functional Test**
4. **Generate Allure Report**

Ao final da execução, um relatório unificado do Allure é gerado e publicado. Você pode acessá-lo através do link disponível na aba **Actions** do repositório ou diretamente na página do GitHub Pages do projeto:

[**https://brunozanotta.github.io/petstore-api-tests/**](https://brunozanotta.github.io/petstore-api-tests/)
```eof