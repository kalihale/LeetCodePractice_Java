package TopInterviewQuestions_Easy;
/** ／(•ㅅ•)＼
 * @author Kali Hale
 * @since 2021-8-12
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/102/math/743/
 * Complete and correct
 */

import java.util.*;

public class FizzBuzz
{
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        for(int i = 1; i < n + 1; i++)
        {
            String str = "";
            if (i >= 3 && i % 3 == 0)
            {
                str = str.concat("Fizz");
            }
            if (i >= 5 && i % 5 == 0)
            {
                str = str.concat("Buzz");
            }
            if (str.length() == 0)
            {
                answer.add(String.valueOf(i));
            }
            else
            {
                answer.add(str);
            }
        }
        return answer;
    }
}
