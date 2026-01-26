package ecommerce;

import ecommerce.customer.Customer;
import ecommerce.order.Order;
import ecommerce.product.Product;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class EcommercePractice {

    public Optional<Customer> oldestCustomer() {
        // Descubra qual o cliente mais idoso cadastrado no sistema
        // Utilize o DataHelper.customers() para obter a lista de clientes
        return DataHelper.customers().stream()
                .min(
                        Comparator.comparing(
                                Customer::getBirthdate
                        )
                );
//        return DataHelper.customers().stream()
//                .reduce((first, second) ->
//                        first.getBirthdate().isBefore(second.getBirthdate()) ? first : second
//                );
    }

    public List<Customer> customersThatBirthdayThisMonth() {
        // Filtre os clientes que fazem aniversário neste mês
        // Utilize o DataHelper.customers() para obter a lista de clientes
        return List.of();
    }

    public List<Customer> customerWithRepeatedFirstName() {
        // Filtre os clientes que possuem o primeiro nome repetido
        // Nesse stream é feito o agrupamento pelo primeiro nome
        // Mega boss exercise.
        // Utilize o DataHelper.customers() para obter a lista de clientes
        return List.of();
    }

    public List<Order> ordersOlderThan2026() {
        // Filtros os pedidos que foram realizados antes de 2026-01-01
        // Utilize o DataHelper.orders() para obter a lista de pedidos
        return List.of();
    }

    public List<Order> ordersThatAskedOn2025() {
        // Filtre os pedidos que foram realizados no ano de 2025
        // Utilize o DataHelper.orders() para obter a lista de pedidos
        return List.of();
    }

    public List<Order> ordersThatAskedOn2026() {
        // Filtre os pedidos que foram realizados no ano de 2026
        // Utilize o DataHelper.orders() para obter a lista de pedidos
        return List.of();
    }

    public List<Customer> customerThatAskedAnyOrder() {
        // Filtre todos os clientes que fizeram ao menos um pedido, lembre-se de remover os valores duplicados
        // Utilize o DataHelper.orders() para obter a lista de pedidos
        return List.of();
    }

    public Optional<Order> mostExpansiveOrder() {
        // Encontre o pedido que possui o maior valor
        // Utilize o DataHelper.orders() para obter a lista de pedidos
        return Optional.empty();
    }

    public Optional<Order> mostCheaperOrder() {
        // Encontre o pedido que possui o menor valor
        // Utilize o DataHelper.orders() para obter a lista de pedidos
        return Optional.empty();
    }

    public Map<Customer, BigDecimal> amountEachCustomerBought() {
        // Aplique filtros e conversões necessárias para descobrir o quanto cad cliente comprou, lembre-se de remover possíveis duplicações
        // Big boss exercise.
        /**
         * [
         * {pedido =1, customer = a, total = 10},
         * {pedido =2, customer = b, total = 4},
         * {pedido =3, customer = c, total = 7},
         * {pedido =4, customer = b, total = 3},
         * {pedido =5, customer = d, total = 9},
         * {pedido =6, customer = a, total = 1},
         * ]
         * {
         *     customer a, [{pedido =1, customer = a, total = 10}, {pedido =6, customer = a, total = 1}]
         *     customer b, [{pedido =2, customer = b, total = 4}, {pedido =4, customer = b, total = 3}]
         *     customer c, [{pedido =3, customer = c, total = 7}]
         *     customer d, [{pedido =5, customer = d, total = 9}]
         * }
         * [{pedido =1, customer = a, total = 10}, {pedido =6, customer = a, total = 1}]
         * [{total = 10}, {total = 1}]
         * {total = 11}
         */
        // Utilize o DataHelper.orders() para obter a lista de pedidos
        return Map.of();
    }

    public Optional<Customer> customerWhoBoughtTheMostTimes() {
        // Cliente que realizou a maior quantidade de pedidos, nesse caso é quantidade e não valor
        // Big boss exercise.
        // Utilize o DataHelper.orders() para obter a lista de pedidos
        return Optional.ofNullable(null);
    }

    public Optional<Customer> customerWhoPlacedExpensiveOrder() {
        // Cliente que realizou o pedido mais caro
        // Utilize o DataHelper.orders() para obter a lista de pedidos
        return Optional.ofNullable(null);
    }

    public Map<Product, Long> howManyTimesEachProductWasSales() {
        // Retorne a quantidade de vezes que cada produto foi vendido
        // Big boss exercise.
        // Utilize o DataHelper.orders() para obter a lista de pedidos
        return Map.of();
    }

    public Map<Product, BigDecimal> totalValueObtainedFromTheSalesOfEachProduct() {
        // Qual o valor total obtido com a venda de cada produto
        // Big boss exercise.
        // Utilize o DataHelper.orders() para obter a lista de pedidos
        return Map.of();
    }

    public Optional<Product> productThatMostSold() {
        // Qual o produto que mais foi vendido
        // Big boss exercise.
        // Utilize o DataHelper.orders() para obter a lista de pedidos
        return Optional.empty();
    }

    public Optional<Product> productThatSoldTheLeast() {
        // Qual o produto que menos vendeu
        // Big boss exercise.
        // Utilize o DataHelper.orders() para obter a lista de pedidos
        return Optional.empty();
    }

    public Map<Customer, List<Product>> productsThatWerePurchasedByCustomer() {
        // Quais os produtos que foram comprados por cada cliente
        // Big boss exercise.
        // Utilize o DataHelper.orders() para obter a lista de pedidos
        return Map.of();
    }
}
