bin = int(input("Enter a binary number: "))

def btod(n):
    p=1
    decimal=0
    while(n!=0):
        remainder = n%10
        n = n//10
        decimal += p*remainder
        p *= 2
    return decimal
binary = btod(bin)
print(f"Binary: {binary}")
print(f"Octal: {oct(binary)}")
print(f"Hexadecimal: {hex(binary)}")