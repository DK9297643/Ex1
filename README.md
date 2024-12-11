# Ex1 - Number Conversion and Validation

## Overview
This project implements utilities for working with numbers in various bases (from 2 to 16). The utilities include functions to convert numbers between bases, validate input formats, compare numbers in different bases, and identify the maximum value in an array of numbers.

## Functionality

### 1. `number2Int(String num)`
Converts a given number from a string representation in a specific base to its decimal (base 10) equivalent.
- **Input:** `num` - a string in the format "number-b-base" (e.g., `101b2`, `1A3b16`).
- **Output:** Decimal value of the number or `-1` if the format is invalid.

### 2. `isNumber(String a)`
Validates if a given string represents a valid number in the supported base format.
- **Input:** `a` - a string to validate.
- **Output:** `true` if valid, `false` otherwise.

### 3. `int2Number(int num, int base)`
Converts a given decimal number to its representation in a specified base.
- **Input:**
  - `num` - the decimal number.
  - `base` - the target base (between 2 and 9 or 'A' and 'G'(if the base is greater than 9)).
- **Output:** A string representing the number in the specified base or an empty string for invalid input.

### 4. `equals(String n1, String n2)`
Compares two numbers in different bases for equality.
- **Input:**
  - `n1` - first number.
  - `n2` - second number.
- **Output:** `true` if the numbers are equal, `false` otherwise.

### 5. `maxIndex(String[] arr)`
Finds the index of the largest number in an array of strings representing numbers in various bases.
- **Input:** `arr` - an array of strings in base formats.
- **Output:** The index of the largest number or the first index in case of ties.

### 6. `charToint(char t)`
Converts a character representing a digit or letter in a specific base to its integer value.
- **Input:** `t` - a character (`0-9` or `A-G`).
- **Output:** The integer value of the character, or `-1` if invalid.

## Usage
1. Call `number2Int` to convert a base-formatted string to decimal.
2. Use `isNumber` to validate input before conversion.
3. Convert integers to specific bases using `int2Number`.
4. Compare two numbers with `equals`.
5. Identify the largest number in an array using `maxIndex`.

## Examples
- `number2Int("101b2")` → `5`
- `isNumber("1A3bG")` → `true`
- `int2Number(10, 2)` → `"1010b2"`
- `equals("101b2", "5bA")` → `true`
- `maxIndex(["101b2", "A1bG", "15bA"])` → `1`


