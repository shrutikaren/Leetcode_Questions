import numpy as np 

def generate(number): 
    newlist = np.zeros((number, number), dtype=int)
    
    for i in range(number): 
        for j in range(i): 
            if (j == 0 or j == i):
                newlist[i][j] = 1
            else:
                newlist[i][j] = newlist[i][j-1] + newlist[i-1][j-1]

    # newlist would have a square pattern where the parts we don't want is a 0
    # most likely. We want a triangle shape in our shaping system so that our 
    # list comprehensions keep having that increasing kind of pattern 

    result_output = [list(eachrow[:i+1]) for i, eachrow in enumerate(newlist)]

    return result_output

result_output = generate(5)
print(result_output)
