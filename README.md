```markdown
# Cálculo de Salários

Esse projeto foi o projeto final do Coding Tank, a última fase do processo seletivo do Santander Coders 2024.

## Descrição

O programa calcula o salário líquido de funcionários com base nos salários brutos fornecidos, aplicando descontos do INSS e do Imposto de Renda (IR).

## Funcionalidades

- Entrada dos salários brutos de 5 funcionários.
- Cálculo dos descontos de INSS e IR.
- Exibição dos resultados: salários brutos, descontos e salários líquidos.

## Como Usar

1. Compile o código com o comando:
   ```bash
   javac Salario.java
   ```

2. Execute o programa:
   ```bash
   java Salario
   ```

3. Insira os salários brutos quando solicitado.

## Exemplo de Saída

```
Informe os salários brutos de 5 funcionários da empresa X:
Funcionário 1: 3000
Funcionário 2: 2500
Funcionário 3: 4000
Funcionário 4: 1500
Funcionário 5: 2000

Resultados:
Funcionário 1:
Salário Bruto: R$ 3000.00
Desconto INSS: R$ 360.00
Desconto IR: R$ 225.00
Salário Líquido: R$ 2415.00

Funcionário 2:
Salário Bruto: R$ 2500.00
Desconto INSS: R$ 225.00
Desconto IR: R$ 187.50
Salário Líquido: R$ 2087.50

...
```

## Funções Auxiliares

- `calcularDescontoINSS(double salarioBruto)`: Calcula o desconto do INSS com base no salário bruto.
- `calcularDescontoIR(double salarioBruto)`: Calcula o desconto do Imposto de Renda com base no salário bruto.

## Requisitos

- JDK 8 ou superior

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
```
