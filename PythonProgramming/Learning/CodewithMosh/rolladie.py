from random import randint
class Dice:
    def roll_dice(self):
        x = (randint(1,6),randint(1,6))
        return x


dice1 = Dice()
print(dice1)
print(dice1.roll_dice())