[![codecov](https://codecov.io/gh/TheFallender/Amazing/branch/master/graph/badge.svg?token=0vyRPWkJGd)](https://codecov.io/gh/TheFallender/Amazing)

# Amazing
This project tries to immitate how a marketstore like Amazon would work. It gives you the option to create products, category (only if you are an admin) and buy the products.

This project uses a [website](http://currencies.apps.grandtrunk.net/) made by Wim Heirman, thanks to him the converter rate gets the latest value from the net.

## How to manually modify settings
In case you want to manually create things outside of the app, here is the template for the files.

Note that you shouldn't modify the password and that you can't see it in plain text. In case you want the password you could decrypt it.

data_path // You can use this file to change the data location
```
DATA_PATH=
```

d_user //User data - All the user data is loaded here
```
u_email=
u_password=
u_login=
u_last_login=
u_admin=
```

d_category //Category data - All the categories should be here, note that this is the string.
```
category=
```

d_product //Product data - Product data will be here
```
p_id=
p_name=
p_category=
p_price=
p_stock=
```

d_product_user //Product user data - The data from the orders
```
pu_u_id=
pu_p_id=
pu_p_name=
pu_number=
```

d_conversor_rate //Conversor rate - Currency rate from and to
```
latest_conversor_rate=
```
## To do list:
☒ Give admin to a user without the need to access the files (having a default admin).

☒ Allow to change the password.

☒ Comentary everywhere.

☒ Delete categories and products (will have to update the product user to retain data).

☒ From Object Array to Array List.

☒ Localize.

☒ Clean code with Lint.

☒ Write outside of the object constructor, function inside the object.

☒ Remove IO size data_a, make it unlimited (arraylist of string).
