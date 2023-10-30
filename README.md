# Java-SSS-Shopping
____________________________________________
# PROJECT DETAILS
    - Project Name :  SSS Shopping using Java.
    - Project Type : E-Commerce Platform.
_____________________________________________
# USED TECHNLOGY:
    - JAVA - Version 17.
    - Maven 3.8.6.
_____________________________________________
# INITIAL STEPS:
    - Go to App.java.
    - Start Run the Project
_____________________________________________
# ACCESS CREDENTIALS:
    - User Need to Register First.
    - Then Login to Access the Shooping Platform.
__________________________________________________
# PROJECT OVERVIEW: (Full Edition)
    -  Registration
        - Seller/Customer register
    - Login
        - Seller/Customer Login
    - Customer Controls
        - View Products
        - View Category
        - Add Products to the Cart
        - View Cart
        - Place Orders
        - View Invoice of Orders
        
    - Seller Controls
        - Add Products
        - Delete Products
        - Edit Products
        - View Products
        - See Orders.
____________________________________________________
# REQUIREMENTS COMPLETED:
    - Register
    - Login
   - **Customer Control**
        - View Products
        - View Catogory
        - Add to Cart
        - View Cart
    - Admin Control
        - Processing
_______________________________________________________
# WORK IN PROCESS
   - Customer Control
        - Make Orders
        - View Orders
        
    - Admin Controls
        - Add Products
        - View Products
        - Edit Products
        - Delete Products
        
_______________________________________________________
# FILE STRCTURE:
    - Model (For Structure and Encasule the Data)
        - User
        - Cart
        - CartProduct
        - Product
        - Orders
    - Controller (Handle Flow, Methods,All Activities)
        - HomeController
        - AuthController
        - ProductController
        - CartController
        - OrderController
        - CategoryController
    - View (Display things in console)
        - HomeView
        - ProductView
        - CartView
        - OrderView
        - WelcomeView
    Main File
        - App
__________________________________________________________________

# FLOW OF PROJECT:
    - Register 
        - User Need to enter Name,email,password,confirmPassword.
        - Password and Confirm Password Should Match
    - Login 
        - Valid Credentials Should need to Login.
    ***Enter Into the Work FLow***
___________________________________________________________________
# PAGES AND THEIR WORK FLOW:
    - LOGIN PAGE:
        - Login 
         ![Welcome Page](https://github.com/saravanan-sarav/Java-SSS-Shopping/assets/145537699/3dac5dc0-08f4-40c4-b9b5-b88e27494d0c)
_______________________________________________________________
        - Register
         ![Register](https://github.com/saravanan-sarav/Java-SSS-Shopping/assets/145537699/fa953832-e566-485b-b12f-2a514ed206f3)
______________________________________________________________
    - HOME PAGE:
        - User Can Select THeir Options
        - Options are...
            - Catogory
            - Products
            - Cart
            - Orders
            - LogOut
        (https://github.com/saravanan-sarav/Java-SSS-Shopping/assets/145537699/b839c48a-7061-49ec-bd06-208032432dc1)
        <img src ="https://github.com/saravanan-sarav/Java-SSS-Shopping/assets/145537699/b839c48a-7061-49ec-bd06-208032432dc1"/>

    - CATOGORY PAGE
        - List the Categories
        ![Product for Particular Category](https://github.com/saravanan-sarav/Java-SSS-Shopping/assets/145537699/5f0845e8-e184-48c8-a158-517f812212d6)
    - PRODUCT PAGE
        - List All Products
        ![Full Products](https://github.com/saravanan-sarav/Java-SSS-Shopping/assets/145537699/86cc5caf-d567-49d5-b9ab-cc7b99b22b57)
    - CART PAGE
        - List the Cart of Particular User.
        ![Cart](https://github.com/saravanan-sarav/Java-SSS-Shopping/assets/145537699/5483587f-98a9-42b9-9f50-c739246efc62)
    - Order Page 
        # - In Processing
______________________________________________________________

# ISSUES I FACED AS OF NOW:
    - Product Id Issue
        - I Used Time Stamp for Id, Which Means Long.
        - So, I can't Display product and I Can't Print Product Id.
        - Then I Got Idea to Use HashMap 
        - In HashMap I Used to Load Ids in Map and i fixed Index Value as a Key
    - Class Calling DeadLock Error
        - Class Calling Each other Simultaniously.
        - So I pass the class in Constructor while Creating Object.
        - And I Created Method OverLoad Concept in Constructor.
    - Basic Error HandLings



    
    
