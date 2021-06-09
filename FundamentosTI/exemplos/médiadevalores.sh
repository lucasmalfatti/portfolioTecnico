#!/bin/bash
#Autor: Lucas Malfatti
#Descrição: O programa lê o preço de 15 produtos, passa a média dos produtos e mostra o maior valor.
i=1
soma=0
maior=0
while [ $i -le 15 ]
do
        echo "Escreva o preço do $iº produto:"
        read valor
        if [ $valor -gt $maior ]
        then
                  maior=$valor
        fi
        soma=$(($soma+$valor))
        i=$(($i=1))
done
soma=$( bc <<< "scale=4; $soma/15" )
echo "A média dos valores é $soma"
echo "O maior valor é $maior"
