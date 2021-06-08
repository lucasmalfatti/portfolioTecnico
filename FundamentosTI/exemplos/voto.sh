#!/bin/bash
# Autor: Lucas Malfatti
# Descrição: Este programa é para identificar se você pode ou não votar
echo "Digite seu nascimento"
read x

idadeparavoto=16
votar=$((2021-$x))

if [ votar -ge idadeparavoto ]
then
      echo "Você podera votar"
else
      echo "Você não podera votar"
fi
