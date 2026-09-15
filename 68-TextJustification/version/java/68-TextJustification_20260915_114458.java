// Last updated: 15/09/2026, 11:44:58
1public class Solution {
2    public List<String> fullJustify(String[] words, int maxWidth) {
3        List<String> res = new ArrayList<>();
4        List<String> curWords = new ArrayList<>();
5        int curLen = 0;
6        for (String word : words) {
7            if (curLen + word.length() + curWords.size() > maxWidth) {
8                int totalSpaces = maxWidth - curLen;
9                int gaps = curWords.size() - 1;
10                if (gaps == 0) {
11                    res.add(curWords.get(0) + " ".repeat(totalSpaces));
12                } else {
13                    int spacePerGap = totalSpaces / gaps;
14                    int extraSpaces = totalSpaces % gaps;
15                    StringBuilder line = new StringBuilder();
16                    for (int i = 0; i < curWords.size(); i++) {
17                        line.append(curWords.get(i));
18                        if (i < gaps) {
19                            line.append(" ".repeat(spacePerGap));
20                            if (i < extraSpaces) {
21                                line.append(' ');
22                            }
23                        }
24                    }
25                    res.add(line.toString());
26                }
27                curWords.clear();
28                curLen = 0;
29            }
30            curWords.add(word);
31            curLen += word.length();
32        }
33        StringBuilder lastLine = new StringBuilder(String.join(" ", curWords));
34        while (lastLine.length() < maxWidth) {
35            lastLine.append(' ');
36        }
37        res.add(lastLine.toString());
38        return res;
39    }
40}