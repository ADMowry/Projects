#ifndef BANKINGAPP_H
#define BANKINGAPP_H

class BankingApp { // Creates BankingApp class
    public:
        // Declared functions
        double balanceWithoutMonthlyDeposit(double initialInvestment, double interestRate, int numberOfYears);
        double balanceWithMonthlyDeposit(double intialInvestment, double monthlyDeposit, double interestRate, int numberOfYears);
        void printDetails(int yearIndex, double balance, double interestEarnedThisYear);
        string nCharString(size_t n, char c);
        
        // Declared variables
        int t_numberOfYears;
        double t_interestEarnedThisYear;
        double t_initialInvestment;
        double t_monthlyDeposit;
        double t_interestRate;
    private:
        int m_numMonths;
        double m_monthlyInterestRate;
        int m_currYear;
        double m_totalAmount;
        double m_interestAmount;
};

#endif