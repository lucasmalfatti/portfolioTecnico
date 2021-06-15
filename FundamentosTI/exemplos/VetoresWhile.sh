#!/bin/bash
#Autor: Lucas Malfatti Rieth
#Descrição: Esse programa mostra nomes de um vetor utilizando o while
nomes=("Lucas" "Laura" "Pedro")
tam=${#nomes[@]}
i=0
while [ $i -lt $tam ]
do
        echo "Oi, eu sou ${nomes[$i]}"
        i=$((i+1))
done

