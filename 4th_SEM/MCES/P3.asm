	AREA ADDARRAY, CODE, READONLY 
ENTRY
	MOV R5, #6
	MOV R0, #0
	LDR R1, =VALUE
LOOP LDRH R2, [R1], #2
	ADD R0, R0, R2
	SUBS R5, R5, #1
	BNE LOOP
	LDR R4, =RESULT 
	STR R0, [R4]
STOP B STOP
VALUE DCW 0x1165, 0x2222, 0x3333, 0x4444, 0x3333, 0x5555
	AREA DATA2, DATA, READWRITE ;Declaring a DATA section names DATA2 to declare and store variables
RESULT DCD 0x0 ;RESULT stores the 32-bit output from the sum of array elements
	END
