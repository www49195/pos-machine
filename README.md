商店里进行购物结算时会使用收银机（POS）系统，这台收银机会在结算时根据客户的购物车（Cart）中的商品（Item）和商店正在进行的优惠活动（Promotion）进行结算和打印购物清单。

已知该商店正在对部分商品进行“指定商品打折”、“第二件商品半价”等优惠活动，如遇到某件商品存在多种优惠活动的情况时，所有优惠活动同时适用。例如商品A原价100，现在打8折，且第二件半价，那么购买两件的总价为120；

**现在已知**

**1st**：有商品文件列表 `itemlist.txt`，内容如下：

    ITEM000001:40
    ITEM000003:50
    ITEM000005:60
    
`ITEM000001` 代表商品的条形码，对于商品来说条形码是唯一的，`40` 代表该商品的单价；

**2nd**：“指定商品打折”优惠活动文本文件 `discount_promotion.txt`，内容如下：

    ITEM000001:75
    ITEM000005:90
    
所有位于该优惠列表中的商品都按照指定的折扣出售，如 `ITEM000001` 为 `7.5` 折；而优惠列表不包含的item则无折扣；

**3rd**：“第二件商品半价”优惠列表 `second_half_price_promotion.txt`，内容如下：

    ITEM000001
    ITEM000003
    
所有位于该优惠列表中的item，都适用于第二件半价；而优惠列表不包含的item则不参加该优惠活动；

**4th**：购物车选购商品列表 `cart.txt`，内容如下：

    ITEM000001-3
    ITEM000003-2
    ITEM000005-2

该购物车中 `ITEM000001-3` 代表商品 `ITEM000001` 的数量是 `3` 件，”-“之后表示数量，如果没有”-“则默认数量是一；在该购物车中选购的商品数量分别为：

+ `3` 件 `ITEM000001`
+ `2` 件 `ITEM000003`
+ `3` 件 `ITEM000005`

输出

在已知以上所有数据的情况下，需要实现一个购物车结算系统，通过购物车中的所购商品进行结算和打印购物清单，打印包含如下内容：

    折后价：308
