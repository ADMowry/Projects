#include <iostream>
#include <iomanip> // Needed for setprecision
#include <string> // Needed for table design function
using namespace std;

#include "BankingApp.h" 

string BankingApp::nCharString(size_t n, char c) { // Repeats characters for display design and cleaner code
    string charString;

    for (int i = 0; i < n; i++) {
        charString.push_back(c); // Appends character
    }
    n = 0;
    
    return charString;
};

void BankingApp::printDetails(int yearIndex, double balance, double interestEarnedThisYear) { // Prints calculated amounts to two decimals
    cout << yearIndex << "\t" << fixed << setprecision(2) << balance << "\t\t\t" << fixed << setprecision(2) << interestEarnedThisYear << endl;
};

double BankingApp::balanceWithoutMonthlyDeposit(double initialInvestment, double interestRate, int numberOfYears) { // Calculates without deposits
    m_numMonths = numberOfYears * 12; // Finds number of months for monthly interest rate calculation
    m_monthlyInterestRate = (interestRate / 100) / 12; // Formula for monthly interest rate
    m_totalAmount = initialInvestment; 
    
    for (int i = 1; i < numberOfYears + 1; i++) { // Iterates over the number of years
        m_currYear = i; // Year count
        t_interestEarnedThisYear = 0; // Resets interest each year
        for (int j = 0; j < m_numMonths/numberOfYears; j++){ // Nested loop iterates through each month in one year to track monthly interest deposits
            m_interestAmount = m_totalAmount * m_monthlyInterestRate;
            m_totalAmount = m_totalAmount + m_interestAmount;
            t_interestEarnedThisYear += m_interestAmount;
        };
        printDetails(m_currYear, m_totalAmount, t_interestEarnedThisYear); // Prints each year's totals
    };
    return m_totalAmount; // Returns end of year balance
};

double BankingApp::balanceWithMonthlyDeposit(double initialInvestment, double monthlyDeposit, double interestRate, int numberOfYears) { // Calculates with deposits
    m_numMonths = numberOfYears * 12; // Finds number of months for monthly interest rate calculation
    m_monthlyInterestRate = (interestRate / 100) / 12;
    m_totalAmount = initialInvestment; // Formula for monthly interest rate
    
    for (int i = 1; i < numberOfYears + 1; i++) { // Iterates over the number of years
        m_currYear = i; // Year count
        t_interestEarnedThisYear = 0; // Resets interest each year
        for (int j = 0; j < m_numMonths/numberOfYears; j++){ // Nested loop iterates through each month in one year to track monthly interest deposits
            m_interestAmount = m_totalAmount * m_monthlyInterestRate;
            m_totalAmount = m_totalAmount + monthlyDeposit + m_interestAmount; // Accounts for monthly deposit
            t_interestEarnedThisYear += m_interestAmount;
        };
        printDetails(m_currYear, m_totalAmount, t_interestEarnedThisYear); // Prints each year's totals
    };
    return m_totalAmount; // Returns end of year balance
};