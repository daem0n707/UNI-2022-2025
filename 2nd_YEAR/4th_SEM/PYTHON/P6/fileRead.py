def display(name, n):
    with open(name, 'r') as file:
        line = file.readlines()
        for i in range(n):
            try:
                print(line[i][:-1])
            except:
                print("\nEnd of file")
                break

def frequency(filename, word):
    with open(filename, 'r') as file:
        line = file.read().replace("\n", "").split()
        f = 0
        for word in line:
            if word.startswith(word):
                f += 1
    print(f"\nFrequency of '{word}': {f}")

display(r"Enter path to file", 1) # Prints first 100 files in file
frequency(r"Enter path to file", 'Python') #Prints frequency of "Python" inside text.txt
