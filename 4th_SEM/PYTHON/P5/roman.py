num = input("Enter Roman numeral: ")

def r_to_d(r):
    roman = {'I':1, 'V':5, 'X':10, 'L':50, 'C':100, 'D':500, 'M':1000}
    total = pre_value = 0
    for i in r[::-1]:
        curr_value = roman[i]
        if curr_value>pre_value:
            total += curr_value
        else:
            total -= curr_value
        pre_value = curr_value
    return total
    
    
r_to_d(roman)