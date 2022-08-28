def list_max(list1):
    max = list1[0]
    for items in list1:
        if items > max:
            max = items
    return max