# PGPD
1. Execução da simulação para 
 μ=5,0 
 σ=0,5 
 N=100 clientes 
 1000 rodadas

Os resultados obtidos com os parâmetros solicitados foram:

Média dos tempos de atendimento (1000 simulações): 4,999 min

Desvio-padrão das médias: 0,050 min

O valor médio está bem próximo da média teórica de 5 minutos, o que mostra que a simulação está funcionando corretamente.

2. Variação do número de caixas

Mais caixas podem reduzir o tempo médio de atendimento porque permitem que mais clientes sejam atendidos ao mesmo tempo. Em um cenário real, dividir a fila em 2 ou 3 caixas diminui o tempo de espera dos clientes, pois a taxa de serviço aumenta e o processamento é feito em paralelo.

3. Variação do desvio-padrão (σ) e impacto nos resultados médios.

A variação de σ impacta a consistência dos resultados.
σ baixo (ex: 0.25): Os tempos de atendimento são mais padões, próximos da média, resultando em um desvio-padrão das médias menor. Os resultados da simulação são mais previsíveis.
σ alto (ex: 2.0): Os tempos de atendimento variam mais, com alguns muito rápidos e outros muito devagares, fazendo com que o desvio-padrão das médias seja maior. Os resultados da simulação são menos previsíveis.

4. Por que este simulador é estocástico?

Este simulador é estocástico porque seu comportamento é governado por variáveis aleatórias. O tempo de atendimento de cada cliente não é fixo; ele é gerado aleatoriamente a partir de uma distribuição normal. Cada vez que a simulação é executada, mesmo com os mesmos parâmetros, os resultados podem ser ligeiramente diferentes, assim como acontece na vida real, onde o tempo de atendimento de um cliente não é totalmente previsível.