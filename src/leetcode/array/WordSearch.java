package leetcode.array;

/**
 * 
 * @author I319213
 *
 *https://leetcode.com/problems/word-search/
 */
public class WordSearch {
	private boolean visited[][];
	
    public boolean exist(char[][] board, String word) {
    	if(board == null || board.length == 0 || board[0].length == 0 || word == null || word.length() == 0
    			|| word.length() > board.length * board[0].length) {
    		return false;
    	} 
    	
    	for(int i = 0; i < board.length; i++) {
    		for(int j = 0 ; j < board[0].length ; j++) {
    			visited = new boolean[board.length][board[0].length];
    			if(nextExist(board, word, 0, i, j)) {
    				return true;
    			}
    		}
    	}
        return false;
    }
    
    private boolean nextExist(char[][] board, String word, int wordIndex, int i, int j) {
    	if(wordIndex >= word.length()) {
    		return true;
    	} 
    	
    	if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] || 
    			word.charAt(wordIndex) != board[i][j]) {//当前位置与word位置字母不匹配
    		return false;
    	}
    	
    	visited[i][j] = true;
    	if(nextExist(board, word, wordIndex+1, i, j - 1) || 
    		nextExist(board, word, wordIndex+1, i, j + 1) || 
    		nextExist(board, word, wordIndex+1, i - 1, j) || 
    		nextExist(board, word, wordIndex+1, i + 1, j) ) {
    		return true;
    	}
    	
    	visited[i][j] = false;
    	return false;
    }
}
