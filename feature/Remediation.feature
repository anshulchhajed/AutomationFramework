@Remediation
Feature: Remediation Test

  Scenario:  Login to enforce application
 Given User is on Login Page
 When User enters Credentials to LogIn
 | User  | Pass |
 | Administrator|protectdemo|	
 Then User navigates to Enforce Homepage
 When User navigates to manage menu
 And USer navigates to policy submenu
 Then New Policy Creation Screen will appear
 When User Clicks on new Item Link
 Then Configure Policy Page will appear
 When User Enters required data to create policy
 |TestPolicy|Test Description|ICT POLICY GRP|