n = int (input("Enter a number : "))
c=0
for i in range (1,n//2 + 2) : 
    if (n%i==0 and n!=i and i!=1) : 
        c = 1
        break
if c==1 : 
    print ("Not Prime")
else :
    print ("Prime")