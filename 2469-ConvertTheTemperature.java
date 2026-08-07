//Problem No.: 2469
//Problem Name: Convert The Temperature
//Difficulty: EASY 


//SOLUTION:-

class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double Fahrenheit = celsius * 1.80 + 32.00;
        return new double[]{kelvin, Fahrenheit};
    }
}


//Run Time: 0ms | 100%   
//Memory: 46.20 MB | 24.06%
