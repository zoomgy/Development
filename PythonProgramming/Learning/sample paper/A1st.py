string1 = "Hello what the fuck"
a = list(string1)
a.reverse()
string2 = ''
for i in a :
    string2 = string2 + i
print(string2)