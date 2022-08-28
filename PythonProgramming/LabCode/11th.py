import math
#n = int(input("Enter a number to be checked : "))
for n in range(1,100001):
    o = n
    sum = 0
    while (n!=0):
        lastvar = n%10
        sum = sum + math.factorial(lastvar)
        n  = n//10
    if sum == o :
        print (o,end = " ")