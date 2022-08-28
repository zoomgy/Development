P = int(input("Enter principle amount : "))
r = int(input("Enter annual interest rate : "))
r = r/100
t = int(input("Enter time in years : "))
n = int(input("Enter number of times interest is compounded per year : "))
A = P * ((1+(r/n))**(n*t))
print("Amount to be payed : ",A)