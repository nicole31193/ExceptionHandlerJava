# ExceptionHandlerJava

This Java program demonstrates exception handling while reading numerical data from a file. It is an example based on Chapter 7 of the course textbook.

The program prompts the user to input a filename, reads the file line by line using `Scanner.hasNext()`, and attempts to convert each token into an integer using `Integer.parseInt()`. If invalid entries (like words or symbols) are encountered, they are gracefully skipped using exception handling.

---

## Description

The program focuses on robust file input by using nested `try-catch` blocks. It avoids `hasNextInt()` or `hasNextDouble()` in favor of directly parsing strings and catching `NumberFormatException`. This demonstrates clean separation of logic and error handling in Java.

### Features

- Prompts the user for a filename.
- Reads and parses values from the file one token at a time.
- Skips invalid values using exception handling.
- Displays the average of valid integers.
- Gracefully handles file-not-found errors.

---

## Example Input Files

Make sure to place these `.txt` files in the same folder as your Java program or properly configure the path.

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


