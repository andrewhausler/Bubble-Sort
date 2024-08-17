import random

def constructList():
    # Adding Random Numbers From Range 0 - 100 
    unsortedList = []
    for i in range(6):
        unsortedList.append(random.randint(0, 100))
    return unsortedList

# Bubble Sort Algorithm
def bubbleSort(unsortedList):
    # This Boolean Allows For A Possible Shorter Time Complexity If The List Has Been Sorted Earlier In The Algorithm Allowing To Kill The Execution
    sorted = False
    # This Loop Iterates Through The Length Of The List
    for i in range(len(unsortedList)):
        # This Loop Iterates Through The Length Of The List - I - 1
        # Sbtracting By I Is Sutracting By The Already Sorted Quantity On The Far Right Of The List
        # Subtracting By 1 Allows Us To Swap With The Index Ahead Of Us Such As J+1 So We Don't Get An IndexOutOfBounds On The Second To Last Index Call
        for j in range(len(unsortedList)-i-1):
            # This Condition Checks If The Left Index Is Greater Than The Right And If So They Trade Index
            if unsortedList[j] > unsortedList[j+1]:
                unsortedList[j+1], unsortedList[j] = unsortedList[j], unsortedList[j+1]
                sorted = True
        # This Condition Is Required Incase Index J Doesn't Need Anymore Swaps And Then Decides To Move Up The Next Index Without Changing I Index Count
        # This Results In J Being Ahead Of I Causing 1 Iteration Of I Not Being Needed So If J Notices No Swaps In The Next Iteration That Means Algorithm Is Complete
        if sorted == False:
            break
    return unsortedList
    
# Main Method
def main():
    myUnsortedList = constructList()
    print(myUnsortedList)
    mySortedList = bubbleSort(myUnsortedList)
    print(mySortedList)

# Allows For Execution When This File Is Ran But When Its Used In Another File The Main Doesn't Run
if __name__ == "__main__":
    main()