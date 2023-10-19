Módulo 1: Input

O algoritmo começa abrindo o arquivo CSV de entrada especificado pelo usuário. Ele utiliza uma biblioteca ou módulo adequado para ler o conteúdo
do arquivo CSV. A cada linha lida do arquivo, as informações são armazenadas, normalmente em uma estrutura de dados como uma lista ou array bidimensional,
onde cada elemento representa uma linha do arquivo original. O código deve implementar a interface AutoCloseable e importar as bibliotecas BufferedReader e BufferedWriter. Definir o caminho InputFile.

Módulo 2: Cálculo

Utilizar o recurso Try-with-resources para criar os objetos BufferedReader e BufferedWriter e garantir que eles serão devidamente fechados.
Então, o módulo para realizar o cálculo, em que, para cada linha lida do arquivo de entrada, o algoritmo extrai os valores das duas primeiras colunas.
Esses valores são convertidos para números (inteiros ou floats, dependendo do formato dos dados) para que possam ser somados. O algoritmo realiza a soma dos dois valores extraídos.

Módulo 3: Update

Fazer a leitura das linhas do arquivo de entrada utilizando um loop com o método readLine() do BufferedReader, após calcular a soma das duas primeiras colunas, adiciona essa soma como um novo valor, geralmente como uma nova coluna, à linha atual.
O dado recém-adicionado é agora parte da linha de dados. Utilizar bloco catch para capturar e tratar exceções que podem ocorrer durante a leitura ou gravação de arquivos.

Módulo 4: Output

Criar o caminho OutputFile. Módulo para criar um novo arquivo CSV de saída, ou sobrescreve um arquivo existente, se aplicável. Para cada linha de dados processada, ele escreve uma linha correspondente no arquivo de saída, utilizando o método newLine() do BufferedWriter. Cada linha do arquivo de saída contém todas as colunas originais, mais a coluna adicional que representa a soma das duas primeiras colunas.

Módulo 5: Close

Módulo para processar todas as linhas do arquivo de entrada e escrevê-las no arquivo de saída, o algoritmo encerra. Os arquivos de entrada e saída são
fechados corretamente para evitar vazamentos de recursos.
