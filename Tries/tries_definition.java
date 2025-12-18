import java.util.*;
/*
 * Leetcode 208 where you define a Trie class and its methods:
 * Search, starts with, insert
 * the Trie has another class inside of it "TrieNode" which has an array of 26 trie nodes each index representing the characters index
 */

class tries_definition{
    public static void main(String[] args){
        Trie obj = new Trie();
        obj.insert("word");
        System.out.println(obj.search("the"));
    }
    static class Trie {

    private class TrieNode{
        TrieNode[] children = new TrieNode[26];
        boolean isWord = false;
    }
    private TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode temp = root;
        for(char c: word.toCharArray()){
            int x = c-'a';
            if(temp.children[x] == null)
                temp.children[x] = new TrieNode();
            temp = temp.children[x];
        }
        temp.isWord = true;
    }
    
    public boolean search(String word) {
        TrieNode temp = root;
        for(char c: word.toCharArray()){
            int x = c -'a';
            if(temp.children[x] == null)
                return false;
            temp = temp.children[x];
        }
        return temp.isWord;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode temp = root;
        for(char c: prefix.toCharArray()){
            int x = c-'a';
            if(temp.children[x] == null)
                return false;
            temp = temp.children[x];
        }
        return true;
    }
}

}