mydict = {
    "key1" : "value1",
    "key2" : "value2",
    "key3" : "value3"
}
a = mydict.keys() # prints keys of a dictionary in the form of lists
b = mydict.values() # print values of a dictionary in the form of lists
print(a)
print(b)
a = list(a)
b = list(b)
print(type(a))
print(type(b))
print(mydict.items()) # prints key value pairs of the dictionary
#dictionary is unordered

anotherdict = {"addedvalue" : "addedkey"}
print(mydict)
mydict.update(anotherdict) # adds the new dicionary key value pairs and also updates any existing value pair.
print (mydict)
print (mydict.get("key1"))
print (mydict.get("man"))
# print (mydict["man"]) # throws error because key value "man" is not present in the dictionary