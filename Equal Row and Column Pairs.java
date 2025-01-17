class Solution {
    public int equalPairs(int[][] grid) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < grid.length; i++){
            StringBuilder s = new StringBuilder();
            for(int j = 0; j < grid.length; j++){
                s.append(grid[i][j]);
                s.append("+");
            }
            String ss = s.toString();
            map.put(ss, map.getOrDefault(ss, 0) + 1);
        }
        int c = 0;
        for(int i = 0; i < grid.length; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < grid.length; j++){
                sb.append(grid[j][i]);
                sb.append("+");
            }
            String ss = sb.toString();
            if(map.containsKey(ss)){
                c += map.get(ss);
            }
        }
        return c;
    }
}