/**
 *Suponha que precisamos trabalhar em um projeto da NASA que pretende lançar um novo satélite. A economia de memória é
 * muito importante nessa missão, pois vamos ter uma quantidade de memória limitada. Vamos trabalhar em 3 módulos e não
 * podemos ultrapassar o limite de memória de cada módulo. Ao iniciar o programa o operador deve digitar os dados da missão
 * para que armazene todos os dados em cada um dos módulos e no final deve ser printado todos os valores por ele escolhidos.
 *
 * a. Móludo 01 - Controle de tempo x funcionários:
 * i. Memória disponível: 3 bytes
 * ii. Requisitos: Armazenar o ano atual da missão (max 9999), quantidade de funcionários envolvidos (max 100).
 *
 * Resposta ao módulo 01: utilizar int para o ano atual da missão (respeitando o maximo 9999)
 * e o byte para a quantidade de funcionarios envolvidos.
 *
 *
 * b. Móludo 02 - Controle de distância x velocidade:
 * i. Memória disponível: 6 bytes;
 * ii. Requisitos: Armazenar distancia que o satélite ficará da terra (max 2 milhões), velocidade máxima
 * (max 30.000 km/h).
 *
 * Resposta ao módulo 02: utilizar o int para armazenar a distância, utilizar o short para armazernar a velocidade máxima.
 *
 *
 * c. Móludo 03 - Status da missão:
 * i. Memória disponível: 17 bytes;
 * ii. Requisitos: Armazenar o estado da missão (se já iniciou ou não), distância que será percorrida
 * durante a missão em km (max 3 bilhões de km) e calibragem das antenas (número racional com precisão
 * de no mínimo 14 casa decimais).
 *
 * Resposta ao módulo 03:  para o status da missao um boolean, int para a distancia que será percorrida
 * e para calibragem de antenas o double.
 *
 *
 *
 *
 *
 *
 *
 *
 * */