i = int(input("Enter the number of rows you want your stars to be : "))
file1 = open("Pattern.txt","a")
for j in range(1,i+1):
    file1.write("*" * j)
    file1.write("\n")

file1.close()