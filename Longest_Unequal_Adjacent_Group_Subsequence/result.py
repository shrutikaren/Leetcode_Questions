def LongestSubsequence(words, groups): 
    i = 1
    j = 1
    output = []
    output.append(words[0])

    while i < len(words) and j < len(groups):
        if groups[j] != groups[j-1]:
            output.append(words[i])

        j += 1
        i += 1

    return output


words = ["a", "b", "c", "d"]
groups = [1, 0, 1, 1]
print(LongestSubsequence(words, groups))


words2 = ["e", "a", "b"]
groups2 = [0, 0, 1]
print(LongestSubsequence(words2, groups2))
