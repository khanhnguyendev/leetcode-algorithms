package com.khanhnguyen.greedy;

/**
 * Problem: Balanced String with no three consecutive characters.
 *
 * <p>This method takes two integers, A and B, which represent the number of 'a'
 * and 'b' characters, respectively. It returns a string that contains exactly A 'a's
 * and B 'b's such that no three consecutive characters are the same.</p>
 *
 * <p><strong>Function Signature:</strong></p>
 * <pre>
 * {@code
 * public static String solution(int A, int B)
 * }
 * </pre>
 *
 * <p><strong>Examples:</strong></p>
 * <pre>
 * {@code
 * 1. Input: A = 5, B = 3
 *    Output: "aabaabab" (or any other valid string with no three consecutive 'a' or 'b')
 *
 * 2. Input: A = 3, B = 3
 *    Output: "ababab" (or any other valid string)
 *
 * 3. Input: A = 1, B = 4
 *    Output: "bbabb"
 * }
 * </pre>
 *
 * <p><strong>Hint:</strong></p>
 * <ul>
 *   <li>Use a greedy approach to append characters in such a way that the character with a higher remaining count is added first.</li>
 *   <li>Alternate characters as necessary to ensure no three consecutive characters are the same.</li>
 * </ul>
 *
 * @param A the number of 'a' characters to be included in the resulting string
 * @param B the number of 'b' characters to be included in the resulting string
 * @return a valid string that contains exactly A 'a's and B 'b's, with no three consecutive 'a's or 'b's
 */
public class BalancedString {

    public static String solution(int A, int B) {
        StringBuilder rs = new StringBuilder();

        while (A > 0 || B > 0) {
            if (A > B) {
                if (A >= 2) {
                    rs.append("aa");
                    A -= 2;
                } else {
                    rs.append("a");
                    A--;
                }
                if (B > 0) {
                    rs.append("b");
                    B--;
                }
            } else if (B > A) {
                if (B >= 2) {
                    rs.append("bb");
                    B -= 2;
                } else {
                    rs.append("b");
                    B--;
                }
                if (A > 0) {
                    rs.append("a");
                    A--;
                }
            } else {
                rs.append("a");
                A--;
                rs.append("b");
                B--;
            }
        }

        return rs.toString();
    }
}
