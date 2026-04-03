#!/bin/bash
while read -r linha; do
    linha_limpa=$(echo "$linha" | sed 's/\xc2\xa0//g' | tr -d ' \t\r')
    if [ ! -z "$linha_limpa" ]; then
        echo "[SCANNER] Linha recebida: '$linha_limpa'"
    fi
done