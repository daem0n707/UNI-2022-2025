	AREA COMPARE, CODE, READONLY
ENTRY
	MOV R5, #5
	LDR R1, =ARRAY
	LDR R2, [R1], #4
LOOP LDR R4, [R1], #4
	CMP R2, R4
	BHI NEXT
	MOV R2, R4 ;Switch the registers to find smallest number
NEXT SUBS R5, R5, #1
	BNE LOOP
STOP B STOP
ARRAY DCD 0x23, 0x45, 0x65, 0x76, 0x12, 0x99
	END
;Output would be 0x99 (Largest)
