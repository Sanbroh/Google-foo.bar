public static String solution(String s) {
        String[] braille = { "100000",
                          "110000",
                          "100100",
                          "100110",
                          "100010",
                          "110100",
                          "110110",
                          "110010",
                          "010100",
                          "010110",
                          "101000",
                          "111000",
                          "101100",
                          "101110",
                          "101010",
                          "111100",
                          "111110",
                          "111010",
                          "011100",
                          "011110",
                          "101001",
                          "111001",
                          "010111",
                          "101101",
                          "101111",
                          "101011",
                          "001111" };

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == ' ') {
                answer += "000000";
            } else {
                if (Character.isUpperCase(curr)) {
                    answer += "000001";
                }
                for (int j = 0; j < alphabet.length(); j++) {
                    if (Character.toLowerCase(curr) == alphabet.charAt(j)) {
                        answer += braille[j];
                        break;
                    }
                }
            }
        }

        return answer;
    }
