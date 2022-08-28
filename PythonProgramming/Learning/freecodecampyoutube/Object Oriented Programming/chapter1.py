import math
Test_cases = int(input("Enter the number of test cases : "))
n = 1
while(Test_cases>=n):
    dimensions = int(input(f"Enter the dimension of the square board for test case {n} : "))
    x = int(input("Enter the x coordinate of the queen : "))
    y = int(input("Enter the y coordinate of the queen : "))
    count = (2*(dimensions - abs(x-y) - 1)) + 2*(dimensions-1)
    print("Number of cells that can be attacked : ",count)
    n = n +1