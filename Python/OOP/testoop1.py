class Item:
    def cal_thing(self,x,y):
        return x*y
    
item = Item()
item.name = 7
item.name1 = 8
print(item.cal_thing(item.name,item.name1))