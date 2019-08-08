Feature: Payement Details

Scenario: No Card holder Name
	Given user is on 'PaymentDetails' page
	When user doesnot enter card holder name
	Then display 'Please fill the Card Holder Name'

Scenario: No debit card Number
	Given user is on 'PaymentDetails' page
	When user doesnot enter debit card number
	Then display 'Please fill the Debit card Number'
	
Scenario: No CVV
	Given user is on 'PaymentDetails' page
	When user doesnot enter cvv 
	Then display 'Please fill the CVV'
	
Scenario: No Card expiration month
	Given user is on 'PaymentDetails' page
	When user doesnot enter expiration month
	Then display 'Please fill expiration month'
	
Scenario: No Card expiration year
	Given user is on 'PaymentDetails' page
	When user doesnot enter expiration year
	Then display 'Please fill expiration year'
	
Scenario: Vaild Payment Details
	Given user is on 'PaymentDetails' page
	When user enters vaild payment details and clicks on 'Make Payment' button
	Then display 'Pan Card Registration Done successfully !!!'
	