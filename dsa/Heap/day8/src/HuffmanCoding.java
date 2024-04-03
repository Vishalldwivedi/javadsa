public class HuffmanCoding {// file complression
    // given a string ABCDEAABBBEEECCDD... total = 50 characters
    // a = 20 , b = 4 , c = 15 , d = 9  , e =2 ;
    // mssg goes in nos. ascii code A = 65 = 01000011 (8bit)
    // 8 bit for 1 character for 50 character == 400 bits
    // if i fix to 3 bits for every character = 150 bits traffic will be less in network
    //and also we need to send the table->a->000 , b = 001, c = 010,d = 011,e = 100
    //we can assign even less bits
    //higher frequency char we assign less bits
    // less freq char we assign more bits.

    // take two smallest and combine from the leave and from  binary tree


//steps : create a min heap
// push all elements in min heap
    // while heap size != 1
    // pop two element // combine and push in min heap


}
