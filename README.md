# LAB1-PUCSP-Compiladores

## Grupo
* Fernanda Gazda
* Lilian Fernandes
* Luana Macedo


### Atividade 1
---
### Atividade 2 

**Explicação breve**

A expressão regular que usamos nessa atividade filtra, reconhece um padrão e o classifica em 5 blocos diferentes, como CEP, e-mail, número de telefone, CPF e RG. Separando os blocos com o operador `|`, a regex consegue reconhecer vários padrões diferentes no texto de uma vez.

**Criar e experimentar regexp para reconhecer e-mail, CEP, CPF, RG, telefone, etc...**
<img width="1631" height="595" alt="Exemplo" src="https://github.com/user-attachments/assets/271f7f0d-9c43-4d80-a9ba-c9c99840f654" />

---
### Atividade 3
---
### Atividade 4
---
### Atividade 5
---
### Atividade 6

**Por que o tokenizer da OpenAI quebra position em pos + ition?**

Como o tokenizer da OpenAI usa o BPE, o que é analisado é a frequência de aparições de tokens usados juntos na base de dados utilizada para treinar a IA. Se uma palavra não tiver um número de aparições suficiente para gerar um token único, serão gerados tokens a partir da divisão dessa palavra, permitindo que esses pedaços possam ser reutilizados posteriormente em outros contextos.


**Qual é a diferença conceitual entre token léxico (segue gramática regular da linguagem) e token de LLM (BPE – Byte Pair Encoding)?**

O token léxico é construído utilizando autômatos finitos e expressões regulares, com base em regras e gramática. Eles são usados para fazer a identificação e classificação do código da linguagem para a análise sintática.

O token de LLM tem base na frequência estatística, sem uma limitação rigorosa baseada na gramática. Esse token pode ser gerado a partir de qualquer subconjunto de letras em uma palavra, de uma única letra ou de uma palavra inteira, podendo variar até mesmo no idioma. 


**Por que o scanner de compilador precisa ser preciso e seguir a gramática, enquanto o da OpenAI não?**

O scanner de compilador tem o objetivo de fazer a análise léxica de linguagens de programação, lidando diretamente com instruções de máquina, o que exige instruções precisas para que o código funcione corretamente. A gramática rígida do scanner é determinística, então o mesmo código sempre gera o mesmo resultado. 

Já o scanner da OpenAI tem o objetivo de compreender a linguagem humana e lida diretamente com o usuário. Baseado na estatística, ele é não determinístico e é projetado para prever a próxima palavra com base no contexto obtido. A fragmentação de palavras para a criação de um token facilita a generalização e a compreensão para gerar um resultado coerente com as informações recebidas anteriormente.

---
### Atividade 7
---
