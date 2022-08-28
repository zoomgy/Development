n = int (input("Enter a number : "))
for n in range(1,n+1):
    c=0
    for i in range (1,n//2 + 2) : 
        if (n%i==0 and n!=i and i!=1) : 
            c = 1
            break
    if c==0 : 
        print (n,end = " ")