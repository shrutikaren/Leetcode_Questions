import numpy as np 

def getRow(number):
    array = np.zeros((number,number), dtype=int)

    for i in range(number + 1):
        for j in range(i + 1):
            if (j == 0 or j == i):
                array[i-1][j-1] = 1;
            else: 
                array[i-1][j-1] = array[i-2][j-2] + array[i-2][j-1]
    return array[number-1]

numbergoal = 5
print(getRow(numbergoal));
