#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

#ifndef GROCERY_H
#define GROCERY_H

class Grocery { // Creates Grocery class
    public:
        // Declared variables
        vector<string> groceryItems;
        string itemName;
        string nCharString(size_t n, char c);

        // Declared functions
        int itemFrequency(vector<string> groceryItems, string itemName);
        void allItemFrequencies(vector<string> groceryItems);
        void itemHistogram(vector<string> groceryItems);
        void createBackupFile(vector<string> groceryItems);
        
    private:
        int userInput;
        string value;
};

#endif