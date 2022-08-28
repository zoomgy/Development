# swapping using 3 variables
a = int(input("Enter the first number : "))
b = int(input("Enter the second number : "))
c = a
a = b
b = c

#swapping using only two variables
x = int(input("Enter the first number : "))
y = int(input("Enter the second number : "))
x = x + y
y = x - y
x = x - y
print(x , y)