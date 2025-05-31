# ExceptionHandlerJava

This Java program demonstrates exception handling while reading numerical data from a file. It is based on the modified `DataAnalyzer.java` example from Chapter 7 of our course textbook.

The program prompts the user to input a filename, reads the file line by line, and calculates the average of valid integers. If invalid entries are encountered (such as words or malformed numbers), the program gracefully handles the error using `try-catch` blocks and continues execution without crashing.

---

## Description

This program intentionally **does not use** `hasNextInt()` or `hasNextDouble()`. Instead, it uses `nextInt()` and relies on catching exceptions like `NumberFormatException` and `FileNotFoundException` to demonstrate robust input handling.

### Features

- Prompts user for a filename.
- Reads numerical values from the specified file.
- Skips over any invalid input without stopping execution.
- Outputs the average of valid integers.
- Handles missing file errors cleanly.

---

## Example Input Files

Place these `.txt` files in the same directory as your Java program when testing.

### `input1.txt`

4
1
2
three
4


### `input2.txt`

4
1
2
3
4


### `input3.txt`

5
1
2
3
4


---

## How to Run the Program

1. Open the project in **Eclipse IDE**.
2. Run `ExceptionHandler.java`.
3. When prompted, type the name of one of the test files (e.g., `input1.txt`) and press enter.
4. Review the console output for the calculated average and any handled errors.

---

## Sample Output

For input file `input1.txt`:

- Enter the input filename: input1.txt
- Invalid input detected and skipped.
- Average = 3.4


---

## Technologies Used

- Java
- Eclipse IDE
- Git + GitHub for version control

---

## Author

**Alexandra Nicole Mihailovic Court**  
GitHub: [@nicole31193](https://github.com/nicole31193)

---

## License

This project is for educational purposes and not licensed for production use.


