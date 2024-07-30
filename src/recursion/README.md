## Recursão

 1- Definição: Rerursão é uma função chama ela mesma. 
 2- Toda recursão tem:
    a) Caso base: que é a condição de parada da recursão
    b) Caso geral: É a relação de recorrenci, define de que maneira o problemaé subdividido em que instancias
    menores dele próprio.
 3- A recursão tem como objetivo resolver partes de um problema ou reduzir o tamanho do problema.

## Problemas da recursão

A recursão, quando executada, cada chamada da função vai sendo colocada na "pilha de chamadas" até o caso base ser executado.
Acontece que se o problema for muito grande, pode ter um estouro de pilha (stack overflow) e consequentemente dar erro.

## Quick Sort

Assim como bubble sort, selection sort etc, quick sort também é um algoritmo de ordenação

 1- Idéia: 
     A idéia do quick sort é "dividir e conquistar". Ele divide uma sequencia em uma sequencia menor, aplicando a 
     recursão para ordenar cada uma dessas sequencias menores.
 2- Como é feito?
    a) Dada uma sequencia, escolhe-se um elemento que chamará de pivor.
    b) Este elemento tem que ir percorrendo a sequencia e a idéia é mudar a posição dos elementos em:
        I) Uma subsequencia "Me": menores que o pivorx
        II) Uma subsequencia "I": iguais o pivorx
        I) Uma subsequencia "Ma": maiores que o pivor
    c) A cada chamada da função recursiva, escolhe-se um novo pivor e esse passo a passo é executado.
    