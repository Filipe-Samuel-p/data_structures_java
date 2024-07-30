## Recursão
 <ol>
    <li> Definição: Rerursão é uma função chama ela mesma.</li>
    <li>Toda recursão tem:</li>
 <ul>
    <li>Caso base: que é a condição de parada da recursão</li>
    <li>Caso geral: É a relação de recorrenci, define de que maneira o problema é subdividido em que instancias menores dele próprio.</li>
 </ul>
 <li> A recursão tem como objetivo resolver partes de um problema ou reduzir o tamanho do problema.</li>
 </ol>

## Problemas da recursão

A recursão, quando executada, cada chamada da função vai sendo colocada na "pilha de chamadas" até o caso base ser executado.
Acontece que se o problema for muito grande, pode ter um estouro de pilha (stack overflow) e consequentemente dar erro.

## Quick Sort

Assim como bubble sort, selection sort etc, quick sort também é um algoritmo de ordenação
<ol>

 <li>Idéia: </li>
    <ul>
     <li>A idéia do quick sort é "dividir e conquistar". Ele divide uma sequencia em uma sequencia menor, aplicando a recursão para ordenar cada uma dessas sequencias menores.</li>
     <li>Como é feito?</li>
     <ul>
        <li>Dada uma sequencia, escolhe-se um elemento que chamará de pivor.</li>
        <li>Este elemento tem que ir percorrendo a sequencia e a idéia é mudar a posição dos elementos em:</li>
            <ul>
           <li> Uma subsequencia "Me": menores que o pivor</li>
           <li>  Uma subsequencia "I": iguais o pivor</li>
            <li> Uma subsequencia "Ma": maiores que o pivor</li>
            </ul>
        <li>  A cada chamada da função recursiva, escolhe-se um novo pivor e esse passo a passo é executado.</li>
     </ul>
    </ul>
</ol>
    