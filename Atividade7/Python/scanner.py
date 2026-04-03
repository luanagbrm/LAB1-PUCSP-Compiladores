import re

def tokenizar_livro(caminho_arquivo):
    """
    Le um arquivo de texto e retorna uma lista de tokens.
    """

    regex_pt = r'[a-zA-ZÀ-ÿ0-9]+|[.,!?;:()\[\]"\'-]' #  expressao regular que captura as palavras e a pontuação do texto do arquivo
    try:
        with open(caminho_arquivo, 'r', encoding='utf-8') as arquivo:
            texto = arquivo.read()
            return re.findall(regex_pt, texto)
    except FileNotFoundError:
        return []

# logica principal do codigo

arquivo_livro = 'livro.txt'
vetor_tokens = tokenizar_livro(arquivo_livro)

if vetor_tokens:
    total_tokens = len(vetor_tokens)
    # cria um loop ate ser inserido um numero de tokens valido
    while True:
        try:
            quantidade = int(input(f"O livro tem {total_tokens} tokens. Quantos devem ser exibidos? "))
            # verifica se eh menor que 1 ou maior que a quantidade de tokens que o livro tem
            if quantidade < 1:
                print("Insira um numero maior que zero.\n")
            elif quantidade > total_tokens:
                print(f"O limite de tokens é {total_tokens}. Tente novamente.\n")
            # se for um numero valido no intervalo definido, sai do loop
            else:
                break 
        except ValueError:
            print("Erro: Digite um numero inteiro valido.\n")
            
    # caso passe em todas as verificaçoes, exibe a lista final de tokens do livro
    print(f"\nExibindo os primeiros {quantidade} tokens:")
    print(vetor_tokens[:quantidade])