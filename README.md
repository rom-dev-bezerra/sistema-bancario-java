# 🏦 Sistema Bancário em Java com Persistência

Este é um projeto desenvolvido em **Java** para consolidar conceitos fundamentais de **Programação Orientada a Objetos (POO)** e explorar a integração com bancos de dados relacionais utilizando **JDBC e PostgreSQL**.

A aplicação simula o ecossistema de um terminal bancário, permitindo gerenciar contas, realizar operações financeiras básicas e transferências seguras entre clientes através de uma interface interativa no console.

🚧 **Projeto em desenvolvimento** — evoluindo de uma arquitetura baseada em memória local para persistência completa em banco de dados.

---

## 🛠️ Tecnologias e Conceitos Praticados

- **Linguagem:** Java (Versão 17+)
- **Banco de Dados:** PostgreSQL
- **Conectividade:** JDBC (Java Database Connectivity)
- **Orientação a Objetos:** Classes, objetos, construtores, encapsulamento e manipulação de referências.
- **Coleções e Fluxos:** `ArrayList`, estruturas de repetição (`while`, `for`) e controle de fluxo (`switch/case`).
- **Segurança de Dados:** Tratamento de exceções com `try/catch` e prevenção contra SQL Injection usando `PreparedStatement`.

---

## 📌 Funcionalidades Concluídas

- [x] **Autenticação Dinâmica:** Fluxo de login interativo exigindo o número da conta e senha para liberação do menu principal.
- [x] **Consulta de Dados:** Exibição estruturada das informações básicas da conta e do saldo atual do titular.
- [x] **Depósito e Saque:** Operações financeiras validadas (impedindo valores negativos ou saques superiores ao saldo disponível).
- [x] **Transferências Seguras (TED/Pix):** Sistema de transferência entre contas que valida se o saldo de origem é suficiente antes de debitar o valor e impede transferências para a própria conta logada.

---

## 🚀 Próximos Passos (Em Desenvolvimento)

- [ ] Migrar o mecanismo de autenticação para validar dados direto na tabela `contas` do PostgreSQL.
- [ ] Implementar a persistência imediata de Saques e Depósitos no banco de dados.
- [ ] Aplicar o controle transacional do JDBC (`setAutoCommit(false)`, `commit()` e `rollback()`) para blindar as operações de transferência no banco físico contra falhas.
- [ ] Criar uma tabela de histórico/extrato para registrar todas as movimentações.

---

## 👨‍💻 Como Executar o Projeto Localmente

1. Certifique-se de ter o **JDK 17+** instalado em sua máquina.
2. Certifique-se de ter uma instância do **PostgreSQL** ativa.
3. Clone este repositório para sua máquina local.
4. Abra o projeto na sua IDE de preferência (ex: IntelliJ IDEA).
5. Configure suas credenciais de acesso ao banco (URL, User e Password) na conexão JDBC da classe principal.
6. Execute o arquivo `Main.java`.
