int commonCharacterCount(String s1, String s2) {
    int counter = 0;
    int i = 0;
    while (i < s1.length()) {
        int j = 0;
        while (j < s2.length() && i < s1.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                counter++;
                s2 = s2.substring(0, j) + s2.substring(j + 1, s2.length());
                i++;
                j = 0;
            } else {
                if (j < s2.length()) {
                    j++;
                }
            }
        }
        i++;
    }
    return counter;
}
