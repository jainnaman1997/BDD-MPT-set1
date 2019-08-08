Feature: User Information

Scenario: No Applicant Name
	Given user is on 'UserInformation' page
	When user doesnot enter applicant name
	Then display 'Please fill the Applicant Name'

Scenario: No First Name
	Given user is on 'UserInformation' page
	When user doesnot enter first name
	Then display 'Please fill the First Name'
	
Scenario: No Last Name
	Given user is on 'UserInformation' page
	When user doesnot enter last name
	Then display 'Please fill the Last Name'
	
Scenario: No Father Name
	Given user is on 'UserInformation' page
	When user doesnot enter father name
	Then display 'Please fill the Father Name'
	
Scenario: No Date of Birth
	Given user is on 'UserInformation' page
	When user doesnot enter invalid date of birth
	Then display 'Please fill the Date of Birth'
	
Scenario: Invalid date format
	Given user is on 'UserInformation' page
	When user enters invalid date format for date of birth
	Then display 'Invalid Date format'
	
Scenario: No Gender 
	Given user is on 'UserInformation' page
	When user doesnot select gender 
	Then display 'Please select the Gender'
	
Scenario: No Mobile number
	Given user is on 'UserInformation' page
	When user doesnot enter mobile number
	Then display 'Please fill MobileNo'

Scenario: Invalid Mobile number
	Given user is on 'UserInformation' page
	When user doesnot enter 10 digit mobile number
	Then display 'Please enter 10 digit mobile no'
	
Scenario: No mailId
	Given user is on 'UserInformation' page
	When user doesnot enter mail id
	Then display 'Please fill the Mail Id'
	
Scenario: No Landline
	Given user is on 'UserInformation' page
	When userdoesnot enter landline number
	Then display 'Please fill the LandLine no'
	
Scenario: No Communication
	Given user is on 'UserInformation' page
	When user doesnot select communication
	Then display 'Please select communication'
	
Scenario: Valid User Information 
	Given user is on 'UserInformation' page
	When user enters valid information and clicks on 'Submit' button
	Then display 'Personal details are validated' and navigate to 'PaymentDetails' page
