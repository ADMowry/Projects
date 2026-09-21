#include <iostream>
#include <string> // Needed for table design function
using namespace std;

#include "BankingApp.h"
#include "BankingApp.cpp"

int main() {
    BankingApp userInvestment; // Creates userInvestment object
    char userInput = 'y'; // Initializing to 'y' allows the loop to begin
    int t_numberOfYears;
    double t_initialInvestment;
    double t_monthlyDeposit;
    double t_interestRate;

    while (userInput == 'y') { // Loops as long as user indicates they want another calculation
        // Table design
        cout << userInvestment.nCharString(32, '*') << endl;
        cout << userInvestment.nCharString(10, '*') << " Data Input " << userInvestment.nCharString(10, '*') << endl;
        
        // Prompting user for input for applicable fields
        cout << "Initial Investment Amount: ";
        while (!(cin >> t_initialInvestment)) { // While loop asks for input until correct
            cout << "Invalid! Please enter a number: ";
            cin.clear();
            cin.ignore(10000, '\n');
        };
        cout << endl;

        cout << "Monthly Deposit: ";
        while (!(cin >> t_monthlyDeposit)) { // While loop asks for input until correct
            cout << "Invalid! Please enter a number: ";
            cin.clear();
            cin.ignore(10000, '\n');
        };
        cout << endl;

        cout << "Interest Rate: ";
        while (!(cin >> t_interestRate)) { // While loop asks for input until correct
            cout << "Invalid! Please enter a number: ";
            cin.clear();
            cin.ignore(10000, '\n');
        };
        cout << endl;

        cout << "Number of years: ";
        while (!(cin >> t_numberOfYears)) { // While loop asks for input until correct
            cout << "Invalid! Please enter a number: ";
            cin.clear();
            cin.ignore(10000, '\n');
        };
        cout << endl;
        cout << "Press any key to continue...";
        // Below cin functions clear excess input to allow the program to stop and wait for the user to press any key
        cin.clear();
        cin.ignore(10000, '\n'); 
        cin.get();

        cout << endl;
        cout << "    Balance and Interest Without Additional Monthly Deposits    " << endl;
        cout << userInvestment.nCharString(64, '=') << endl;
        cout << "Year\t" << "Year End Balance\t" << "Year End Earned Interest" << endl;
        cout << userInvestment.nCharString(64, '-') << endl;
        userInvestment.balanceWithoutMonthlyDeposit(t_initialInvestment, t_interestRate, t_numberOfYears); // Caclulates with user input with no deposits
        cout << endl;

        cout << "      Balance and Interest With Additional Monthly Deposits      " << endl;
        cout << userInvestment.nCharString(64, '=') << endl;
        cout << "Year\t" << "Year End Balance\t" << "Year End Earned Interest" << endl;
        cout << userInvestment.nCharString(64, '-') << endl;
        userInvestment.balanceWithMonthlyDeposit(t_initialInvestment, t_monthlyDeposit, t_interestRate, t_numberOfYears); // Calculates with user input with deposits
        cout << endl;

        cout << "Would you like to calculate another investment? (y/n)"; // Loop will terminate with any user input that is not 'y'
        cin >> userInput;
        cout << endl;
    };
}


