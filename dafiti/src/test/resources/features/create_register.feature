Feature:I as a user need to create an account to add products to the cart

  Scenario: Create Register
    Given the user is on the app dafiti
    When the user registers and selects the product
    Then the user can view the product in the shopping cart