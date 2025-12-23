# Java Collections Conversion Demo

This repository contains a simple Java program that demonstrates how to create and convert between different collection types in the Java Collections Framework:

- `ArrayList`
- `LinkedList`
- `HashSet`
- `LinkedHashSet`
- `TreeSet`

The program fills an `ArrayList` with integers using different loops, then sequentially converts that list into other collection types while printing the contents at each step.

## Features

- Create an `ArrayList<Integer>` and populate it with a pattern of numbers.
- Convert `ArrayList` to `LinkedList`.
- Convert `LinkedList` to `HashSet`.
- Convert `HashSet` to `LinkedHashSet`.
- Convert `LinkedHashSet` to `TreeSet`.
- Observe how ordering and uniqueness change across different collection types.

## Code structure

- `wq`  
  Creates and returns an `ArrayList<Integer>` with sample data and prints it.

- `aa`  
  Converts the `ArrayList` from `wq` into a `LinkedList` and prints it.

- `bb`  
  Converts the `LinkedList` from `aa` into a `HashSet` and prints it.

- `cc`  
  Converts the `HashSet` from `bb` into a `LinkedHashSet` and prints it.

- `ee`  
  Converts the `LinkedHashSet` from `cc` into a `TreeSet` and prints it.

- `list` (public class with `main`)  
  Calls all the above methods in sequence:
public static void main(String[] args) {
wq.data();
aa.vv();
bb.rr();
cc.abc();
ee.az();
}

text

## How to run

1. Make sure you have Java (JDK 8 or later) installed.

2. Clone this repository:
git clone https://github.com/<your-username>/java-collections-conversion-demo.git
cd java-collections-conversion-demo

text

3. Save the code in a file named `list.java` inside a `collections` package directory:
src/
collections/
list.java

text

4. Compile the program:
javac -d out src/collections/list.java

text

5. Run the program:
java -cp out collections.list

text

You will see the contents of each collection printed in the console, showing how insertion order and sorting behavior differ between the collection types.

## Possible improvements

- Rename classes (`wq`, `aa`, `bb`, etc.) to more meaningful names (e.g., `ArrayListDemo`, `LinkedListDemo`).
- Add comments explaining the output of each collection.
- Turn this into a small learning project with separate examples for each collection type.
