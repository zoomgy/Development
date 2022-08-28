numbers = [1,2,3,4,3,3,3,2,2,7,7,7,7]
numbers2 = []
for item in numbers:
    if item not in numbers2:
        numbers2.append(item)
print(numbers2)