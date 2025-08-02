# 💼 Simulador de Banco com Investimentos | Banking System Simulator (Java)

![Java](https://img.shields.io/badge/Java-17+-red?style=flat-square&logo=java)
![POO](https://img.shields.io/badge/POO-Object%20Oriented-blue?style=flat-square)
![Terminal](https://img.shields.io/badge/Interface-Terminal-black?style=flat-square)
![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow?style=flat-square)

---

## 📌 Descrição

**Simulador de Banco com Investimentos** é um projeto 100% em Java, com foco total em programação orientada a objetos. A aplicação funciona via terminal e simula a experiência de um usuário bancário, permitindo desde a criação de contas até operações financeiras e simulação de investimentos (CDB, Ações, etc).

Este projeto foi desenvolvido por **Kauã Diniz**, como parte de sua preparação para universidades internacionais de excelência, como Harvard, MIT, Oxford, entre outras. É uma demonstração de domínio real de lógica, arquitetura de software e boas práticas com Java puro.

---

## 🎯 Funcionalidades

- [x] Cadastro de usuários
- [x] Autenticação com email e senha
- [x] Criação de conta bancária
- [x] Depósito e saque
- [x] Visualização de saldo
- [x] Simulação de retorno de investimentos (com juros compostos)
- [x] Sistema de menus via terminal
- [ ] Armazenamento persistente com arquivos `.txt`
- [ ] Interface gráfica (futuramente com JavaFX ou Web)

---

## 🧠 Conceitos aplicados

- Programação Orientada a Objetos (POO)
- Encapsulamento, abstração, herança (se aplicável)
- Estruturas de dados (`ArrayList`, `Scanner`, `Map`)
- Simulação de fluxo bancário real
- Design modular com classes separadas
- Controle de fluxo com menus dinâmicos

---

## 🗂 Estrutura de arquivos

```bash
📁 SimuladorBanco/
├── Main.java              # Executa o programa
├── Menu.java              # Menu interativo do terminal
├── Usuario.java           # Classe de usuário (email, senha)
├── Conta.java             # Conta bancária (saldo, saque, depósito)
├── Transacao.java         # Registro de transações
├── Investimento.java      # Simulação de investimentos
├── Banco.java             # Lógica principal do sistema
└── ArquivoUtils.java      # Utilitário para salvar dados (em breve)
