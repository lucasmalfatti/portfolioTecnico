#!/bin/bash
#Autor: Lucas Malfatti
#Descrição: Esse programa mostra os números inteiros entre 1 e o número digitado
echo" Digite um valor "
read n
variavel=0

if [ $n -gt $variavel ]
then
      for t in $(seq 1 $n)
      do
          echo "$t"
      done
else
      echo "Execute o código novamente e insira um valor maior que $variavel"
fi
