def nth_tribonacci_number(n):
    if (n == 0):
        return 0 
    elif (n == 1):
        return 1
    elif (n == 2):
        return 1
    else:
        a = 0
        b = 1
        c = 1
        temp = 0 
        for i in range(3, n):
            temp = a + b + c
            a = b
            b = c
            c = temp
        return temp


for i in range (1,27):
    print(nth_tribonacci_number(i))


