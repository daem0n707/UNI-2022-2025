	AREA SUM, CODE, READONLY
ENTRY
	MOV R0, #10
	MOV R1, #0
	LDR R2, =ARRAY
NEXT LDR R3, [R2], #4
	ADD R1, R1, R3
	SUBS R0, R0, #1
	BNE NEXT
STOP B STOP
ARRAY DCD 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
	END
