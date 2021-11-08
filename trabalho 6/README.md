### Exercício 2 
 
- a. Defina uma classe genérica para modelar as contas do banco, com o  atributo saldo. 
- b. Defina duas classes específicas para dois tipos de contas do banco:  poupança (atributo Dia do Aniversário) e corrente (atributo limite) 
- c. Defina uma classe para especificar um gerador de extratos. Podemos criar  um método de gerar extratos básicos para cada tipo de conta, mas como  todos os tipos de contas são contas, vamos criar um método genérico que  aceite qualquer tipo de conta como parâmetro 
- d. Faça um teste para o gerador de extratos.

A classe vai ter um método para imprimir extrato, com um parâmetro que  vai ser uma conta e que vai imprimir na tela o saldo da conta e a data atual. Exemplo de codigo para trabalhar com Data:
~~~Java
public static void main(String[] args) {
  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
  Date agora = new Date();
  System.out.println("Data "+ sdf.format(agora));
} 
~~~
