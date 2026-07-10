/*
LeetCode #257 - Binary Tree Paths

Difficulty: Easy

Approach:
Recursive DFS

1. If the tree is empty, return an empty list.
2. If the current node is a leaf, return its value as a path.
3. Recursively get all paths from the left and right subtrees.
4. Prepend the current node's value to each path.
5. Return the complete list of root-to-leaf paths.

Time Complexity: O(n)
Space Complexity: O(h)

where h is the height of the tree.
*/

import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<String> binaryTreePaths(TreeNode root) {

        List<String> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        if (root.left == null && root.right == null) {
            ans.add(String.valueOf(root.val));
            return ans;
        }

        List<String> leftPaths = binaryTreePaths(root.left);
        List<String> rightPaths = binaryTreePaths(root.right);

        for (String path : leftPaths) {
            ans.add(root.val + "->" + path);
        }

        for (String path : rightPaths) {
            ans.add(root.val + "->" + path);
        }

        return ans;
    }
}
