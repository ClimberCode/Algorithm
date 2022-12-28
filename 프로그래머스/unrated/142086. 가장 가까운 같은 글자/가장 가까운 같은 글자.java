class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        //문자열이 반복된 위치 중 가장 가까운 곳을 나타내도록하고 처음 나오는 문자는 -1로 표현
        //banana -> {-1, -1, -1, 2, 2, 2}
        //1 <= s.length() <= 10000

        //각 문자가 나왔었는지 표현할 수단
        //왼쪽에서 오른쪽으로 비교하면 처음부터 끝까지 전부 비교하게됨
        //오른쪽에서 왼쪽으로 비교하면 끝까지 안감


        for (int i = s.length()-1; i >= 0; i--) { //반복문의 s문자열의 오른쪽 끝에서 시작
            int place = -1; //처음 등장한 문자에 -1로 채움
            answer[i] = place;
            for (int j = i-1; j >= 0; j--) { //문자열을 탐색할 반복문
                if (s.charAt(i) == s.charAt(j)) { //
                    answer[i] = i - j;

                    break;
                }
            }
        }
        return answer;
    }
}