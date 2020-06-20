int centuryFromYear(int year) {
    int x = year % 100 == 0 ? year/100 : (int) Math.floor(year/100) + 1;
    return x;
}
