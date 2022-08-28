n = int(input("Enter a number : "))
i = n
sum = 0
while(n!=0) : 
    lastvar = n%10
    sum = sum + lastvar
    n = n//10
print (sum)