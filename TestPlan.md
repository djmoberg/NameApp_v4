# Test plan
Test plan for the NameApp_v4 application

## Test 1
Description: Launch the LearningActivity without going through the main activity

Where: LearningActivity

Type: activity

Pre-conditions: none

Expected result: The LearningActivity launches successfuly


## Test 2
Description: Score gets updated on success or failure

Where: Learning activity

Type: 

Pre-conditions: none

Expected result: Score gets updated 


## Test 3
Description: RegisterOwnerActivity gets launched when main activity gets launched and there are no set owner

Where: RegisterOwnerActivity/MainActivity

Type: activity

Pre-conditions: no preferences set

Expected result: RegisterOwnerActivity gets launched


## Test 4
Description: When a person gets added in the AddPersonActivity, the listView in NameActivity gets updated

Where: NameActivity/AddPersonActivity

Type: UI

Pre-conditions: none

Expected result: A new person gets added to the listView


## Test 5
Description: When a picture in PictureActivity is clicked, the correct name is displayed

Where: PictureActivity/ShowPersonActivity

Type: UI

Pre-conditions: none

Expected result: Correct name is displayed

