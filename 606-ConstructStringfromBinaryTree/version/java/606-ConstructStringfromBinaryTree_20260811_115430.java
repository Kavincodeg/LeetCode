// Last updated: 11/08/2026, 11:54:30
1class Solution {
2    public String tree2str(TreeNode t) {
3        StringBuilder res = new StringBuilder();
4        dfs(t, res);
5        return res.toString();
6    }
7
8    public static void dfs(TreeNode t, StringBuilder res) {
9        if (t == null)
10            return;
11        res.append(String.valueOf(t.val));
12        if (t.left == null && t.right == null)
13            return;
14        res.append('(');
15        dfs(t.left, res);
16        res.append(')');
17        if (t.right != null) {
18            res.append('(');
19            dfs(t.right, res);
20            res.append(')');
21        }
22    }
23}