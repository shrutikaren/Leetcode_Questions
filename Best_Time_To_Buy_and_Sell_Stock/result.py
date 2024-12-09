def maximumprofit(earnings):
    days = len(earnings)
    minimum = float('inf')
    maximum = 0 

    for price in earnings: 
        if price < minimum:
            minimum = price
        if price - minimum > maximum: 
            maximum = price - minimum 

    return maximum 


earnings = [7, 1, 5, 3, 6, 4]
profit_earned = maximumprofit(earnings)
print(profit_earned)
