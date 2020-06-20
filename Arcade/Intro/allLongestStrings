String[] allLongestStrings(String[] inputArray) {
    int maxLen = 0;
    for (int i = 0; i < inputArray.length; i++) {
        maxLen = (int) Math.max(inputArray[i].length(), maxLen);
    }
    int counter = 0;
    for (int i = 0; i < inputArray.length; i++) {
        if (inputArray[i].length() == maxLen) {
            counter++;
        }
    }
    String result[] = new String[counter];
    int j = 0;
    for (int i = 0; i < inputArray.length; i++) {
        System.out.println("i = " + i + "   j = " + j);
        if (inputArray[i].length() == maxLen) {
            result[j++] = inputArray[i];
        }
    }
    return result;
    }
