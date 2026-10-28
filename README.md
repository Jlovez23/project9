## Menu class
```
create the menu class
    create main method for menu class
        initialize menu class
        run menuLoop method

    create menuLoop method
        Boolean keepGoing
        
        create a loop using keepGoing
            use menu to print string
            ask for input put into response
            
            if response == 0
                keepGoing = false
            if response == 1
                run the human guesser
            if response == 2
                run the computer guesser
        print "goodbye!"
```

## HumanGuess
```
create HumanGuess class
    create main method for HumanGuess class
        initialize HumanGuess class
        run HumanGuess.Run method

    create Run method
        generate random number named RNumber
        Boolean keepGoing = true
        int input
        create while loop with keepGoing
            create a try section
                ask for input
        
                if input < RNumber
                    print "Too low"
        
                if input > RNumber
                    print "Too High"

                else
                    print "Correct"
                    keepGoing = false
            catch number format
                print "that isnt a number"
```

## ComputerGuess
```
create ComputerGuess class
    create main method for computerGuess
        initialize ComputerGuess
        run ComputerGuess.Run method

    create Run method
        Boolean keepGoing = true
        min = 1
        max = 100
        create while loop with keepGoing
            run guesser method using min max and put return into guess
            print "I guess " + guess
            

    create guesser method
        int total
        add min and max and put into total
        divide total by 2 and put it into int guess
        return guess
        
        
```
