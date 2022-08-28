file1 = open("fuckbhavya.txt","r")
list_of_lines = file1.readlines()
for line in list_of_lines:
    if line[0] == 'A' or line[0] == 'a' :
        print(line,end='')
    print("")
file1.close()
file2 = open("fuckbhavya.txt","w")
print(file2.write("Section E"))
file2.close()