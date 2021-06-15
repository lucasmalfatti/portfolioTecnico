#!/bin/bash
#Autor: Lucas Malfatti Rieth
#Descrição: O programa lê os nomes digitados pelo usuário e no final te mostra as quantidades de nomes digitiados e os nomes digitados.
nome=""
echo "Escreva 'exit'  para sair"
i=0
while [[ $nome != "exit" ]]
do
        echo "Digite um nome"
        read nome
        if [ $nome != "exit" ]
        then
                usuario[$i]=$nome
                i=$((i+1))
                echo "Você digitou um $nome"
        else
                echo "Você está saindo..."
        fi
done
echo "A quantidade de nomes digitadas foi: ${#usuario[@]}"

