#include <iostream>
#include <sstream>
#include <string>

using namespace std;

//let us assume we won't go over 100 numbers
const int MAXITEMS = 100;
int items[MAXITEMS], bins[MAXITEMS];
int numItems=0; //stores actual # of items

//return # of bins used
int binPacking() {
   int numBins = 0;
   for (int i = numItems - 1; i >= 0; i--) {
      if (items[i] != 0) {
         int currBin = items[i];
         items[i] = 0;
         for(int j = i - 1; j >= 0; j--) {
            if (items[j] != 0 && currBin + items[j] <= 100) {
               currBin += items[j];
               items[j] = 0;
            }  
         }
         bins[numBins++] = currBin;
      }
   }
   return numBins;       
}

   


int main() {
   string line;

   //get all the items first.
   getline(cin, line);  //get one line of input
   istringstream istr(line);  //convert it to inputstringstream
   //extract the numbers from the stream into the array
   while (istr >> items[numItems]) //ERROR checking here too?
      numItems++;

   //Algorithm's output
   int numBins = binPacking();
   cout << "# of bins: " << numBins << endl;
   for(int i=0; i<numBins; i++)
      cout << bins[i] << " ";
}
