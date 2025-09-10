import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

public class SalesDashboard {

    public static void main(String[] args) {
        // Assuming cityToStoresMap is initialized
        Map<String, List<Store>> cityToStoresMap = new HashMap<>();

        // Step 1-4: Traverse → Filter → Map → Flatten
        Stream<Item> allItemsStream = cityToStoresMap.values().stream()
            .flatMap(List::stream)  // all stores
            .flatMap(store -> store.getCustomerToOrdersMap().entrySet().stream())
            .filter(entry -> {
                // Step 2: Customers with >= 3 orders in last 60 days
                List<Order> orders = entry.getValue();
                long recentOrders = orders.stream()
                        .filter(o -> o.getDate().isAfter(LocalDate.now().minusDays(60)))
                        .count();
                return recentOrders >= 3;
            })
            // Step 3: Map to all purchased items
            .flatMap(entry -> entry.getValue().stream()
                    .flatMap(order -> order.getItems().stream()));

        // Step 5-8: Distinct → Sort → Peek → Skip+Limit
        List<Item> topAffordablePicks = allItemsStream
            .distinct()  // Step 5
            .sorted(Comparator.comparingDouble(Item::getPrice).reversed()) // Step 6
            .peek(item -> System.out.println("Processing: " + item.getName() + " $" + item.getPrice())) // Step 7
            .skip(2)   // Step 8 (skip top 2 expensive)
            .limit(10) // next 10
            .collect(Collectors.toList());

        // Step 9: Group by category
        Map<String, List<Item>> itemsByCategory = topAffordablePicks.stream()
            .collect(Collectors.groupingBy(Item::getCategory));

        // Step 10: Count Electronics
        long electronicsCount = itemsByCategory.getOrDefault("Electronics", List.of()).size();
        System.out.println("Electronics Count: " + electronicsCount);

        // Step 11: anyMatch (any item > $500)
        boolean hasExpensive = topAffordablePicks.stream().anyMatch(i -> i.getPrice() > 500);

        // Step 12: allMatch (all items > $10)
        boolean allAboveTen = topAffordablePicks.stream().allMatch(i -> i.getPrice() > 10);

        // Step 13: noneMatch (no null/empty names)
        boolean validNames = topAffordablePicks.stream()
                .noneMatch(i -> i.getName() == null || i.getName().isEmpty());

        // Step 14: findFirst Home Appliances
        Optional<Item> firstHomeAppliance = itemsByCategory.getOrDefault("Home Appliances", List.of())
                .stream().findFirst();

        // Step 15: findAny Fitness
        Optional<Item> anyFitness = itemsByCategory.getOrDefault("Fitness", List.of())
                .stream().findAny();

        // Step 16: reduce to calculate total value
        double totalValue = topAffordablePicks.stream()
                .map(Item::getPrice)
                .reduce(0.0, Double::sum);

        // Print summary
        System.out.println("Has >$500 item? " + hasExpensive);
        System.out.println("All >$10? " + allAboveTen);
        System.out.println("Valid names? " + validNames);
        firstHomeAppliance.ifPresent(i -> System.out.println("First Home Appliance: " + i));
        anyFitness.ifPresent(i -> System.out.println("Any Fitness Item: " + i));
        System.out.println("Total Value of Picks: $" + totalValue);
    }
}
