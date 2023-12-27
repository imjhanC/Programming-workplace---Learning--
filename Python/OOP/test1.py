class Item:
    def cal_total_price(self,x,y):
        return x*y

item1 = Item()
item1.name = "xxx"
item1.price= 1000
item1.quantity = 5 
print(item1.cal_total_price(item1.price,item1.quantity))