# AL0338 - ANÁLISE E PROJETOS DE ALGORITMOS
## Trabalho Prático 1 - Algoritmos Gulosos

O HackerRank é uma plataforma online que oferece uma variedade de desafios de
programação e ciência da computação para ajudar pessoas a desenvolver suas habilidades
técnicas. É amplamente utilizado por programadores, estudantes e profissionais de tecnologia
para praticar programação, algoritmos, estruturas de dados, e outras habilidades relacionadas.
A plataforma oferece desafios em várias linguagens de programação, desde linguagens
populares como Python, Java e C++ até linguagens menos comuns. Os desafios variam em
dificuldade, desde questões introdutórias até problemas complexos que envolvem algoritmos
avançados.
Os usuários podem resolver esses desafios online, receber feedback imediato sobre sua
solução e comparar suas respostas com outros usuários para ver como estão se saindo em
relação a uma comunidade global de programadores. Além disso, o HackerRank também é
usado por empresas para recrutar talentos em tecnologia, oferecendo testes personalizados
como parte de seus processos de seleção. Portanto, o HackerRank é uma plataforma valiosa
tanto para aprendizado quanto para avaliação de habilidades técnicas em programação.

___

### Dependências
Java >= 8

___

### Problema

Alice é uma professora de jardim de infância. Ela quer dar alguns doces para as crianças de sua turma. Todas as crianças estão sentadas em uma fila e cada uma delas tem uma pontuação de acordo com seu desempenho na classe. Alice quer dar pelo menos 1 doce para cada criança. Se duas crianças estiverem sentadas uma ao lado da outra, então aquela com a pontuação mais alta deve receber mais doces. Alice quer minimizar o número total de doces que ela precisa comprar.

___

Exemplo

arr = [4,6,4,5,6,2]

Ela distribui doces para os alunos nas seguintes quantidades mínimas: [1,2,1,2,3,1]. Ela precisa comprar no mínimo 10 doces.

___

Descrição da função

A função candies tem os seguintes parâmetros:

int n: o número de crianças na turma
int arr[n]: as notas de cada aluno

Retorna

int: o número mínimo de doces que Alice deve comprar
Formato de entrada

A primeira linha contém um inteiro, n, o tamanho de arr.
Cada uma das próximas linhas contém um inteiro indicando a nota do aluno na posição i.

___

Restrições

1 <= n <= 10^5
1 <= arr[i] <= 10^5

### Exemplo de comando para executar código

## Exemplo 1

Exemplo de Input 1

3
1
2
2

Exemplo de Output 1

4

Explicação Input 1

O primeiro número se refere ao número de alunos, e os próximos números se referem a nota de cada aluno.

Explicação Output 1

A distribuição ótima será 1,2,1, então a quantidade mínima de doces será 4.

## Exemplo 2

Exemplo de Input 2

10
2
4
2
6
1
7
8
9
2
1

Exemplo de Output 2

19

Explicação Input 1

O primeiro número se refere ao número de alunos, e os próximos números se referem a nota de cada aluno.

Explicação Output 1

A distribuição ótima será 1,2,1,2,1,2,3,4,2,1, então a quantidade mínima de doces será 19.


## Exemplo 3

Exemplo de Input 3

8
2
4
3
5
2
6
4
5

Exemplo de Output 2

12

Explicação Input 3

O primeiro número se refere ao número de alunos, e os próximos números se referem a nota de cada aluno.

Explicação Output 3

A distribuição ótima será 1,2,1,2,1,2,1,2, então a quantidade mínima de doces será 12.


Fonte: [HackerRank](https://www.hackerrank.com/challenges/candies/problem)