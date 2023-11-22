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


### Problema

Alice is a kindergarten teacher. She wants to give some candies to the children in her class.  All the children sit in a line and each of them has a rating score according to his or her performance in the class.  Alice wants to give at least 1 candy to each child. If two children sit next to each other, then the one with the higher rating must get more candies. Alice wants to minimize the total number of candies she must buy.

___

Example

arr = [4,6,4,5,6,2]

She gives the students candy in the following minimal amounts: [1,2,1,2,3,1]. She must buy a minimum of 10 candies.

Function Description

Complete the candies function in the editor below.

candies has the following parameter(s):

int n: the number of children in the class
int arr[n]: the ratings of each student
Returns

int: the minimum number of candies Alice must buy
Input Format

The first line contains an integer, , the size of .
Each of the next  lines contains an integer  indicating the rating of the student at position .

___

Constraints

1 <= n <= 10^5
1 <= arr[i] <= 10^5

___

Sample Input 0

3
1
2
2

Sample Output 0

4

Explanation 0

Here 1, 2, 2 is the rating. Note that when two children have equal rating, they are allowed to have different number of candies. Hence optimal distribution will be 1, 2, 1.

___

Sample Input 1

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

Sample Output 1

19

Explanation 1

Optimal distribution will be 

1,2,1,2,1,2,3,4,2,1

___

Sample Input 2

8
2
4
3
5
2
6
4
5

Sample Output 2

12

Explanation 2

Optimal distribution will be

1,2,1,2,1,2,1,2


Fonte: [HackerRank](https://www.hackerrank.com/challenges/candies/problem)

### Solução


### Como executar