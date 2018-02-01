# Test plan
Test plan for the NameApp_v4 application

## Test 1
Description: Launch the LearningActivity without going through the main activity

Where: LearningActivity

Type: activity

Pre-conditions: none

Expected result: The LearningActivity launches successfully

File: LearningActivityTest.java


## Test 2
Description: Score gets updated on success or failure

Where: Learning activity

Type: UI

Pre-conditions: none

Expected result: Score gets updated 

File: LearningActivityTest.java

## Test 3
Description: RegisterOwnerActivity gets launched when main activity gets launched and there is no set owner

Where: RegisterOwnerActivity/MainActivity

Type: activity

Pre-conditions: no preferences set

Expected result: RegisterOwnerActivity gets launched

File: MainActivityTest.java

## Test 4
Description: When a person gets added in the AddPersonActivity, the listView in NameActivity gets updated

Where: NameActivity/AddPersonActivity

Type: UI

Pre-conditions: none

Expected result: A new person gets added to the listView

File: NameActivityTest.java

## Test 5
Description: When a picture in PictureActivity is clicked, the correct name is displayed

Where: PictureActivity/ShowPersonActivity

Type: UI

Pre-conditions: none

Expected result: Correct name is displayed

File: PictureActivityTest.java

## Test 6
Description: When a name in NameActivity is clicked, the correct person is displayed

Where: NameActivity/ShowPersonActivity

Type: UI

Pre-conditions: none

Expected result: Correct person is displayed

File: NameActivityTest.java

## Summary
To run the tests, run the androidTest package from Android Studio. The result should be that all 7 tests passes. We discovered one bug while running the tests. On Test 1, when we tried to launch the LearningActivity without going through the MainActivity, the app crashed. This was because the default data was set in the MainActivity and when we launched the LearningActivity directly, no data was set. We fixed this by setting the default data in the GlobalClass instead.  
