class Solution {
       public String longestPalindrome(String s) {

        if (s.length() == 0) {
            return "";
        }

        int[] oddRadiuses = new int[s.length()];
        int[] evenRadiuses = new int[s.length()];

        int lOdd = 0;
        int rOdd = -1;

        int lEven = 0;
        int rEven = -1;

        int oddMax = 0;
        int evenMax = 0;

        for (int i = 0; i < s.length(); ++i) {

            int inner;

            // odd part

            inner = i > rOdd ? 1 : Math.min(oddRadiuses[lOdd + rOdd - i], rOdd - i + 1);

            while (i + inner < s.length() && i - inner >= 0 && s.charAt(i + inner) == s.charAt(i - inner))
                ++inner;

            oddRadiuses[i] = inner;

            oddMax = inner > oddRadiuses[oddMax] ? i : oddMax;
            if (i + inner - 1 > rOdd) {
                lOdd = i - inner + 1;
                rOdd = i + inner - 1;
            }

            // even part

            inner = i > rEven ? 0 : Math.min(evenRadiuses[lEven + rEven - i + 1], rEven - i + 1);

            while (i + inner < s.length() && i - inner - 1 >= 0 && s.charAt(i + inner) == s.charAt(i - inner - 1))
                ++inner;

            evenRadiuses[i] = inner;

            evenMax = inner > evenRadiuses[evenMax] ? i : evenMax;

            if (i + inner - 1 > rEven) {
                lEven = i - inner;
                rEven = i + inner - 1;
            }
        }

        if (evenRadiuses[evenMax] >= oddRadiuses[oddMax]) {
            return s.substring(evenMax - evenRadiuses[evenMax], evenMax + evenRadiuses[evenMax]);
        } else {
            return s.substring(oddMax - oddRadiuses[oddMax] + 1, oddMax + oddRadiuses[oddMax]);
        }

    }
}