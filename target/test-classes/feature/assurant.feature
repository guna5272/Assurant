
Feature: login


Background: Navigate to dropdown
      Given Launch the application 
	    When user clicks on claim and support "https://ir.assurant.com/home/default.aspx"
      Then user validates dropdown options are Visibile


      Scenario: validate mobile device insurance
   
      When user click on mobile device insurance
      When user click on assurant device care
      When user click on register my device
      Then user fill valid mobile details
      
      Scenario: validate Renters Insurance
      When user click on Renters insurance
      And  user click on learn more button
      And user click on Explore flexDeposit button
      And user click on contactform
      Then validate contact form navigate to new Tab
      
      Scenario: validate  News and insights
      When user clicks on news&insights
      Then validate the dropdown is appeared
      When user clicks on One Dropdown
      And user clicks emailID to subscribee
      Then validate the confirmation message
      
      
      Scenario: Flood Policy
      When user click on Renters insurance
      And user click on claim and support
      When User click on Flood Policies
      And User click NFIP Help 
      And User Click Commercial Flood in New Tab
      And User Click Contact Private Flood Support in New Tab
      Then Validate Contact us page is Navigated in new Tab
      
      Scenario: vechicle protection
      When user click on partner solution
      And user click on vehicle protection Services
      When user click on claim and POlicy support
      And user click on getRepair help
      Then validate sign in  form is opened
      
      
      
      
      
      
 
      
 