import re
phone = '123-896-76891'

def number(n):
    p = n.split('-')
    for i in p:
        if not i.isdecimal():
            return False
    if len(p) != 3:
        return False
    elif len(p[0])!=3 or len(p[1])!=3 or len(p[2])!=4:
        return False
    return True

def regex(n):
    number = re.compile(r'\d\d\d-\d\d\d-\d\d\d\d')
    if number.match(n):
        print("Valid")
    else:
        print("Invalid")
    
regex(phone)