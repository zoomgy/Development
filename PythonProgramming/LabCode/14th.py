max = 11 ^ 12
n1 = int (input("Enter Lower Limit : "))
n2 = int (input("Enter Upper Limit : "))
for i in range(n1,n2+1):
    for j in range(i,n2+1):
        if (i ^ j)>max :
            max = i ^ j
print (max)