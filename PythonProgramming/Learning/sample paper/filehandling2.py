#8
file1 = open("sample.txt","r")
list1 = file1.readlines()
maximum = list1[0].split()[0]
for line in list1:
    list2 = list(line.split())
    for i in list2:
        if len(i)>len(maximum):
            maximum = i
print(maximum)
file1.close()