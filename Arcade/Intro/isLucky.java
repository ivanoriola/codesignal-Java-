boolean isLucky(int n) {
    int tempNum = n;
    int cifras = 1;
    while ((tempNum /= 10) > 0) {
        cifras++;
    }

    int firstHalfSum = 0, secondHalfSum = 0;
    for (int i = 0; i < cifras / 2; i++) {
        firstHalfSum += n % 10;
        n /= 10;
    }
    for (int i = cifras / 2; i < cifras; i++) {
        secondHalfSum += n % 10;
        n /= 10;
    }
    if (firstHalfSum == secondHalfSum) {
        return true;
    } else {
        return false;
    }
}
