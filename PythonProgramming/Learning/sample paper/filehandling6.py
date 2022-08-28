a = open("sample.txt","a")
b = [1,2,3,4,5,6,7]
a.writelines(f"{b}")
a.close()

f = open("sample.txt","r")
print(f.read())
f.close()