n = int(input("Enter index: "))

def fib(n):
    if n==0 or n==1:
        return n
    elif n<0:
        print("Invalid Index")
    else:
        return fib(n-2)+fib(n-1)

print(f"Fibonacci at index {n}: {fib(n)}")