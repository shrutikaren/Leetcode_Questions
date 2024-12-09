# Parameters involved are the following: 
#   s - String s containing some letters 
#   t - String t containing some letter 
# This function compares to see if the String t contains a subsequence of 
# String s in the same order of characters as it appears in String s.

def isSubsequence(s, t):
    s_length = len(s);
    t_length = len(t);
    indexfound = 0
    found = False 
    for i in range(s_length):
        found = False # Every character inside s would begin with a false 

        for j in range(indexfound, t_length):
            if (t[j] == s[i]): 
                indexfound = j + 1
                found = True
                
            
        # If we go through all of the characters and can't find a matching
        # character in the order we expected it to be then we will have to
        # return false midway 
        if (found != True):
            return False

    if (found != True):
        return False
    else:
        return True

s = "abc"  
t = "ahbgdc"
print(isSubsequence(s, t))          
