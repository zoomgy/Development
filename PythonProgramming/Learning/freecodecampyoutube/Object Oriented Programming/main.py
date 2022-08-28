# creation of the class

class Item:
    def calculate_total_price(self):
        return self.price * self.quantity


item1 = Item()
item1.name = "Phone"
item1.price = 500
item1.quantity = 2


item2 = Item()
item2.name = "Laptop"
item2.price = 1000
item2.quantity = 3

print(item1.calculate_total_price())