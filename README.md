# LAB1-PUCSP-Compiladores

## Grupo
* Fernanda Gazda
* Lilian Fernandes
* Luana Macedo


# Atividade 1
<img width="571" height="370" alt="Screenshot 2026-04-03 at 00 37 55" src="https://github.com/user-attachments/assets/6ecc3cf6-7c2b-4931-a655-ba73f953d87d" />

---
# Atividade 2 
**Explicação breve**
Nessa expressão, através do operador | (OU), essa regex é dividida em três blocos que servem para: achar nomes de variáveis, números e símbolos matemáticos. No exemplo `position = initial + rate * 60`, ela varre o texto procurando apenas o que importa (como position, o = e o 60). O resultado é uma lista limpa de tokens léxicos, já que os espaços em branco são naturalmente filtrados e ignorados.
<img width="1654" height="858" alt="image" src="https://github.com/user-attachments/assets/60aaa07c-376b-497b-8a23-e6e37bbf5aba" />

**Criar e experimentar regexp para reconhecer e-mail, CEP, CPF, RG, telefone, etc...**
<img width="1631" height="595" alt="Exemplo" src="https://github.com/user-attachments/assets/271f7f0d-9c43-4d80-a9ba-c9c99840f654" />

---
# Atividade 3 – Find/Replace com Regex no VS Code

## Exercício 1 – Remover comentários `//` e `/* */`

**Regex utilizada:** `//.*|/\*[\s\S]*?\*/`
**Replace:** (vazio)

### Antes
<img width="1512" height="982" alt="remover-comentarios-antes" src="https://github.com/user-attachments/assets/b32c31d8-74ba-4589-a1e5-3206503c2c16" />

### Depois
<img width="1512" height="982" alt="remover-comentarios-depois" src="https://github.com/user-attachments/assets/eb627d1d-c8df-4189-ae83-ca1b2dfd91e4" />

**Limpeza de linhas em branco extras:**
**Regex:** `\n\s*\n\s*\n` → `\n\n`

### Antes
<img width="1512" height="982" alt="remover-espaco-antes" src="https://github.com/user-attachments/assets/cf0a11ac-7ce6-42c1-bd74-188c040117fc" />

### Depois
<img width="1512" height="982" alt="remover-espaco-depois" src="https://github.com/user-attachments/assets/a9aeb5cd-b016-4473-9f68-84eb10a87272" />

---

## Exercício 2 – Substituir `=` por `:=`

**Regex utilizada:** `(?<![=!<>])=(?!=)`
**Replace:** `:=`

### Antes
<img width="1512" height="982" alt="pascal-style-antes" src="https://github.com/user-attachments/assets/5f891f0f-4cde-4291-9866-e79a8030188c" />


### Depois
<img width="1512" height="982" alt="pascal-style-depois" src="https://github.com/user-attachments/assets/2763f4f9-20f3-46c7-903a-d27f5a46f938" />


---

## Exercício 3 – Limpar espaços extras no CSV
**Resultado:** [csv-limpo-sample.csv](https://github.com/luanagbrm/LAB1-PUCSP-Compiladores/blob/main/Atividade3/csv-limpo-sample.csv)

**Arquivo:** `relatorio_dados_abertos_oferta_12021_18102021.csv` (23.464 linhas)

### Passo 1 – Remover espaços extras (2+ espaços → 1)
**Regex:** ` {2,}` → ` `

#### Antes
<img width="1512" height="982" alt="limpar-espacos-extra-antes" src="https://github.com/user-attachments/assets/ca1fe58e-7abb-43a8-8ca8-3f875e2a329d" />


#### Depois
<img width="1512" height="982" alt="limpar-espacos-extra-depois" src="https://github.com/user-attachments/assets/40d59fa7-4d3d-418b-bbe2-7714deb1f0d8" />


### Passo 2 – Remover espaços ao redor dos delimitadores `;`
**Regex:** ` +(?=;)|(?<=;) +` → (vazio)

#### Antes
<img width="1512" height="982" alt="limpar-espacos-limitadores-antes" src="https://github.com/user-attachments/assets/efe6969d-62b2-4a0e-a221-b37da439464b" />


#### Depois
<img width="1512" height="982" alt="limpar-espacos-limitadores-depois" src="https://github.com/user-attachments/assets/5ce8be0f-04bb-4eec-bb2a-8109992a5db5" />


### Passo 3 – Remover espaços no início/fim das linhas
**Regex:** `^ +| +$` → (vazio)

#### Antes
<img width="1512" height="982" alt="limpar-espacos-fim-antes" src="https://github.com/user-attachments/assets/142e2656-60b0-4013-9b42-62a325417aaf" />


#### Depois
<img width="1512" height="982" alt="limpar-espacos-fim-depois" src="https://github.com/user-attachments/assets/fb90a18e-6990-4cac-946b-ffaea2f52c12" />

---

## Exercício 4 – CSV para TSV
**Resultado:** [csv-to-tsv-sample.tsv](https://github.com/luanagbrm/LAB1-PUCSP-Compiladores/blob/main/Atividade3/csv-to-tsv-sample.tsv)

**Regex utilizada:** `;` → `\t`

### Antes
<img width="1512" height="982" alt="csv-to-tsv-antes" src="https://github.com/user-attachments/assets/2e002104-da8b-453d-8f89-d7ab9a439efe" />


### Depois
<img width="1512" height="982" alt="csv-to-tsv-depois" src="https://github.com/user-attachments/assets/b88356ad-f5ae-4409-8eab-715c858f2574" />

---

## Exercício 5 – Converter formato numérico BR → EN
**Resultado:** [br-to-en-sample.csv](https://github.com/luanagbrm/LAB1-PUCSP-Compiladores/blob/main/Atividade3/br-to-en-sample.csv)

### Passo 1 – Remover ponto de milhar
**Regex:** `(\d)\.(\d{3})` → `$1$2`

#### Antes
<img width="1512" height="982" alt="remove-ponto-milhar-antes" src="https://github.com/user-attachments/assets/2fd8ca5e-3990-4d6d-8979-d3cecdfac1d5" />

#### Depois
<img width="1512" height="982" alt="remove-ponto-milhar-depois" src="https://github.com/user-attachments/assets/05d50899-3d63-49f6-a897-00a7cae1b31c" />


### Passo 2 – Vírgula decimal → ponto
**Regex:** `(\d),(\d)` → `$1.$2`

#### Antes
<img width="1512" height="982" alt="remove-virgula-decimal-antes" src="https://github.com/user-attachments/assets/c16d4d74-3151-4512-82d0-1b0a155c7169" />


#### Depois
<img width="1512" height="982" alt="remove-virgula-decimal-depois" src="https://github.com/user-attachments/assets/0c0997f4-c6c5-4c9e-b82f-f793c780acae" />


---
# Atividade 4
---
# Atividade 5 - Automato finito com JFLAP

### Reconhecer inteiros
<img width="1028" height="970" alt="Image" src="https://github.com/user-attachments/assets/8f4acb25-9837-42e7-8400-8013d3f1f469" />


### Identificadores
<img width="1078" height="1001" alt="Image" src="https://github.com/user-attachments/assets/22c03084-65e6-48ff-b81d-ea66d5ab7d35" />


### Ambiguidade
![Image](https://github.com/user-attachments/assets/5520c48b-e51b-4256-8b6a-4be7091bf6e3)


---
# Atividade 6
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
# Atividade 7
---
