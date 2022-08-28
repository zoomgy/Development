from cmath import sqrt


a = int(input("Enter the value of a : "))
b = int(input("Enter the value of b : "))
c = int(input("Enter the value of c : "))
x = ((-1*b)+sqrt((b**2)-(4*a*c)))/(2*a)
y = ((-1*b)-sqrt((b**2)-(4*a*c)))/(2*a)
print(f"{x} and {y}")