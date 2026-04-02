# LAB1-PUCSP-Compiladores

## Grupo
* Fernanda Gazda
* Lilian Fernandes
* Luana Macedo


### Atividade 1
---
### Atividade 2 
**Explicação breve**
Nessa expressão, através do operador | (OU), essa regex é dividida em três blocos que servem para: achar nomes de variáveis, números e símbolos matemáticos. No exemplo `position = initial + rate * 60`, ela varre o texto procurando apenas o que importa (como position, o = e o 60). O resultado é uma lista limpa de tokens léxicos, já que os espaços em branco são naturalmente filtrados e ignorados.
<img width="1654" height="858" alt="image" src="https://github.com/user-attachments/assets/60aaa07c-376b-497b-8a23-e6e37bbf5aba" />

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
<img width="746" height="563" alt="image" src="https://github.com/user-attachments/assets/7d61fe58-d7d4-4747-875d-85993e243b71" />


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
