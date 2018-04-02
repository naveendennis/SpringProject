 **Application Setup**

**User** 
	- Admin
	- Buyer

**Operations**

    * Admin
	- Add item
		- item_id 
		- item name
		- item type (category)
		- item color
		- item size
		- men / women
		- Item picture
	- Delete Item
	- Edit Item
	- Add category
		- Category name
		- Choose items for category

    * Buyer	
	- Book appointment
		- Select date & time (Date Picker)
		- Order category
		- order description
		- Sign in option

    * Common
	- Login Authentication
	- Authorization
	- Logout

**Pojos**
	- Appointment | Order
		- DateTime
		- Category_id
		- Description
		- userid (buyer)

	- User Details
		- userid		
		- name
		- email
		- preferred_category_ids

	- User
		- userid
		- password
		- user_type

	- Item
		- item id 
		- name
		- type (category | hashtag)
		- color
		- size
		- men / women
		- picture
	
	- category
		- category_id
		- category_name


		
