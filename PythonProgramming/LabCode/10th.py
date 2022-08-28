from math import factorial
n = int(input("Enter a number to be checked : "))
o = n
sum = 0
while (n!=0):
    lastvar = n%10
    sum = sum + factorial(lastvar)
    n  = n//10
if sum == o :
    print ("Strong")
else : 
    print ("Not strong")