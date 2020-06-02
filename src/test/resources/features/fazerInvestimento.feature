Feature: Fazer um simulado de um investimento
 Como uma pessoa fisica cooperada
 Eu desejo simular um investimento do meu dinheiro por um determinado periodo
 
 Scenario: Fazendo uma simulacao de investimento
		Given que eu acesse a pagina inicial do simulador
		And informo o valor inicial para aplicar
		And informo o quanto eu quero poupar por mes
		And informo o tempo que eu desejo poupar
		Then clico em simular
		And valido o resultado			