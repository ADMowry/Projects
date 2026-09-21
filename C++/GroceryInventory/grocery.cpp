#include <iostream>
#include <string> // Need for table design and input
#include <vector> // Need for value storage
#include <fstream> // Need for file interactions

using namespace std;

#include "grocery.h"

string Grocery::nCharString(size_t n, char c) { // Repeats characters for display design and cleaner code
    string charString;

    for (int i = 0; i < n; i++) {
        charString.push_back(c); // Appends character
    }
    n = 0;
    
    return charString;
}

int Grocery::itemFrequency(vector<string> groceryItems, string itemName) { // Calculates frequency of input item
    int count = 0;
    for (int i = 0; i < groceryItems.size(); ++i) { // Iterates through vector to find occurrences of input item
        if (itemName == groceryItems[i]) {
            count += 1; // Counts occurrences of input item
        }
    }
    return count;
}

void Grocery::allItemFrequencies(vector<string> groceryItems) { // Calculates frequency of all items
    vector<string> countedItems; // Creates vector to store what has already been counted
    for(int i = 0; i < groceryItems.size(); ++i) { // Iterates through list to find occurences of each word
        bool counted = false;
        for (int j = 0; j < countedItems.size(); ++j) { // Verifies if item has already been counted
            if (groceryItems[i] == countedItems[j]) {
                counted = true;
            }
        }
        if (!counted) { 
            cout << groceryItems[i] << " " << itemFrequency(groceryItems, groceryItems[i]) << endl; // Prints item and frequency
            countedItems.push_back(groceryItems[i]); // Adds items not already counted to counted list so it will not be counted again
        }
    }
}

void Grocery::itemHistogram(vector<string> groceryItems) { // Calculates frequency of all items
    vector<string> countedItems; // Creates vector to store what has already been counted
    for(int i = 0; i < groceryItems.size(); ++i) { // Iterates through list to find occurences of each word
        bool counted = false;
        for (int j = 0; j < countedItems.size(); ++j) { // Verifies if item has already been counted
            if (groceryItems[i] == countedItems[j]) {
                counted = true;
            }
        }
        if (!counted) {
            cout << groceryItems[i] << " " << nCharString(itemFrequency(groceryItems, groceryItems[i]), '*') << endl; // Prints item and frequency in symbols
            countedItems.push_back(groceryItems[i]); // Adds items not already counted to counted list so it will not be counted again
        }
    }
}

void Grocery::createBackupFile(vector<string> groceryItems) { // Creates backup file
    ofstream outFS;
    vector<string> countedItems; // Creates vector to store what has already been counted

    outFS.open("frequency.dat"); // Opens file to write
    if (!outFS.is_open()) { // Catches error with opening file
        cout << "Could not open file.";
        return;
    }

    for(int i = 0; i < groceryItems.size(); ++i) { // Iterates through list to find occurences of each word
        bool counted = false;
        for (int j = 0; j < countedItems.size(); ++j) { // Verifies if item has already been counted
            if (groceryItems[i] == countedItems[j]) {
                counted = true;
            }
        }
        if(!counted) {
            outFS << groceryItems[i] << " " << itemFrequency(groceryItems, groceryItems[i]) << endl; // Prints item and frequency to file
            countedItems.push_back(groceryItems[i]); // Adds items not already counted to counted list so it will not be counted again
        }
    }

    outFS.close(); // Closes file
}