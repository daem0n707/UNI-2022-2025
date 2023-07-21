# PROGRAM EXPLANATION
- [Multiplying 16-bit Number](##multiplying-16-bit-numbers)
- [Factorial of a number](##factorial-of-a-number)
- [Add array of 16-bit numbers](##add-array-of-16-bit-numbers)
- [Square of a number using Lookup Tables](##square-of-a-number-using-lookup-tables)
- [Largest or Smallest number in an array](##largest-or-smallest-number-in-an-array)
- [Sum of first 10 Integers](##sum-of-first-10-integers)

## [Multiplying 16-bit Numbers](./P1.asm)
```
LDR R0, =ARRAY: Load the address of the ARRAY into register R0. The = sign before ARRAY is used to get the address of the label ARRAY.

LDRH R1, [R0]: Load a 16-bit halfword from the memory location pointed to by R0 (the first element of the ARRAY) into register R1. This instruction fetches the value at the specified address and loads it into R1. Since LDRH reads a halfword (16 bits), it will load the value 0x1234 from the first memory location pointed to by R0.

LDRH R2, [R0, #2]: Move 2 bytes (16 bits) forward in memory from the address in R0 to access the next element of the ARRAY. Load a 16-bit halfword from this new memory location into register R2. This instruction fetches the value at the specified address and loads it into R2. Since LDRH reads a halfword (16 bits), it will load the value 0x1345 from the second memory location pointed to by R0.

MUL R3, R2, R1: Multiply the values in R2 and R1 and store the result in R3. The value in R2 (0x1345) is multiplied by the value in R1 (0x1234), and the result (0x1234 * 0x1345) is stored in R3.

STOP: Infinite loop to stop the program execution.

The program performs a simple multiplication of two 16-bit values from the ARRAY and stores the result in R3. The values used for multiplication are 0x1234 and 0x1345 from the ARRAY. The program then enters an infinite loop (B STOP) to halt the execution.
```

## [Factorial of a Number](./P2.asm)
```
MOV R0, #5: Load the immediate value 5 into register R0. This value (5) will be used as the number for which the factorial is to be calculated.

CMP R0, #0: Compare the value in R0 with the immediate value 0.

BEQ ANS: If R0 is equal to 0, branch to the label ANS. This handles the special case where the factorial of 0 is 1.

CMP R0, #1: Compare the value in R0 with the immediate value 1.

BEQ ANS: If R0 is equal to 1, branch to the label ANS. This handles the special case where the factorial of 1 is also 1.

MOV R1, R0: If R0 is not 0 or 1, copy the value in R0 to R1. This initializes a loop counter in R1 to calculate the factorial.

UP: The loop label, marking the beginning of the loop.

SUBS R1, R1, #1: Subtract 1 from the value in R1 (the loop counter) and set condition flags based on the result.

BEQ STOP: If the result of R1-1 is 0, branch to the label STOP. This checks if the loop counter has reached 0, indicating that the factorial calculation is complete.

MUL R2, R1, R0: Multiply the values in R1 and R0 (the loop counter and the current value of R0) and store the result in R2.

MOV R0, R2: Copy the value in R2 (the result of the multiplication) to R0. This updates R0 with the new calculated value as the factorial progresses.

B UP: Branch back to the label UP. This continues the loop until the loop counter (R1) becomes 0.

ANS: The ANS label.

MOV R0, #1: Load the immediate value 1 into R0. This handles cases where the input value is 0 or 1, and the factorial is directly set to 1.

STOP: Infinite loop to stop the program execution.

The program calculates the factorial of the number stored in R0 and stores the result in R0 itself. If the input value is 0 or 1, the factorial is directly set to 1. The program then enters an infinite loop (B STOP) to halt the execution.
```

## [Add array of 16-bit Numbers](./P3.asm)
```
MOV R5, #6: Load the immediate value 6 into register R5. This value (6) will be used as the loop counter to iterate over the VALUE array, which contains six elements.

MOV R0, #0: Load the immediate value 0 into register R0. This will be used as a temporary register to hold the sum of the elements in the VALUE array.

LDR R1, =VALUE: Load the address of the VALUE array into register R1. The = sign before VALUE is used to get the address of the label VALUE.

LOOP: The loop label, marking the beginning of the loop.

LDRH R2, [R1], #2: Load a 16-bit halfword from the memory location pointed to by R1 (the next element of the VALUE array) into register R2. After the load, the value in R1 is incremented by 2 bytes (halfword size) so that it points to the next element in the VALUE array.

ADD R0, R0, R2: Add the value in R2 (the current halfword from the VALUE array) to the value in R0 (the sum) and store the result in R0.

SUBS R5, R5, #1: Decrement the value in R5 (the loop counter) by 1 and set condition flags based on the result.

BNE LOOP: If R5 is not equal to 0 (the result of the previous subtraction), branch back to the label LOOP. This continues the loop until all elements of the VALUE array are processed.

LDR R4, =RESULT: Load the address of the RESULT variable into register R4. The = sign before RESULT is used to get the address of the label RESULT.

STR R0, [R4]: Store the value in R0 (the sum of the elements in the VALUE array) into the memory location pointed to by R4 (RESULT variable).

STOP: Infinite loop to stop the program execution.

The program iterates over the VALUE array, calculates the sum of its elements, and stores the result in the variable RESULT. The program then enters an infinite loop (B STOP) to halt the execution.
```

## [Square of a number using Lookup Tables](./P4.asm)
```
MOV R1, #5: Load the immediate value 5 into register R1.

LDR R0, =LOOKUP: Load the address of the LOOKUP table into register R0. The = sign before LOOKUP is used to get the address of the label LOOKUP.

MOV R1, R1, LSL #2: Left shift the value in R1 by 2 bits (equivalent to multiplying by 4) to calculate the correct offset within the LOOKUP table. This is done because the table contains 32-bit entries (DCD) and each entry takes 4 bytes.

ADD R0, R0, R1: Add the value in R1 (the offset) to the base address in R0 (the address of the LOOKUP table) to get the memory address of the desired entry in the LOOKUP table. The result is stored in R0.

LDR R3, [R0]: Load the value from the memory address pointed to by R0 (the address of the desired LOOKUP table entry) into register R3. This instruction fetches the value at the specified address, which effectively retrieves the square of the number specified by the original value in R1.

STOP: Infinite loop to stop the program execution.

The program uses the LOOKUP table to calculate the square of the number 5 (specified in R1) and stores the result in R3. The table contains precomputed squares of consecutive numbers from 0 to 10. Note that the instruction MOV R1, R1, LSL #2 performs the multiplication by 4 (left shift by 2 bits) since each entry in the LOOKUP table is 4 bytes (32 bits) wide due to the use of DCD. The calculated square (25) is stored in R3 before entering the infinite loop (B STOP) to halt the execution
```

## [Largest or smallest number in an array](./P5.asm)
```
MOV R5, #5: Load the immediate value 5 into register R5. This value (5) will be used as the loop counter to iterate over the ARRAY.

LDR R1, =ARRAY: Load the address of the ARRAY into register R1. The = sign before ARRAY is used to get the address of the label ARRAY.

LDR R2, [R1], #4: Load a 32-bit word from the memory location pointed to by R1 (the first element of the ARRAY) into register R2. After the load, the value in R1 is incremented by 4 bytes (word size) so that it points to the next element in the ARRAY.

LOOP: The loop label, marking the beginning of the loop.

LDR R4, [R1], #4: Load a 32-bit word from the memory location pointed to by R1 (the next element of the ARRAY) into register R4. After the load, the value in R1 is incremented by 4 bytes (word size) so that it points to the next element in the ARRAY.

CMP R2, R4: Compare the values in R2 and R4. The CMP instruction updates the condition flags based on the result of the comparison.

BHI NEXT: If the value in R2 is higher than the value in R4 (unsigned comparison), branch to the label NEXT. This means the program has found a new minimum value (smallest number) in the ARRAY.

MOV R2, R4: If R2 is not higher than R4, copy the value in R4 to R2. This effectively switches the registers to update R2 with the new minimum value found.

NEXT: The NEXT label.

SUBS R5, R5, #1: Decrement the value in R5 (the loop counter) by 1 and set condition flags based on the result.

BNE LOOP: If R5 is not equal to 0 (the result of the previous subtraction), branch back to the label LOOP. This continues the loop until all elements of the ARRAY are processed.

STOP: Infinite loop to stop the program execution.

The program iterates over the ARRAY and finds the smallest number (minimum value) among the elements. It does this by comparing each element with the current minimum value (stored in R2) and updating R2 if a smaller value is found. After the loop finishes, R2 will contain the smallest number in the ARRAY. The program then enters an infinite loop (B STOP) to halt the execution.
```

## [Sum of first 10 Integers](./P6.asm)
```
MOV R0, #10: Load the immediate value 10 into register R0. This value (10) will be used as the loop counter to iterate over the ARRAY.

MOV R1, #0: Load the immediate value 0 into register R1. This will be used as a temporary register to hold the sum of the elements in the ARRAY.

LDR R2, =ARRAY: Load the address of the ARRAY into register R2. The = sign before ARRAY is used to get the address of the label ARRAY.

NEXT: The loop label, marking the beginning of the loop.

LDR R3, [R2], #4: Load a 32-bit word from the memory location pointed to by R2 (the next element of the ARRAY) into register R3. After the load, the value in R2 is incremented by 4 bytes (word size) so that it points to the next element in the ARRAY.

ADD R1, R1, R3: Add the value in R3 (the current element from the ARRAY) to the value in R1 (the sum) and store the result in R1.

SUBS R0, R0, #1: Decrement the value in R0 (the loop counter) by 1 and set condition flags based on the result.

BNE NEXT: If R0 is not equal to 0 (the result of the previous subtraction), branch back to the label NEXT. This continues the loop until all elements of the ARRAY are processed.

STOP: Infinite loop to stop the program execution.

The program iterates over the ARRAY, calculates the sum of its elements, and stores the result in R1. After the loop finishes, R1 will contain the sum of the elements in the ARRAY. The program then enters an infinite loop (B STOP) to halt the execution.
```
