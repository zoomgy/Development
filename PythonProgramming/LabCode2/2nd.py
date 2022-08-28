import math
a1 = int(input("Enter x coordinate of point A : "))
b1 = int(input("Enter y coordinate of point A : "))
a2 = int(input("Enter x coordinate of point B : "))
b2 = int(input("Enter y coordinate of point B : "))
D = math.sqrt(((a2 - a1)**2) + ((b2 - b1)**2))
print("Distance : ",D)