# I used recursion for this question when I worked with my java file 
# Here, in this python file, we will try something different. We will 
# try to work on a dynamic programming approach to solve the same 
# question but differently. 

def fibonacci_sequence(n):
    if (n == 0):
        return 0;
    elif (n == 1):
        return 1;
    else:
        num1 = 0;
        num2= 1;
        for i in range(n):
            temp = num1 + num2;
            num1 = num2;
            num2 = temp;

        return num1;


print(fibonacci_sequence(4));
