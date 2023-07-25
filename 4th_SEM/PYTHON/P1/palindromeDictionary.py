string = input("Enter a number or string: ")
reverse = ""
last = -1
length = len(string)
dictionary = {}

while length!=0:
    lastLetter = string[last]
    if lastLetter not in dictionary:
        dictionary.update({lastLetter : 1})
    else:
        dictionary[lastLetter] += 1
        
    reverse += lastLetter 
    last -= 1
    length -= 1
    
print(f"Reverse: {reverse}")
if reverse == string:
    print("It is a Palindrome")
else:
    print("It is not a Palindrome")
print(dictionary)
