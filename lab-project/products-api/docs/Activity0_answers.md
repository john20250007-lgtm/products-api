# Tutorial 3 - Activity 0 answers

| # | Statement | Compiles? | What happens |
|---|-----------|-----------|--------------|
| 1 | `products.add(new Product(3L, "Mug", 8.50));` | Yes | Adds a third element; list size becomes 3. |
| 2 | `products.add("Mug");` | No | A `String` is not a `Product`; the list is typed `List<Product>`. |
| 3 | `String s = products.get(0);` | No | `get(0)` returns a `Product`, which cannot be assigned to a `String`. |
| 4 | `Product p = products.get(5);` | Yes | Compiles, but throws `IndexOutOfBoundsException` at runtime (only 2 items). |
| 5 | `int n = products.size();` | Yes | Returns 2. |
| 6 | `fixed.add(new Product(3L, "Mug", 8.50));` | No | Arrays have no `add` method. |
| 7 | `Product q = byId.get(99L);` | Yes | Compiles; returns `null` because key 99 does not exist. |
| 8 | `System.out.println(q.getName());` | Yes | Compiles, but throws `NullPointerException` at runtime because `q` is null. |

Rows 4 and 8 compile because the compiler only checks types, not the contents of the collection at runtime.
