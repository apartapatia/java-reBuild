# Readme

## Int class

This is a Java class called Int that provides basic arithmetic operations and methods to manipulate an integer value. The class has the following methods:

### Constructors
- Int() creates a new instance of Int with the default value of 0.
- Int(int value) creates a new instance of Int with the specified value.

### Arithmetic operations
- increment() increments the value of Int by 1.
- decrement() decrements the value of Int by 1.
- add(Int value) adds the specified value to the value of Int.
- subtract(Int value) subtracts the specified value from the value of Int.
- multiply(Int value) multiplies the value of Int by the specified value.
- divide(Int value) divides the value of Int by the specified value.

### Conversion methods
- toLong() returns the value of Int as a long.
- toDouble() returns the value of Int as a double.

### Comparison methods
- equals(Int value) checks if the value of Int is equal to the specified value.
- lessZero() checks if the value of Int is less than zero.
- aboveZero() checks if the value of Int is greater than zero.

### Bit manipulation methods
- isNegative() negates the value of Int.
- setBit(int bit) sets the bit at the specified position to 1.
- clearBit(int bit) sets the bit at the specified position to 0.

### Override method
- toString() returns the value of Int as a String.

## Example Usage
```Java
Int a = new Int(5);
a.increment(); // a = 6
a.add(new Int(10)); // a = 16
a.divide(new Int(2)); // a = 8
System.out.println(a.toString()); // output: 8