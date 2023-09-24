string = input("Enter a number or string: ")

dictionary = {}

for letter in string:
    if letter not in dictionary:
        dictionary.update({letter : 1})
    else:
        dictionary[letter] += 1
    
reverse = string[::-1]
print(f"Reverse: {reverse}")
if reverse == string:
    print("It is a Palindrome")
else:
    print("It is not a Palindrome")
print(dictionary)
