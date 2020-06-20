int makeArrayConsecutive2(int[] statues) {
    if (statues.length - 1 == 0) {
        return 0;
    }

    int n = statues.length, max = 0, min = 20;

    for (int i = 0; i < statues.length; i++) {
        //max = Math.max(max, statues[i]);
        //min = Math.min(min, statues[i]);
        if (statues[i] > max) {
            max = statues[i];
        }
        if (statues[i] < min) {
            min = statues[i];
        }
    }

    return max - min - n + 1;
}
