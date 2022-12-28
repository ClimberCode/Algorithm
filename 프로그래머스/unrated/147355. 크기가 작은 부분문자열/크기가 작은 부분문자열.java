
    class Solution {
        public int solution(String t, String p) {
                int answer = 0;
                Long longP = Long.parseLong(p); //문자열 p를 정수형으로
                 
                for (int i = 0; i <= t.length() - p.length() ; i++) {
                    String str = t.substring(i, i+p.length()); //t문자열을 p길이씩 자름
                    Long longStr = Long.parseLong(str); //자른 문자열을 정수형으로 변환
                    
                    if (longStr <= longP) { //자른 문자열이 p문자열보다 작거나 같은경우
                        answer++; //횟수 증가
                    }
                }
                return answer;
        }
    }
