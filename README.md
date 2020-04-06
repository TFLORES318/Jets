## Jets - Week 3 Skill Distillery


### Overview (what the project is, how to do it, how to run it)
- This project allows the user to make a selection from the "Jet Application."

- The first option in the menu will display a list of previously made jets of a fleet. This list displays the model of the jet, name of jet, speed, range and price.

- The second option in the menu will again show the details of every jet as well as how much time it has to fly until it runs out of fuel, based on miles per hour. It will also display the speed of the jets in "mach."

- The third option will display the fastest jet in the fleet.

- The fourth option will display the jet with the longest range in the fleet.

- The fifth option will activate all cargo planes to load.

- The sixth option will active all fighter jets to start fire. 

- The seventh option will allow the user to add in a jet of their own choosing into this fleet. All criteria to make a jet (model, name, speed, range, price) must be completed. 

- The eighth option will allow the user to remove a jet from the fleet. 

- The ninth and last option will allow the user to quit the program.

The fleet that was pre-made is read through a text file (jets.txt). From this, the AirField class uses Buffered Reader to add each Jet into the Array List. Each characteristic of the jets - model, name, speed, range and price - has its own array spot. From there, each jet is assigned to a specific type based on the jet model, either a Cargo Plane or a Fighter Jet. 
The fleet of jets is displayed after the list is created through a separate method that loops through the jets via a for each loop. 
In order to display jet details again as well as it's fly method, which displays the amount of time it will fly before fuel runs out as well as it's mach speed, the jets are looped again via a for each loop and the fly method in the jets is called for each one.
The fastest jet and the jet with the longest range is determined by looping through the jets via their Array List index spot then getting each speed and range through the getter method and comparing it with the previous jet. Afterwards, the jet is printed out with it's details.
Activating all cargo planes to load and all jets to start fire is done by using a for loop to look through the Array List and find the jets that are instance of cargo planes and fighter jets and call their respective methods.
A jet can be added by a user - this takes user input in the jet application and then adds it into the Array List as a jet object of JetImp.
A jet an also be removed by a user - this is done by assigning a counter to each jet object and then displaying all jets in a menu. The jet application takes user input by number of what jet to remove from fleet. When the jet is selected, we display the removed jet then subtract 1 from the counter when actually removing the jet from the array list, to ensure that the correct object is removed. The jets are then displayed without the removed jet. 
The menu will continue to loop through a while loop until the user chooses to quit - the program will then end.


### Technologies Used
- Eclipse
- Java
- Terminal Commands
- GitHub/Git 


### Lessons Learned
- This project helped me understand the construction of Array Lists and using the get, add, remove commands. 
- I learned how to implement Buffered Reader when using a text file. For a while, the program was having trouble creating the list but after carefully reviewing the program step by step, I found the issue. 
- Practicing with interfaces and abstract classes through this project has been great and I see the value in using these.
- Using instance of and casting - will need more practice with this but I understand the concept more. 
- I can never get enough practice with for loops and used for each loops for the first time in a program.
- I also applied a switch statement for the first time in a program - to work through my menu. 
- Overall this program was challenging for me but I realized (after my buffered reader list issue) that I have a lot of patience even in coding which made me feel more confident that I can execute a working program. 