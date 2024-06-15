# Pace Calculator

![image](https://github.com/jessica-charzynski/PaceCalculator/assets/104297335/370528ca-25f0-4f09-8bf8-3d9cc06779cf)

Pace Calculator is a Java application that allows users to calculate their running pace based on the distance covered and the time taken. 

It features a simple graphical user interface (GUI) built with Swing.

## Task: Version Control with Git

### 1. Created a repository on GitHub ✅

### 2. Added the project to the repository (via file upload) ✅

### 3. Applied all relevant methods mentioned in the documentation demonstrably (via Git Bash) ✅

##### Removing Files: rm + commit + push
![rm_method](https://github.com/jessica-charzynski/PaceCalculator/assets/104297335/7a1343ce-81ef-4aa0-a9b8-e39e56c50d57)

##### Adding Files: add + commit + push
![add_method](https://github.com/jessica-charzynski/PaceCalculator/assets/104297335/4e0dc33d-e567-424a-9320-26413c55ef01)

##### Pulling Changes: pull
![pull_method](https://github.com/jessica-charzynski/PaceCalculator/assets/104297335/2c80e3d1-ae1c-4a5f-8a22-942c03407d4a)

##### Checking Status After Local Changes: status
![status_method_after_change](https://github.com/jessica-charzynski/PaceCalculator/assets/104297335/02e4738b-ed72-46e0-9ffc-799030d54ae8)

##### Viewing Differences: diff
![diff_method](https://github.com/jessica-charzynski/PaceCalculator/assets/104297335/ccc56e01-292d-4637-855c-c6b8d3dd8fa5)

##### Adding Changes: add + commit + push
![push_changes](https://github.com/jessica-charzynski/PaceCalculator/assets/104297335/8667dcd7-2828-4d85-b46e-47be5d87770d)

### 4. Experiment with time travel ✅
To do this, I undid the last change to the GUI.

##### Display a list of the previous commits: log
![log_method](https://github.com/jessica-charzynski/PaceCalculator/assets/104297335/a186c006-5d10-41ef-b390-68c427b45773)
* git revert ec4b55322db967f5f33217b0e930aedccd8da5e1
* git push origin main
##### Result:
![revert](https://github.com/jessica-charzynski/PaceCalculator/assets/104297335/0a154fae-0a1b-40f3-bf60-4972336292c4)

### 5. Create second branch, switch between them, and then merge these branches back together ✅
* added the tutorial.md file locally 
* git checkout -b second-branch
* git add .
* git commit -m "Added PaceCalculator project with a tutorial"
* git push origin second-branch
##### Result:
![image](https://github.com/jessica-charzynski/PaceCalculator/assets/104297335/2744f25a-e222-41e8-a558-506ea621bed6)
* Switching back to branch 'main': git checkout main
##### Merge branches:
![image](https://github.com/jessica-charzynski/PaceCalculator/assets/104297335/72a4c872-f91c-4403-84ee-c4820cf24bed)
* Delete second-branch

### 6. Create a pull request on GitHub referencing https://github.com/edlich/education ✅
* Fork of the repository
* git clone https://github.com/dein-benutzername/education.git
* Add "Banksy.txt" (ASCII Art) to "Art-Folder" (locally)
* git add Banksy.txt
* git commit -m "Added Banksy.txt to Art-Folder"
* git push origin master
##### Pull-Request:
![image](https://github.com/jessica-charzynski/PaceCalculator/assets/104297335/07e10b9b-a4f6-40f0-8813-ecf57883a249)





