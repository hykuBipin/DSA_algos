Write a method, pairProduct, that takes in a List and a target product as arguments. The function should return a List containing a pair of indices whose elements multiply to the given target. The indices returned must be unique.

Be sure to return the indices, not the elements themselves.

There is guaranteed to be one such pair whose product is the target.

test_00

Source.pairProduct(List.of(3, 2, 5, 4, 1), 8); // -> [1, 3]

test_01

Source.pairProduct(List.of(3, 2, 5, 4, 1), 10); // -> [1, 2]

test_02

Source.pairProduct(List.of(4, 7, 9, 2, 5, 1), 5); // -> [4, 5]

test_03

Source.pairProduct(List.of(4, 7, 9, 2, 5, 1), 35); // -> [1, 4]

test_04

Source.pairProduct(List.of(3, 2, 5, 4, 1), 10); // -> [1, 2]

test_05

Source.pairProduct(List.of(4, 6, 8, 2), 16); // -> [2, 3]

test_06

ArrayList<Integer> numbers = new ArrayList<>();
for (int i = 1; i <= 25000; i += 1) {
  numbers.add(i);
}
pairProduct(numbers, 624975000); // -> [ 24998, 24999 ] 