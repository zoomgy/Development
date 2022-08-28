file1 = open("sample.txt" ,"r")
line_list = file1.readlines()
for line in line_list :
    if line[0] == "a" or line[0] == "A" :
        print(line)
file1.close()