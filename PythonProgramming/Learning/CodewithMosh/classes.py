class Engine:
    def __init__(self,x,y):
        self.x = x
        self.y = y

    def carburator(self):
        print("carburator")
    
    def engine_oil(self):
        print("Engine Oil")

    def coolant(self):
        print("coolant")


engine1 = Engine(10,20)
print(engine1.x,engine1.y)