P = int(input("Enter principle amount : "))
t = int(input("Enter time in years : "))
r = int(input("Enter annual rate : "))
A = ((P*r*t)/100)+P
print("Amount to be paid : ",A)