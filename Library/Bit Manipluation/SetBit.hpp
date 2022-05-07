//? Given a number N and index i, find whether the ith bit in binary representation is set or not
bool isSet(const int &N, const int &index)
{
    return ((1 << index) & N);
}
// * N = 12, i = 3
// * temp = 1 -> 10 -> 100 -> 1000
// * (12 & 8)

//? Given a number N find the number of set bits in its binary representation
int totalSetBits(const int &N)
{

}