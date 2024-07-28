# Algoritmos de ordenação

## Bubble Sort

<ol>
    <li>Ordena um vetor de tamanho N.</li>
    <li>A ordenação faz comparações entre os elementos adjacentes e faz a troca de posição
se necessário.</li>
    <li>A eficiencia é O(n^2), ou seja, quanto maior o tamanho do vetor, maior o tempo de ordenação.</li>
</ol>

## Selection Sort

<ol>
    <li>Melhor que o bubble sort pois diminui o número de trocas O(n^2) para O(n)</li>
    <li>O número de comparações continua O(n^2)</li>
    <li>Idéia:</li>
    <ul>    
        <li>Cada passagem, o algoritmo percorre um subconjunto de elementos e realiza
        as comparações de maneira a SELECIONAR o menor elemento do subconjunto</li>
        <li>Guarda o indíce do menor elemento</li>
        <li>Põe o menor elemento na primeira posição do vetor</li>
        <li>Faz uma outra passagem e continua até o vetor estiver ordenado</li>
    </ul>
</ol>

## Insertion Sort

<ol>
        <li>Semelhante a ordenar um baralho de cartas em sua mão. A idéia é pegar cada carta
comparar e designar o seu local ordenado.</li>
        <li>Em insertion sort, você compara o elemento  "chave"  com os elementos anteriores. Se os elementos anteriores 
são maiores do que o elemento "chave", então você move o elemento anterior para a próxima posição.
Comece do índice 1 até o tamanho do array de entrada.</li>
</ol>
