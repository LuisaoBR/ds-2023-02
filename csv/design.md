Módulo 1: Input

O algoritmo começa abrindo o arquivo CSV de entrada especificado pelo usuário. Ele utiliza uma biblioteca ou módulo adequado para ler o conteúdo
do arquivo CSV. A cada linha lida do arquivo, as informações são armazenadas, normalmente em uma estrutura de dados como uma lista ou array bidimensional,
onde cada elemento representa uma linha do arquivo original.

Módulo 2: Cálculo

Módulo para realizar o cálculo, em que, para cada linha lida do arquivo de entrada, o algoritmo extrai os valores das duas primeiras colunas. Esses valores
são convertidos para números (inteiros ou floats, dependendo do formato dos dados) para que possam ser somados. O algoritmo realiza a soma dos dois valores
extraídos.

Módulo 3: Update

Módulo que, após calcular a soma das duas primeiras colunas, adiciona essa soma como um novo valor, geralmente como uma nova coluna, à linha atual.
O dado recém-adicionado é agora parte da linha de dados.

Módulo 4: Output

Módulo para criar um novo arquivo CSV de saída (ou sobrescreve um arquivo existente, se aplicável). Para cada linha de dados processada, ele escreve
uma linha correspondente no arquivo de saída. Cada linha do arquivo de saída contém todas as colunas originais, mais a coluna adicional que representa
a soma das duas primeiras colunas.

Módulo 5: Close

Módulo para processar todas as linhas do arquivo de entrada e escrevê-las no arquivo de saída, o algoritmo encerra. Os arquivos de entrada e saída são
fechados corretamente para evitar vazamentos de recursos.

Módulo 6: Controle

Módulo para controle dos módulos anteriores, além de tratamento de erros e alocação de memória.
