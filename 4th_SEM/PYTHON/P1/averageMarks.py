#GIven three subject, find best of two 

a,b,c = map(int, input("Enter three subject marks: ").split())
total = a+b+c
if(a<b and a<c):
    least = a
elif(b<a and b<c):
    least = b
else:
    least = c
avg = (total-least)/2
print(f"Best of two: {avg}")
