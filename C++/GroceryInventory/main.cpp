#include <iostream>
#include <string>
#include <vector>
#include <fstream>

using namespace std;

#include "grocery.h"
#include "grocery.cpp"

int main() {
    Grocery cornerGrocer; // Creates cornerGrocer object
    int userInput;
    string itemName;
    vector<string> groceryItems;
    bool active = true; // Initialized to true to start input loop
    ifstream inFS;
    string value;

    inFS.open("CS210_Project_Three_Input_File.txt"); // Open file
    
    if (!inFS.is_open()) { // Catches error with opening file
        cout << "Could not open file.";
        return 1;
    }

    while (inFS >> value) { // Adds values from data file to list
        groceryItems.push_back(value);
    }

    inFS.close(); // Closes file

    cornerGrocer.createBackupFile(groceryItems); // Create backup file
    
    // Print menu
    cout << cornerGrocer.nCharString(60, '-') << endl;
    cout << "Corner Grocery Items Purchased" << endl;
    cout << cornerGrocer.nCharString(60, '-') << endl << endl;
    cout << "Option 1: Look Up Specific Item Frequency" << endl;
    cout << "Option 2: Show All Item Frequencies" << endl;
    cout << "Option 3: Show Item Frequency Graph" << endl;
    cout << "Option 4: Exit" << endl << endl;

    while (active) { // Loops until program is exited
        cout << "Enter menu option: ";
        while(!(cin >> userInput)) { // Validates input is a number
            cout << endl << "Invalid! Please enter an option number: ";
            cin.clear();
            cin.ignore(10000, '\n');
        }
        cout << endl;
        
        switch (userInput) {
            case 1: // Look up specific item frequency
                cout << "Enter item name: ";
                cin >> itemName;
                itemName[0] = toupper(itemName[0]); // Ensures capitalization doesn't skew results of search
                cout << cornerGrocer.itemFrequency(groceryItems, itemName) << endl << endl;
                break;
            case 2: // Show all item frequencies
                cornerGrocer.allItemFrequencies(groceryItems); 
                cout << endl << endl;
                break;
            case 3: // Show item frequency graph
                cornerGrocer.itemHistogram(groceryItems);
                cout << endl;
                break;
            case 4: // Exit program
                cout << "Exiting Program" << endl << endl;
                active = false; // Updates boolean to close program
                break;
            default: // Validates input is a valid menu option number
                cout << "Invalid menu option" << endl << endl;
                break;

        }
    }
}