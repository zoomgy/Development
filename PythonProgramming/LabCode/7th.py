n = int (input("Enter a number : "))
rev = 0
o = n
while (n!=0):
    lastvar = n%10
    rev = rev*10 + lastvar
    n = n//10
if (rev == o) :
    print ("Pallindrom")
else :
    print("Not pallindrom")