// Este é um programa de exemplo
#include <stdio.h>

/* 
 * Função principal do programa
 * Retorna 0 em caso de sucesso
 */
int main() {
    int x = 10; // valor inicial
    int y = 20; // segundo valor
    /* cálculo da soma */
    int soma = x + y;
    printf("Soma = %d\n", soma); // imprime resultado
    
    // Loop de exemplo
    for (int i = 0; i < 10; i++) {
        /* incrementa e imprime */
        printf("i = %d\n", i);
    }
    
    /*
     * Bloco final
     * com múltiplas linhas
     * de comentário
     */
    return 0; // sucesso
}
