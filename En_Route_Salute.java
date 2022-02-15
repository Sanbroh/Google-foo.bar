public static int solution(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '>') {
                for (int j = i; j < s.length(); j++) {
                    if (s.charAt(j) == '<') {
                        answer += 2;
                    }
                }
            }
        }

        return answer;
    }
