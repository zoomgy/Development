coins = list(map(int,input().split()))
maximum = coins.count(coins[0])
for coin in coins:
    if coins.count(coin) > maximum :
        maximum = coins.count(coin)
print("Number of pockets required :",maximum)